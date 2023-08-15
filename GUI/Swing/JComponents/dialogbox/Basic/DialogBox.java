package dialogbox.Basic;

import javax.swing.JOptionPane;

public class DialogBox {

    
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello World");

        //Types of Dialog Box
        
        //ERROR_MESSAGE
        //INFORMATION_MESSAGE
        //WARNING_MESSAGE
        //QUESTION_MESSAGE
        //PLAIN MESSAGE
        
        
       JOptionPane.showMessageDialog(null, "Throwing message for exceptions....", "Bug",JOptionPane.ERROR_MESSAGE);

       
    }
    
}
