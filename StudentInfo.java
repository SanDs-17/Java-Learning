import java.util.Scanner;
public class StudentInfo {
    public static void main(String args[])
    {
        Scanner var = new Scanner(System.in);
        String Name = var.nextLine();
        Double Score = var.nextDouble();
        var.nextLine();
        String Dept = var.nextLine();
        System.out.println("My Name is "+Name);
        System.out.println("My Score is "+Score/10 +"/10");
        System.out.println("My Dept is "+Dept);
    }
}