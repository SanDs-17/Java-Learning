import java.util.Scanner;

public class StudentFeedback {
    public static void main(String args[])
    {
        Scanner Num = new Scanner(System.in);

        int Score = Num.nextInt();

        if(Score < 50)
        {
            System.out.println("You need to improve");
        }
        else if (Score >= 50 && Score <= 70) 
        {
            System.out.println("Good job!");
        }
        else if (Score > 70) 
        {
            System.out.println("Excellent performance!");
        }
    }
}
