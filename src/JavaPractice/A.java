package JavaPractice;

public class A {
    Object show(){
    return "A";
    }
}

class B extends A{
    String show(){
        return "B";
    }

    public static void main(String[] args) {
         B s = new B();
        System.out.println(s.show());
    }
}
