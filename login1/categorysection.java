package login1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class categorysection {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void category() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					categorysection window = new categorysection();
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
	public categorysection() {
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
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 683, 32);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBack = new JLabel("Back");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				login nw= new login();
				//nw.login();
			}
		});
		lblBack.setForeground(Color.WHITE);
		lblBack.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblBack.setBounds(611, 11, 46, 14);
		panel.add(lblBack);
		
		JButton btnNewButton = new JButton("Sign Languange \r\nRecognition");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testgui nw= new testgui();
				nw.testgui();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(81, 278, 224, 42);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		//to learn slr
		JButton btnLearnSignLanguage = new JButton("Learn Sign Language");
		btnLearnSignLanguage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				learnsection nw= new learnsection();
				nw.learnsection();
			}
		});
		btnLearnSignLanguage.setForeground(Color.WHITE);
		btnLearnSignLanguage.setBackground(Color.GRAY);
		btnLearnSignLanguage.setBounds(369, 278, 224, 42);
		frame.getContentPane().add(btnLearnSignLanguage);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(categorysection.class.getResource("/image/cover.jpeg")));
		label_1.setBounds(0, 31, 683, 220);
		frame.getContentPane().add(label_1);
	}
	}


