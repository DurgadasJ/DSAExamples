package hackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentSolution {
    public static void main(String[] args) {
        List<Student> stu = Arrays.asList(
                new Student(1,"john", 12 ,"john@gmail.com","doe"),
                new Student(2,"john", 13 ,"j1ohn@gmail.com","do1e"),
                new Student(3,"sam", 12 ,"johnsd@gmail.com","dsdoe")
        );

         Set<Student> studentSet = new HashSet<>(stu);
         for(Student student: studentSet){
             System.out.println(student);
         }

        System.out.println(stu);
    }
}
