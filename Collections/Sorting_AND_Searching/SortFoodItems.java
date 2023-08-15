package Sorting_AND_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortFoodItems
{
    public static void main(String[] args)
    {
        String items[] = { "fig",  "apple", "date", "banana", "egg", "carrot" };
        System.out.println("Original List: " + Arrays.toString(items));

        items = sortItems(items, false);
        System.out.println("Ascending List: " + Arrays.toString(items));

        items = sortItems(items, true);
        System.out.println("Descending List: " + Arrays.toString(items));
    }

    public static String[] sortItems(String items[], boolean inReverse)
    {
        ArrayList<String> itemsList = new ArrayList<>();
        for(int i = 0; i<items.length; i++){
            itemsList.add(items[i]);
        }
        if(inReverse)
            Collections.sort(itemsList, Collections.reverseOrder());
        else
            Collections.sort(itemsList);
        

        for(int i = 0; i<itemsList.size(); i++)
            items[i] = itemsList.get(i);
        return items;
    }
}

/**
 *
    Complete the implementation of the sortItems() method in the Java program below so that the strings are sorted in alphabetical order when inReverse = false (i.e. ascending order).

    When inReverse = true, the list should be returned in reverse alphabetical order (i.e. descending order).

    e.g. Given the following original list: "fig", "apple", "date", "banana", "egg", "carrot"

    sortItems(items, false); 
    should return: "apple", "banana", "carrot", "date", "egg", "fig"

    and

    sortItems(items, true); 
    should return: "fig", "egg", "date", "carrot", "banana", "apple"
 */