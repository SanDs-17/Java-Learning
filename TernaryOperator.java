import java.util.Scanner;

class Ternary{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();

        String Temp = (A > B)? "A is Greater than B" : "B is Greater than A";
        System.out.println(Temp);
    }
}