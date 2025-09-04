// program to create a simple calculator using switch statement.

import java.util.Scanner;

class Challenge10{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 2 numbers and operator to calculate -> example -- 2 3 +");
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        char c = scn.next().charAt(0);
        
        switch (c){
            case '+':
                System.out.println("Result: " + (a+b));
                break;
            case '-':
                System.out.println("Result: " + (a-b));
                break;
            case '*':
                System.out.println("Result: " + (a*b));
                break;
            case '/':
                if(b==0){
                    System.out.println("Error: Division by zero");
                }else
                System.out.println("Result: " + (a/b));
                break;
            default: System.out.println("Invalid Inputs");
        }
        
    }
}
