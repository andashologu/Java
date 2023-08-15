import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArraysAndArrayLists {
    
    public static void main(String[] args) {
        //1. ArrayLists
        
        ArrayList<String> classArrList = new ArrayList<>();
        classArrList.add("Mellisa");
        classArrList.add("Linox");
        classArrList.add("Owethu");
        classArrList.add("Asiphe");
        System.out.println(classArrList);
        for(int i = 0; i<classArrList.size(); i++){
            System.out.println(classArrList.get(i));
        }
         
        //2. Arrays 
        Integer StudNumArray_2[] = new Integer[4]; //this array will not store more than 4 values
        //assigning arrays
        StudNumArray_2[0] = 238332345;
        StudNumArray_2[1] = 238332346;
        StudNumArray_2[2] = 238332347;
        StudNumArray_2[3] = 238332348;
            
        //3. Arrays to ArrayLists    
        System.out.println("Student number list:");
        ArrayList<Integer> StudNumArrList = new ArrayList<>();
        for(int i=0; i<StudNumArray_2.length;i++){
            StudNumArrList.add(StudNumArray_2[i]);
        } 
        System.out.println(StudNumArrList);
        
        //4. Array to List
        List<Integer> StudNumList_2 = Arrays.asList(StudNumArray_2);
        System.out.println("Student number list 2:"+StudNumList_2);

        //5. DIMENSIONAL ARRAYS to DIMENSIONAL ARRAYSLISTS
            
        String[][] fullnamesArray = {
                                        {"Mellisi","Ncube"},
                                        {"Linox", "Maronking"},
                                        {"Owethu", "Mthunzi"},
                                        {"Asiphe", "Mthotho"}
                                    };
        System.out.println("Todays Attendees:");
        //array                        
        for(int i=0; i<fullnamesArray.length;i++){
            for(int j=0; j<fullnamesArray[i].length;j++){
                System.out.printf(fullnamesArray[i][j]+" ");
            }
            System.out.printf("\n");
        }   
        //convert array to arraylist
        ArrayList<ArrayList<String>> fullnamesList = new ArrayList<>(); 
        for(int i=0; i<fullnamesArray.length; i++){
            fullnamesList.add(new ArrayList<>());//create empty column before using get(i);
            for(int j=0; j<fullnamesArray[i].length; j++){//add on columns (j) on each row (i)
                fullnamesList.get(i).add(fullnamesArray[i][j]);
            }
        }
        System.out.println("full list: "+ fullnamesList);
    }
}