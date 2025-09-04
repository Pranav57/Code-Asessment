// switch statement to display the day of the week.
import java.util.Scanner;

class Challenge9{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //taking user input
        System.out.println("Enter week day number 1-7");
        int day = scn.nextInt();
        //using switch statement
        switch (day){
            case 1: 
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default: System.out.println("Invalid input");
        }
    }
}
