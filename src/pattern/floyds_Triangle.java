package src.pattern;

//FLOYD's TRIANGLE

public class floyds_Triangle {

    static int m = 5;
    static int number = 1;

    public static void main(String[] args) {

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number++ + "  ");
            }
            System.out.println();
        }

    }
}
