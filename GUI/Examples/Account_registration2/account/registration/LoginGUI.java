package Account_registration2.account.registration;

import java.awt.Color;
import java.awt.Dimension;
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

public class LoginGUI{
    
    private JLabel usrnamLbl, pwdLbl;
    private JTextField usrnamFld, pwdFld;
    private JButton sgnupBtn, lgnBtn;
    
    private JPanel panel;

    private JFrame frame;
    
    String username, password;
     
    public LoginGUI(){       
        
        usrnamLbl = new JLabel("Username");
        usrnamLbl.setBounds(5,5,100,25);
        pwdLbl = new JLabel("Password");
        pwdLbl.setBounds(5,35,100,25);
        usrnamFld = new JTextField();
        usrnamFld.setBounds(110, 5, 100, 25);
        pwdFld = new JTextField();
        pwdFld.setBounds(110, 35, 100, 25);
        sgnupBtn = new JButton("Sign up");
        sgnupBtn.setBounds(5, 65, 100, 25);
        lgnBtn = new JButton("Login");
        lgnBtn.setBounds(110, 65, 100, 25);
        
        panel = new JPanel(null);
        Border border = new LineBorder(Color.GRAY, 1, true);
        panel.setBorder(border);
        
        panel.add(usrnamLbl);
        panel.add(usrnamFld);
        panel.add(pwdLbl);
        panel.add(pwdFld);
        panel.add(sgnupBtn);
        panel.add(lgnBtn);
        
    
        frame = new JFrame("Login GUI");
        frame.setLayout(new GridLayout());    
        frame.setSize(new Dimension(300,300));    
        frame.setVisible(true);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ButtonHandler handler = new ButtonHandler();
        lgnBtn.addActionListener(handler);
        sgnupBtn.addActionListener(handler);
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
                frame.dispose();
            }
            else{}
        }
    }
}
