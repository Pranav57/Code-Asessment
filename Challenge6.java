// program to check if a number is positive, negative, or zero.

import java.util.Scanner;

class Challenge6{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = obj.nextInt();
        if (a>0){
            System.out.println("Number is Positive");
	}else if(a==0){
            System.out.println("Number is 0");		
        }else  System.out.println("Number is not positive");        
    }
}
