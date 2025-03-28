import java.util.Scanner;

class SumOfArray {
    public static void main(String args[]) {
        int[] marks = new int[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 marks:");

        // Taking input for the array
        for (int i = 0; i < 5; i++) {
            marks[i] = scan.nextInt();
        }

        // Calculating sum
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }

        // Displaying result
        System.out.println("Total Marks: " + sum);
    }
}
