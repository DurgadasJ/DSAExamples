package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsByRange {
        public static void main(String[] args) {
            List<Integer> lst = List.of(2,4,23,12,25,17,30,39);

            System.out.println(lst.stream().collect(Collectors.groupingBy(n->
                    {
            int remainder = n%10;
            int lower = n-remainder;
            int upper =lower+9;

            return lower+"-"+upper;
                }
        ))
            );

        }


}
