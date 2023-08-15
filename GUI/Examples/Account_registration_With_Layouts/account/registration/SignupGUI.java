package Account_registration_With_Layouts.account.registration;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class SignupGUI extends JFrame{
    
    private JLabel fstnamLbl, lstnamLbl, usrnamLbl, pwdLbl;
    private JTextField fstnamFld, lstnamFld, usrnamFld, pwdFld;
    private JButton sgnupBtn;
   
    private JPanel panel1, panel2;
    
    String firstname, lastname, username, password;
    
            
    public SignupGUI(){  
        
        super("Signup GUI");
        
        fstnamLbl = new JLabel("Firstname");
        lstnamLbl = new JLabel("Lastname");
        usrnamLbl = new JLabel("Username");
        pwdLbl = new JLabel("Password");
        fstnamFld = new JTextField(10);
        lstnamFld = new JTextField(10);
        usrnamFld = new JTextField(10);
        pwdFld = new JTextField(10);
        sgnupBtn = new JButton("Sign up");
        
        panel1 = new JPanel(new GridLayout(5,2));
        panel2 = new JPanel(new FlowLayout());
        Border border = new LineBorder(Color.GRAY, 1, true);
        panel1.setBorder(border);
        panel2.setBorder(border);
        
        panel1.add(fstnamLbl);
        panel1.add(fstnamFld);
        panel1.add(lstnamLbl);
        panel1.add(lstnamFld);
        panel1.add(usrnamLbl);
        panel1.add(usrnamFld);
        panel1.add(pwdLbl);
        panel1.add(pwdFld);
        panel2.add(sgnupBtn);
        
        add(panel1); 
        add(panel2);
        
        setLayout(new GridLayout(2,1));    
        setSize(300,300);    
        setVisible(true);   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        ButtonHandler handler = new ButtonHandler();
        sgnupBtn.addActionListener(handler);
    }
    
    private class ButtonHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == sgnupBtn){
                firstname = fstnamFld.getText();
                lastname = lstnamFld.getText();
                username = usrnamFld.getText();
                password = pwdFld.getText();
                
                System.out.println(firstname +" "+ lastname +" successfully signed up...");

                new LoginGUI();
                dispose();
            }
        }
    }
}
