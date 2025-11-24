import java.util.*;

public class Palindrome {

    static boolean isPalindrome(String ch){
        //Two pointer approach
        int left = 0;
        int right = ch.length() - 1;

        while(left < right){
            if(ch.charAt(left) != ch.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check: ");
        String ch = sc.nextLine();
        System.out.println("The charcter is : " + ch);
        boolean palindrome = isPalindrome(ch);

        if(palindrome){
            System.out.println("This is palindrime: " + ch);
        }else {
            System.out.println("Not a palindrome: " + ch);
        }
    }
}