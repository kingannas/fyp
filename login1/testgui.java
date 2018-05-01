package login1;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;


public class testgui extends JFrame {

	JFrame frame;
	JLabel lblNewLabel = new JLabel("...");
	static JButton btnNewButton = new JButton("SLR");
	static JTextField txtTest = new JTextField();
	static JTextField txtSave = new JTextField();
	private JTextField txtWord;
//	private JTextField txtSave;
	/**
	 * Launch the application.
	 */
	public static void testgui() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testgui window = new testgui();
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
	public testgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		frame.setSize(width/2,height/2);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 45, 673, 328);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		lblNewLabel.setBounds(281, 39, 161, 55);
//		lblNewLabel.setVisible(false);
		panel.add(lblNewLabel);
		
//		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("button pressed");
			}
		});
		btnNewButton.setBounds(311, 262, 89, 23);
		panel.add(btnNewButton);
		txtTest.setEditable(false);
		txtTest.setBackground(SystemColor.control);
		txtTest.setHorizontalAlignment(SwingConstants.CENTER);
		txtTest.setText("test");
		txtTest.setBounds(239, 206, 230, 45);
		panel.add(txtTest);
		txtTest.setColumns(10);
		
		txtSave = new JTextField();
		txtSave.setEditable(false);
		txtSave.setHorizontalAlignment(SwingConstants.CENTER);
		txtSave.setText("word");
		txtSave.setBackground(SystemColor.control);
		txtSave.setBounds(236, 141, 233, 54);
		panel.add(txtSave);
		txtSave.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(0, 0, 683, 34);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBack = new JLabel("Back");
		lblBack.setBounds(631, 11, 31, 17);
		panel_1.add(lblBack);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				categorysection nw= new categorysection();
				//nw.login();
			}
		});
		lblBack.setForeground(Color.WHITE);
		lblBack.setFont(new Font("Verdana", Font.PLAIN, 13));
	}
}
