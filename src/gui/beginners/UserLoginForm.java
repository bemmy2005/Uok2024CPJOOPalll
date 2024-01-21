package gui.beginners;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UserLoginForm implements ActionListener{
	//All  required fields
	JFrame frame;
	//Labels
	JLabel userLabel=new JLabel("Username");
	JLabel passwordLabel=new JLabel("Password");
	//Fields
	JTextField userTextField=new JTextField("put username");
	JPasswordField passwordField=new JPasswordField("*******");
	//Buttons
	JButton loginButton=new JButton("Login");
	JButton resetButton=new JButton("Reset");
	JButton regButton=new JButton("Register");
	JButton redButton=new JButton("Display");
	JButton updButton=new JButton("Update");
	JButton delButton=new JButton("Delete");
	JTable table=new JTable();
	 JScrollPane scrollPane = new JScrollPane(table);
     //add(scrollPane, BorderLayout.CENTER);
	//Check box
	JCheckBox showPassword=new JCheckBox("Show Password");
	//constructor
	public UserLoginForm() {
		createWindow();
		setLocationsAndSize();
		addcompontentstoFrame();
		addActionEvent();
	}
	private void addActionEvent() {
		loginButton.addActionListener(this);
		resetButton.addActionListener(this);
		showPassword.addActionListener(this);
		regButton.addActionListener(this);
		redButton.addActionListener(this);
		updButton.addActionListener(this);
		delButton.addActionListener(this);
		
	}
	private void addcompontentstoFrame() {
		//userLabel;	passwordLabel; 	userTextField; 		passwordField;
				//showPassword; 		loginButton; 		resetButton;
		frame.add(userLabel);	
		frame.add(passwordLabel); 	
		frame.add(userTextField); 		
		frame.add(passwordField);
		frame.add(showPassword); 		
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(regButton);
		frame.add(redButton);
		frame.add(updButton);
		frame.add(delButton);
		frame.add(table);
		table.add(scrollPane, BorderLayout.CENTER);
	}
	private void setLocationsAndSize() {
		//userLabel.setBounds(50, 150, 100, 30);
		userLabel.setBounds(20, 20, 100, 30);
		//passwordLabel.setBounds(50,220,100,30);;
		passwordLabel.setBounds(20,70,100,30);
		
		
		//userTextField.setBounds(150,150,150,30);;
		userTextField.setBounds(120,20,150,30);
		//passwordField.setBounds(150,220,150,30);
		passwordField.setBounds(120,70,150,30);
		//showPassword.setBounds(150,250,150,30);;
		showPassword.setBounds(120,120,150,30);;
		/*loginButton.setBounds(50,300,100,30);;
		regButton.setBounds(50,350,100,30);
		redButton.setBounds(200, 350,100,30);
		updButton.setBounds(50,400,100,30);
		delButton.setBounds(200, 400,100,30);
		resetButton.setBounds(200, 300,100,30);
		*/
		loginButton.setBounds(20,170,100,30);
		resetButton.setBounds(150, 170,100,30);
		
		regButton.setBounds(20,220,100,30);
		redButton.setBounds(150, 220,100,30);
		
		updButton.setBounds(20,270,100,30);
		delButton.setBounds(150, 270,100,30);
		table.setBounds(10, 320, 345, 220);
		
		
	}
	private void createWindow() {
		frame=new JFrame();
		frame.setTitle("Login Form");
		frame.setBounds(10,10,380,600);
		frame.getContentPane().setBackground(Color.gray);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		User myuser=new User(null, null);
		if(e.getSource()==loginButton) {
			
			myuser.setUsername(userTextField.getText());
			myuser.setPassword(passwordField.getText());
			myuser.login(myuser.getUsername(), myuser.getPassword());
		}
		if(e.getSource()==resetButton) {
			userTextField.setText("");
			passwordField.setText("");
		}
		if(e.getSource()==regButton) {
			myuser.setUsername(userTextField.getText());
			myuser.setPassword(passwordField.getText());
			myuser.registertwo();
			DefaultTableModel tableModel=myuser.populateTable();
			table.setModel(tableModel);
		}if(e.getSource()==redButton) {
			//myuser.displaytwo();
			DefaultTableModel tableModel=myuser.populateTable();
			table.setModel(tableModel);
		}
		if(e.getSource()==delButton) {
			String userInput = JOptionPane.showInputDialog(null, "Enter id:");
			myuser.deletedata(Integer.parseInt(userInput));
		}
		if(e.getSource()==updButton) {
			String userInput = JOptionPane.showInputDialog(null, "Enter id:");
			myuser.setUsername(userTextField.getText());
			myuser.setPassword(passwordField.getText());
			myuser.updatedata(Integer.parseInt(userInput));
			//myuser.updatedata(Integer.parseInt(userInput),userTextField.getText(),passwordField.getText());
		}
		if(e.getSource()==showPassword) {
			if(showPassword.isSelected()) {
				passwordField.setEchoChar((char)0);
			}else {
				passwordField.setEchoChar('*');
			}
		}

	}

public static void main(String[] args) {
	UserLoginForm lgnfm=new UserLoginForm();
}
}
