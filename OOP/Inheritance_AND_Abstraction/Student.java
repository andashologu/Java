package Inheritance_AND_Abstraction;


//Student is Subclass (child), Person is Superclass (parent) and Main is Mainclass

public class Student extends Person {
    long studentnumber;
    
    public Student(String firstname, String lastname, int age, long studentnumber){
        super(firstname, lastname, age);
        this.studentnumber = studentnumber;
    }
    
    public void displayInfo(){
        System.out.println("I am a Student");
    }

    public double computePay() {
        return 0;
    }
    
    public void setStudentNumber(long studentnumber){
        this.studentnumber = studentnumber;
    }

    public Long getStudentNumber(){
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
