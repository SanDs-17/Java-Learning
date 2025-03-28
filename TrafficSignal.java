import java.util.Scanner;

public class TrafficSignal {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String Color = scan.nextLine();

        if (Color.equals("red"))
        {
            System.out.println("Stop");
        }
        else if (Color.equals("yellow")) {
            System.out.println("Get Ready");
        }
        else if (Color.equals("green")) {
            System.out.println("Go");
        }
    }
}
