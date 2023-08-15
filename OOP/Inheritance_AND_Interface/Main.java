package Inheritance_AND_Interface;


public class Main{

    public static void main(String[] args) {
        
        Student student = new Student("Anda", "Shologu", 218332173, 15);
        System.out.println("Full details: "+student);
        System.out.println("Hi "+ student.getFristName() + " "+student.getLastName());
        System.out.println("Our system detected your typical average to be: "+student.computePay());
        
        StudentAssistant assistant = new StudentAssistant("Anda", "Shologu", 15, 218332173, 15, 9);
        System.out.println("Full details: "+assistant);
        System.out.println("Hi "+ assistant.getFristName() + " "+assistant.getLastName());
        System.out.println("Our system detected your typical average to be: "+assistant.computePay());

        Staff staff = new Staff("Anda", "Shologu", 15, 218332173, 15, 9);
        System.out.println("Full details: "+staff);
        System.out.println("Hi "+ student.getFristName() + " "+student.getLastName());
        System.out.println("Our system detected your typical average to be: "+staff.computePay());
    }
}
