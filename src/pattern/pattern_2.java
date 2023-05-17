/*FIBONACCI SERIES PATTERN
 * 0
 * 1 1
 * 2 3 5
 * 8 13 21 34
 */




package src.pattern;

public class pattern_2 {
    public static void main(String[] args) {
        
        int a = 0, b = 1, c;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

    }
    
}
