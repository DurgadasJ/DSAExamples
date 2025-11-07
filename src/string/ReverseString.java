package string;
//Reverse the given string word-wise. The last word in the given string should come at 1st place,
// the last-second word at 2nd place, and so on. Individual words should remain as it is.
public class ReverseString {
    public static void main(String[] args) {
        String str = "Welcome to Intellij IDEA";

        String str1 = reverseStringWordWise(str);
        System.out.println(str1);

        String str2 = "DataEngineering";
        reverseString2(str2);
        reverseString3(str2);

        //stringbuilder and stringbuffer
        // stringbuilder is not synchronized and faster
        // stringbuffer is synchronized and slower
        // stringbuilder is used when we need to make changes to the string in a single thread
        // stringbuffer is used when we need to make changes to the string in multiple threads
        // stringbuilder is preferred over stringbuffer if thread safety is not a concern

        // lambda expression is used to provide the implementation of a functional interface
        // functional interface is an interface that has only one abstract method


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

    static void reverseString2(String str1){
        char[] arr = str1.toCharArray();

        int left=0,right = str1.length()-1;

        while(left<right){
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        StringBuilder str = new StringBuilder();

        for(char s: arr){
            str.append(s);
        }
        System.out.println(str);
    }
    static void reverseString3(String str1){
        String str = "";

        for(int i=str1.length()-1;i>=0;i--){
            str += str1.charAt(i);
        }
        System.out.println(str);
    }


}
