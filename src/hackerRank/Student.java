package hackerRank;

import java.util.Objects;

public class Student {
    private int id;

    private String name;

    private int age;

    private String email;

    private String parentName;

    public Student(int id, String name, int age, String email, String parentName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.parentName = parentName;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getParentName() {
        return parentName;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setParentName(String parentName){
        this.parentName = parentName;
    }

    // Two students are considered equal if they have the same name
    // Override equals and hashCode methods accordingly
    // Use Objects.hash() for hashCode implementation
    // Use instanceof to check the type in equals method
    // Check for reference equality in equals method
    // Return false if the object is not an instance of Student in equals method
    // Cast the object to Student in equals method
    @Override
    public boolean equals(Object o){
        // check reference equality
        // if both references point to the same object
        // return true
        if(this ==o ) return true;
        // check if the object is an instance of Student
        // if not return false
        // instance means the object is of the same type
        if(!(o instanceof Student)) return false;

        // cast the object to Student
        // now we can access the name field
        Student student = (Student) o;

        return name.equals(student.name);
    }


    // The hashCode method should return the hash code of the name field
    // Use Objects.hash() for hashCode implementation
    // Use the name field to compute the hash code
    // Ensure that equal objects have the same hash code
    // can you help me the flow once name is added how the process will be
    // when we add the name to the set it will check the hashcode of the name if it is same
    // it will check the equals method if it is same it will not add to the set
    // if hashcode is different it will add to the set
    @Override
    public int hashCode(){
        // hascode will be called before equals method
        // equals method will be called only if the hashcode is same
        // there may be case hashcode is same but equals method is false
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", parentName="
                + parentName + "]";
    }

}
