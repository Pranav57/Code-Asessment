// Print a right triangle pattern of stars and a pyramid pattern of stars.

import java.util.Scanner;

class Challenge14{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of floors: ");
        int a = scn.nextInt();
        
        for(int i=1;i<=a;i++){
            // printing right angled triangle
            for(int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i=1;i<=a;i++){
            // printing space
            for(int j =1;j<=a-i;j++){
                System.out.print(" ");
            }
            // printing stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            // switching rows/ going to next line
            System.out.println("");
        }
    }
}
