package Recursion;
import java.util.Scanner;

public class Factorial{

   static int factorial(int n){
    //Base Case
    if (n==0 || n == 1) return 1;

    //Recursive Case ->f(n) = n * f(n-1)

    int smallTask = factorial(n-1); 
    int bigTask = n * smallTask;

    return bigTask;
   }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to find the factroial: ");
        int n = sc.nextInt();
 
        int ans = factorial(n);
        System.out.println("The factorial is: "+ans);
        
    }
}