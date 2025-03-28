import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Checking pass/fail based on marks
        System.out.print("Enter marks: ");
        int mark = scanner.nextInt();
        if (mark > 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Checking scholarship eligibility based on income

        System.out.print("Enter income: ");
        int income = scanner.nextInt();
        if (income > 7000) {
            System.out.println("Scholarship is available");
        } else {
            System.out.println("Not eligible");
        }
    }
}
