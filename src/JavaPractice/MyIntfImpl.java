package JavaPractice;

public class MyIntfImpl implements MyInterface {
    @Override
    public void display() {
        System.out.println("Implementing abstract method of Interface");
    }

    public static void main(String[] args) {

        MyIntfImpl obj = new MyIntfImpl();
        obj.display();
        MyInterface.static_1method();
        obj.default_1method();
    }
}
