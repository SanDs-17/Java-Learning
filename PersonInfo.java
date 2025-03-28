import java.util.Scanner;
class PersonInfo {
    public static void main(String[] args) {
     Scanner Demo = new Scanner(System.in);
     String Name = Demo.nextLine();
     int Age = Demo.nextInt();

     // newline
     Demo.nextLine();
     
     String Address = Demo.nextLine();

     System.out.println(Name);
     System.out.println(Age);
     System.out.println(Address);
    }
  }