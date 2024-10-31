
import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class AttendanceFunction extends JFrame {
    private JLabel lblTitle, lblSearch, lblDate;
    private JSpinner dateSpinner;
    private JTextField txtSearch;
    private JButton btnSearch, btnRefresh, backbtn, submitbtn, cancelbtn;
    private JTable attendanceTable;
    private JScrollPane scrollPane;
    private DefaultTableModel model;

    public AttendanceFunction(){
        setTitle("Student Management System");
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        lblTitle = new JLabel ("Attendance");
        lblTitle.setBounds(30, 20, 350, 30);setExtendedState(MAXIMIZED_BOTH);     
        lblTitle.setFont(new Font("Serif", Font.BOLD, 25));
        add (lblTitle);
        
        lblDate = new JLabel("Date:");
        lblDate.setBounds(1110, 90, 100, 30);
        lblDate.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblDate);
        
        dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "dd/MM/yyyy");
        dateSpinner.setEditor(dateEditor);
        dateSpinner.setBounds(1165, 90, 150, 30);
        add(dateSpinner);
        
        lblSearch = new JLabel("Search Student:");
        lblSearch.setBounds(50, 90, 150, 30);
        lblSearch.setFont(new Font("Arial", 1, 14));
        add(lblSearch);
        
        txtSearch = new JTextField();
        txtSearch.setBounds(200, 90, 650, 25);
        add(txtSearch);
        
        btnSearch = new JButton("Search");
        btnSearch.setBounds(900, 90, 90, 25);
        
        btnSearch.setFont(new Font("Arial", 0, 10));
        btnSearch.setForeground(Color.WHITE);
        btnSearch.setBackground(Color.BLUE);
        add(btnSearch);

        btnRefresh = new JButton("Refresh");
        btnRefresh.setBounds(1000, 90, 90, 25);
        btnRefresh.setFont(new Font("Arial", 0, 10));
        btnRefresh.setForeground(Color.WHITE);
        btnRefresh.setBackground(Color.BLUE);
        add(btnRefresh);
        
        submitbtn = new JButton("Submit");
        submitbtn.setBounds(1165, 145, 120, 40);
        submitbtn.setFont(new Font("Arial", 0, 10));
        submitbtn.setForeground(Color.WHITE);
        submitbtn.setBackground(Color.BLUE);
        add(submitbtn);

        cancelbtn = new JButton("Cancel");
        cancelbtn.setBounds(1165, 210, 120, 40);
        cancelbtn.setFont(new Font("Arial", 0, 10));
        cancelbtn.setForeground(Color.WHITE);
        cancelbtn.setBackground(Color.BLUE);
        add(cancelbtn);
        
        backbtn = new JButton("Back");
        backbtn.setBounds(1165, 650, 120, 40);
        backbtn.setFont(new Font("Arial", 0, 10));
        backbtn.setForeground(Color.WHITE);
        backbtn.setBackground(Color.BLUE);
        add(backbtn);

        String[] columnStrings = {"Student ID", " Course ID", "Course", "Student Name", "Present", "Absent"};
        String[][] rowStrings = {{"2023-0408-BN-0", "2023-911-IT", "BSIT", "Bruno Mars"},
                                       {"2023-092-BN-0",  "2023-451-IT", "BSIT", "Lady Gaga"},
                                       {"2023-236-BN-0",  "2023-904-IT", "BSIT", "Taylor Swift"}};
        
        model = new DefaultTableModel(rowStrings, columnStrings);
        
        attendanceTable = new JTable(model);
        scrollPane = new JScrollPane(attendanceTable);
        scrollPane.setBounds(50, 135, 1055, 550);
        scrollPane.getViewport().setBackground(Color.lightGray);
        add(scrollPane);
        
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = txtSearch.getText().toLowerCase();
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
                attendanceTable.setRowSorter(sorter);

                if (searchText.trim().isEmpty()) {
                    sorter.setRowFilter(null);  
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText, 3)); 
                }
            }
        });
        btnRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSearch.setText("");  
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
                attendanceTable.setRowSorter(sorter);
                sorter.setRowFilter(null);  
            }
        });
        
        backbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                
            }

        });
        submitbtn.addActionListener(e -> {
            int option = JOptionPane.showConfirmDialog(this, "Submit attendance?", "Confirm", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                
            }
        });
    }

    public static void main(String[] args) {
        new AttendanceFunction().setVisible(true);
    }
}

        
                
                
                
                
       