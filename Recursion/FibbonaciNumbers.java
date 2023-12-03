public class Main{

    // find n'th fibonacci number
    // Pattern: fibo(n) = fibo(n-1) + fibo(n-2)
    public static void main(String[] args){
       System.out.println(fibo(n:6));
        

    }

    static int fibo(int n){
        //base condition
        if (n<2){
            return n;
        }
        return fibo(n: n-1) + fibo(n: n-2);
    }

}