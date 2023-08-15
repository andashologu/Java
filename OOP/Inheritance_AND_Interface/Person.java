package Inheritance_AND_Interface;

public class Person {
       
    String firstname;
    String lastname;
    int age;
    
    
    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
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
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
        @Override
         public String toString() {
            return "{"
                   + "firstname: " + firstname
                   + ", lastname: "+ lastname
                   + ", age: "+age
                   + "}";
         }
}
