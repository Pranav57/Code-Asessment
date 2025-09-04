// Program performs arithmetic operations on two numbers
class Challenge2{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        
        // Using Airthmetic operators
        System.out.println("Addition :"+ (a+b));
        System.out.println("Subtraction :"+ (a-b));
        System.out.println("Multiplication :"+ (a*b));
        System.out.println("Divition :"+ (a/b));
        System.out.println("Modulus: "+ (a%b));
        
        // Using Assisgnment operators
        int c = 10;
        c+=1;
        System.out.println(c);
        c-=1;
        System.out.println(c);
        c*=1;
        System.out.println(c);
        c/=2;
        System.out.println(c);
    }
}
