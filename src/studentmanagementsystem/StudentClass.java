/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class StudentClass extends JFrame {
    

    private JLabel lblTitle, lblName, lblId , lblCourse, lblGrade , lblMid, lblFin, lblAttendance, lblSearch;
    private JTextField txtName, txtId, midGrade, finGrade, txtSearch;
    private JComboBox txtCourse;
    private JButton btnAdd, btnDelete, btnUpdate, btnAttendance, btnSearch, btnRefresh, btnMenu;
    private JTable studList;

    
    
    private String [] crs = {"BSIT", "BSIE", "BSCPE" };

    StudentClass (){
        setExtendedState(MAXIMIZED_BOTH);     
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    lblTitle = new JLabel ("Student Management System");
    lblTitle.setBounds(30, 20, 350, 30);
    lblTitle.setFont(new Font("Serif", Font.BOLD, 25));
    add (lblTitle);
    
    lblName = new JLabel ("Student's ID: ");
    lblName.setBounds(50, 190, 150, 40);
    lblName.setFont(new Font("Arial", 1, 16));
    add (lblName);
    
    lblId = new JLabel ("Student's Name: ");
    lblId.setBounds(50, 240, 150, 40);
    lblId.setFont(new Font("Arial", 1, 16));
    add (lblId);
        
    lblCourse = new JLabel ("Course: ");
    lblCourse.setBounds(50, 290, 150, 40);
    lblCourse.setFont(new Font("Arial", 1, 16));
    add (lblCourse);
    
    
    txtName = new JTextField ();
    txtName.setBounds(200, 195, 250, 25);
    add (txtName);
    
    txtId = new JTextField ();
    txtId.setBounds(200, 245, 250, 25);
    add(txtId);

    txtCourse = new JComboBox (crs);
    txtCourse.setBounds(160, 295, 200, 25);
    add (txtCourse);
    
    
    //Buttons
    
    btnAdd = new JButton ("Add");
    btnAdd.setBounds(50, 430, 120, 40);
    btnAdd.setFocusable(false);
    btnAdd.setForeground(Color.WHITE);
    btnAdd.setBackground(Color.BLUE);
    add (btnAdd);
    
    btnUpdate = new JButton ("Update");
    btnUpdate.setBounds(190, 430, 120, 40);
    btnUpdate.setFocusable(false);
    btnUpdate.setForeground(Color.WHITE);
    btnUpdate.setBackground(Color.BLUE);
    add (btnUpdate);
    
    btnDelete = new JButton ("Delete");
    btnDelete.setBounds(330, 430, 120, 40);
    btnDelete.setFocusable(false);
    btnDelete.setForeground(Color.WHITE);
    btnDelete.setBackground(Color.BLUE);
    add(btnDelete);
    
    btnAttendance = new JButton ("Attendance");
    btnAttendance.setBounds(125, 500, 120, 40);
    btnAttendance.setFocusable(false);
    btnAttendance.setForeground(Color.WHITE);
    btnAttendance.setBackground(Color.BLUE);
    add (btnAttendance);
    
    // Table where the information will appear
    studList = new JTable ();
    studList.setBounds(600, 150, 720, 450);
    studList.setBackground(Color.lightGray);
    add(studList);
    
    //Search Function
    lblSearch = new JLabel ("Search Student: ");
    lblSearch.setBounds(600, 110, 150, 40);
    lblSearch.setFont(new Font("Arial", 1, 14));
    add (lblSearch);
    
    txtSearch = new JTextField ();
    txtSearch.setBounds(730, 115, 400, 25);
    add (txtSearch);
    
    btnSearch = new JButton ("Search");
    btnSearch.setBounds(1170, 115, 70, 25);
    btnSearch.setFocusable(false);
    btnSearch.setFont(new Font("Arial", 0, 10));
    btnSearch.setBackground(Color.BLUE);
    add (btnSearch);
    
    btnRefresh = new JButton ("Refresh");
    btnRefresh.setBounds(1250, 115, 70, 25);
    btnRefresh.setFocusable(false);
    btnRefresh.setFont(new Font("Arial", 0, 10));
    btnRefresh.setBackground(Color.BLUE);
    add (btnRefresh);
    
    //back to menu
    
    btnMenu = new JButton ("Menu");
    btnMenu.setBounds(1250, 650, 70, 25);
    btnMenu.setFocusable(false);
    btnMenu.setFont(new Font("Arial", 0, 10));
    btnMenu.setBackground(Color.BLUE);
    add (btnMenu);
    
   
    }
}
