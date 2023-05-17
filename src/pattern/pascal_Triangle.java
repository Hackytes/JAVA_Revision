package src.pattern;

public class pascal_Triangle {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        

        for (int i = 1; i <= 5; i++) {
            

            for (int j = 0; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            int a = 1;

            for (int k = 1; k <= i; k++) {
                System.out.print(a + " ");

                a = a * (i - k) / k;
            }
            
            System.out.println();

        }

    }
    
}
