package DataStructures.Searching.BinarySearch;

import java.util.Random;

class RecursiveMethod {



	public static int[] fillArrayWithRandom(int[] array){
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
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