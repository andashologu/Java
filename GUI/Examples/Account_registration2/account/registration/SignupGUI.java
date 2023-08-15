package Account_registration2.account.registration;

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

public class SignupGUI{
    
    private JLabel fstnamLbl, lstnamLbl, usrnamLbl, pwdLbl;
    private JTextField fstnamFld, lstnamFld, usrnamFld, pwdFld;
    private JButton sgnupBtn;
   
    private JPanel panel1, panel2;

    private JFrame frame;
    
    String firstname, lastname, username, password;
    
    public SignupGUI(){       
        
        fstnamLbl = new JLabel("Firstname");
        fstnamLbl.setBounds(5,5,100,25);
        lstnamLbl = new JLabel("Lastname");
        lstnamLbl.setBounds(5,35,100,25);
        usrnamLbl = new JLabel("Username");
        usrnamLbl.setBounds(5,60,100,25);
        pwdLbl = new JLabel("Password");
        pwdLbl.setBounds(5,85,100,25);
        fstnamFld = new JTextField();
        fstnamFld.setBounds(115,5,100,25);
        lstnamFld = new JTextField();
        lstnamFld.setBounds(115,35,100,25);
        usrnamFld = new JTextField();
        usrnamFld.setBounds(115,60,100,25);
        pwdFld = new JTextField();
        pwdFld.setBounds(115,85,100,25);
        sgnupBtn = new JButton("Sign up");
        
        panel1 = new JPanel(null);
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
        
        
        frame = new JFrame("Signup GUI");
        frame.setLayout(new GridLayout(2,1));    
        frame.setSize(300,300);    
        frame.setVisible(true);  
        frame.add(panel1); 
        frame.add(panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
                frame.dispose();
            }
        }
    }
}
