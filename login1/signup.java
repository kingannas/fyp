package login1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import javax.swing.event.ChangeListener;
import javax.swing.JRadioButton;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.Checkbox;

public class signup {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JPanel panel;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void signup() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(316, 67, 303, 29);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(316, 123, 303, 29);
		frame.getContentPane().add(textField_2);
		
		Button button = new Button("Sign Up");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Verdana", Font.PLAIN, 12));
		button.setBackground(new Color(255, 127, 80));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
					JOptionPane.showMessageDialog(frame, "You are successfully sign up");
					
					//OPEN CATEGORY SECTION
					categorysection nw= new categorysection();
					nw.category();
				
		
				}
				
			
		});
		button.setBounds(316, 277, 303, 37);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(316, 50, 81, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblEmail = new JLabel("GENDER");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEmail.setBounds(316, 163, 81, 16);
		frame.getContentPane().add(lblEmail);
		
		lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPassword.setBounds(316, 107, 81, 16);
		frame.getContentPane().add(lblPassword);
		
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 262, 370);
		frame.getContentPane().add(panel);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(signup.class.getResource("/image/cover3.jpg")));
		panel.add(label);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Verdana", Font.PLAIN, 13));
		rdbtnMale.setBounds(316, 186, 109, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Verdana", Font.PLAIN, 13));
		rdbtnFemale.setBounds(441, 186, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JLabel lblDisabilitiesStatus = new JLabel("DISABILITIES STATUS");
		lblDisabilitiesStatus.setFont(new Font("Verdana", Font.BOLD, 12));
		lblDisabilitiesStatus.setBounds(316, 216, 251, 16);
		frame.getContentPane().add(lblDisabilitiesStatus);
		
		Checkbox checkbox = new Checkbox("Deaf");
		checkbox.setFont(new Font("Verdana", Font.PLAIN, 13));
		checkbox.setBounds(316, 238, 95, 22);
		frame.getContentPane().add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Mute");
		checkbox_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		checkbox_1.setBounds(441, 238, 95, 22);
		frame.getContentPane().add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("None");
		checkbox_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		checkbox_2.setBounds(562, 238, 95, 22);
		frame.getContentPane().add(checkbox_2);
	}
}
