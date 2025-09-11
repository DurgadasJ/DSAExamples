package streams;

public class Employee {

    private String name;

    private int age;

    private String dept;

    private double salary;

    private String manager;

    public Employee(String name, int age, String dept, double salary,String manager) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
        this.manager = manager;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDept() {
        return dept;
    }
    public double getSalary() {
        return salary;
    }
    public String getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + ", manager=" + manager + "]";
    }

}
