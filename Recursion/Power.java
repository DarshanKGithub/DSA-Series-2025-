package Recursion;

import java.util.Scanner;

public class Power {
    
    static int power(int num){
        //Base Case
        if(num == 0) return 1;

        //Recursive 
        int smallTask = power(num-1);
        int bigTask = 2 * smallTask;

        return bigTask;
 
        // return 2 *  power( - 1)  ;
       
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find power of num: ");
        int num = sc.nextInt();

        int ans = power(num);
        System.out.println("The power of num is: " + ans);
    }
}
