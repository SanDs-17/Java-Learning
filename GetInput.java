import java.util.Scanner;
class q1{
    public static void main(String args[])
    {
        Scanner var = new Scanner(System.in);
        int a = var.nextInt();
        int b = var.nextInt();
        int c = var.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.println(d/e);
    }
}