package streams;

public class SpecialCharStream {
    public static void main(String[] args) {
        String str = "a,bc%de";
        //e,dc%bc
        int left = 0;
        int right = str.length()-1;

        char [] arr = str.toCharArray();

        while(left<right){
            if(!Character.isLetter(arr[left])){
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        String str_ = new String(arr);
        System.out.println(str_);
        for(int i=0;i<str.length();i++){
            System.out.print(arr[i]);
        }

    }
}
