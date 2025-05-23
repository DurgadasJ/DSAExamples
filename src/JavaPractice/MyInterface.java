package JavaPractice;

@FunctionalInterface
public interface MyInterface {

    void display();

    static void static_1method(){
        System.out.println("Static Method Called");
    }

    default void default_1method(){
        System.out.println("Default Method Called");
    }
}
