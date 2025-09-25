package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMul {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 5, 6));

        List<Integer> lst1 = Arrays.asList(1, 2, 5, 6);
        int mul=1;
        for(int i=0;i<lst.size();i++){
            mul = mul*lst.get(i);
        }
        System.out.println(mul);
        // lst1.add(7); gives error as it is not allowed as list is immutable here
        lst.add(7);
        int mul1=1;
        for(int i=0;i<lst.size();i++){
            mul1 = mul1*lst.get(i);
        }
        System.out.println(mul1);

    }
}

