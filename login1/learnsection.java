package login1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class learnsection {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void learnsection() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					learnsection window = new learnsection();
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
	public learnsection() {
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
				categorysection nw= new categorysection();
				nw.category();
			}
		});
		lblBack.setForeground(Color.WHITE);
		lblBack.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblBack.setBounds(611, 11, 46, 14);
		panel.add(lblBack);
		
		
		
		JButton btnNewButton = new JButton("Basic Sign \r\nLanguage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				learn nw= new learn();
				nw.learn();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(81, 278, 224, 42);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		//to learn gesture
		JButton btnLearnSignLanguage = new JButton("Additional Gesture");
		btnLearnSignLanguage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gesture1 nw= new gesture1();
				nw.gesture1();
			}
		});
		btnLearnSignLanguage.setForeground(Color.WHITE);
		btnLearnSignLanguage.setBackground(Color.GRAY);
		btnLearnSignLanguage.setBounds(369, 278, 224, 42);
		frame.getContentPane().add(btnLearnSignLanguage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 31, 683, 214);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLearnSection = new JLabel("LEARN SECTION");
		lblLearnSection.setFont(new Font("Kristen ITC", Font.PLAIN, 21));
		lblLearnSection.setForeground(Color.WHITE);
		lblLearnSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblLearnSection.setBounds(224, 72, 238, 75);
		panel_1.add(lblLearnSection);
	}
}
