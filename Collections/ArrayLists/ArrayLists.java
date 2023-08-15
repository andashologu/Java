package ArrayLists;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> classArrList = new ArrayList<>();
        classArrList.add("Mellisa");
        classArrList.add("Linox");
        classArrList.add("Owethu");
        classArrList.add("Asiphe");
        System.out.println(classArrList);
        for(int i = 0; i<classArrList.size(); i++){
            System.out.println(classArrList.get(i));
        }
    }
}
