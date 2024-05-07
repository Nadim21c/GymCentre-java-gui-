import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    

    Login(){

        JFrame loginFrame =new JFrame("LOGIN");
        loginFrame.setVisible(true);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setResizable(true);
        loginFrame.setSize(1600,800);
        //setLocationRelativeTo(null);
        loginFrame.getContentPane().setBackground(Color.WHITE);
        //this.getContentPane().setLayout(new FlowLayout());
        loginFrame.setLayout(null);


        JLabel welcomeText = new JLabel("Welcome Back!");
        welcomeText.setBounds(750, 120, 500, 80); 
        welcomeText.setFont(new Font("Hellix", Font.BOLD, 40)); 
        welcomeText.setForeground(Color.black); 
        loginFrame.add(welcomeText);



        JLabel detailsText = new JLabel("Please enter your details");
        detailsText.setBounds(810, 165, 500, 80); 
        detailsText.setFont(new Font("ARIAL", Font.PLAIN, 15)); 
        detailsText.setForeground(Color.black); 
        loginFrame.add(detailsText);


        // Email Text Field 
        JTextField email = new JTextField("   Email");
        email.setBounds(750,280,250,40);
        email.setBackground(Color.white);
        loginFrame.add(email);


        // Password Text Filed
        JTextField passField = new JTextField("   Password");
        passField.setBounds(750,360,250,40);
        passField.setBackground(Color.white);
        loginFrame.add(passField);


        // forget button
        JButton forgetButton = new JButton("forgot password");
        forgetButton.setBounds(880, 420, 120, 20); 
        forgetButton.setFont(new Font("ARIAL", Font.PLAIN, 10)); 
        forgetButton.setForeground(Color.black); 
        forgetButton.setBackground(Color.white);
        loginFrame.add(forgetButton);



        // login enter button 
        JButton loginJButton = new JButton("Log In");
        loginJButton.setBounds(750, 485, 120, 40); 
        loginJButton.setFont(new Font("ARIAL", Font.PLAIN, 20)); 
        loginJButton.setForeground(Color.lightGray); 
        loginJButton.setBackground(Color.black);
        loginFrame.add(loginJButton);



        // Sign-Up Button
        JButton signJButton = new JButton("Sign-Up");
        signJButton.setBounds(880, 485, 120, 40); 
        signJButton.setFont(new Font("ARIAL", Font.PLAIN, 20)); 
        signJButton.setForeground(Color.lightGray); 
        signJButton.setBackground(Color.black);
        loginFrame.add(signJButton);

        signJButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
                new SignUpFrame();
            }
            
        });


        ImageIcon logoIcon = new ImageIcon("logo2.jpg");
        JLabel logoJLabel = new JLabel(logoIcon);
        logoJLabel.setBounds(150, 120, logoIcon.getIconWidth(), logoIcon.getIconHeight()); // Adjust position and size based on image
        loginFrame.add(logoJLabel);



    }

    public static void main(String[] args) {
        new Login();
    }
}
