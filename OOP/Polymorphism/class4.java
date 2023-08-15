package Polymorphism;

public class class4 {
    
    int answer;
    
    public class4(){}
    
    public int add(int a, int b){
        answer = a + b;
        return answer;
    }
    
    public int subtract(int a, int b){
        answer = b - a;
        return answer;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return b/a;
    }
}
