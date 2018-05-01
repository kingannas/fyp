package login1;

import javax.swing.*;
import java.awt.*;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Window;

import javax.swing.Box;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;

import java.awt.Button;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	public void paint(Graphics g)
	{
		g.drawLine(0, 480, 200, 480);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					login window = new login();
					window.setUndecorated(true);
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
		
	}
	private void setBackgroundColor(Color white) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//center frame
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/image/one.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 615, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		frame.setSize(width/2,height/2);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setVisible(true);
		

		//logo
		JPanel Login1 = new JPanel();
		Login1.setBounds(47, -25, 599, 370);
		frame.getContentPane().add(Login1);
		Login1.setLayout(null);
		
		
		//label sign language recognition
		JLabel label_1 = new JLabel("Sign Language \r\nRecognition");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("Ebrima", Font.BOLD, 14));
		label_1.setBounds(292, 63, 212, 18);
		Login1.add(label_1);
		
		//label username
		JLabel label_2 = new JLabel("USERNAME");
		label_2.setFont(new Font("Verdana", Font.BOLD, 11));
		label_2.setBounds(249, 103, 74, 14);
		Login1.add(label_2);
		
		//username field
		textField = new JTextField();
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(249, 117, 303, 26);
		Login1.add(textField);
		
		//label password
		JLabel label_3 = new JLabel("PASSWORD");
		label_3.setFont(new Font("Verdana", Font.BOLD, 11));
		label_3.setBounds(249, 154, 93, 14);
		Login1.add(label_3);
		
		//password field
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(249, 167, 303, 26);
		Login1.add(passwordField);
		
		//checkbox
		JCheckBox checkBox = new JCheckBox("Remember me");
		checkBox.setFont(new Font("Verdana", Font.PLAIN, 10));
		checkBox.setBounds(249, 203, 134, 23);
		Login1.add(checkBox);
		
		//button sign in
		Button button = new Button("Sign in");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Verdana", Font.PLAIN, 14));
		button.setBackground(new Color(255, 127, 80));
		button.setBounds(246, 232, 306, 37);
		Login1.add(button);
		
		//button create new account
		Button button_1 = new Button("Create a new account");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Vivaldi", Font.PLAIN, 14));
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(246, 275, 306, 37);
		Login1.add(button_1);
		
		//sign in to category
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname=textField.getText();
				String pass=passwordField.getText();
				
				if (uname.equals("name")&& pass.equals("123"))
				{
					JOptionPane.showMessageDialog(frame, "You are successfully login");
					
					//OPEN CATEGORY SECTION
					categorysection nw= new categorysection();
					nw.category();
				
		
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Invalid username and password");
				}
			}
		});
		
		//login to sign up
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signup nw= new signup();
				nw.signup();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 119, 196, 171);
		Login1.add(panel);
		
		JLabel label = new JLabel("\r\n");
		label.setIcon(new ImageIcon(login.class.getResource("/image/one.png")));
		panel.add(label);
		
		JLabel lblExit = new JLabel("[X] EXIT");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblExit.setForeground(new Color(255, 127, 80));
		lblExit.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblExit.setBounds(525, 40, 74, 26);
		Login1.add(lblExit);

	}

	private void setUndecorated(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
		

