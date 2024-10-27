
package studentmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class GradeClass extends JFrame{
  
  
    private JLabel lblTitle, lblName, lblId , lblSem, lblTerm, lblC1 , lblC2, lblC3, lblC4, lblC5, lblC6, lblC7, lblC8, lblSearch;
    private JTextField txtName, txtId, midGrade, finGrade, txtSearch, txtTerm, txtSem, txtC1, txtC2, txtC5, 
            txtC3, txtC4, txtC6, txtC7, txtC8, txtG1, txtG2, txtG3, txtG4, txtG5, txtG6, txtG7, txtG8;
    private JComboBox cmbTerm;
    private JButton btnAdd, btnDelete, btnUpdate, btnAttendance, btnSearch, btnRefresh, btnMenu, btnClear, btnSearch2;
    private JTable studList;
    private JScrollPane pane;
    private DefaultTableModel model;
    
    
    private String [] term = {"Midterm","Finals"};

    GradeClass (){
        setExtendedState(MAXIMIZED_BOTH);     
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    lblTitle = new JLabel ("Student Management System");
    lblTitle.setBounds(30, 20, 350, 30);
    lblTitle.setFont(new Font("Serif", Font.BOLD, 25));
    add (lblTitle);
    
    lblId = new JLabel ("Student's ID: ");
    lblId.setBounds(50, 150, 150, 40);
    lblId.setFont(new Font("Arial", 1, 16));
    add (lblId);
    
    lblName = new JLabel ("Student's Name: ");
    lblName.setBounds(50, 220, 150, 40);
    lblName.setFont(new Font("Arial", 1, 16));
    add (lblName);
       
    lblSem = new JLabel ("Semester: ");
    lblSem.setBounds(50, 270, 150, 40);
    lblSem.setFont(new Font("Arial", 1, 16));
    add (lblSem );
    
    lblTerm = new JLabel ("Term: ");
    lblTerm.setBounds(300, 270, 150, 40);
    lblTerm.setFont(new Font("Arial", 1, 16));
    add (lblTerm );
    
    txtId = new JTextField ();
    txtId.setBounds(170, 155, 250, 25);
    add(txtId);
    
    txtName = new JTextField ();
    txtName.setBounds(190, 225, 250, 25);
    txtName.setBackground(Color.LIGHT_GRAY);
    txtName.setEditable(false);
    add (txtName);
    
    txtSem = new JTextField ();
    txtSem.setBounds(160, 275, 70, 25);
    txtSem.setBackground(Color.LIGHT_GRAY);
    txtSem.setEditable(false);
    add (txtSem);
    
    cmbTerm = new JComboBox(term);
    cmbTerm.setBounds(370, 275, 80, 25);
    add (cmbTerm);
    
    //Courses
    
    lblC1 = new JLabel ("Course 1");
    lblC1.setBounds(50, 330, 150, 40);
    lblC1.setFont(new Font("Arial", 1, 12));
    add (lblC1);
    
    txtC1 = new JTextField ();
    txtC1.setBounds(110, 340, 135, 20);
    txtC1.setBackground(Color.LIGHT_GRAY);
    txtC1.setEditable(false);
    add (txtC1);
    
    txtG1 = new JTextField ();
    txtG1.setBounds(255, 340, 35, 20);
    txtG1.setBackground(Color.CYAN);
    txtG1.setEditable(false);
    add (txtG1);
    
    lblC2 = new JLabel ("Course 2");
    lblC2.setBounds(50, 370, 150, 40);
    lblC2.setFont(new Font("Arial", 1, 12));
    add (lblC2 );
    
    txtC2 = new JTextField ();
    txtC2.setBounds(110, 380, 135, 20);
    txtC2.setBackground(Color.LIGHT_GRAY);
    txtC2.setEditable(false);
    txtC2.setText("Data Structure and Algorithm");
    add (txtC2);
    
    txtG2 = new JTextField ();
    txtG2.setBounds(255, 380, 35, 20);
    txtG2.setBackground(Color.CYAN);
    txtG2.setEditable(false);
    add (txtG2);
    
    
    lblC3 = new JLabel ("Course 3");
    lblC3.setBounds(50, 410, 150, 40);
    lblC3.setFont(new Font("Arial", 1, 12));
    add (lblC3 );
    
    txtC3 = new JTextField ();
    txtC3.setBounds(110, 420, 135, 20);
    txtC3.setBackground(Color.LIGHT_GRAY);
    txtC3.setEditable(false);
    add (txtC3);
    
    txtG3 = new JTextField ();
    txtG3.setBounds(255, 420, 35, 20);
    txtG3.setBackground(Color.CYAN);
    txtG3.setEditable(false);
    txtG3.setText("0.75");
    add (txtG3);
    
    
    
    lblC4 = new JLabel ("Course 4");
    lblC4.setBounds(50, 450, 150, 40);
    lblC4.setFont(new Font("Arial", 1, 12));
    add (lblC4 );
    
    txtC4 = new JTextField ();
    txtC4.setBounds(110, 460, 135, 20);
    txtC4.setBackground(Color.LIGHT_GRAY);
    txtC4.setEditable(false);
    add (txtC4);
    
    txtG4 = new JTextField ();
    txtG4.setBounds(255, 460, 35, 20);
    txtG4.setBackground(Color.CYAN);
    txtG4.setEditable(false);
    add (txtG4);
    
    
    lblC5 = new JLabel ("Course 5");
    lblC5.setBounds(320, 330, 150, 40);
    lblC5.setFont(new Font("Arial", 1, 12));
    add (lblC5 );
    
    txtC5 = new JTextField ();
    txtC5.setBounds(380, 340, 135, 20);
    txtC5.setBackground(Color.LIGHT_GRAY);
    txtC5.setEditable(false);
    add (txtC5);
    
    txtG5 = new JTextField ();
    txtG5.setBounds(525, 340, 35, 20);
    txtG5.setBackground(Color.CYAN);
    txtG5.setEditable(false);
    add (txtG5);
    
    
    lblC6 = new JLabel ("Course 6");
    lblC6.setBounds(320, 370, 150, 40);
    lblC6.setFont(new Font("Arial", 1, 12));
    add (lblC6 );
    
    txtC6 = new JTextField ();
    txtC6.setBounds(380, 380, 135, 20);
    txtC6.setBackground(Color.LIGHT_GRAY);
    txtC6.setEditable(false);
    add (txtC6);
    
    txtG6 = new JTextField ();
    txtG6.setBounds(525, 380, 35, 20);
    txtG6.setBackground(Color.CYAN);
    txtG6.setEditable(false);
    add (txtG6);
    
    
    lblC7 = new JLabel ("Course 7");
    lblC7.setBounds(320, 410, 150, 40);
    lblC7.setFont(new Font("Arial", 1, 12));
    add (lblC7 );
    
    txtC7 = new JTextField ();
    txtC7.setBounds(380, 420, 135, 20);
    txtC7.setBackground(Color.LIGHT_GRAY);
    txtC7.setEditable(false);
    add (txtC7);
    
    txtG7 = new JTextField ();
    txtG7.setBounds(525, 420, 35, 20);
    txtG7.setBackground(Color.CYAN);
    txtG7.setEditable(false);
    add (txtG7);
    
    
    lblC8 = new JLabel ("Course 8");
    lblC8.setBounds(320, 450, 150, 40);
    lblC8.setFont(new Font("Arial", 1, 12));
    add (lblC8 );
    
    txtC8 = new JTextField ();
    txtC8.setBounds(380, 460, 135, 20);
    txtC8.setBackground(Color.LIGHT_GRAY);
    txtC8.setEditable(false);
    add (txtC8);
    
    txtG8 = new JTextField ();
    txtG8.setBounds(525, 460, 35, 20);
    txtG8.setBackground(Color.CYAN);
    txtG8.setEditable(false);
    add (txtG8);
   
    
    //Buttons
    
    btnAdd = new JButton ("Add");
    btnAdd.setBounds(70, 530, 120, 40);
    btnAdd.setFocusable(false);
    btnAdd.setForeground(Color.WHITE);
    btnAdd.setBackground(Color.BLUE);
    add (btnAdd);
    
    btnUpdate = new JButton ("Update");
    btnUpdate.setBounds(210, 530, 120, 40);
    btnUpdate.setFocusable(false);
    btnUpdate.setForeground(Color.WHITE);
    btnUpdate.setBackground(Color.BLUE);
    add (btnUpdate);
    
    btnDelete = new JButton ("Delete");
    btnDelete.setBounds(350, 530, 120, 40);
    btnDelete.setFocusable(false);
    btnDelete.setForeground(Color.WHITE);
    btnDelete.setBackground(Color.BLUE);
    add(btnDelete);
    
    btnAttendance = new JButton ("Attendance");
    btnAttendance.setBounds(145, 590, 120, 40);
    btnAttendance.setFocusable(false);
    btnAttendance.setForeground(Color.WHITE);
    btnAttendance.setBackground(Color.BLUE);
    add (btnAttendance);
    
    btnClear = new JButton ("Clear");
    btnClear.setBounds(285, 590, 120, 40);
    btnClear.setFocusable(false);
    btnClear.setForeground(Color.WHITE);
    btnClear.setBackground(Color.BLUE);
    add (btnClear);
    
    // Table where the information will appear
    model = new DefaultTableModel(5,5 );
    studList = new JTable (model);
    pane = new JScrollPane(studList);
    pane.setBounds(600, 150, 720, 450);
    pane.getViewport().setBackground(Color.lightGray);
    add(pane);
    
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
    btnSearch.setForeground(Color.WHITE);
    btnSearch.setFont(new Font("Arial", 0, 10));
    btnSearch.setBackground(Color.BLUE);
    add (btnSearch);
    
    btnRefresh = new JButton ("Refresh");
    btnRefresh.setBounds(1250, 115, 70, 25);
    btnRefresh.setFocusable(false);
    btnRefresh.setForeground(Color.WHITE);
    btnRefresh.setFont(new Font("Arial", 0, 10));
    btnRefresh.setBackground(Color.BLUE);
    add (btnRefresh);
    
    //back to menu
    
    btnMenu = new JButton ("Menu");
    btnMenu.setBounds(1250, 650, 70, 25);
    btnMenu.setFocusable(false);
    btnMenu.setForeground(Color.WHITE);
    btnMenu.setFont(new Font("Arial", 0, 10));
    btnMenu.setBackground(Color.BLUE);
    add (btnMenu);
    
    //SearchStudentID
    
    btnSearch2 = new JButton ("Search");
    btnSearch2.setBounds(450, 155, 70, 25);
    btnSearch2.setFocusable(false);
    btnSearch2.setForeground(Color.WHITE);
    btnSearch2.setFont(new Font("Arial", 0, 10));
    btnSearch2.setBackground(Color.BLUE);
    add (btnSearch2);
    
    }
}
