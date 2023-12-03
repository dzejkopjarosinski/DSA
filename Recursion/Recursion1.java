public class Main{
    
    // To know that you can solve something with recurrsion you need to find if you can solve smaller problem with recurrsion

    public static void main(String[] args){
        // function that takes a number and prints next 5 numbers
        print();
    }

    static void print(int n){

        // This is base condition and it is used to beark code when needed
        if(n==5){
            System.out.println(5);
            return;
        }

        System.out.println(n);
        print(n+1);
    }

}