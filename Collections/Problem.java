import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem{

  public static List<Integer> findNumbersWithCount(int[] listOfNumbers, int countOfOccurrenceThreshold){

    List<Integer> output = new ArrayList<Integer>();
    for(int i=0; i<listOfNumbers.length; i++)
        output.add(listOfNumbers[i]);
    if(output == null || output.size() == 0)
      return output;
    
    Set<Integer> valuesThatOccurNTimesSet = new HashSet<>();
    Map<Integer, Integer> valueCounts = new HashMap<>();
    for (Integer number : output){
      //short method:
      //int currentNumCount = valueCounts.getOrDefault(number, 0) + 1;
      
      //Long method:
      Integer currentNumCount = valueCounts.get(number);//return the mapped column (meaning the other column in this same row)
      if (currentNumCount == null){
          currentNumCount = 1;//All the numbers will be add map key 1 initially
      } else{
          currentNumCount++;//All the existing number will be given previous map (currentNumCount) key + 1 
      }
      valueCounts.put(number, currentNumCount);
      if (currentNumCount >= countOfOccurrenceThreshold) { /*As the map keys keep incrementing if a map key ever reach countOfOccurrenceThreshold or is greater, add to valuesThatOccurNTimesSet!*/
        valuesThatOccurNTimesSet.add(number);
      }
    }
    return new ArrayList<>(valuesThatOccurNTimesSet);
  }

	public static void main(String[] args) {
    int y[] = new int[] {5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 };
    List<Integer> x = findNumbersWithCount(y, 2);
    System.out.println("Numbers that appear twice and more: "+x);
	}
}