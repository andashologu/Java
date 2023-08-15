package Polymorphism;

public class class2 {
    
    int a = 15;
    int b = 25;
    int answer;
    
    public class2(){}
    
    public void add(){
        answer = a + b;
        System.out.println(a +" + "+ b +" = "+answer);
    }
    
    public void subtract(){
        answer = b - a;
        System.out.println(b +" - "+ a +" = "+answer);
    }
    public void multiply(){
        answer = a*b;
        System.out.println(a +" x "+ b +" = "+answer);
    }
    public void divide(){
        answer = b/a;
        System.out.println(b +" / "+ a +" = "+answer);
    }
}
