package Inheritance_AND_Overriding;

//Staff is Subclass (child), Person is Superclass (parent) and Main is Mainclass

public class Staff extends Person {
    long staffnumber;
    int salary;
    
    public Staff(String firstname, String lastname, int age, long staffnumber, int salary){
        super(firstname, lastname, age);
        this.staffnumber = staffnumber;
        this.salary = salary;
    }
    
    public void displayInfo(){
        System.out.println("I am a Staff");
    }
    
    public void setStaffnumber(long staffnumber){
        this.staffnumber = staffnumber;
    }
    public long getStudentNumber(){
        return staffnumber;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    public long getSalary(){
        return salary;
    }
    @Override
     public String toString() {
        return "{"
               + "firstname: " + firstname
               + ", lastname: "+ lastname
               + ", staffnumber: "+ staffnumber
               + ", age: "+age
               + ", salary: "+salary
               + "}";
    }
}
