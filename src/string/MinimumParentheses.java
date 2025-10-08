package string;

public class MinimumParentheses {
    public static void main(String[] args) {
        String str = "))(";
        int count = mincount(str);
        System.out.println(count);
    }



    private static int mincount(String str) {
        int n= str.length(), lcount=0,rcount=0,added=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == '('){
                lcount  += 1;
            }else if(str.charAt(i) == ')'){
                if(lcount>rcount){
                    rcount += 1;
                }else{
                    added +=1;
                }
            }
        }
        added = added + lcount-rcount;
        return added;
    }
}
