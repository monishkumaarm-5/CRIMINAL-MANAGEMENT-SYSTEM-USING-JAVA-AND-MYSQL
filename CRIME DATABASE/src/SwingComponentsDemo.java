
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
public class CRIME extends JFrame implements ActionListener
{
    private Connection connection;

    public CRIME()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime", "root", "sql@123");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        login();
        
    }
    private JFrame loginFrame= new JFrame("Login-Page");
    private JLabel loginimage= new JLabel(getScaledImageIcon("images/image.png",150,150));
    private JLabel usridLabel = new    JLabel("     USER ID:");
    private JLabel passwordJLabel =new JLabel("    Password:"); 
    private JTextField userid=new JTextField();
    private JTextField password=new JTextField();
    private JLabel Title =new JLabel("CRIME DATABASE MANAGEMENT");
    private JButton login=new JButton("Login");
    String passwordreceived;
    String passwordcheck,useridinput;
    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingComponentsDemo extends JFrame {

    public SwingComponentsDemo() {
        setTitle("Swing Components Demo");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // JButton
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button clicked!");
            }
        });

        // JLabel
        JLabel label = new JLabel("This is a JLabel");

        // JTextField
        JTextField textField = new JTextField(20);

        // JTextArea
        JTextArea textArea = new JTextArea(5, 20);

        // JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("Check me");

        // JMenu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");
        menu.add(menuItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // JColorChooser
        JButton colorChooserButton = new JButton("Choose Color");
        colorChooserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Choose a color", Color.black);
                if (color != null) {
                    getContentPane().setBackground(color);
                }
            }
        });

        // JTable
        String[][] data = {{"1", "John", "22"}, {"2", "Jane", "23"}, {"3", "Tom", "24"}};
        String[] columnNames = {"ID", "Name", "Age"};
        JTable table = new JTable(data, columnNames);

        // JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);

        // JComboBox
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        // Adding components to the JFrame
        add(button);
        add(label);
        add(textField);
        add(scrollPane); // Adding JScrollPane which contains JTextArea
        add(radioButton1);
        add(radioButton2);
        add(checkBox);
        add(colorChooserButton);
        add(new JScrollPane(table)); // Adding JTable within JScrollPane
        add(comboBox);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingComponentsDemo().setVisible(true);
            }
        });
    }
}

    String idReceived;
    public void login()
    {   
        loginFrame.setSize(600,600);
        loginFrame.getContentPane().setBackground(Color.BLACK);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginimage.setBounds(155,25,300,200);
        loginFrame.add(loginimage);

        Title.setFont(font2);
        Title.setForeground(Color.WHITE);
        Title.setBackground(DarkBlue);
        Title.setBorder(BorderFactory.createLineBorder(DarkBlue));
        Title.setBounds(100,225,450,25);
        loginFrame.add(Title);
        
        userid.setBounds(275,275,200,45);
        userid.setForeground(Color.WHITE);
        userid.setBackground(new Color(0,23,45));
        userid.setBorder(BorderFactory.createLineBorder(new Color(0,23,45)));
        userid.setFont(font);
        userid.setText("");

        password.setBounds(275,325,200,45);
        password.setForeground(Color.WHITE);
        password.setBackground(new Color(0,23,45));
        password.setBorder(BorderFactory.createLineBorder(new Color(0,23,45)));
        password.setFont(font);
        password.setText("");

        usridLabel.setFont(font);
        usridLabel.setForeground(Color.WHITE);
        usridLabel.setBounds(175,275,175,45);

        passwordJLabel.setFont(font);
        passwordJLabel.setForeground(Color.WHITE);
        passwordJLabel.setBounds(175,325,175,45);

        login.setBounds(225,400,200,50);
        login.setBackground(new Color(0,23,45));
        login.setForeground(new Color(173,216,230));
        login.addActionListener(this);
        login.setFont(font);

        loginFrame.add(userid);
        loginFrame.add(usridLabel);
        loginFrame.add(password);
        loginFrame.add(passwordJLabel);
        loginFrame.add(login);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);
    }

    private JFrame dashboardFrame;
    private JButton FIR_Button =new JButton("FILE A FIR");
    private JButton FIRdetailsButton =new JButton("SHOW A FIR");
    private JButton SHOWCRIMINALBUTTON =new JButton("SHOW A CRIMINAL");
    private JButton SHOWVICTIMSBUTTON =new JButton("SHOW A VICTIM");
    private JButton UPDATEBUTTON=new JButton("UPDATE THE FILES");
    private JButton CHECKINGFIRBUTTON=new JButton("CHECK FIR");
    private JButton lOGOUTButton = new JButton("LOGOUT -->");
    Color lightblue =new Color(173,213,230);

    public void dashboard()
    {
        dashboardFrame=new JFrame("Dashboard");

        dashboardFrame.setSize(800,800);
        dashboardFrame.getContentPane().setBackground(Color.BLACK);
        dashboardFrame.setLayout(null);
        dashboardFrame.setLocationRelativeTo(null);
        dashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginimage.setBounds(255,50,300,200);
        dashboardFrame.add(loginimage);

        Title.setFont(font2);
        Title.setForeground(Color.WHITE);
        Title.setBackground(DarkBlue);
        Title.setBorder(BorderFactory.createLineBorder(DarkBlue));
        Title.setBounds(190,245,450,25);
        dashboardFrame.add(Title);

        FIR_Button.setForeground(Color.WHITE);
        FIR_Button.setBackground(DarkBlue);
        FIR_Button.setFont(font);
        FIR_Button.setBounds(100,300,250,100);
        FIR_Button.setBorder(BorderFactory.createLineBorder(DarkBlue));
        FIR_Button.addActionListener(this);
        dashboardFrame.add(FIR_Button);
        
        FIRdetailsButton.setForeground(Color.WHITE);
        FIRdetailsButton.setBackground(DarkBlue);
        FIRdetailsButton.setFont(font);
        FIRdetailsButton.setBounds(450,300,250,100);
        FIRdetailsButton.setBorder(BorderFactory.createLineBorder(DarkBlue));
        FIRdetailsButton.addActionListener(this);
        dashboardFrame.add(FIRdetailsButton);

        SHOWCRIMINALBUTTON.setForeground(Color.WHITE);
        SHOWCRIMINALBUTTON.setBackground(DarkBlue);
        SHOWCRIMINALBUTTON.setFont(font);
        SHOWCRIMINALBUTTON.setBounds(100, 425, 250,100);
        SHOWCRIMINALBUTTON.setBorder(BorderFactory.createLineBorder(DarkBlue));
        SHOWCRIMINALBUTTON.addActionListener(this);
        dashboardFrame.add(SHOWCRIMINALBUTTON);

        SHOWVICTIMSBUTTON.setForeground(Color.WHITE);
        SHOWVICTIMSBUTTON.setBackground(DarkBlue);
        SHOWVICTIMSBUTTON.setFont(font);
        SHOWVICTIMSBUTTON.setBounds(450, 425, 250, 100);
        SHOWVICTIMSBUTTON.setBorder(BorderFactory.createLineBorder(DarkBlue));
        SHOWVICTIMSBUTTON.addActionListener(this);
        dashboardFrame.add(SHOWVICTIMSBUTTON);

        UPDATEBUTTON.setForeground(Color.WHITE);
        UPDATEBUTTON.setBackground(DarkBlue);
        UPDATEBUTTON.setFont(font);
        UPDATEBUTTON.setBounds(100,550, 250, 100);
        UPDATEBUTTON.setBorder(BorderFactory.createLineBorder(DarkBlue));
        UPDATEBUTTON.addActionListener(this);
        dashboardFrame.add(UPDATEBUTTON);

        CHECKINGFIRBUTTON.setForeground(Color.WHITE);
        CHECKINGFIRBUTTON.setBackground(DarkBlue);
        CHECKINGFIRBUTTON.setFont(font);
        CHECKINGFIRBUTTON.setBounds(450,550,250,100);
        CHECKINGFIRBUTTON.setBorder(BorderFactory.createLineBorder(DarkBlue));
        CHECKINGFIRBUTTON.addActionListener(this);
        

        lOGOUTButton.setForeground(lightblue);
        lOGOUTButton.setBackground(Color.BLACK);
        lOGOUTButton.setFont(font);
        lOGOUTButton.setBounds(675,25,100,50);
        lOGOUTButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lOGOUTButton.addActionListener(this);
        dashboardFrame.add(lOGOUTButton);

        dashboardFrame.setVisible(true);    
        
    }
    private JFrame FircriminalFRame =new JFrame("FIR-criminal");
    private JLabel criminalnamelLabel=new JLabel("       CRIMINAL NAME");
    private JLabel CriminaldobLabel=new JLabel("DATE OF BIRTH:(YYYY-MM-DD)");
    private JLabel criminalgenderLabel=new JLabel("Gender:");
    private JLabel criminaladdressLabel=new JLabel("CRIMINALADDRESS:");
    private JLabel imageLabel =new JLabel("        CRIMINAL PHOTO");
    private JButton addimagebutton=new JButton("Add Image");
    private JFileChooser choosingimagepath=new JFileChooser(); 
    private JTextField crimianlnameTextField=new JTextField("  ");
    private JTextField criminaldobTextField=new JTextField("  ");
    String gen[]={"MALE","FEMALE","OTHER"};
    private JComboBox<String> criminalgenderComboBox=new JComboBox<>(gen);
    private JTextField criminaladdressTextField=new JTextField("  ");
    private JButton submitforcriminalButton=new JButton("NEXT ->");
    private JLabel CRiminaltitlelable=new JLabel("CRIMINAL DETAILS");
    String crimeid;
    
    public void criminal_records()
    {
        
        FircriminalFRame.setSize(800,850);
        FircriminalFRame.getContentPane().setBackground(Color.BLACK);
        FircriminalFRame.setLayout(null);
        FircriminalFRame.setLocationRelativeTo(null);
        FircriminalFRame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CRiminaltitlelable.setFont(font3);
        CRiminaltitlelable.setForeground(Color.WHITE);
        CRiminaltitlelable.setBackground(Color.BLACK);
        CRiminaltitlelable.setBounds(260,50,700,75);
        CRiminaltitlelable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(CRiminaltitlelable);
        
        imageLabel =new JLabel("        CRIMINAL PHOTO");
        imageLabel.setFont(font);
        imageLabel.setForeground(Color.WHITE);
        imageLabel.setBackground(Color.BLACK);
        imageLabel.setBounds(50,150,200,200);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        FircriminalFRame.add(imageLabel);

        addimagebutton.setForeground(Color.WHITE);
        addimagebutton.setBackground(Color.BLACK);
        addimagebutton.setFont(font);
        addimagebutton.setBounds(70,375,150,25);
        addimagebutton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addimagebutton.addActionListener(this);
        FircriminalFRame.add(addimagebutton);

        criminalnamelLabel.setForeground(Color.WHITE);
        criminalnamelLabel.setBackground(lightblue);
        criminalnamelLabel.setFont(font2);
        criminalnamelLabel.setBounds(300,150,400,75);
        criminalnamelLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(criminalnamelLabel);


        CriminaldobLabel.setForeground(Color.WHITE);
        CriminaldobLabel.setBackground(lightblue);
        CriminaldobLabel.setFont(font);
        CriminaldobLabel.setBounds(50,425,250,100);
        CriminaldobLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(CriminaldobLabel);
        

        criminaladdressLabel.setForeground(Color.WHITE);
        criminaladdressLabel.setBackground(DarkBlue);
        criminaladdressLabel.setFont(font);
        criminaladdressLabel.setBounds(50,625,250,75);
        criminaladdressLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(criminaladdressLabel);

        criminalgenderLabel.setForeground(Color.WHITE);
        criminalgenderLabel.setBackground(DarkBlue);
        criminalgenderLabel.setFont(font);
        criminalgenderLabel.setBounds(50,525,250,75);
        criminalgenderLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(criminalgenderLabel);

        crimianlnameTextField.setForeground(Color.WHITE);
        crimianlnameTextField.setBackground(DarkBlue);
        crimianlnameTextField.setFont(font);
        crimianlnameTextField.setBounds(300,250,400,75);
        crimianlnameTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        crimianlnameTextField.setText(" ");
        FircriminalFRame.add(crimianlnameTextField);

        criminaldobTextField.setForeground(Color.WHITE);
        criminaldobTextField.setBackground(DarkBlue);
        criminaldobTextField.setFont(font);
        criminaldobTextField.setBounds(400,425,250,75);
        criminaldobTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        criminaldobTextField.setText(" ");
        FircriminalFRame.add(criminaldobTextField);

        criminalgenderComboBox.setForeground(Color.WHITE);
        criminalgenderComboBox.setBackground(DarkBlue);
        criminalgenderComboBox.setFont(font);
        criminalgenderComboBox.setBounds(400,525,250,75);
        criminalgenderComboBox.setBorder(BorderFactory.createLineBorder(DarkBlue));
        criminalgenderComboBox.setSelectedItem("MALE");
        FircriminalFRame.add(criminalgenderComboBox);

        criminaladdressTextField.setForeground(Color.WHITE);
        criminaladdressTextField.setBackground(DarkBlue);
        criminaladdressTextField.setFont(font);
        criminaladdressTextField.setBounds(400,625,250,75);
        criminaladdressTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        criminaladdressTextField.setText(" ");
        FircriminalFRame.add(criminaladdressTextField);

        submitforcriminalButton.setForeground(Color.WHITE);
        submitforcriminalButton.setBackground(DarkBlue);
        submitforcriminalButton.setFont(font);
        submitforcriminalButton.setBounds(100,725,600,40);
        submitforcriminalButton.setBorder(BorderFactory.createLineBorder(DarkBlue));
        submitforcriminalButton.addActionListener(this);
        FircriminalFRame.add(submitforcriminalButton);

        FircriminalFRame.setVisible(true);

    } 

    private JFrame FirvictimeFRame =new JFrame("FIR-victim");
    private JLabel VictimnamelLabel=new JLabel("       VICTIM NAME");
    private JLabel victimdobLabel=new JLabel("DATE OF BIRTH:(YYYY-MM-DD)");
    private JLabel victimgenderLabel=new JLabel("Gender:");
    private JLabel victimaddressLabel=new JLabel("VICTIM ADDRESS:");
    private JLabel victimimageLabel =new JLabel("        VICTIM PHOTO");
    private JButton victimaddimagebutton=new JButton("Add Image");
    private JFileChooser victimchoosingimagepath=new JFileChooser(); 
    private JTextField victimnameTextField=new JTextField("  ");
    private JTextField victimdobTextField=new JTextField("  ");
    private JComboBox<String> victimgenderComboBox=new JComboBox<>(gen);
    private JTextField victimaddressTextField=new JTextField("  ");
    private JButton submitforvictimButton=new JButton("NEXT ->");
    private JLabel victimtitlelable=new JLabel("VICTIM DETAILS");
    String victimid;
    
    public void victim_records()
    {
        
        FirvictimeFRame.setSize(800,850);
        FirvictimeFRame.getContentPane().setBackground(Color.BLACK);
        FirvictimeFRame.setLayout(null);
        FirvictimeFRame.setLocationRelativeTo(null);
        FirvictimeFRame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        victimtitlelable.setFont(font3);
        victimtitlelable.setForeground(Color.WHITE);
        victimtitlelable.setBackground(Color.BLACK);
        victimtitlelable.setBounds(260,50,700,75);
        victimtitlelable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FirvictimeFRame.add(victimtitlelable);
        
        victimimageLabel =new JLabel("        VICTIM PHOTO");
        victimimageLabel.setFont(font);
        victimimageLabel.setForeground(Color.WHITE);
        victimimageLabel.setBackground(Color.BLACK);
        victimimageLabel.setBounds(50,150,200,200);
        victimimageLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        FirvictimeFRame.add(victimimageLabel);

        victimaddimagebutton.setForeground(Color.WHITE);
        victimaddimagebutton.setBackground(Color.BLACK);
        victimaddimagebutton.setFont(font);
        victimaddimagebutton.setBounds(70,375,150,25);
        victimaddimagebutton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        victimaddimagebutton.addActionListener(this);
        FirvictimeFRame.add(victimaddimagebutton);

        VictimnamelLabel.setForeground(Color.WHITE);
        VictimnamelLabel.setBackground(lightblue);
        VictimnamelLabel.setFont(font2);
        VictimnamelLabel.setBounds(300,150,400,75);
        VictimnamelLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FirvictimeFRame.add(VictimnamelLabel);


        victimdobLabel.setForeground(Color.WHITE);
        victimdobLabel.setBackground(lightblue);
        victimdobLabel.setFont(font);
        victimdobLabel.setBounds(50,425,250,100);
        victimdobLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FirvictimeFRame.add(victimdobLabel);
        

        victimaddressLabel.setForeground(Color.WHITE);
        victimaddressLabel.setBackground(DarkBlue);
        victimaddressLabel.setFont(font);
        victimaddressLabel.setBounds(50,625,250,75);
        victimaddressLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FirvictimeFRame.add(victimaddressLabel);

        victimgenderLabel.setForeground(Color.WHITE);
        victimgenderLabel.setBackground(DarkBlue);
        victimgenderLabel.setFont(font);
        victimgenderLabel.setBounds(50,525,250,75);
        victimgenderLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FirvictimeFRame.add(victimgenderLabel);

        victimnameTextField.setForeground(Color.WHITE);
        victimnameTextField.setBackground(DarkBlue);
        victimnameTextField.setFont(font);
        victimnameTextField.setBounds(300,250,400,75);
        victimnameTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        victimnameTextField.setText(" ");
        FirvictimeFRame.add(victimnameTextField);

        victimdobTextField.setForeground(Color.WHITE);
        victimdobTextField.setBackground(DarkBlue);
        victimdobTextField.setFont(font);
        victimdobTextField.setBounds(400,425,250,75);
        victimdobTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        victimdobTextField.setText(" ");
        FirvictimeFRame.add(victimdobTextField);

        victimgenderComboBox.setForeground(Color.WHITE);
        victimgenderComboBox.setBackground(DarkBlue);
        victimgenderComboBox.setFont(font);
        victimgenderComboBox.setBounds(400,525,250,75);
        victimgenderComboBox.setBorder(BorderFactory.createLineBorder(DarkBlue));
        victimgenderComboBox.setSelectedItem("MALE");
        FirvictimeFRame.add(victimgenderComboBox);

        victimaddressTextField.setForeground(Color.WHITE);
        victimaddressTextField.setBackground(DarkBlue);
        victimaddressTextField.setFont(font);
        victimaddressTextField.setBounds(400,625,250,75);
        victimaddressTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        victimaddressTextField.setText(" ");
        FirvictimeFRame.add(victimaddressTextField);

        submitforvictimButton.setForeground(Color.WHITE);
        submitforvictimButton.setBackground(DarkBlue);
        submitforvictimButton.setFont(font);
        submitforvictimButton.setBounds(100,725,600,40);
        submitforvictimButton.setBorder(BorderFactory.createLineBorder(DarkBlue));
        submitforvictimButton.addActionListener(this);
        FirvictimeFRame.add(submitforvictimButton);

        FirvictimeFRame.setVisible(true);

    } 

    JButton editbutton =new JButton("Edit");
    public void updatecriminal(String idReceived)
    {
        
        FircriminalFRame.setSize(800,850);
        FircriminalFRame.getContentPane().setBackground(Color.BLACK);
        FircriminalFRame.setLayout(null);
        FircriminalFRame.setLocationRelativeTo(null);
        FircriminalFRame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CRiminaltitlelable.setFont(font3);
        CRiminaltitlelable.setForeground(Color.WHITE);
        CRiminaltitlelable.setBackground(Color.BLACK);
        CRiminaltitlelable.setBounds(260,50,700,75);
        CRiminaltitlelable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(CRiminaltitlelable);
        
        imageLabel =new JLabel("        CRIMINAL PHOTO");
        imageLabel.setFont(font);
        imageLabel.setForeground(Color.WHITE);
        imageLabel.setBackground(Color.BLACK);
        imageLabel.setBounds(50,150,200,200);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        FircriminalFRame.add(imageLabel);

        addimagebutton.setForeground(Color.WHITE);
        addimagebutton.setBackground(Color.BLACK);
        addimagebutton.setFont(font);
        addimagebutton.setBounds(70,375,150,25);
        addimagebutton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addimagebutton.addActionListener(this);
        FircriminalFRame.add(addimagebutton);

        criminalnamelLabel.setForeground(Color.WHITE);
        criminalnamelLabel.setBackground(lightblue);
        criminalnamelLabel.setFont(font2);
        criminalnamelLabel.setBounds(300,150,400,75);
        criminalnamelLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(criminalnamelLabel);


        CriminaldobLabel.setForeground(Color.WHITE);
        CriminaldobLabel.setBackground(lightblue);
        CriminaldobLabel.setFont(font);
        CriminaldobLabel.setBounds(50,425,250,100);
        CriminaldobLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(CriminaldobLabel);
        

        criminaladdressLabel.setForeground(Color.WHITE);
        criminaladdressLabel.setBackground(DarkBlue);
        criminaladdressLabel.setFont(font);
        criminaladdressLabel.setBounds(50,625,250,75);
        criminaladdressLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(criminaladdressLabel);

        criminalgenderLabel.setForeground(Color.WHITE);
        criminalgenderLabel.setBackground(DarkBlue);
        criminalgenderLabel.setFont(font);
        criminalgenderLabel.setBounds(50,525,250,75);
        criminalgenderLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(criminalgenderLabel);

        crimianlnameTextField.setForeground(Color.WHITE);
        crimianlnameTextField.setBackground(DarkBlue);
        crimianlnameTextField.setFont(font);
        crimianlnameTextField.setBounds(300,250,400,75);
        crimianlnameTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        crimianlnameTextField.setText(" ");
        FircriminalFRame.add(crimianlnameTextField);

        criminaldobTextField.setForeground(Color.WHITE);
        criminaldobTextField.setBackground(DarkBlue);
        criminaldobTextField.setFont(font);
        criminaldobTextField.setBounds(400,425,250,75);
        criminaldobTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        criminaldobTextField.setText(" ");
        FircriminalFRame.add(criminaldobTextField);

        criminalgenderComboBox.setForeground(Color.WHITE);
        criminalgenderComboBox.setBackground(DarkBlue);
        criminalgenderComboBox.setFont(font);
        criminalgenderComboBox.setBounds(400,525,250,75);
        criminalgenderComboBox.setBorder(BorderFactory.createLineBorder(DarkBlue));
        criminalgenderComboBox.setSelectedItem("MALE");
        FircriminalFRame.add(criminalgenderComboBox);

        criminaladdressTextField.setForeground(Color.WHITE);
        criminaladdressTextField.setBackground(DarkBlue);
        criminaladdressTextField.setFont(font);
        criminaladdressTextField.setBounds(400,625,250,75);
        criminaladdressTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        criminaladdressTextField.setText(" ");
        FircriminalFRame.add(criminaladdressTextField);

        FircriminalFRame.setVisible(true);
                        // 
                        try {
                            PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM criminal_records WHERE Criminalid = ?");
                            prepareStatement.setString(1, idReceived);
                            ResultSet retrievingCriminalData = prepareStatement.executeQuery();
                            
                            if (retrievingCriminalData.next()) {
                                crimianlnameTextField.setText(retrievingCriminalData.getString("Criminalname"));
                                criminaldobTextField.setText(retrievingCriminalData.getString("dateofbirth"));
                                criminalgenderComboBox.setSelectedItem(retrievingCriminalData.getString("gender"));
                                criminaladdressTextField.setText(retrievingCriminalData.getString("address"));
                                
                              
                                Blob criminalBlob = retrievingCriminalData.getBlob("image");
                                ImageIcon criminalImage = new ImageIcon(criminalBlob.getBytes(1, (int) criminalBlob.length()));
                                Image scalingImage = criminalImage.getImage();
                                Image scaledImage = scalingImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                                ImageIcon scaledIcon = new ImageIcon(scaledImage);
                                imageLabel.setIcon(scaledIcon);
                            } else {
                                JOptionPane.showMessageDialog(null, "No records found for the given ID.");
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        editbutton.setForeground(Color.WHITE);
                        editbutton.setBackground(DarkBlue);
                        editbutton.setFont(font);
                        editbutton.setBounds(100,725,600,40);
                        editbutton.setBorder(BorderFactory.createLineBorder(DarkBlue));
                        editbutton.addActionListener(this);
                        FircriminalFRame.add(editbutton);
                    }
    
    


    

    private JFrame FirdetailsFRame =new JFrame("FIR-victim");
    private JLabel detailsoffenselLabel=new JLabel("       TYPE OF OFFENSE");
    private JLabel detailsdateLabel=new JLabel("DATE OF CRIME:(YYYY-MM-DD)");
    private JLabel detailstimeLabel=new JLabel("TIME OF CRIME:(HH:MM:SS)");
    private JLabel detailsdescriptionLabel=new JLabel("DESCRIPTION:");
    private JLabel detailsimageLabel =new JLabel("        VICTIM PHOTO");
    private JButton detailsaddimagebutton=new JButton("Add Image");
    private JFileChooser detailschoosingimagepath=new JFileChooser(); 
    private JTextField detailstimeTextField=new JTextField("  ");
    private JTextField detailsdateTextField=new JTextField("  ");
    String CRIMETYPES[]={"Robbery", "Burglary", "Assault (Simple)", "Aggravated Assault", "Murder", "Manslaughter", "Attempted Murder", "Rape", "Sexual Assault", "Child Abuse", "Domestic Violence", "Stalking", "Harassment", "Human Trafficking", "Kidnapping", "Abduction", "Arson", "Fraud", "Embezzlement", "Forgery", "Identity Theft", "Credit Card Fraud", "Computer Fraud", "Insurance Fraud", "Tax Evasion", "Money Laundering", "Drug Possession", "Drug Trafficking", "Drug Manufacturing", "Driving Under the Influence (DUI)", "Hit and Run", "Reckless Driving", "Theft", "Shoplifting", "Auto Theft", "Grand Theft", "Petty Theft", "Robbery", "Armed Robbery", "Carjacking", "Extortion", "Terrorism", "Cybercrime", "Hacking", "Phishing", "Cyberstalking", "Online Harassment", "Cyberbullying", "Data Breach", "Intellectual Property Theft", "Environmental Crime", "Pollution", "Illegal Dumping", "Wildlife Trafficking", "White Collar Crime", "Corporate Fraud", "Insider Trading", "Ponzi Scheme", "Racketeering", "Public Order Offenses", "Disorderly Conduct", "Disturbing the Peace", "Public Intoxication", "Rioting", "Trespassing", "Vandalism", "Weapons Offenses", "Illegal Possession of Firearms", "Carrying Concealed Weapon", "Assault with a Deadly Weapon", "Other"};
    private JComboBox<String> offensedetailsComboBox=new JComboBox<>(CRIMETYPES);
    private JTextField detailsdescriptionTextField=new JTextField("  ");
    private JButton submitfordetailsButton=new JButton("SUBMIT");
    private JLabel fir_details_titlelable=new JLabel("VICTIM DETAILS");
    String firid;

    public void FIRdetails_records()
    {
        
        FirdetailsFRame.setSize(800,850);
        FirdetailsFRame.getContentPane().setBackground(Color.BLACK);
        FirdetailsFRame.setLayout(null);
        FirdetailsFRame.setLocationRelativeTo(null);
        FirdetailsFRame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fir_details_titlelable.setFont(font3);
        fir_details_titlelable.setForeground(Color.WHITE);
        fir_details_titlelable.setBackground(Color.BLACK);
        fir_details_titlelable.setBounds(260,50,700,75);
        fir_details_titlelable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FirdetailsFRame.add(fir_details_titlelable);
        
        detailsimageLabel =new JLabel("        EVIDENCE PHOTO");
        detailsimageLabel.setFont(font);
        detailsimageLabel.setForeground(Color.WHITE);
        detailsimageLabel.setBackground(Color.BLACK);
        detailsimageLabel.setBounds(50,150,200,200);
        detailsimageLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        FirdetailsFRame.add(detailsimageLabel);

        detailsaddimagebutton.setForeground(Color.WHITE);
        detailsaddimagebutton.setBackground(Color.BLACK);
        detailsaddimagebutton.setFont(font);
        detailsaddimagebutton.setBounds(70,375,150,25);
        detailsaddimagebutton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        detailsaddimagebutton.addActionListener(this);
        FirdetailsFRame.add(detailsaddimagebutton);

        detailsoffenselLabel.setForeground(Color.WHITE);
        detailsoffenselLabel.setBackground(lightblue);
        detailsoffenselLabel.setFont(font2);
        detailsoffenselLabel.setBounds(300,150,400,75);
        detailsoffenselLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FirdetailsFRame.add(detailsoffenselLabel);


        detailsdateLabel.setForeground(Color.WHITE);
        detailsdateLabel.setBackground(lightblue);
        detailsdateLabel.setFont(font);
        detailsdateLabel.setBounds(50,425,250,100);
        detailsdateLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FirdetailsFRame.add(detailsdateLabel);
        

        detailsdescriptionLabel.setForeground(Color.WHITE);
        detailsdescriptionLabel.setBackground(DarkBlue);
        detailsdescriptionLabel.setFont(font);
        detailsdescriptionLabel.setBounds(50,625,250,75);
        detailsdescriptionLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FirdetailsFRame.add(detailsdescriptionLabel);

        detailstimeLabel.setForeground(Color.WHITE);
        detailstimeLabel.setBackground(DarkBlue);
        detailstimeLabel.setFont(font);
        detailstimeLabel.setBounds(50,525,250,75);
        detailstimeLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FirdetailsFRame.add(detailstimeLabel);

        offensedetailsComboBox.setForeground(Color.WHITE);
        offensedetailsComboBox.setBackground(DarkBlue);
        offensedetailsComboBox.setFont(font);
        offensedetailsComboBox.setBounds(300,250,400,75);
        offensedetailsComboBox.setBorder(BorderFactory.createLineBorder(DarkBlue));
        FirdetailsFRame.add(offensedetailsComboBox);

        detailsdateTextField.setForeground(Color.WHITE);
        detailsdateTextField.setBackground(DarkBlue);
        detailsdateTextField.setFont(font);
        detailsdateTextField.setBounds(400,425,250,75);
        detailsdateTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        detailsdateTextField.setText("");
        FirdetailsFRame.add(detailsdateTextField);

        detailstimeTextField.setForeground(Color.WHITE);
        detailstimeTextField.setBackground(DarkBlue);
        detailstimeTextField.setFont(font);
        detailstimeTextField.setBounds(400,525,250,75);
        detailstimeTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        detailstimeTextField.setText("");
        FirdetailsFRame.add(detailstimeTextField);

        detailsdescriptionTextField.setForeground(Color.WHITE);
        detailsdescriptionTextField.setBackground(DarkBlue);
        detailsdescriptionTextField.setFont(font);
        detailsdescriptionTextField.setBounds(400,625,250,75);
        detailsdescriptionTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        detailsdescriptionTextField.setText("");
        FirdetailsFRame.add(detailsdescriptionTextField);

        submitfordetailsButton.setForeground(Color.WHITE);
        submitfordetailsButton.setBackground(DarkBlue);
        submitfordetailsButton.setFont(font);
        submitfordetailsButton.setBounds(100,725,600,40);
        submitfordetailsButton.setBorder(BorderFactory.createLineBorder(DarkBlue));
        submitfordetailsButton.addActionListener(this);
        FirdetailsFRame.add(submitfordetailsButton);

        FirdetailsFRame.setVisible(true);

    } 


   
    JFrame criminalframe;
    JLabel criminalrecordtitle=new JLabel("VICTIM RECORDS");
    JButton backtodashboard=new JButton("BACK->");
    JTable criminaltable = new JTable();
    JScrollPane scrollPane = new JScrollPane(criminaltable);

    JButton editbuttonforvictim =new JButton("Edit");
    public void updatevictim(String idReceived)
    {
        
        FircriminalFRame.setSize(800,850);
        FircriminalFRame.getContentPane().setBackground(Color.BLACK);
        FircriminalFRame.setLayout(null);
        FircriminalFRame.setLocationRelativeTo(null);
        FircriminalFRame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CRiminaltitlelable.setFont(font3);
        CRiminaltitlelable.setForeground(Color.WHITE);
        CRiminaltitlelable.setBackground(Color.BLACK);
        CRiminaltitlelable.setText("VICTIM RECORDS");
        CRiminaltitlelable.setBounds(260,50,700,75);
        CRiminaltitlelable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(CRiminaltitlelable);
        
        imageLabel =new JLabel("        VICTIM PHOTO");
        imageLabel.setFont(font);
        imageLabel.setForeground(Color.WHITE);
        imageLabel.setBackground(Color.BLACK);
        imageLabel.setBounds(50,150,200,200);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        FircriminalFRame.add(imageLabel);

        addimagebutton.setForeground(Color.WHITE);
        addimagebutton.setBackground(Color.BLACK);
        addimagebutton.setFont(font);
        addimagebutton.setBounds(70,375,150,25);
        addimagebutton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addimagebutton.addActionListener(this);
        FircriminalFRame.add(addimagebutton);

        criminalnamelLabel.setForeground(Color.WHITE);
        criminalnamelLabel.setBackground(lightblue);
        criminalnamelLabel.setFont(font2);
        criminalnamelLabel.setText("Victim Name:");
        criminalnamelLabel.setBounds(300,150,400,75);
        criminalnamelLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(criminalnamelLabel);


        CriminaldobLabel.setForeground(Color.WHITE);
        CriminaldobLabel.setBackground(lightblue);
        CriminaldobLabel.setFont(font);
        CriminaldobLabel.setBounds(50,425,250,100);
        CriminaldobLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(CriminaldobLabel);
        

        criminaladdressLabel.setForeground(Color.WHITE);
        criminaladdressLabel.setBackground(DarkBlue);
        criminaladdressLabel.setFont(font);
        criminaladdressLabel.setBounds(50,625,250,75);
        criminaladdressLabel.setText("Victim Address:");
        criminaladdressLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(criminaladdressLabel);

        criminalgenderLabel.setForeground(Color.WHITE);
        criminalgenderLabel.setBackground(DarkBlue);
        criminalgenderLabel.setFont(font);
        criminalgenderLabel.setBounds(50,525,250,75);
        criminalgenderLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        FircriminalFRame.add(criminalgenderLabel);

        crimianlnameTextField.setForeground(Color.WHITE);
        crimianlnameTextField.setBackground(DarkBlue);
        crimianlnameTextField.setFont(font);
        crimianlnameTextField.setBounds(300,250,400,75);
        crimianlnameTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        crimianlnameTextField.setText(" ");
        FircriminalFRame.add(crimianlnameTextField);

        criminaldobTextField.setForeground(Color.WHITE);
        criminaldobTextField.setBackground(DarkBlue);
        criminaldobTextField.setFont(font);
        criminaldobTextField.setBounds(400,425,250,75);
        criminaldobTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        criminaldobTextField.setText(" ");
        FircriminalFRame.add(criminaldobTextField);

        criminalgenderComboBox.setForeground(Color.WHITE);
        criminalgenderComboBox.setBackground(DarkBlue);
        criminalgenderComboBox.setFont(font);
        criminalgenderComboBox.setBounds(400,525,250,75);
        criminalgenderComboBox.setBorder(BorderFactory.createLineBorder(DarkBlue));
        criminalgenderComboBox.setSelectedItem("MALE");
        FircriminalFRame.add(criminalgenderComboBox);

        criminaladdressTextField.setForeground(Color.WHITE);
        criminaladdressTextField.setBackground(DarkBlue);
        criminaladdressTextField.setFont(font);
        criminaladdressTextField.setBounds(400,625,250,75);
        criminaladdressTextField.setBorder(BorderFactory.createLineBorder(DarkBlue));
        criminaladdressTextField.setText(" ");
        FircriminalFRame.add(criminaladdressTextField);

        FircriminalFRame.setVisible(true);
                        // 
                        try {
                            PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM Victim_records WHERE Victimid =?");
                            prepareStatement.setString(1, idReceived);
                            ResultSet retrievingCriminalData = prepareStatement.executeQuery();
                            
                            if (retrievingCriminalData.next()) {
                                crimianlnameTextField.setText(retrievingCriminalData.getString("Victimname"));
                                criminaldobTextField.setText(retrievingCriminalData.getString("dateofbirth"));
                                criminalgenderComboBox.setSelectedItem(retrievingCriminalData.getString("gender"));
                                criminaladdressTextField.setText(retrievingCriminalData.getString("address"));
                                
                              
                                Blob criminalBlob = retrievingCriminalData.getBlob("image");
                                ImageIcon criminalImage = new ImageIcon(criminalBlob.getBytes(1, (int) criminalBlob.length()));
                                Image scalingImage = criminalImage.getImage();
                                Image scaledImage = scalingImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                                ImageIcon scaledIcon = new ImageIcon(scaledImage);
                                imageLabel.setIcon(scaledIcon);
                            } else {
                                JOptionPane.showMessageDialog(null, "No records found for the given ID.");
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        editbuttonforvictim.setForeground(Color.WHITE);
                        editbuttonforvictim.setBackground(DarkBlue);
                        editbuttonforvictim.setFont(font);
                        editbuttonforvictim.setBounds(100,725,600,40);
                        editbuttonforvictim.setBorder(BorderFactory.createLineBorder(DarkBlue));
                        editbuttonforvictim.addActionListener(this);
                        FircriminalFRame.add(editbuttonforvictim);
                    }
    

    @Override
    public void actionPerformed (ActionEvent e)
    {
        //login
        if(e.getSource()==login)
        {
          useridinput=userid.getText();
          passwordcheck=password.getText();
          try
          {
          ResultSet login_result;
          PreparedStatement login_check=connection.prepareStatement("select * from login_information where user_id =?");
          login_check.setString(1,useridinput);
          login_result=login_check.executeQuery();
          login_result.next();
          passwordreceived=login_result.getString(2);
          System.out.println(passwordreceived);
          System.out.println(passwordcheck);
          
          if(passwordreceived.equals(passwordcheck))
          {
            loginFrame.dispose();
            dashboard();
          }
          else
          {
            JOptionPane.showMessageDialog(this,"INCORRECT PASSWORD");
          }

          }
          catch(SQLException ex)
          {
           JOptionPane.showMessageDialog(this,"USERID DOES NOT EXISTS");
          }
        }

        //logout
        if(e.getSource()==lOGOUTButton)
        {
            dashboardFrame.dispose();
            login();
        }

        //fir_create criminal
        if(e.getSource()==FIR_Button)
        {
            dashboardFrame.dispose();
            criminal_records();
        }

        //criminal image upload
        
        if(e.getSource()==addimagebutton)
        {
            int returnValue=choosingimagepath.showOpenDialog(null);
            if (returnValue==JFileChooser.APPROVE_OPTION)
            {
                File imagefile = choosingimagepath.getSelectedFile();
                try
                {
                FileInputStream imageFileInputStream=new FileInputStream(imagefile);
                byte[] imagebytes =imageFileInputStream.readAllBytes();
                ImageIcon imageIcon=new ImageIcon(imagebytes);
                Image scalingImage =imageIcon.getImage(); 
                Image scaledImage =scalingImage.getScaledInstance(200,200,Image.SCALE_SMOOTH);
                ImageIcon scaledicon=new ImageIcon(scaledImage);
                imageLabel.setIcon(scaledicon);
                imageFileInputStream.close();
                }
                catch(IOException ex)
                {

                }
            }
        }

    
        //fir create_victim
        if(e.getSource()==submitforcriminalButton)
        {
           
            String criminialnamereceived =crimianlnameTextField.getText();
            String criminaldobreceived=criminaldobTextField.getText();
            String criminalgenderreceived=(String)criminalgenderComboBox.getSelectedItem();
            String criminaladdressreceived=criminaladdressTextField.getText();
            PreparedStatement prepareStatement;
            File imagefile = choosingimagepath.getSelectedFile();
            int j=1;

            try{
                int i;
                ResultSet rs;
                i=0;
                PreparedStatement retreive_max = connection.prepareStatement("SELECT MAX(Criminalid) from criminal_records");
                rs=retreive_max.executeQuery();
                while(rs.next())
               {
                i=rs.getInt(1);
                i++;
               }
                crimeid=Integer.toString(i);
                rs.close();
                retreive_max.close();
                FileInputStream imageFileInputStream=new FileInputStream(imagefile);
                prepareStatement=connection.prepareStatement("insert into criminal_records values(?,?,?,?,?,?)");
                prepareStatement.setString(1,crimeid);
                prepareStatement.setString(2,criminialnamereceived);
                prepareStatement.setString(3,criminaldobreceived);
                prepareStatement.setString(4,criminalgenderreceived);
                prepareStatement.setString(5,criminaladdressreceived);
                prepareStatement.setBlob(6, imageFileInputStream);
                prepareStatement.executeUpdate();  
            }
            catch(SQLException|IOException ex)
            {
                JOptionPane.showMessageDialog(this,ex.getMessage());
                j=0;
            }
            if(j==1)
            {
            FircriminalFRame.dispose();
            victim_records();
            }
        }

        //victim image upload
        if(e.getSource()==victimaddimagebutton)
        {
            int returnValue=victimchoosingimagepath.showOpenDialog(null);
            if (returnValue==JFileChooser.APPROVE_OPTION)
            {
                File imagefile =victimchoosingimagepath.getSelectedFile();
                try
                {
                FileInputStream imageFileInputStream=new FileInputStream(imagefile);
                byte[] imagebytes =imageFileInputStream.readAllBytes();
                ImageIcon imageIcon=new ImageIcon(imagebytes);
                Image scalingImage =imageIcon.getImage(); 
                Image scaledImage =scalingImage.getScaledInstance(200,200,Image.SCALE_SMOOTH);
                ImageIcon scaledicon=new ImageIcon(scaledImage);
                victimimageLabel.setIcon(scaledicon);
                imageFileInputStream.close();
                }
                catch(IOException ex)
                {

                }
            }
        }

        //fir create_details
        if(e.getSource()==submitforvictimButton)
        {
            String victimnamereceived =victimnameTextField.getText();
            String victimdobreceived=victimdobTextField.getText();
            String victimgenderreceived=(String)victimgenderComboBox.getSelectedItem();
            String victimaddressreceived=victimaddressTextField.getText();
            PreparedStatement prepareStatement;
            File imagefile = victimchoosingimagepath.getSelectedFile();
            int j=1;
            try{
                int i;
                ResultSet rs;
                i=0;
                PreparedStatement retreive_max = connection.prepareStatement("SELECT MAX(Victimid) from victim_records");
                rs=retreive_max.executeQuery();
                while(rs.next())
               {
                i=rs.getInt(1);
                i++;
               }
                victimid=Integer.toString(i);
                FileInputStream imageFileInputStream=new FileInputStream(imagefile);
                prepareStatement=connection.prepareStatement("insert into victim_records values(?,?,?,?,?,?)");
                prepareStatement.setString(1,victimid);
                prepareStatement.setString(2,victimnamereceived);
                prepareStatement.setString(3, victimdobreceived);
                prepareStatement.setString(4,victimgenderreceived);
                prepareStatement.setString(5, victimaddressreceived);
                prepareStatement.setBlob(6, imageFileInputStream);
                prepareStatement.executeUpdate();  
            }
            catch(SQLException|IOException ex)
            {
                j=0;
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
            if(j==1)
            {
            FirvictimeFRame.dispose();
            FIRdetails_records();
            }
        }



        //details image upload
        if(e.getSource()==detailsaddimagebutton)
        {
            int returnValue=detailschoosingimagepath.showOpenDialog(null);
            if (returnValue==JFileChooser.APPROVE_OPTION)
            {
                File imagefile = detailschoosingimagepath.getSelectedFile();
                try
                {
                FileInputStream imageFileInputStream=new FileInputStream(imagefile);
                byte[] imagebytes =imageFileInputStream.readAllBytes();
                ImageIcon imageIcon=new ImageIcon(imagebytes);
                Image scalingImage =imageIcon.getImage(); 
                Image scaledImage =scalingImage.getScaledInstance(200,200,Image.SCALE_SMOOTH);
                ImageIcon scaledicon=new ImageIcon(scaledImage);
                detailsimageLabel.setIcon(scaledicon);
                imageFileInputStream.close();
                }
                catch(IOException ex)
                {

                }
            }
        }

        //fir final submit
        if(e.getSource()==submitfordetailsButton)
        {
            String offensedetailreceived=(String)offensedetailsComboBox.getSelectedItem();
            String detailsdatereceived =detailsdateTextField.getText();
            String detailstimereceived=detailstimeTextField.getText();
            String detailsdescriptionreceived=detailsdescriptionTextField.getText();
            PreparedStatement prepareStatement;
            File imagefile = detailschoosingimagepath.getSelectedFile();
            int j=1;
            try{
                int i;
                ResultSet rs;
                i=0;
                PreparedStatement retreive_max = connection.prepareStatement("SELECT MAX(Firid) from fir_records");
                rs=retreive_max.executeQuery();
                while(rs.next())
               {
                i=rs.getInt(1);
                i++;
               }
                firid=Integer.toString(i);
                FileInputStream imageFileInputStream=new FileInputStream(imagefile);
                prepareStatement=connection.prepareStatement("insert into fir_records values(?,?,?,?,?,?,?,?)");
                prepareStatement.setString(1,firid);
                prepareStatement.setString(2,crimeid);
                prepareStatement.setString(3,victimid);
                prepareStatement.setString(4,offensedetailreceived);
                prepareStatement.setString(5, detailsdatereceived);
                prepareStatement.setString(6,detailstimereceived);
                prepareStatement.setString(7,detailsdescriptionreceived);
                prepareStatement.setBlob(8,imageFileInputStream);
                prepareStatement.executeUpdate();  
            }
            catch(SQLException|IOException ex)
            {
                j=0;
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
            JOptionPane.showMessageDialog(this,"FIR REGISTERED SUCCESSFULLY\nFIR ID: "+firid+"\nCrime ID: "+crimeid+"\nVictim ID: "+victimid);
            if(j==1)
            {
            FirdetailsFRame.dispose();
            dashboard();
            }
        }

        //show criminal data
        if(e.getSource()==SHOWCRIMINALBUTTON)
        {
            
            dashboardFrame.dispose();
            criminalframe = new JFrame("Criminal Data");
            criminalframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            criminalframe.setLayout(null);
            criminalframe.getContentPane().setBackground(Color.BLACK);
            
            criminalrecordtitle.setForeground(Color.WHITE);
            criminalrecordtitle.setBackground(Color.BLACK);
            criminalrecordtitle.setFont(font2);
            criminalrecordtitle.setText("CRIMINAL RECORDS");
            criminalrecordtitle.setBounds(350,40,400,75);
            criminalrecordtitle.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            criminalframe.add(criminalrecordtitle);

            backtodashboard.setForeground(lightblue);
            backtodashboard.setBackground(Color.BLACK);
            backtodashboard.setFont(font);
            backtodashboard.setBounds(890,10,75,50);
            backtodashboard.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            backtodashboard.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {
                    criminalframe.dispose();
                    dashboard();
                }
            });
            criminalframe.add(backtodashboard);
            criminaltable.setBackground(DarkBlue);
            criminaltable.setForeground(Color.WHITE);
            DefaultTableModel criminalmodel = new DefaultTableModel(new Object[]{"CRIMINAL ID","CRIMINAL NAME","DATE OF BIRTH","GENDER","ADDRESS","IMAGE"}, 0);
            criminaltable.setModel(criminalmodel);
           
                try
                {
                    PreparedStatement prepareStatement;
                    ResultSet retrievingcriminaldata;
                    prepareStatement=connection.prepareStatement("select * from criminal_records");
                    retrievingcriminaldata=prepareStatement.executeQuery();
                     while(retrievingcriminaldata.next())
                     {
                        int Criminalid=retrievingcriminaldata.getInt("Criminalid");
                        String CriminalName=retrievingcriminaldata.getString("Criminalname");
                        String Criminaldateofbirth=retrievingcriminaldata.getString("dateofbirth");
                        String Criminalgender=retrievingcriminaldata.getString("gender");
                        String Criminaladdress=retrievingcriminaldata.getString("address");
                        Blob criminalblob=retrievingcriminaldata.getBlob("image");
                        ImageIcon criminalimage = new ImageIcon(criminalblob.getBytes(1, (int) criminalblob.length()));
                        Image scalingImage =criminalimage.getImage(); 
                        Image scaledImage =scalingImage.getScaledInstance(200,200,Image.SCALE_SMOOTH);
                        ImageIcon scaledicon=new ImageIcon(scaledImage);
                        criminalmodel.addRow(new Object[]{Criminalid,CriminalName,Criminaldateofbirth,Criminalgender,Criminaladdress,scaledicon});
                     }
    
                }
                catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                }
                
                criminaltable.setRowHeight(200);

                criminaltable.getColumn("IMAGE").setCellRenderer(new ImageRenderer());
    
            
                scrollPane.setBounds(10,150,970,600);
                criminalframe.add(scrollPane);
        
                
                criminalframe.setSize(1000, 800);
                criminalframe.setLocationRelativeTo(null);
                criminalframe.setVisible(true);
                
            
        }

         //show victim data
         if(e.getSource()==SHOWVICTIMSBUTTON)
         {
             
             dashboardFrame.dispose();
             criminalframe = new JFrame("Victim Data");
             criminalframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             criminalframe.setLayout(null);
             criminalframe.getContentPane().setBackground(Color.BLACK);
             
             criminalrecordtitle.setForeground(Color.WHITE);
             criminalrecordtitle.setBackground(Color.BLACK);
             criminalrecordtitle.setText("VICTIM RECORD");
             criminalrecordtitle.setFont(font2);
             criminalrecordtitle.setBounds(350,40,400,75);
             criminalrecordtitle.setBorder(BorderFactory.createLineBorder(Color.BLACK));
             criminalframe.add(criminalrecordtitle);
 
             backtodashboard.setForeground(lightblue);
             backtodashboard.setBackground(Color.BLACK);
             backtodashboard.setFont(font);
             backtodashboard.setBounds(890,10,75,50);
             backtodashboard.setBorder(BorderFactory.createLineBorder(Color.BLACK));
             backtodashboard.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e)
                 {
                     criminalframe.dispose();
                     dashboard();
                 }
             });

             criminalframe.add(backtodashboard);
             criminaltable.setBackground(DarkBlue);
             criminaltable.setForeground(Color.WHITE);
             DefaultTableModel criminalmodel = new DefaultTableModel(new Object[]{"VICTIM ID","VICTIM NAME","DATE OF BIRTH","GENDER","ADDRESS","IMAGE"}, 0);
             criminaltable.setModel(criminalmodel);
            
                 try
                 {
                     PreparedStatement prepareStatement;
                     ResultSet retrievingcriminaldata;
                     prepareStatement=connection.prepareStatement("select * from victim_records");
                     retrievingcriminaldata=prepareStatement.executeQuery();
                      while(retrievingcriminaldata.next())
                      {
                         int Criminalid=retrievingcriminaldata.getInt("Victimid");
                         String CriminalName=retrievingcriminaldata.getString("Victimname");
                         String Criminaldateofbirth=retrievingcriminaldata.getString("dateofbirth");
                         String Criminalgender=retrievingcriminaldata.getString("gender");
                         String Criminaladdress=retrievingcriminaldata.getString("address");
                         Blob criminalblob=retrievingcriminaldata.getBlob("image");
                         ImageIcon criminalimage = new ImageIcon(criminalblob.getBytes(1, (int) criminalblob.length()));
                         Image scalingImage =criminalimage.getImage(); 
                         Image scaledImage =scalingImage.getScaledInstance(200,200,Image.SCALE_SMOOTH);
                         ImageIcon scaledicon=new ImageIcon(scaledImage);
                         criminalmodel.addRow(new Object[]{Criminalid,CriminalName,Criminaldateofbirth,Criminalgender,Criminaladdress,scaledicon});
                      }
     
                 }
                 catch(SQLException ex)
                 {
                     JOptionPane.showMessageDialog(this,ex.getMessage());
                 }
                 
                 criminaltable.setRowHeight(200);
 
                 criminaltable.getColumn("IMAGE").setCellRenderer(new ImageRenderer());
     
             
                 scrollPane.setBounds(10,150,970,600);
                 criminalframe.add(scrollPane);
         
                 
                 criminalframe.setSize(1000, 800);
                 criminalframe.setLocationRelativeTo(null);
                 criminalframe.setVisible(true);
                 
             
         }

         //show detailsdata
         if(e.getSource()==FIRdetailsButton)
         {
             
             dashboardFrame.dispose();
             criminalframe = new JFrame("FIR Data");
             criminalframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             criminalframe.getContentPane().setBackground(Color.BLACK);
             
             criminalrecordtitle.setForeground(Color.WHITE);
             criminalrecordtitle.setBackground(Color.BLACK);
             criminalrecordtitle.setText("              FIR RECORD");
             criminalrecordtitle.setFont(font2);
             criminalrecordtitle.setBounds(350,40,400,75);
             criminalrecordtitle.setBorder(BorderFactory.createLineBorder(Color.BLACK));
             criminalframe.add(criminalrecordtitle);
 
             backtodashboard.setForeground(lightblue);
             backtodashboard.setBackground(Color.BLACK);
             backtodashboard.setFont(font);
             backtodashboard.setBounds(890,10,75,50);
             backtodashboard.setBorder(BorderFactory.createLineBorder(Color.BLACK));
             backtodashboard.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e)
                 {
                     criminalframe.dispose();
                     dashboard();
                 }
             });
             criminalframe.add(backtodashboard);
             criminaltable.setBackground(DarkBlue);
             criminaltable.setForeground(Color.WHITE);
             DefaultTableModel criminalmodel = new DefaultTableModel(new Object[]{"FIR ID","CRIMINAL ID","VICTIM ID","OFFENSE","CRIMEDATA","CRIMETIME","DESCRIPTION","EVIDENCEIMAGE"}, 0);
             criminaltable.setModel(criminalmodel);
            
                 try
                 {
                     PreparedStatement prepareStatement;
                     ResultSet retrievingcriminaldata;
                     prepareStatement=connection.prepareStatement("select * from fir_records");
                     retrievingcriminaldata=prepareStatement.executeQuery();
                      while(retrievingcriminaldata.next())
                      {
                         int firid=retrievingcriminaldata.getInt("Firid");
                         int Criminalid=retrievingcriminaldata.getInt("Criminalid");
                         int Victimid=retrievingcriminaldata.getInt("Victimid");
                         String CriminalName=retrievingcriminaldata.getString("TypeofOffense");
                         String Criminaldateofbirth=retrievingcriminaldata.getString("crimedate");
                         String Criminalgender=retrievingcriminaldata.getString("crimetime");
                         String Criminaladdress=retrievingcriminaldata.getString("description");
                         Blob criminalblob=retrievingcriminaldata.getBlob("evidenceimage");
                         ImageIcon criminalimage = new ImageIcon(criminalblob.getBytes(1, (int) criminalblob.length()));
                         Image scalingImage =criminalimage.getImage(); 
                         Image scaledImage =scalingImage.getScaledInstance(200,200,Image.SCALE_SMOOTH);
                         ImageIcon scaledicon=new ImageIcon(scaledImage);
                         criminalmodel.addRow(new Object[]{firid,Criminalid,Victimid,CriminalName,Criminaldateofbirth,Criminalgender,Criminaladdress,scaledicon});
                      }
     
                 }
                 catch(SQLException ex)
                 {
                     JOptionPane.showMessageDialog(this,ex.getMessage());
                 }
                 
                 criminaltable.setRowHeight(200);
 
                 criminaltable.getColumn("EVIDENCEIMAGE").setCellRenderer(new ImageRenderer());
     
             
                 scrollPane.setBounds(10,150,970,600);
                 criminalframe.add(scrollPane);
         
                 
                 criminalframe.setSize(1000, 800);
                 criminalframe.setLocationRelativeTo(null);
                 criminalframe.setLayout(null);
                 criminalframe.setVisible(true);        
                 
         }
         if (e.getSource() == UPDATEBUTTON) {
            dashboardFrame.dispose(); 
            JFrame updateFrame = new JFrame("Update Records");
            updateFrame.setSize(600,600);
            updateFrame.getContentPane().setBackground(Color.BLACK);
            updateFrame.setLocationRelativeTo(null);
            loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
            
    
            
            JLabel titleLabel = new JLabel("UPDATING RECORDS");
            titleLabel.setBounds(175, 20, 300, 30);
            titleLabel.setForeground(Color.WHITE);
            updateFrame.add(titleLabel);
            
            JLabel selectLabel = new JLabel("SELECT:");
            selectLabel.setBounds(100, 60, 100, 30);
            selectLabel.setForeground(Color.WHITE);
            updateFrame.add(selectLabel);
            
            JComboBox<String> updateComboBox = new JComboBox<>(new String[]{"CRIMINAL_RECORDS","VICTIM_RECORDS"});
            updateComboBox.setBounds(200, 60, 200, 30);
            updateFrame.add(updateComboBox);
            
            JLabel idLabel = new JLabel("ID:");
            idLabel.setBounds(100, 100, 100, 30);
            idLabel.setForeground(Color.WHITE);
            updateFrame.add(idLabel);
            
            JTextField idTextField = new JTextField();
            idTextField.setBounds(200, 100, 200, 30);
            updateFrame.add(idTextField);
            
            JButton nextButton = new JButton("Next");
            nextButton.setBounds(150, 150, 100, 30);
            updateFrame.add(nextButton);
            
            updateFrame.setSize(500, 300);
            updateFrame.setLayout(null);
            updateFrame.setVisible(true);
            
            nextButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String selectedOption = (String) updateComboBox.getSelectedItem();
                    idReceived = idTextField.getText();
                    
                    if (selectedOption.equals("CRIMINAL_RECORDS")) 
                    {
                        updateFrame.dispose(); // Dispose the update frame
                        updatecriminal(idReceived); // Display criminal records frame
                    }
                     else if (selectedOption.equals("VICTIM_RECORDS")) {
                        updateFrame.dispose(); 
                        updatevictim(idReceived);
                    }
                }
            });
        }

        if(e.getSource()==editbutton)
        {
            
                String criminalNameReceived = crimianlnameTextField.getText();
                String criminalDobReceived = criminaldobTextField.getText();
                String criminalGenderReceived = (String) criminalgenderComboBox.getSelectedItem();
                String criminalAddressReceived = criminaladdressTextField.getText();
                File imageFile =choosingimagepath.getSelectedFile();
            
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(
                        "UPDATE criminal_records SET Criminalname=?, dateofbirth=?, gender=?, address=?, image=? WHERE Criminalid=?"
                    );
                    preparedStatement.setString(1, criminalNameReceived);
                    preparedStatement.setString(2, criminalDobReceived);
                    preparedStatement.setString(3, criminalGenderReceived);
                    preparedStatement.setString(4, criminalAddressReceived);
            
                    if (imageFile != null) {
                        FileInputStream imageFileInputStream = new FileInputStream(imageFile);
                        preparedStatement.setBlob(5, imageFileInputStream);
                    } else {
                        preparedStatement.setNull(5, Types.BLOB);
                    }
            
                    preparedStatement.setInt(6, Integer.parseInt(idReceived)); // Set the ID to update
                    int rowsAffected = preparedStatement.executeUpdate();
            
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Record updated successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "No record found with the given ID.");
                    }
            
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
                    ex.printStackTrace();
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Image file not found: " + ex.getMessage());
                    ex.printStackTrace();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Unexpected error: " + ex.getMessage());
                    ex.printStackTrace();
                }
                FircriminalFRame.dispose();          
                dashboard();
            
            
        }
        if(e.getSource()==editbuttonforvictim)
        {
            
                String criminalNameReceived = crimianlnameTextField.getText();
                String criminalDobReceived = criminaldobTextField.getText();
                String criminalGenderReceived = (String) criminalgenderComboBox.getSelectedItem();
                String criminalAddressReceived = criminaladdressTextField.getText();
                File imageFile =choosingimagepath.getSelectedFile();
            
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(
                        "UPDATE Victim_records SET Victimname=?, dateofbirth=?, gender=?, address=?, image=? WHERE Victimid=?"
                    );
                    preparedStatement.setString(1, criminalNameReceived);
                    preparedStatement.setString(2, criminalDobReceived);
                    preparedStatement.setString(3, criminalGenderReceived);
                    preparedStatement.setString(4, criminalAddressReceived);
            
                    if (imageFile != null) {
                        FileInputStream imageFileInputStream = new FileInputStream(imageFile);
                        preparedStatement.setBlob(5, imageFileInputStream);
                    } else {
                        preparedStatement.setNull(5, Types.BLOB);
                    }
            
                    preparedStatement.setInt(6, Integer.parseInt(idReceived)); // Set the ID to update
                    int rowsAffected = preparedStatement.executeUpdate();
            
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Record updated successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "No record found with the given ID.");
                    }
            
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
                    ex.printStackTrace();
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Image file not found: " + ex.getMessage());
                    ex.printStackTrace();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Unexpected error: " + ex.getMessage());
                    ex.printStackTrace();
                }
                FircriminalFRame.dispose();          
                dashboard();
            
        }
        
 

    }
    
    public static void main(String arg[])
    {
        new CRIME();           
    }

    private ImageIcon getScaledImageIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImg);
    }

    private static class ImageRenderer extends JLabel implements TableCellRenderer {
        public ImageRenderer() 
        {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof ImageIcon) 
            {
                setIcon((ImageIcon) value);
            } 
            else 
            {
                setIcon(null);
            }
            return this;
        }
    }

    
}
