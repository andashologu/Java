package Inheritance_AND_Interface;


//Student is Subclass (child), Person is Superclass (parent) and Main is Mainclass

public class StudentAssistant extends Person implements Payable{
    long studentnumber;
    private double rate;
    private double hours;
    
    public StudentAssistant(String firstname, String lastname, int age, long studentnumber, double rate, double hours){
        super(firstname, lastname, age);
        this.studentnumber = studentnumber;
        this.rate = rate;
        this.hours = hours;
    }
    
    public double computePay() {
        return ((rate * hours) * 52) / 12;
    }
    
    public void setStudentNumber(long studentnumber){
        this.studentnumber = studentnumber;
    }
    public Long getStudentNumber(){
        return studentnumber;
    }

    public double getHours() {
        return hours;
     }
     public void setHours(double hours) {
        this.hours = hours;
     }

     public double getRate() {
        return rate;
     }
     public void setRate(double rate) {
       this.rate = rate;
     }

    @Override
     public String toString() {
        return "{"
               + "firstname: " + firstname
               + ", lastname: "+ lastname
               + ", studentnumber: "+ studentnumber
               + ", hours: "+ hours
               + ", rate: "+ rate
               + ", age: "+age
               + "}";
    }
}
