import java.util.InputMismatchException;
import java.util.Scanner;


public class AdditionCalculator {
    public static void main(String[] args) {
        Boolean continueLoop = true;
        int count = 1;
        do
        {
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter first number: ");
                int fstNum = scanner.nextInt();
                System.out.println("Enter second number: ");
                int secNum = scanner.nextInt();
                int sum = fstNum + secNum;
                System.out.println(fstNum +" + "+secNum+" = "+sum);
                System.out.println("Do you want  to calculate again ?");
                System.out.println("Enter\n"
                                    +"1 - to continue\n"
                                    +"2 - to cancel\n");
                int value = scanner.nextInt();   
                if(value == 2)
                    continueLoop = false;
            }
            catch(NumberFormatException | InputMismatchException exc){
                System.out.println("Non-nummeic values are not allowed !"); 
                System.out.println("Do you want  to calculate again ?");
                System.out.println("Enter\n"
                                    +"1 - to continue\n"
                                    +"2 - to cancel\n");
                Scanner scanner = new Scanner(System.in);
                int value = scanner.nextInt();   
                if(value == 2)
                     continueLoop = false;
            }
            finally{// the final statement will always be reached
                System.out.println("Exucution "+ count++ +"......");
            }
        }
        while(continueLoop);
    }
}
