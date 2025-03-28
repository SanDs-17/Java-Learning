import java.util.Scanner;
public class BasicArrayOperations {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        // Step 1: Ask for the array size
        System.out.print("Enter the number of elements: ");
        int size = scan.nextInt();  

        // Step 2: Create an array
        int[] numbers = new int[size];  

        // Step 3: Get user input for each element
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        // Step 4: Find the middle element
        int middleIndex = size / 2;  
        System.out.println("Middle element: " + numbers[middleIndex]);
        
    }
}

