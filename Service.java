import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Service implements ActionListener{
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        JFrame frameSer =new JFrame("Services");
        frameSer.setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameSer.setResizable(true);
        frameSer.setSize(1600,800);
        //setLocationRelativeTo(null);
        frameSer.getContentPane().setBackground(Color.BLACK);
        //this.getContentPane().setLayout(new FlowLayout());
        frameSer.setLayout(null);
         

        JPanel normalPanel = new JPanel();
        normalPanel.setBackground(Color.lightGray);
        normalPanel.setBounds(90,50,550,600);
        frameSer.add(normalPanel);

        JPanel premiumPanel = new JPanel();
        premiumPanel.setBackground(Color.cyan);
        premiumPanel.setBounds(750,50,550,600);
        frameSer.add(premiumPanel);


        JLabel normLabel = new JLabel("Normal");
        normLabel.setBounds(140, 100, 600, 80); 
        normLabel.setFont(new Font("Hellix", Font.BOLD, 90)); 
        normLabel.setForeground(Color.black); 
        normalPanel.add(normLabel);



        JLabel normPricing = new JLabel("$49.99/month");
        normPricing.setBounds(140, 300, 100, 60); 
        normPricing.setFont(new Font("Hellix", Font.PLAIN, 40)); 
        normPricing.setForeground(Color.black); 
        normalPanel.add(normPricing);


        JLabel preLabel = new JLabel("Premium");
        preLabel.setBounds(800, 110, 600, 80); 
        preLabel.setFont(new Font("Hellix", Font.BOLD, 90)); 
        preLabel.setForeground(Color.black); 
        premiumPanel.add(preLabel);


        JLabel pre_pri = new JLabel("$99.99/month");
        pre_pri.setBounds(800, 310, 100, 80); 
        pre_pri.setFont(new Font("Hellix", Font.PLAIN, 40)); 
        pre_pri.setForeground(Color.black); 
        premiumPanel.add(pre_pri);



        JButton enroll = new JButton("ENROLL NOW (>)");
        enroll.setBounds(60,1000,200,100);
        enroll.setForeground(Color.white);
        enroll.setBackground(Color.magenta);

        normalPanel.add(enroll);
        
        enroll.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
                new Login();
            }
            
        });





        JButton enroll_Pre = new JButton("ENROLL NOW (>)");
        enroll_Pre.setBounds(800,1000,200,100);
        enroll_Pre.setForeground(Color.white);
        enroll_Pre.setBackground(Color.magenta);
        premiumPanel.add(enroll_Pre);

        enroll_Pre.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
                new Login();
            }
            
        });



        JLabel fc1 = new JLabel("Facility                       ");
        fc1.setBounds(140, 350, 150, 60); 
        fc1.setFont(new Font("Hellix", Font.PLAIN, 50)); 
        fc1.setForeground(Color.black); 
        normalPanel.add(fc1);




        normalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 35, 35)); // Horizontal alignment with spacing
        JButton button2 = new JButton("Group Classes");
        JButton button3 = new JButton("Cardio Equipment");
        JButton button4 = new JButton("Training Area");
        JButton button5 = new JButton("Showers");
        Dimension buttonSize = new Dimension(220, 40); // Button size
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);
        button5.setPreferredSize(buttonSize);
        
        // Set font for buttons
        Font buttonFont = new Font("Garamond", Font.BOLD, 18);
        button2.setFont(buttonFont);
        button3.setFont(buttonFont);
        button4.setFont(buttonFont);
        button5.setFont(buttonFont);
        
        // Set font color for buttons
        Color fontColor = Color.black;
        button2.setForeground(fontColor);
        button3.setForeground(fontColor);
        button4.setForeground(fontColor);
        button5.setForeground(fontColor);
        
        // Set background color for buttons
        Color buttonColor = new Color(255,255,255);
        button2.setBackground(buttonColor);
        button3.setBackground(buttonColor);
        button4.setBackground(buttonColor);
        button5.setBackground(buttonColor);

        normalPanel.add(button2);
        normalPanel.add(button3);
        normalPanel.add(button4);
        normalPanel.add(button5);




        JLabel fc2 = new JLabel("Facility                       ");
        fc2.setBounds(140, 350, 150, 60); 
        fc2.setFont(new Font("Hellix", Font.PLAIN, 50)); 
        fc2.setForeground(Color.black); 
        premiumPanel.add(fc2);
   

        
        premiumPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 35, 35)); // Horizontal alignment with spacing
        JButton button6 = new JButton("Swimming Pool");
        JButton button7 = new JButton("Steam Room");
        JButton button8 = new JButton("Sauna Room");
        JButton button9 = new JButton("Nutritional Guidance");
        JButton button10 = new JButton("Plus normal services");
        Dimension buttonSizePre = new Dimension(230, 40); // Button size
        button6.setPreferredSize(buttonSizePre);
        button7.setPreferredSize(buttonSizePre);
        button8.setPreferredSize(buttonSizePre);
        button9.setPreferredSize(buttonSizePre);
        button10.setPreferredSize(buttonSizePre);
        
        // Set font for buttons
        Font buttonFontPre = new Font("Garamond", Font.BOLD, 18);
        button6.setFont(buttonFontPre);
        button7.setFont(buttonFontPre);
        button8.setFont(buttonFontPre);
        button9.setFont(buttonFontPre);
        button10.setFont(buttonFontPre);
        
        // Set font color for buttons
        Color fontColorPre = Color.WHITE;
        button6.setForeground(fontColorPre);
        button7.setForeground(fontColorPre);
        button8.setForeground(fontColorPre);
        button9.setForeground(fontColorPre);
        button10.setForeground(Color.black);
        
        // Set background color for buttons
        Color buttonColorPre = new Color(46,139,87);
        button6.setBackground(buttonColorPre);
        button7.setBackground(buttonColorPre);
        button8.setBackground(buttonColorPre);
        button9.setBackground(buttonColorPre);
        button10.setBackground(Color.cyan);

        premiumPanel.add(button6);
        premiumPanel.add(button7);
        premiumPanel.add(button8);
        premiumPanel.add(button9);
        premiumPanel.add(button10);



    }

 
       
 

}
