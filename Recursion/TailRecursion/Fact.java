package Recursion.TailRecursion;

public class Fact {
    public static int factorial(int n, int accumulator){
        if(n==0){ // base case
            return accumulator;
        }

        return factorial(n-1,n*accumulator); // tail recursion
    }

    public static void main(String[] args){
        System.out.println("Factorial is equal to "+factorial(5,1));
    }
}
