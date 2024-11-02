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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Menu extends JFrame implements ActionListener{
private JLabel lblTitle,Students,Course,Grades,Logout;
private JButton MyButtonStudents, MyButtonCourse, MyButtonGrades, MyLogoutButton;
public Menu(){
    setTitle("Student Management System");
    setSize(700, 600);//Can change to 500 , 600 i just do this size just to be goodlooking
    setLayout(null);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lblTitle = new JLabel("Student Management System", SwingConstants.CENTER);
    lblTitle.setBounds(100, 50, 500, 40);// Can move the 100 either back or up font the alignment
    lblTitle.setFont(new Font("Arial", Font.BOLD,33));
    add(lblTitle);
    
    MyButtonStudents = new JButton("STUDENTS");
    MyButtonStudents.setBounds(225, 170, 240, 60);//Just adjust the bounds back or  up depends on alignment
    MyButtonStudents.setFont(new Font("Arial",Font.PLAIN,20));
    MyButtonStudents.setBackground(Color.blue);
    MyButtonStudents.setForeground(Color.white);//for the font color
    MyButtonStudents.addActionListener(this);
    add(MyButtonStudents);
    
    MyButtonCourse = new JButton("COURSE");
    MyButtonCourse.setBounds(225, 260, 240, 60);//same with this can also change the bounds depends on alignment
    MyButtonCourse.setFont(new Font("Arial",Font.PLAIN,20));
    MyButtonCourse.setBackground(Color.blue);
    MyButtonCourse.setForeground(Color.white);// this part was a suggestion to change the color of the font
    MyButtonCourse.addActionListener(this);
    add(MyButtonCourse);
    
    MyButtonGrades = new JButton("GRADES");
    MyButtonGrades.setBounds(225, 350, 240, 60);//also this one i orderly change each 
    MyButtonGrades.setFont(new Font("Arial",Font.PLAIN,20));
    MyButtonGrades.setBackground(Color.blue);
    MyButtonGrades.setForeground(Color.white);
    MyButtonGrades.addActionListener(this);
    add(MyButtonGrades);
    
    MyLogoutButton = new JButton("Logout");
    MyLogoutButton.setBounds(580, 500, 80, 30);//in this part just adjust te first number
    MyLogoutButton.setFont(new Font("Arial",Font.PLAIN,15)); 
    MyLogoutButton.setBackground(Color.blue);
    MyLogoutButton.setForeground(Color.white);//also for the font color
    MyLogoutButton.addActionListener(this);
    add(MyLogoutButton);
}
    public void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  if(e.getSource()== MyButtonStudents||e.getSource()== MyButtonCourse||e.getSource()== MyButtonGrades){
      this.dispose();
  }else if(e.getSource()==MyLogoutButton){
      this.dispose();
  }
    
    }
    
}
