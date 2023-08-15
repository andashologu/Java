package Arrays;

public class DimensionalArrays {

    public static void main(String[] args) {

        String[][] fullnamesArray = {
                                        {"Mellisi","Ncube"},
                                        {"Linox", "Maronking"},
                                        {"Owethu", "Mthunzi"},
                                        {"Asiphe", "Mthotho"}
                                    };
        System.out.println("Todays Attendees:");
        //arrays                        
        for(int i=0; i<fullnamesArray.length;i++){
            for(int j=0; j<fullnamesArray[i].length;j++){
                System.out.printf(fullnamesArray[i][j]+" ");
            }
            System.out.printf("\n");
        } 
    }
}
