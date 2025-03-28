import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[])
    {
        // Check the number Even or Odd
        Scanner Num = new Scanner(System.in);

        int num = Num.nextInt();
        
        if(num % 2 == 0)
        {
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is Odd");
        }
    }
}
