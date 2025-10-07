package string;

//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args) {
        String str  = "A man, a plan, a canal: Panama";
        boolean bool = checkPalindrome(str);
        System.out.println(bool);

         StringBuilder sb = new StringBuilder();
         for(int i=0;i<str.length();i++){
             char ch = str.charAt(i);
             if(isAlphaNumeric(ch)){
                 sb.append(toLowerCase(ch));
             }
         }
         String filteredStr = sb.toString();
         boolean isPalin = isPalindrome(filteredStr);
         System.out.println(isPalin);

    }

    private static boolean isAlphaNumeric(char ch){
        return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9');
    }

    private static char toLowerCase(char ch){
        if(ch>='a' && ch<='z'){
            return ch;
        }else{
            return (char)(ch - 'A' + 'a');
        }
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
