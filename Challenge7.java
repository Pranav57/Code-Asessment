// program to find the largest among three numbers using if-else statements.
import java.util.Scanner;

class Challenge7{
    public static void main(String args[]){
        Scanner scannerobj= new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = scannerobj.nextInt();
        System.out.println("Enter Second Number");
        int b = scannerobj.nextInt();
        System.out.println("Enter Third Number");
        int c = scannerobj.nextInt();
        
        // Check for all equal
        if (a == b && b == c) {
            System.out.println("All three numbers are equal: " + a);
        } 
        // Check if two are equal and largest
        else if (a == b && a > c) {
            System.out.println("First and second are equal and largest: " + a);
        } else if (a == c && a > b) {
            System.out.println("First and third are equal and largest: " + a);
        } else if (b == c && b > a) {
            System.out.println("Second and third are equal and largest: " + b);
        } 
        // check largest among 3.
        else if (a>b && a>c){
            System.out.println("First number is largest");
        } else if (b>a && b>c){
            System.out.println("Second number is largest");
        } else System.out.println("Third number is largest");
    }
}
