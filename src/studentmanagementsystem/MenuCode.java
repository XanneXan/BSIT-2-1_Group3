/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author USER
 * CEEJAY BAYRAN
 */
import java.awt.*;
import javax.swing.*;
public class MenuCode extends JFrame {
    private JLabel lblTitle;
    private JPanel MyButtonPanel , LogoutPanel;
    private JButton ClickButtonD, ClickButtonE, ClickButtonF;
    public MenuCode(){
        setTitle("STUDENT MANAGEMENT SYSTEM");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);
        setLocationRelativeTo(null);
        
        lblTitle = new JLabel("Student Management System",SwingConstants.CENTER);
        lblTitle.setFont(new Font("Arial",Font.BOLD,40));
        add(lblTitle,BorderLayout.NORTH);
        
        MyButtonPanel = new JPanel();
        MyButtonPanel.setLayout(new BoxLayout(MyButtonPanel, BoxLayout.Y_AXIS));
        MyButtonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ClickButtonD = createButton("STUDENTS", Color.BLUE);
        ClickButtonE = createButton("COURSE", Color.BLUE);
        ClickButtonF = createButton("GRADES", Color.BLUE);
        
        MyButtonPanel.add(Box.createVerticalGlue());
        MyButtonPanel.add(ClickButtonD);
        MyButtonPanel.add(Box.createVerticalStrut(25));
        MyButtonPanel.add(ClickButtonE);
        MyButtonPanel.add(Box.createVerticalStrut(25));
        MyButtonPanel.add(ClickButtonF);
        MyButtonPanel.add(Box.createVerticalGlue());
        add(MyButtonPanel, BorderLayout.CENTER);
        
        JButton LogoutButton = new JButton("LOGOUT");
        LogoutButton.setPreferredSize(new Dimension(100, 40));
        LogoutButton.setFont(new Font("Arial", Font.PLAIN, 15));
        LogoutButton.addActionListener(e ->System.exit(0));
        
        LogoutPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        LogoutPanel.add(LogoutButton);
        add(LogoutPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
    private JButton createButton(String text, Color color){
        JButton ThisButton = new JButton(text);
        ThisButton.setMaximumSize(new Dimension(300,100));
        ThisButton.setFont(new Font("Arial", Font.PLAIN,20));
        ThisButton.setBackground(color);
        ThisButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        ThisButton.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        ThisButton.addActionListener(e->dispose());
        return ThisButton;
                
    }
   
    }
