package calculator;

import java.util.Scanner;

public class App {
//    This is the main section...

    public static void main(String[] args) {
        // System.out.println("Hello, this is the main class...");
        System.out.println("Please enter the first value:");

        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();

        System.out.println("Please enter Operation:");
        String op = sc.next();

        System.out.println("Please enter your second value:");
        int value2 = sc.nextInt();
        
        int ans = 0;
        
        if (op.equals("+")){
            ans = value1 + value2;    
        } else if(op.equals("-")){
            ans = value1 - value2;
        } else if(op.equals("*")){
            ans = value1 * value2;
        } else if (op.equals("/")) {
            ans = value1 / value2;
        }

        System.out.println("Answer = " + ans);
    }
}
