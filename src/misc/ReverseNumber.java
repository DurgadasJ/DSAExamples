package misc;

//  Java program to reverse a number
public class ReverseNumber {
    public static void main(String[] args) {
        int num =48953;
        int revnum=0;
        // logic to reverse a number
        while(num>0){
            int rem = num % 10;
            // build the reversed number
            revnum = revnum*10+rem;
            num = num /10;
        }
        System.out.println(revnum);
    }
}
