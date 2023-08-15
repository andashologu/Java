package Polymorphism;

public class class3 {
    
    int answer;
    
    public class3(){}
    
    public void add(int a, int b){
        answer = a + b;
        System.out.println(a +" + "+ b +" = "+answer);
    }
    
    public void subtract(int a, int b){
        answer = b - a;
        System.out.println(b +" - "+ a +" = "+answer);
    }
    public void multiply(int a, int b){
        answer = a*b;
        System.out.println(a +" x "+ b +" = "+answer);
    }
    public void divide(int a, int b){
        answer = b/a;
        System.out.println(b +" / "+ a +" = "+answer);
    }
}
