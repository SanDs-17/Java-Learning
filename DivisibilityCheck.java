import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String args[])
    {
        //logical operator

        Scanner l = new Scanner(System.in);

        int num = l.nextInt();

        if(num % 3==0 && num % 5==0)  // && --> And operation
        {
            System.out.println("Divisible by 3 and 5 "+num);
        }
        else{
            System.out.println("Not divisible by 3 and 5 "+num);
        }
    }
}
