package recursion;

//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args) {
        String str  = "A man, a plan, a canal: Panama";
        boolean bool = checkPalindrome(str);
        System.out.println(bool);
    }

    private static boolean checkPalindrome(String str) {
        int left =0,right = str.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
