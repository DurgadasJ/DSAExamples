package JavaImplementation;

import java.util.Objects;

public class Employee {
    //Java Pojo Class

    private int id;

    private String name;

    private String email;


// core java, java8, data structure, unit test, sql server
// thread, thread-safe, collection hashmap, lambda expression, Functional Programming, SOLID Principles
// stream api

    // diff between constructor and method is constructor name is same as class name
    // and no return type
    // Method name can be different and has return type
    // this is used to refer current object
    // Constructor is called when object is created
    // Constructor can be overloaded
    // If no constructor is defined, default constructor is provided by compiler
    // If constructor is defined, default constructor is not provided by compiler
    // Constructor can have parameters
    // Constructor is used to initialize the object
    // Constructor can call another constructor using this()
    // Constructor cannot be abstract, static, final, synchronized
    // Constructor can have access modifiers
    // Constructor cannot be inherited
    // Constructor can throw exceptions
    // Use this to differentiate between instance variables and parameters with same name
    public Employee(int id, String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
//        System.out.println("Employee Constructor called");
//        int a =7;
//        int c =8;
//        int b = a + c;
//        System.out.println("Sum is " + b);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,email);
    }

    // what are we doing in equals method explain line by line
    // 1. Check if the current object is the same as the object being compared
    // 2. Check if the object being compared is an instance of Employee
    // 3. Cast the object being compared to Employee
    // 4. Compare the id, name and email of both objects for equality
    // 5. Return true if all fields are equal, else return false
    // Why do we need to override equals and hashCode methods?
    // Because the default implementation of equals and hashCode methods in Object class
    // compares the memory addresses of the objects, which is not what we want
    // We want to compare the values of the fields of the objects for equality
    // When we override equals method, we must also override hashCode method
    // to maintain the contract between equals and hashCode methods
    // If two objects are equal according to equals method, they must have the same hash code
    // If two objects have the same hash code, they may or may not be equal according to equals method
    // Use Objects.equals() to compare the fields for null safety
    // Use instanceof to check the type of the object being compared
    // Use reference equality check to optimize performance
    // Handle null check in instanceof
    @Override
    public boolean equals(Object obj){
        // is this the same object
        // is obj an instance of Employee
        // cast obj to Employee
        if(this == obj) return true;
        // null check
        // getClass() != obj.getClass() also works but not recommended
        // because it fails for subclasses
        // instanceof works for subclasses also
        // is the equals method recommended way?
        // Yes, because it handles null check and type check in one line
        // is instanceof is recommended way?
        // Yes, because it handles null check and type check in one line
        if(!(obj instanceof Employee)) return false;
        Employee emp = (Employee) obj;
        return Objects.equals(name,emp.name) && Objects.equals(email,emp.email);
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "Employee{id = " + id + ", name = " + name + ", email = " + email + "}";
    }


}
