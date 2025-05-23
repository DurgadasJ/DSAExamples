package JavaPractice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;

public class MyClass implements Runnable, Predicate, Callable {
    public static void main(String[] args) throws Exception {

        String str = "My Java";
        String str1 = new String("My Java");

        boolean a = str.equals(str1);
        System.out.println(a);

        MyJavaClass myjc= new MyJavaClass();
        myjc.display();
        myjc.default_1method();
        MyInterface.static_1method();
//
//        System.out.println("Saurabh Joshi");
//
//        Thread thread_ = new Thread();
//
//        thread_.start();
//
//        System.out.println("By extending thread class "+thread_.getName());
//        ExecutorService execute = Executors.newFixedThreadPool(4);
//
//
//        for(int i=0;i<4;i++) {
//            execute.submit(() -> {
//                System.out.println("task is runing on " + Thread.currentThread().getName());
//            });
//        }
//        execute.shutdown();
//
//        MyClass mcls = new MyClass();
//        mcls.run();
//        System.out.println(mcls.test(5));
//        System.out.println(mcls.call());

    }

    @Override
    public void run() {
        System.out.println("Implementation of Runnable");
    }

    @Override
    public boolean test(Object o) {
        return 5%2==1;
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
