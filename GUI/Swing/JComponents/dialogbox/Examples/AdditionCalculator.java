package dialogbox.Examples;

import javax.swing.JOptionPane;

public class AdditionCalculator {
    public static void main(String[] args) {
        Boolean continueLoop = true;
        int count = 1;
        do
        {
            try{
                String fstNum = JOptionPane.showInputDialog("Enter first number: ");
                String secNum = JOptionPane.showInputDialog("Enter second number: ");
                int sum = Integer.valueOf(fstNum) + Integer.valueOf(secNum);//an error will be executed here when trying to convert non-numeric values
                //the following statements are not reached if the error occurs on the above lines, but the final statement
                JOptionPane.showMessageDialog(null, fstNum +" + "+secNum+" = "+sum);
                int value = JOptionPane.showConfirmDialog(null, "Do you want  to calculate again ?");     
                if(value == 1 | value == 2)
                     continueLoop = false;
            }
            catch(NumberFormatException exc){
                JOptionPane.showMessageDialog(null, "Non-nummeic values are not allowed !", "Bug !!!", JOptionPane.ERROR_MESSAGE);
                int value = JOptionPane.showConfirmDialog(null, "Do you want  to calculate again ?");     
                if(value == 1 | value == 2)
                     continueLoop = false;
            }
            finally{// the final statement will always be reached
                System.out.println(count++);
            }
        }
        while(continueLoop);
    }
}
