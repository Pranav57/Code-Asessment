// program to find and print all prime numbers between 1 and 100 using loops.
class Challenge15{
    public static void main(String[] args){
        for(int i=2;i<=100;i++){
            boolean prime = true; //assuming number is prime
            for(int j=2;j<i;j++){ //checking divisibility factors
                if(i%j==0){
                    prime = false;
                 }
            }
        if(prime==true){
                    System.out.println(i);
                }
        }
    }
}
