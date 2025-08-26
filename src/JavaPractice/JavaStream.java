package JavaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String [] args){

        //ways to create list
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        List<String> names2 = List.of("John", "Jane", "Jack");
        List<String> names3 = new ArrayList<>(Arrays.asList("John", "Jane", "Jack"));
        names3.add("Jill");
        //will we be able add element is names or names2??
        //names.add("Jill"); // will throw UnsupportedOperationException
        //names2.add("Jill"); // will throw UnsupportedOperationException
        System.out.println(names3);
        System.out.println(names);

        //ways to create set
        Set<String> nameSet = new HashSet<>(Arrays.asList("John", "Jane", "Jack"));
        Set<String> nameSet2 = Set.of("John", "Jane", "Jack");
//        Set<String> nameSet4 = Arrays.asSet("John", "Jane", "Jack");// will throw error as Arrays doesn't have asSet method
        Set<String> nameSet3 = new LinkedHashSet<>(Arrays.asList("John", "Jane", "Jack"));
        nameSet3.add("Jill");
        //will we be able add element is nameSet or nameSet2??
        //nameSet.add("Jill"); // will work
        //nameSet2.add("Jill"); // will throw UnsupportedOperationException
        System.out.println(nameSet);

        //ways to create map
        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.put("John", 1);
        nameMap.put("Jane", 2);
        nameMap.put("Jack", 3);
        Map<String, Integer> nameMap2 = Map.of("John", 1, "Jane", 2, "Jack", 3);
        Map<String, Integer> nameMap3 = new LinkedHashMap<>();
        nameMap3.put("John", 1);
        nameMap3.put("Jane", 2);
        nameMap3.put("Jack", 3);
        nameMap3.put("Jill", 4);
        System.out.println(nameMap);
        //will we be able add element is nameMap2??
        //nameMap2.put("Jill", 4); // will throw UnsupportedOperationException

        List<String> lst = new ArrayList<>();

        lst.add("John");
        lst.add("Inesh");
        lst.add("luc");

//        lst.stream().filter(s->s.length()>3).map(String::toUpperCase).forEach(System.out::println);

        List<Integer> salary = new LinkedList<>();
        salary.add(10000);
        salary.add(15000);
        salary.add(20000);

//        System.out.println(salary.stream().sorted(Comparator.reverseOrder()).limit(1).findFirst().orElse(1));
//        System.out.println(salary.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0));

        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Inesh");
        set.add("luc");
        set.add("John");
        set.stream().forEach(System.out::println);

        Set<Integer> setSalary = new LinkedHashSet<>();
        setSalary.add(10000);
        setSalary.add(15000);
        setSalary.add(20000);
        setSalary.add(10000);

        Set<Integer> sortedSet = setSalary.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new));
        setSalary.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new)).forEach(System.out::println);
        System.out.println(sortedSet);


    }
}

