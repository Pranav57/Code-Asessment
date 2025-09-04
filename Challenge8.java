// program to check if a given year is a leap year.
import java.util.Scanner;

class Challenge8{
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scn.nextInt();
        // leap year rule, the year should be divisble by 4, if it is a centurian year then it should not be divisible by 100 and only divisible by 400
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
