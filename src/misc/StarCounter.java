package misc;

public class StarCounter {
    public static void main(String[] args) {
        int n = 5;
        //1 3 5 7 9 11 13
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
                if (j < i * 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
                if (j < i * 2 - 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
