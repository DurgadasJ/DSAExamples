package string;

public class StarCounter {
    public static void main(String[] args) {
        int n =3;
        //1 3 5 7 9 11 13 15

        int sum = 2*n -1;
        for(int i=0;i<n;i++){
            for(int l=0;l<i;l++){
                System.out.print("  ");
            }
            for(int j=0;j<sum;j++){
                System.out.print("* ");
            }
            sum -=2;
            System.out.println();
        }
    }
}
