package Inheritance_AND_Overriding;


//Student is Subclass (child), Person is Superclass (parent) and Main is Mainclass

public class Student extends Person {
    long studentnumber;
    
    public Student(String firstname, String lastname, int age, long studentnumber){
        super(firstname, lastname, age);
        this.studentnumber = studentnumber;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("I am a Student");
    }
    
    public void setStudentNumber(long studentnumber){
        this.studentnumber = studentnumber;
    }
    public long getStudentNumber(){
        return studentnumber;
    }
    @Override
     public String toString() {
        return "{"
               + "firstname: " + firstname
               + ", lastname: "+ lastname
               + ", studentnumber: "+ studentnumber
               + ", age: "+age
               + "}";
    }
}
