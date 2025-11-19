package Leetcode;

import java.util.*;

public class KeepMultiplyingByTwo {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(original)) {
            original *= 2;
        }

        return original;
    }

    public static void main(String[] args) {
        KeepMultiplyingByTwo sol = new KeepMultiplyingByTwo();
        int[] nums = {5, 3, 6, 1, 12};
        int original = 3;
        System.out.println(sol.findFinalValue(nums, original)); // Output: 24
    }
}
