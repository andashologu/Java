package Sorting_AND_Searching;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<String> classArrList = new ArrayList<>();
        classArrList.add("Mellisa");
        classArrList.add("Linox");
        classArrList.add("Owethu");
        classArrList.add("Asiphe");
        System.out.println(Collections.binarySearch(classArrList, "Linox"));  
    }
}
