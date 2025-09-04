// Program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.

class Challenge4{
    public static void main(String[] args){
        int a = 10;
        System.out.println("Original: "+ a);
        System.out.println("Pre-Increment: " + (++a));
        System.out.println("Post-Increment: " + (a++) + " (Returned " + (a-1) + ")");
        System.out.println("Pre-Decrement: " + (--a));
        System.out.println("Post-Decrement: " + (a--) + " (Returned " + (a+1) + ")");
    }
}
