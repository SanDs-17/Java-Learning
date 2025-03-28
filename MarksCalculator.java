import java.util.Scanner;

public class MarksCalculator {
    public static void main(String args[])
    {
        Scanner Num = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");
        
        int Mark1 = Num.nextInt();
        int Mark2 = Num.nextInt();
        int Mark3 = Num.nextInt();
        int Mark4 = Num.nextInt();
        int Mark5 = Num.nextInt();
        int Total= Mark1+Mark2+Mark3+Mark4+Mark5;
        int Average = Total / 5;
        
        if(Average > 35)
        {
            System.out.println("Additional class is required");
        }
        else{
            System.out.println("You are good to go");
        }
    }
}
