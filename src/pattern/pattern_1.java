package src.pattern;

public class pattern_1 {

    public static void main(String[] args) {
        
        int num = 2;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }

    }
    
}
