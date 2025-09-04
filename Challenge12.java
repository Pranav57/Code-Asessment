// program to calculate factorial of a number using while loop.
import java.util.Scanner;
import java.math.BigInteger;

class Challenge12{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int a = scn.nextInt();
        while (a<0){
            System.out.println("Enter a positive number");
            a=scn.nextInt();
        }
        int original = a;
        BigInteger i = BigInteger.ONE; // variable to store product and 0! value comes from here
        //a>1 because if a is 0, we can get 0! value
        while (a>1){
            i = i.multiply(BigInteger.valueOf(a));
            a--;
        }
        System.out.println("Factorial of "+ original +" is :"+i);
    }
}
