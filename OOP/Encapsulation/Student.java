public class Student {
    
    String firstname;
    String lastname;
    long studentnumber;
    int age;
    
    public Student(){}//default contructor....
    
    public Student(String firstname, String lastname, long studentnumber, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentnumber = studentnumber;
        this.age = age;
    }
    
    
    public void setFirstName(String firstname){
        this.firstname = firstname;
    }
    public String getFristName(){
        return firstname;
    }
    
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public String getLastName(){
        return lastname;
    }
    
    public void setStudentNumber(long studentnumber){
        this.studentnumber = studentnumber;
    }
    public long getStudentNumber(){
        return studentnumber;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    //1.
        @Override
         public String toString() {
            return "{"
                   + "firstname: " + firstname
                   + ", lastname: "+ lastname
                   + ", studentnumber: "+ studentnumber
                   + ", age: "+age
                   + "}";
         }
    //2.
        /*
            %s - insert a string
            %d - insert a byte, short, int, long and BigInteger
            %f - insert a real number
        */
        /*@Override
        public String toString() {
            return String.format("%s %s %d" %d, firstname, lastname, studentnumber, age);
        }*/
}
