package ArrayLists;

import java.util.ArrayList;

public class DimensionalArrayLists {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> fullnamesList = new ArrayList<>(); 
        fullnamesList.add(new ArrayList<>());//create empty column before using get(i);
        fullnamesList.get(0).add("Mellisa");
        fullnamesList.get(0).add("Ncube");
        fullnamesList.add(new ArrayList<>());
        fullnamesList.get(1).add("Owethu");
        fullnamesList.get(1).add("Mthunzi");

        System.out.println("full list: "+fullnamesList);

        System.out.println("get 2nd row 2nd second column: "+fullnamesList.get(1).get(1));
    }
}
