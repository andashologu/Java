package Polymorphism;

public class class1 {

    /**
     * @param args the command line arguments
     */
    
    static int a = 15;
    static int b = 25;
    
    public static void add(){
        int sum = a + b;
        System.out.println(a +" + "+ b +" = "+sum);
    }
    
    public static void subtract(){
        int difference = b - a;
        System.out.println(b +" - "+ a +" = "+difference);
    }
    public static void multiply(){
        int product = a*b;
        System.out.println(a +" x "+ b +" = "+product);
    }
    public static void divide(){
        int quotient = b/a;
        System.out.println(b +" / "+ a +" = "+quotient);
    }
    
    public static void main(String[] args) {
       //1. static........................................................................................................................... 
        add();
        subtract();
        multiply();
        divide();
       
       //2. non static......................................................................................................................
       class2 class_2 = new class2();
       class_2.add();
       class_2.subtract();
       class_2.multiply();
       class_2.divide();
       
       //3. dynamic.............................................................................................................................
       class3 class_3 = new class3();
       class_3.add(2, 5);
       class_3.subtract(5, 7);
       class_3.multiply(6, 89);
       class_3.divide(5, 25);
       
       //5. dynamic..........................................................................................................................
       class4 class_4 = new class4();
       class_4.add(2, 5);
       class_4.subtract(5, 7);
       class_4.multiply(6, 89);
       class_4.divide(5, 25);
    }
}
