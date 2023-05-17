package src.pattern;

public class hollow_butterfly {

    public static void main(String[] args) {
        int n = 5;

        //Upper Half

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //Lower Half
        for (int i = n; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            if (i > 1)
                System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            if (i > 1)
                System.out.print("*");
            System.out.println(" ");

        }

    }
    
}
