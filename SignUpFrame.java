import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;

public class SignUpFrame {

        SignUpFrame(){
            
        JFrame sign_Frame =new JFrame("SignUp");
        sign_Frame.setVisible(true);
        sign_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sign_Frame.setResizable(true);
        sign_Frame.setSize(1600,800);
        //setLocationRelativeTo(null);
        sign_Frame.getContentPane().setBackground(Color.white);
        //this.getContentPane().setLayout(new FlowLayout());
        sign_Frame.setLayout(null);




        JLabel welcomeText = new JLabel("Create a Account");
        welcomeText.setBounds(150, 100, 500, 80); 
        welcomeText.setFont(new Font("Hellix", Font.BOLD, 40)); 
        welcomeText.setForeground(Color.black); 
        sign_Frame.add(welcomeText);



        JLabel detailsText = new JLabel("Please enter your details");
        detailsText.setBounds(200, 145, 500, 80); 
        detailsText.setFont(new Font("ARIAL", Font.PLAIN, 15)); 
        detailsText.setForeground(Color.black); 
        sign_Frame.add(detailsText);

        // User name Text Filed

        JTextField userField = new JTextField("   name");
        userField.setBounds(150,260,250,40);
        userField.setBackground(Color.white);
        sign_Frame.add(userField);


        // Email Text Field 
        JTextField email = new JTextField("   Email");
        email.setBounds(150,340,250,40);
        email.setBackground(Color.white);
        sign_Frame.add(email);


        // Password Text Filed
        JTextField passField = new JTextField("   Password");
        passField.setBounds(150,420,250,40);
        passField.setBackground(Color.white);
        sign_Frame.add(passField);



        // Sign-Up Button
        JButton signJButton2 = new JButton("Sign-Up");
        signJButton2.setBounds(250, 505, 150, 40); 
        signJButton2.setFont(new Font("ARIAL", Font.PLAIN, 20)); 
        signJButton2.setForeground(Color.lightGray); 
        signJButton2.setBackground(Color.black);
        sign_Frame.add(signJButton2);





        // Image 

        
        ImageIcon signupImage = new ImageIcon("singup3.jpg");
        JLabel imageJLabel = new JLabel(signupImage);
        imageJLabel.setBounds(700, 150, signupImage.getIconWidth(), signupImage.getIconHeight()); // Adjust position and size based on image
        sign_Frame.add(imageJLabel);


    }

}

