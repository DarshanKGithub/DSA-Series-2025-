package Leetcode;
import java.util.*;

public class BinaryToDecimal {
 
    static List<Boolean> binaryToDecimalDivisibleBy5(int[] nums){
        List<Boolean> res = new ArrayList<>();
        int val = 0;

        for(int n: nums){
            val = ((val << 1) + n) % 5;
            res.add(val == 0);
        }
        return res;

    }


    

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        List<Boolean> result = binaryToDecimalDivisibleBy5(nums);
        System.out.print(result);
      
    }
}
