package src;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int input;

            do {
                double marks = sc.nextDouble();
                if (marks >= 90) {
                    System.out.println("This is good.");
                } else if (89 >= marks && marks >= 60) {
                    System.out.println("This is also good.");
                } else if (59 >= marks && marks >= 0) {
                    System.out.println("This is good as well");
                } else {
                    System.out.println("Invalid!");
                }

                System.out.println("Want to continue ? (yes(1) or No(0))");
                input = sc.nextInt();
            }

            while (input == 1);
        }

        // Table Of n

        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++){
        //
        // int tableOfn = n * i;
        //
        // System.out.println(tableOfn);
        // }

        // Print even numbers till n

        // int n = sc.nextInt();
        //
        // for(int i = 0; i<=n; i++){
        // if(i % 2 == 0) {
        // System.out.println(i);
        // }
        // }

    }
}
