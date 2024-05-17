import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener  {
    private static final int FRAME_WIDTH = 900;
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JTextField nameTextField;
    private JTextField mobileTextField;
    private JRadioButton male, female;
    private ButtonGroup gender;
    private JComboBox dateCombo, monthCombo,yearCombo;
    private JTextArea resultsText;
    private JCheckBox checkBox;
    private JButton rest;
    private JButton submit;
    private JTextArea respond;
    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    public MyFrame(){

        setTitle("Registration form");
        setResizable(false);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Set tittle
        getContentPane().setLayout(null);
        JLabel titleLabel = new JLabel("Registration Form: ");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        titleLabel.setSize(200,30);
        titleLabel.setLocation(450, 20);
        add(titleLabel);

        //Name
        getContentPane().setLayout(null);
        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLabel.setSize(200,30);
        nameLabel.setLocation(30, 60);
        add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        nameTextField.setSize(250, 30);
        nameTextField.setLocation(150, 60);
        add(nameTextField);

        //Mobile
        getContentPane().setLayout(null);
        JLabel mobileLabel = new JLabel("Mobile: ");
        mobileLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        mobileLabel.setSize(200,30);
        mobileLabel.setLocation(30, 100);
        add(mobileLabel);

        mobileTextField = new JTextField();
        mobileTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        mobileTextField.setSize(200, 30);
        mobileTextField.setLocation(150, 100);
        add(mobileTextField);

        //Gender
        getContentPane().setLayout(null);
        JLabel sexLabel = new JLabel("Gender: ");
        sexLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        sexLabel.setSize(200,30);
        sexLabel.setLocation(30, 140);
        add(sexLabel);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(150, 140);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(75, 20);
        female.setLocation(250, 140);
        add(female);

        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        //Date of Birth
        getContentPane().setLayout(null);
        JLabel dobLabel = new JLabel("DOB: ");
        dobLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        dobLabel.setSize(200,30);
        dobLabel.setLocation(30, 180);
        add(dobLabel);

        dateCombo = new JComboBox(dates);
        dateCombo.setSize(50, 30);
        dateCombo.setLocation(150, 180);
        add(dateCombo);

        monthCombo = new JComboBox(months);
        monthCombo.setSize(100, 30);
        monthCombo.setLocation(200, 180);
        add(monthCombo);

        yearCombo = new JComboBox(years);
        yearCombo.setSize(80, 30);
        yearCombo.setLocation(300, 180);
        add(yearCombo);

        //Address - Text Area
        getContentPane().setLayout(null);
        JLabel areaLabel = new JLabel("Address: ");
        areaLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        areaLabel.setSize(300,30);
        areaLabel.setLocation(30, 220);
        add(areaLabel);

        resultsText = new JTextArea();
        resultsText.setFont(new Font("Arial", Font.PLAIN, 15));
        resultsText.setSize(300, 100);
        resultsText.setLocation(150, 220);
        resultsText.setLineWrap(true);
        add(resultsText);

        //CheckBox
        checkBox = new JCheckBox("Accept Terms & Conditions");
        checkBox.setFont(new Font("Arial", Font.PLAIN, 15));
        checkBox.setSize(300, 30);
        checkBox.setLocation(30, 340);
        add(checkBox);

        //Submit button
        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(100,30);
        submit.setLocation(50,380);
        submit.addActionListener(this);
        add(submit);

        //Display the data
        respond = new JTextArea();
        respond.setFont(new Font("Arial", Font.PLAIN, 15));
        respond.setSize(300, 400);
        respond.setLocation(500, 60);
        respond.setEditable(false);
        add(respond);

        //Reset button
        rest = new JButton("Reset");
        rest.setFont(new Font("Arial", Font.PLAIN, 15));
        rest.setSize(100,30);
        rest.setLocation(160,380);
        rest.addActionListener(this);
        add(rest);

    }

    public void actionPerformed(ActionEvent event) {

        if(event.getSource() == submit){
            if (checkBox.isSelected()){             //checking the term & condition status

                String name = nameTextField.getText();
                System.out.println(name);

                String contact = mobileTextField.getText();
                System.out.println(contact);

                String DOB = (String)dateCombo.getSelectedItem() + "/" +  (String)monthCombo.getSelectedItem() + "/" + (String)yearCombo.getSelectedItem();
                System.out.println(DOB);

                String address = resultsText.getText();
                System.out.println(address);

                JOptionPane.showMessageDialog(null, "Registration Successful");

                //format of the responded data
                respond.setText(
                        "Name: " + name + "\n" +
                        "Contact: " + contact + "\n" +
                        "Sex: " + (male.isSelected() ? "male" : "female") + "\n" +
                        "Date of Birth: " + DOB + "\n" +
                        "Address: " + address + "\n"
                );

                //Reset the form automatically using empty string
                String clear = "";
                nameTextField.setText(clear);
                mobileTextField.setText(clear);
                resultsText.setText(clear);
                checkBox.setSelected(false);
                dateCombo.setSelectedIndex(0);
                monthCombo.setSelectedIndex(0);
                yearCombo.setSelectedIndex(0);

            }else{

                JOptionPane.showMessageDialog(null, "You need to agree with the terms & conditions");
            }
        }

        //Rest the form using rest button
        if (event.getSource() == rest){
            String clear = "";
            nameTextField.setText(clear);
            mobileTextField.setText(clear);
            resultsText.setText(clear);
            checkBox.setSelected(false);
            dateCombo.setSelectedIndex(0);
            monthCombo.setSelectedIndex(0);
            yearCombo.setSelectedIndex(0);
            respond.setText(clear);
        }

    }
}
