/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  package finalmenu;
    //CEEJAY BAYRAN 
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.*;

    public class FinalMenuSub extends JFrame{
    private JLabel lblTitle;
    private JPanel MyButtonPanel, LogoutPanel;
    private JButton ClickButtonD, ClickButtonE, ClickButtonF, LogoutButton;
        
    FinalMenuSub(){
             setTitle("STUDENT MANAGEMENT SYSTEM");
             setSize(500, 600);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setLayout(new BorderLayout());
             setResizable(false);
             setLocationRelativeTo(null);

             lblTitle = new JLabel("Student Management System", SwingConstants.CENTER);
             lblTitle.setFont(new Font("Arial", Font.BOLD, 40));
             add(lblTitle, BorderLayout.NORTH);
        
             JPanel MyButtonPanel = new JPanel();
             MyButtonPanel.setLayout(new BoxLayout(MyButtonPanel, BoxLayout.Y_AXIS));

             JButton ClickButtonD = createButton("STUDENTS");
             JButton ClickButtonE = createButton("COURSE");
             JButton ClickButtonF = createButton("GRADES");

             ClickButtonD.setBorder(BorderFactory.createEmptyBorder(11, 0, 11, 0));
             ClickButtonE.setBorder(BorderFactory.createEmptyBorder(11, 0, 11, 0));
             ClickButtonF.setBorder(BorderFactory.createEmptyBorder(11, 0, 11, 0));

             MyButtonPanel.add(ClickButtonD);
             MyButtonPanel.add(ClickButtonE);
             MyButtonPanel.add(ClickButtonF);

             add(MyButtonPanel,BorderLayout.CENTER);

             LogoutButton = new JButton("LOGOUT");
             LogoutButton.setPreferredSize(new Dimension(200,60));
             LogoutButton.addActionListener(e ->System.exit(0));
             setVisible(true);

             LogoutPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
             LogoutPanel.add(LogoutButton);
             add(LogoutPanel, BorderLayout.SOUTH);


             setVisible(true);


        }
         private JButton createButton(String text){
             JButton Button = new JButton(text);
             Button.setPreferredSize(new Dimension(300,65));
             Button.setFont(new Font("Arial", Font.PLAIN,25));
             Button.setAlignmentX(Component.CENTER_ALIGNMENT);
             Button.addActionListener(this);
             return Button;

         } 

        @Override
        public void actionPerformed(ActionEvent e) {
         ///   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

      String Button  = ((JButton)e.getSource()).getText();
        private static class CampInfo {
        switch(Button){
        case "STUDENTS":
        new CampInfo();
        break;
        case"COURSE":
        new CampInfo();
        break;
        case"GRADES":
        new CampInfo();
        break;
        }
        }     
            }
        }

    }