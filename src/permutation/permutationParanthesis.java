package permutation;

import java.util.ArrayList;
import java.util.List;

public class permutationParanthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> res = new ArrayList<String>();
        List<String> res_1 = recurse(res, 0, 0, "", n);
        System.out.println(res_1);
    }

    public static List<String> recurse(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return res;
        }

        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }
        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }

        return res;
    }
}
