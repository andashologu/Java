package Inheritance_AND_Overriding;


public class Main{

    public static void main(String[] args) {
        
        Student student= new Student("Anda", "Shologu", 218332173, 15);
        System.out.println("Full details: "+student);
        System.out.println("Hi "+ student.getFristName() + " "+student.getLastName());
        
        Staff staff= new Staff("Anda", "Shologu", 218332173, 15, 9898987);
        System.out.println("Full details: "+staff);
        System.out.println("Hi "+ student.getFristName() + " "+student.getLastName());
    }
}
