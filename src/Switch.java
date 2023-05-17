package src;

import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Enter the operator");

            int operator = sc.next().charAt(0);

            switch (operator) {

                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;
                default:
                    System.out.println(0);

            }
        }

    }
}

