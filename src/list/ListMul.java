package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMul {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 5, 6));
        int mul=1;
        for(int i=0;i<lst.size();i++){
            mul = mul*lst.get(i);
        }
        System.out.println(mul);

    }
}

