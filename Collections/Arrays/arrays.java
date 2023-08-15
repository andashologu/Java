package Arrays;

public class arrays {
    public static void main(String[] args) {

        //Arrays of Primitive datatypes

        int[] studNumArray = new int[4]; //this array will not store more than 4 values
        //assigning arrays
        studNumArray[0] = 238332345;
        studNumArray[1] = 238332346;
        studNumArray[2] = 238332347;
        studNumArray[3] = 999999999;
        System.out.println("int array 3: "+studNumArray[3]);

        Long[] idNumArray = new Long[4]; //id numbers cannot be interger because they exceed range
        //assigning arrays
        idNumArray[0] = 9712318722986L;//the L must be put t the end Long value
        idNumArray[1] = 12318722986L;
        idNumArray[2] = 9912318722986L;
        idNumArray[3] = 2318722986L;
        System.out.println("Long array 2"+ idNumArray[2]);

        for(int i = 0; i<=idNumArray.length; i++){
            System.out.println("Long array "+i+": "+idNumArray[i]);
        }

        String[] classArray = new String[]{"Mellisa", "Linox", "Owethu", "Asiphe"};
        //String[] classArray = {"Mellisa", "Linox", "Owethu", "Asiphe"};
        System.out.println(classArray[2]);

        for(int i = 0; i<classArray.length; i++){
            System.out.println(classArray[i]);
        }
    }
}
