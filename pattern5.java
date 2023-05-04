//inverted half Pyramid(rotated by 180 deg)

public class pattern5 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            // inner loop for printing spaces

            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // inner loop for *

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
