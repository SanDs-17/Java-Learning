public class DivisibleBy3And5 {
    public static void main(String args[]) {
        System.out.println("Numbers divisible by 3 and 5 from 0 to 100:");

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {  // Use && instead of &
                System.out.println(i);
            }
        }
    }
}
