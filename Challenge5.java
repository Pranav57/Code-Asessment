// Program that demonstrates operator precedence and type casting in Java.
class Challenge5{
    public static void main(String[] args){
        int a =10;
        double b= 3.5;
        
        // * has higher precedence than +
        int c = a*2 + (int)b;
        System.out.println("Expression result: "+c);
        
        //Implicit Typecast
        double d = a + b;
        System.out.println("Implicit casting: "+d);
        
        //Explicit Typecast
        int e = a + (int)b;
        System.out.println("Explicit casting: "+e);
        
    }
}
