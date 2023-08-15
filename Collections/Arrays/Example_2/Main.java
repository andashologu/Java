package Arrays.Example_2;

import java.util.Random;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of values to be generated: ");
        int max = scanner.nextInt();
        int arr[] = new int[max];
        arr = fillArrayWithRandom(arr);
        printArray(arr);
        scanner.close();
    }

    public static int[] fillArrayWithRandom(int[] array){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            if(i==2){
                System.out.println("Enter value of array index 2:");
                array[i] = scanner.nextInt();
                scanner.close();
                continue;
            }
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void printArray(int arrayToBePrinted[]){
        for(int i = 0; i < arrayToBePrinted.length; i++){
            System.out.println(i+"] = "+arrayToBePrinted[i]);
        }
    }
}
