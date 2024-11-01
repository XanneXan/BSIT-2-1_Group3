package login;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

     public class Loginfr_1 extends JFrame implements ActionListener {
         private JTextField txtInput;
         private JPasswordField passField;
         private JLabel lblname,lbl, passJLabel;
         private JButton btnlogin, btnregister;
         
         
    Loginfr_1 (){
      
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        lblname = new JLabel("Student Management System");
        lblname.setBounds(80, 50, 800, 50);
        lblname.setFont(new Font("Arial Black",Font.BOLD,20));
        add(lblname);
        
        lbl = new JLabel("Name:");
        lbl.setBounds(60,180 ,150, 50);
        lbl.setFont(new Font("Arial Black",Font.BOLD,13));
        add(lbl);

        txtInput = new JTextField();
        txtInput.setBounds (165,180,265,50);
        add(txtInput);
        
        passJLabel = new JLabel("Password:");
        passJLabel.setBounds(60, 250, 210, 50);
        passJLabel.setFont(new Font("Arial Black",Font.BOLD,13));
        add(passJLabel);
       
        passField = new JPasswordField();
        passField.setBounds(165,250,265,50);
        add(passField);
        
        btnlogin = new JButton("LOG IN");
        btnlogin.setBounds(50,400,120,60);
        btnlogin.setFont(new Font("Arial Black",Font.BOLD,13));
        add(btnlogin);
        
        btnregister = new JButton("REGISTER");
        btnregister.setBounds(310,400,120,60);
        btnregister.setFont(new Font("Arial Black",Font.BOLD,13));
        add(btnregister);
        
        
        btnlogin.addActionListener(this);
        btnregister.addActionListener(this);
       
        
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnregister){
 register();
        }else if (e.getSource()== btnlogin){
            String txt=txtInput.getText().trim();
            String field=new String(passField.getPassword()).trim();
            if(txt.isEmpty()&& field.isEmpty()){
                JOptionPane.showMessageDialog(this, "PLEASE INPUT A PASSWORD AND NAME", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(field.isEmpty()){
                JOptionPane.showMessageDialog(this, "PLEASE INPUT A PASSWORD", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(txt.isEmpty()) {
                 JOptionPane.showMessageDialog(this, "PLEASE INPUT A NAME", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this, "INCORRECT NAME OR PASSWORD", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
                
    }
    }
    private void register() {
        JFrame f = new JFrame();
        f.setSize(500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        
        JLabel lblname = new JLabel("Student Management System");
        lblname.setBounds(80, 50, 800, 50);
        lblname.setFont(new Font("Arial Black",Font.BOLD,20));
        f.add(lblname);
        
        JLabel lbl = new JLabel("Name:");
        lbl.setBounds(60,180 ,150, 50);
        lbl.setFont(new Font("Arial Black",Font.BOLD,13));
        f.add(lbl);

        JTextField txtInput = new JTextField();
        txtInput.setBounds (165,180,265,50);
        f.add(txtInput);
        
        JLabel passJLabel = new JLabel("Password:");
        passJLabel.setBounds(60, 250, 210, 50);
        passJLabel.setFont(new Font("Arial Black",Font.BOLD,13));
        f.add(passJLabel);
       
        JPasswordField passField = new JPasswordField();
        passField.setBounds(165,250,265,50);
        f.add(passField);
        
        JLabel rpassJLabel = new JLabel("Repeat");
        rpassJLabel.setBounds(60, 310, 220, 50);
        rpassJLabel.setFont(new Font("Arial Black",Font.BOLD,13));
        f.add(rpassJLabel);
        
        JLabel rpassJLabell = new JLabel("Password:");
        rpassJLabell.setBounds(60, 330, 230, 50);
        rpassJLabell.setFont(new Font("Arial Black",Font.BOLD,13));
        f.add(rpassJLabell);
        
        JPasswordField rpassField = new JPasswordField();
        rpassField.setBounds(165, 320, 265, 50);
        f.add(rpassField);
        
        JButton btnlogin = new JButton("LOG IN");
        btnlogin.setBounds(50,400,120,60);
        btnlogin.setFont(new Font("Arial Black",Font.BOLD,13));
        f.add(btnlogin);
        
       JButton btnconfirm = new JButton("CONFIRM");
        btnconfirm.setBounds(310,400,120,60);
        btnconfirm.setFont(new Font("Arial Black",Font.BOLD,13));
        f.add(btnconfirm);
       
        
        btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
            }

            
        });
        btnconfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt=txtInput.getText().trim();
            String field=new String(passField.getPassword()).trim();
            String rfield=new String(rpassField.getPassword()).trim();
            
            if(txt.isEmpty()&& field.isEmpty()&& rfield.isEmpty()){
                JOptionPane.showMessageDialog(f, "PLEASE FILL ALL FIELD", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(field.isEmpty()){
                JOptionPane.showMessageDialog(f, "PLEASE INPUT A PASSWORD", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(txt.isEmpty()) {
                 JOptionPane.showMessageDialog(f, "PLEASE INPUT A NAME", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(!field.equals(rfield)){
                JOptionPane.showMessageDialog(f, "PASSWORD DO NOT MATCH", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(f, "SUCCESSFULLY REGISTERED");
                f.dispose();
            
            }
            }
        });
        f.setVisible(true);
    }
     }