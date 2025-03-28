import java.util.Scanner;
class NumberComparison {
    public static void main(String args[])
    {
        Scanner var = new Scanner(System.in);
        int num1 = var.nextInt();
        int num2 = var.nextInt();

        if(num1 == num2)
        {
            System.out.println("Both number are equal");
        }
        else{
            System.out.println("Not equal");
        }
    }    
}
