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

public class gesture1 {

	private JFrame frame;
	private JLabel hello = new JLabel("");
	private JLabel goodbye = new JLabel("");
	private JLabel yes = new JLabel("");
	private JLabel no = new JLabel("");
	private JLabel thanks = new JLabel("");
	private JLabel yourewelcome = new JLabel("");
	private JLabel please = new JLabel("");
	private JLabel sorry = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void gesture1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gesture1 window = new gesture1();
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
	public gesture1() {
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
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 683, 34);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBack = new JLabel("Back");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				learnsection nw= new learnsection();
				nw.learnsection();
			}
		});
		lblBack.setForeground(Color.WHITE);
		lblBack.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblBack.setBounds(611, 11, 46, 14);
		panel.add(lblBack);
		
		JLabel labelimages_1 = new JLabel("");
		labelimages_1.setHorizontalAlignment(SwingConstants.CENTER);
		labelimages_1.setIcon(new ImageIcon(learn.class.getResource("/image/one.png")));
		labelimages_1.setBounds(172, 84, 299, 137);
		frame.getContentPane().add(labelimages_1);
		
		JButton btnNewButton = new JButton("Hello");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelimages_1.setVisible(false);
				hello.setVisible(true);
				goodbye.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				thanks.setVisible(false);
				yourewelcome.setVisible(false);
				please.setVisible(false);
				sorry.setVisible(false);
			}
		});
		btnNewButton.setBounds(62, 252, 123, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnGoodBye = new JButton("Good Bye");
		btnGoodBye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelimages_1.setVisible(false);
				hello.setVisible(false);
				goodbye.setVisible(true);
				yes.setVisible(false);
				no.setVisible(false);
				thanks.setVisible(false);
				yourewelcome.setVisible(false);
				please.setVisible(false);
				sorry.setVisible(false);
			}
		});
		btnGoodBye.setBounds(195, 252, 123, 34);
		frame.getContentPane().add(btnGoodBye);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelimages_1.setVisible(false);
				hello.setVisible(false);
				goodbye.setVisible(false);
				yes.setVisible(true);
				no.setVisible(false);
				thanks.setVisible(false);
				yourewelcome.setVisible(false);
				please.setVisible(false);
				sorry.setVisible(false);
			}
		});
		btnYes.setBounds(328, 252, 123, 34);
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelimages_1.setVisible(false);
				hello.setVisible(false);
				goodbye.setVisible(false);
				yes.setVisible(false);
				no.setVisible(true);
				thanks.setVisible(false);
				yourewelcome.setVisible(false);
				please.setVisible(false);
				sorry.setVisible(false);
			}
		});
		btnNo.setBounds(461, 252, 123, 34);
		frame.getContentPane().add(btnNo);
		
		JButton btnThanks = new JButton("Thanks");
		btnThanks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelimages_1.setVisible(false);
				hello.setVisible(false);
				goodbye.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				thanks.setVisible(true);
				yourewelcome.setVisible(false);
				please.setVisible(false);
				sorry.setVisible(false);
			}
		});
		btnThanks.setBounds(62, 297, 123, 34);
		frame.getContentPane().add(btnThanks);
		
		JButton btnYoureWelcome = new JButton("You're Welcome");
		btnYoureWelcome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelimages_1.setVisible(false);
				hello.setVisible(false);
				goodbye.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				thanks.setVisible(false);
				yourewelcome.setVisible(true);
				please.setVisible(false);
				sorry.setVisible(false);
			}
		});
		btnYoureWelcome.setBounds(195, 297, 121, 34);
		frame.getContentPane().add(btnYoureWelcome);
		
		JButton btnPlease = new JButton("Please");
		btnPlease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelimages_1.setVisible(false);
				hello.setVisible(false);
				goodbye.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				thanks.setVisible(false);
				yourewelcome.setVisible(false);
				please.setVisible(true);
				sorry.setVisible(false);
			}
		});
		btnPlease.setBounds(328, 297, 123, 34);
		frame.getContentPane().add(btnPlease);
		
		JButton btnSorry = new JButton("Sorry");
		btnSorry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelimages_1.setVisible(false);
				hello.setVisible(false);
				goodbye.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				thanks.setVisible(false);
				yourewelcome.setVisible(false);
				please.setVisible(false);
				sorry.setVisible(true);
			}
		});
		btnSorry.setBounds(461, 297, 123, 34);
		frame.getContentPane().add(btnSorry);
		
		hello = new JLabel("");
		hello.setHorizontalAlignment(SwingConstants.CENTER);
		hello.setIcon(new ImageIcon(learn.class.getResource("/image/hello.gif")));
		hello.setBounds(172, 84, 299, 137);
		frame.getContentPane().add(hello);
		hello.setVisible(false);
		
		goodbye = new JLabel("");
		goodbye.setHorizontalAlignment(SwingConstants.CENTER);
		goodbye.setIcon(new ImageIcon(learn.class.getResource("/image/goodbye.gif")));
		goodbye.setBounds(172, 84, 299, 137);
		frame.getContentPane().add(goodbye);
		goodbye.setVisible(false);
		
		yes = new JLabel("");
		yes.setHorizontalAlignment(SwingConstants.CENTER);
		yes.setIcon(new ImageIcon(learn.class.getResource("/image/yes.gif")));
		yes.setBounds(172, 84, 299, 137);
		frame.getContentPane().add(yes);
		yes.setVisible(false);
		
		no = new JLabel("");
		no.setHorizontalAlignment(SwingConstants.CENTER);
		no.setIcon(new ImageIcon(learn.class.getResource("/image/no.gif")));
		no.setBounds(172, 84, 299, 137);
		frame.getContentPane().add(no);
		no.setVisible(false);
		
		thanks = new JLabel("");
		thanks.setHorizontalAlignment(SwingConstants.CENTER);
		thanks.setIcon(new ImageIcon(learn.class.getResource("/image/thanks.gif")));
		thanks.setBounds(172, 84, 299, 137);
		frame.getContentPane().add(thanks);
		thanks.setVisible(false);
		
		yourewelcome = new JLabel("");
		yourewelcome.setHorizontalAlignment(SwingConstants.CENTER);
		yourewelcome.setIcon(new ImageIcon(learn.class.getResource("/image/yourewelcome.gif")));
		yourewelcome.setBounds(172, 84, 299, 137);
		frame.getContentPane().add(yourewelcome);
		yourewelcome.setVisible(false);
		
		please = new JLabel("");
		please.setHorizontalAlignment(SwingConstants.CENTER);
		please.setIcon(new ImageIcon(learn.class.getResource("/image/please.gif")));
		please.setBounds(172, 84, 299, 137);
		frame.getContentPane().add(please);
		please.setVisible(false);
		
		sorry = new JLabel("");
		sorry.setHorizontalAlignment(SwingConstants.CENTER);
		sorry.setIcon(new ImageIcon(learn.class.getResource("/image/sorry.gif")));
		sorry.setBounds(172, 84, 299, 137);
		frame.getContentPane().add(sorry);
		sorry.setVisible(false);
	}

}
