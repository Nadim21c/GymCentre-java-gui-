import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Gym_Frame extends JFrame {
  
    JLabel centreName;
    JButton home,services,contact;

    Gym_Frame(){
         
        super("Fitness Club");
        this.setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(1600,800);
        //setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        //this.getContentPane().setLayout(new FlowLayout());
        setLayout(null);



        ImageIcon imageIcon = new ImageIcon("body.jpg");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(160, 90, imageIcon.getIconWidth(), imageIcon.getIconHeight()); // Adjust position and size based on image
        add(imageLabel);



        centreName = new JLabel("FITNESS CLUB");
        centreName.setBounds(46, 40, 600, 50); 
        centreName.setFont(new Font("Hellix", Font.BOLD, 40)); 
        centreName.setForeground(Color.LIGHT_GRAY); 
        add(centreName);



         home = new JButton("Home");
         home.setBounds(800,55,100,35);

         home.setForeground(Color.white);
         home.setBackground(Color.black);

         add(home);


         services = new JButton("Services");
         services.setBounds(925,55,100,35);
         
         services.setForeground(Color.white);
         services.setBackground(Color.black);

         add(services);

        services.addActionListener(new Service());



         contact = new JButton("Contact");
         contact.setBounds(1050,55,100,35);
         
         contact.setForeground(Color.white);
         contact.setBackground(Color.black);

         add(contact);

// add a blog menu

JButton blog = new JButton("Blog");
blog.setBounds(1175,55,100,35);

blog.setForeground(Color.white);
blog.setBackground(Color.black);

add(blog);


        contact.addActionListener(new Contact());



         Font homeFont = new Font("Ariel",Font.BOLD,15);
         home.setFont(homeFont);
         services.setFont(homeFont);
         contact.setFont(homeFont);
         blog.setFont(homeFont);

    







        // BMI Operation

        JLabel bmicheckText = new JLabel("CHECK YOUR BMI NOW-");
        bmicheckText.setBounds(970, 220, 250, 200); 
        bmicheckText.setFont(new Font("Hellix", Font.ITALIC, 20)); 
        bmicheckText.setForeground(Color.WHITE); 
        add(bmicheckText);

        JTextField ageBMI = new JTextField("   age");
        ageBMI.setBounds(970,360,200,40);
        ageBMI.setBackground(Color.lightGray);
        add(ageBMI);



        JTextField weightField = new JTextField("   weight");
        weightField.setBounds(970,430,200,40);
        weightField.setBackground(Color.lightGray);
        add(weightField);


       JTextField heightField = new JTextField("   height");
       heightField.setBounds(970,500,200,40);
       heightField.setBackground(Color.lightGray);
       add(heightField);





        JButton checkBMIButton = new JButton("check");
        checkBMIButton.setBounds(1070, 570, 100, 40); 
        checkBMIButton.setFont(new Font("ARIAL", Font.PLAIN, 20)); 
        checkBMIButton.setForeground(Color.black); 
        checkBMIButton.setBackground(Color.white);
        add(checkBMIButton);

checkBMIButton.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
     
        String weightStr = weightField.getText();
        String heightStr = heightField.getText();

        // Validation (consider adding input validation to handle non-numeric values)
        // ...

        // Conversion to numeric values (assuming valid input)
        float weight = Float.parseFloat(weightStr);
        float height = Float.parseFloat(heightStr);

        float bmi = weight / (height * height);


        if ( bmi < 18.5){
            
            JOptionPane.showMessageDialog(null,"Your BMI is "+bmi+"\nUnderWeight","Body Condition",1);
        }
        else if ( bmi > 18.5 && 25 > bmi){
            
            JOptionPane.showMessageDialog(null,"Your BMI is "+bmi+"\nhealty range","Body Condition",1);
        }
        else if ( bmi > 25 ){
            
            JOptionPane.showMessageDialog(null,"Your BMI is "+bmi+"\nOverWeight","Body Condition",1);
        }
       
    }
    
});

}   
}
