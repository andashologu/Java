package Overloading;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Dog chip = new Dog();
        chip.count();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial value");
        int from = scanner.nextInt();
        System.out.println("Enter final value");
        int to = scanner.nextInt();
        chip.count(from, to);
        scanner.close();
    }
}
