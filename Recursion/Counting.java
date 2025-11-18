package Recursion;

import java.util.Scanner;

public class Counting {
    
    static void countingNum(int count) {
        if (count == 0) return;
        
        System.out.print(count + " ");
        countingNum(count - 1);   // ← Fixed here
    }

    public static void main(String[] args) {   // ← Also fixed: void, not int
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        countingNum(count);
        
        sc.close();
    }
}