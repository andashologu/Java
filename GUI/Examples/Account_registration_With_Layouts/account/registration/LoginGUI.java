package Account_registration_With_Layouts.account.registration;

import java.awt.Color;
import java.awt.Dimension;
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

public class LoginGUI extends JFrame{
    
    private JLabel usrnamLbl, pwdLbl;
    private JTextField usrnamFld, pwdFld;
    private JButton sgnupBtn, lgnBtn;
    
    private JPanel panel;
    
    String username, password;
     
    public LoginGUI(){       
        
        super("Login GUI");
        
        usrnamLbl = new JLabel("Username");
        pwdLbl = new JLabel("Password");
        usrnamFld = new JTextField(10);
        pwdFld = new JTextField(10);
        sgnupBtn = new JButton("Sign up");
        lgnBtn = new JButton("Login");
        
        panel = new JPanel(new GridLayout(3,2));
        Border border = new LineBorder(Color.GRAY, 1, true);
        panel.setBorder(border);
        
        panel.add(usrnamLbl);
        panel.add(usrnamFld);
        panel.add(pwdLbl);
        panel.add(pwdFld);
        panel.add(sgnupBtn);
        panel.add(lgnBtn);
        
        add(panel);  
        
        ButtonHandler handler = new ButtonHandler();
        lgnBtn.addActionListener(handler);
        sgnupBtn.addActionListener(handler);

        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));    
        setSize(new Dimension(300,300));    
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private class ButtonHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == lgnBtn){
                username = usrnamFld.getText();
                password = pwdFld.getText();
                System.out.println(username+" successfully logged in...");
            }
            else if(e.getSource() == sgnupBtn){
                new SignupGUI();
                dispose();
            }
            else{}
        }
    }
}
