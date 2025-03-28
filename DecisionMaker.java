import java.util.Scanner;

class DecisionMaker {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);

        // Taking input for RCB match outcome
        System.out.print("RCB win or lose:");
        String RCB = s1.nextLine();

        if (RCB.equals("Win")) {
            System.out.println("Ee saala cup namdhey");
        } else {
            System.out.println("Cup illa");
        }

        // Taking input for Meghana’s fate
        System.out.print("Meghana Dead or Not:");
        String Meghana = s1.nextLine();

        if (Meghana.equals("Dead")) {
            System.out.println("Surya meets Ramya");
        } else {
            System.out.println("Surya weds Meghana");
        }
    }
}
