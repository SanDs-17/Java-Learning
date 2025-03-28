import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you Salary:");
        int Salary = scan.nextInt();
        System.out.println("Enter your Age:");
        int Age = scan.nextInt();
        


        if(Salary >= 20000 || Age <= 25)
        {
            System.out.println("Eligible for loan");
            System.out.println("How much you need loan amout:");
            int Loan = scan.nextInt();
            if (Loan < 50000) {
                System.out.println("Loan Available");
            }
            else{
                System.out.println("Loan not Available");
            }
        }
        else{
            System.out.println("Not eligible for loan");
        }
    }
}
