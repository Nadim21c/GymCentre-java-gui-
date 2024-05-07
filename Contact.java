import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Contact implements ActionListener{
  
    JFrame frame =new JFrame("Fitness club");
    JLabel centreName;
    JButton home,services,contact;

    @Override
    public void actionPerformed(ActionEvent e) {

          
        frame.setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(1600,800);
        //setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.BLACK);
        //this.getContentPane().setLayout(new FlowLayout());
        frame.setLayout(null);



        ImageIcon imageIcon = new ImageIcon("Gym_1-1-.jpg");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(780, 180, imageIcon.getIconWidth(), imageIcon.getIconHeight()); // Adjust position and size based on image
        frame.add(imageLabel);



        centreName = new JLabel("Contact us ");
        centreName.setBounds(120, 80, 600, 80); 
        centreName.setFont(new Font("Hellix", Font.BOLD, 60)); 
        centreName.setForeground(Color.white); 
        frame.add(centreName);



        centreName = new JLabel("LOCATION ");
        centreName.setBounds(120, 240, 200, 40); 
        centreName.setFont(new Font("Hellix", Font.PLAIN, 20)); 
        centreName.setForeground(Color.white); 
        frame.add(centreName);



        centreName = new JLabel("CITY CENTRE 23 ZINDABAZAR, SYLHET");
        centreName.setBounds(120, 270, 270, 50); 
        centreName.setFont(new Font("Hellix", Font.PLAIN, 13)); 
        centreName.setForeground(Color.lightGray); 
        frame.add(centreName);


        centreName = new JLabel("PHONE");
        centreName.setBounds(120, 340, 200, 40); 
        centreName.setFont(new Font("Hellix", Font.PLAIN, 20)); 
        centreName.setForeground(Color.white); 
        frame.add(centreName);



        centreName = new JLabel("01718442222");
        centreName.setBounds(120, 370, 270, 50); 
        centreName.setFont(new Font("Hellix", Font.PLAIN, 13)); 
        centreName.setForeground(Color.lightGray); 
        frame.add(centreName);


       
        centreName = new JLabel("EMAIL");
        centreName.setBounds(120, 440, 200, 40); 
        centreName.setFont(new Font("Hellix", Font.PLAIN, 20)); 
        centreName.setForeground(Color.white); 
        frame.add(centreName);



        centreName = new JLabel("FITNESSCLUB@GMAIL.COM");
        centreName.setBounds(120, 470, 270, 50); 
        centreName.setFont(new Font("Hellix", Font.PLAIN, 13)); 
        centreName.setForeground(Color.lightGray); 
        frame.add(centreName);

    }
       


   

}


