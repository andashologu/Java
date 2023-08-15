public class Main {

    public static void main(String[] args) {
        
        //1.
        Student student = new Student();
        student.setFirstName("Anda");
        System.out.println("Hi "+student.getFristName());
        System.out.println("Full details: "+student);
        
        //2.
        student= new Student("Anda", "Shologu", 218332173, 15);
        System.out.println("Full details: "+student);
        System.out.println("Hi "+ student.getFristName() + " "+student.getLastName());
        
        //3.
        Student[] students = {
                              new Student("Anda", "Shologu", 218332173, 15),
                              new Student("Melissa", "Ncube", 228332273, 19),
                              new Student("Owethu", "Mthuthu", 228332274, 19)
                             };
        
        System.out.println("First student: "+ students[0]);
        System.out.println("First student name: "+ students[0].getFristName());
        System.out.println("Student: ");
        for (Student stud : students) {
            System.out.println(stud);
        }
    }
}
