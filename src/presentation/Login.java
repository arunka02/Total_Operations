package presentation;

import service.UserService;
import service.impl.UserServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    
    private JLabel lbluname;
    private JLabel lblpword;
    private JTextField txtuname;
    private JPasswordField txtpword;
    private JButton btnOk;
    
    public Login() {
        
        setLayout(new FlowLayout());
        
        lbluname = new JLabel("Username: ");
        lblpword = new JLabel("Password: ");
        txtuname = new JTextField(10);
        txtpword = new JPasswordField(10);
        btnOk = new JButton("Ok");
        
        add(lbluname);
        add(txtuname);
        add(lblpword);
        add(txtpword);
        add(btnOk);
        
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname = txtuname.getText();
                String pword = txtpword.getText();
                if(uname.equals("")) {
                    JOptionPane.showMessageDialog(null,"Please enter username!","Login",JOptionPane.INFORMATION_MESSAGE);
                } else if(pword.equals("")) {
                    JOptionPane.showMessageDialog(null,"Please enter password!","Login",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    UserService userService = new UserServiceImpl();
                    boolean status = userService.authenticateUser(uname, pword);
                    if(status) {
                        JOptionPane.showMessageDialog(null,"Login successful...","Username",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,"Invaild username or password","Password",JOptionPane.ERROR_MESSAGE);    
                    }
                    
                }
                
            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setTitle("Login");
        login.setSize(250,200);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
