package Inheritance_AND_Interface;


//Student is Subclass (child), Person is Superclass (parent) and Main is Mainclass

public class Student extends Person implements Payable{
    long studentnumber;
    
    public Student(String firstname, String lastname, int age, long studentnumber){
        super(firstname, lastname, age);
        this.studentnumber = studentnumber;
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
