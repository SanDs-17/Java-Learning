import java.util.Scanner;

class Elseif{
    public static void main(String args[])
    {
        Scanner Num = new Scanner(System.in);

        int Score = Num.nextInt();

        if(Score > 35 && Score < 60)
        {
            System.out.println("I can get video game");
        }
        else if (Score > 60 && Score < 90) {
            System.out.println("I can get Iphone");
        }
        else if (Score > 90){
            System.out.println("I can get Macbook pro");
        }
    }
}