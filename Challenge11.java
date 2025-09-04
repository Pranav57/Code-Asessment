// program to print numbers from 1 to N using a for loop.
import java.util.Scanner;

class Challenge11{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scn.nextInt();
        
        for(int i=1; i<a; i++){
            System.out.print(i+" ");
        }
    }
}
