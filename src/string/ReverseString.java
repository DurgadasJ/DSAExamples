package string;
//Reverse the given string word-wise. The last word in the given string should come at 1st place,
// the last-second word at 2nd place, and so on. Individual words should remain as it is.
public class ReverseString {
    public static void main(String[] args) {
        String str = "Welcome to Intellij IDEA";

        String str1 = reverseStringWordWise(str);

        System.out.println(str1);

    }
    static String reverseStringWordWise(String input) {
        String[] str = input.split(" ");
        String str1 = "";
        for(int i=str.length-1;i>=0;i--){
            str1 = str1 + str[i];
            if(i>0){
                str1 += " ";
            }
        }
        return str1;
    }
}
