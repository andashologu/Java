package HashMaps;

import java.util.HashMap;

public class HashMaps
{
	
	public static void main(String[] args){

		HashMap<Integer, String> names = new HashMap<Integer, String>();//Different datatypes
		names.put(1, "James");
		names.put(2, "Smith");
		names.put(3, "John");
		names.put(4, "Mary");
		names.put(4, "Anda");//this key will not be duplicate

		System.out.println("Names: " + names);
		System.out.println("Second name/ key 2:" + names.get(2));
	}
}
