package Inheritance_AND_Interface;

//Staff is Subclass (child), Person is Superclass (parent) and Main is Mainclass

public class Staff extends Person implements Payable {
    
    long staffnumber;
    private double rate;
    private double hours;
    
    public Staff(String firstname, String lastname, int age, long staffnumber, double rate, double hours){
        super(firstname, lastname, age);
        this.staffnumber = staffnumber;
        this.rate = rate;
        this.hours = hours;
    }

    public double computePay() {
        return ((rate * hours) * 52) / 12;
    }
    
    public void setStaffnumber(long staffnumber){
        this.staffnumber = staffnumber;
    }
    public long getStudentNumber(){
        return staffnumber;
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
               + ", staffnumber: "+ staffnumber
               + ", hours: "+ hours
               + ", rate: "+ rate
               + ", age: "+age
               + "}";
    }
}
