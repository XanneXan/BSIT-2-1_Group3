/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

import java.awt.Font;
import javax.swing.*;

public class StudentClass extends JFrame {
    
    private JLabel lblTitle, lblName, lblId , lblCourse, lblGrade;
    private JTextField txtName, txtId, txtCourse, txtGrade;
    private JButton btn1;
    
    StudentClass (){
        setExtendedState(MAXIMIZED_BOTH);     
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    lblTitle = new JLabel ("Student Management System");
    lblTitle.setBounds(30, 10, 350, 30);
    lblTitle.setFont(new Font("Serif", Font.BOLD, 25));
    add (lblTitle);
    
    lblName = new JLabel ("Student's Name: ");
    lblName.setBounds(30, 60, 150, 40);
    lblName.setFont(new Font("Arial", 0, 16));
    add (lblName);
    
    lblId = new JLabel ("Student's ID: ");
    lblId.setBounds(30, 120, 150, 40);
    lblId.setFont(new Font("Arial", 0, 16));
    add (lblId);
    
    txtName = new JTextField ();
    txtName.setBounds(160, 65, 250, 30);
    add (txtName);
    
    txtId = new JTextField ();
    txtId.setBounds(160, 125, 250, 30);
    add(txtId);
    
    lblCourse = new JLabel ("Course: ");
    lblCourse.setBounds(500, 60, 150, 40);
    lblCourse.setFont(new Font("Arial", 0, 16));
    add (lblCourse);
    
    lblGrade = new JLabel ("Grade: ");
    lblGrade.setBounds(500, 120, 150, 40);
    lblGrade.setFont(new Font("Arial", 0, 16));
    add (lblGrade);
    
    txtCourse = new JTextField ();
    txtCourse.setBounds(570, 65, 250, 30);
    add (txtCourse);
    
    txtGrade = new JTextField ();
    txtGrade.setBounds(570, 125, 250, 30);
    add(txtGrade);
    
    btn1 = new JButton("New");
    btn1.setBounds(600, 600, 200, 30);
    add(btn1);
            
    
        
    }
}
