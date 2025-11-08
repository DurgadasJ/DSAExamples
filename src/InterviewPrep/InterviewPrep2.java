package InterviewPrep;

import java.util.List;
import java.util.stream.Collectors;

public class InterviewPrep2 {
    public static void main(String[] args) {
        List<Integer> lst = List.of(1,2,2,3,3,4,4,4,4);

        // Below functional interfaces are used here
        // Predicate, Function, Consumer
        // Predicate -> filter
        // Function -> groupingBy
        // Consumer -> forEach
        // Collectors.counting() -> Supplier internally

        lst.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getKey().longValue()==e.getValue())
                .forEach(e-> System.out.print(e.getKey()+" "));
    }

}
