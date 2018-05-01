package login1;

import java.awt.EventQueue;
import java.awt.Event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.SystemColor;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLayeredPane;


public class learn extends JFrame{

	
	private JFrame frame;
	private ImageIcon image;
	private JLabel labelimages_1 = new JLabel("");
	private JLabel imageQ = new JLabel("");
	private JLabel imageA = new JLabel("");
	private JLabel imageW = new JLabel("");
	private JLabel imageE = new JLabel("");
	private JLabel imageR = new JLabel("");
	private JLabel imageT = new JLabel("");
	private JLabel imageY = new JLabel("");
	private JLabel imageU = new JLabel("");
	private JLabel imageI = new JLabel("");
	private JLabel imageO = new JLabel("");
	private JLabel imageP = new JLabel("");
	private JLabel imageS = new JLabel("");
	private JLabel imageD = new JLabel("");
	private JLabel imageF = new JLabel("");
	private JLabel imageG = new JLabel("");
	private JLabel imageH = new JLabel("");
	private JLabel imageJ = new JLabel("");
	private JLabel imageK = new JLabel("");
	private JLabel imageL = new JLabel("");
	private JLabel imageZ = new JLabel("");
	private JLabel imageX = new JLabel("");
	private JLabel imageC = new JLabel("");
	private JLabel imageV = new JLabel("");
	private JLabel imageB = new JLabel("");
	private JLabel imageN = new JLabel("");
	private JLabel imageM = new JLabel("");

	
	/**
	 * Launch the application.
	 */
	public static void learn() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					learn window = new learn();
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
	public learn() {
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
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 683, 34);
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
		
		
		         
		JButton btnNewButton = new JButton("Q");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(true);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);
//				
//				if ()
//				{
//					System.out.print("q");
		
				imageQ = new JLabel("");
				imageQ.setHorizontalAlignment(SwingConstants.CENTER);
				imageQ.setIcon(new ImageIcon(learn.class.getResource("/image/q1.jpg")));
				imageQ.setBounds(172, 45, 299, 137);
				frame.getContentPane().add(imageQ);
				imageQ.setVisible(true);
//				}
//				else {
//			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(60, 206, 46, 28);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(true);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);
				
				
			}
		});
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnW.setBounds(116, 206, 46, 28);
		frame.getContentPane().add(btnW);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(true);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);
			}
		});
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnE.setBounds(172, 206, 46, 28);
		frame.getContentPane().add(btnE);
		
		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(true);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);
			}
		});
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnR.setBounds(228, 206, 46, 28);
		frame.getContentPane().add(btnR);
		
		JButton btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(true);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);
			}
		});
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnT.setBounds(284, 206, 46, 28);
		frame.getContentPane().add(btnT);
		
		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(true);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnY.setBounds(340, 206, 46, 28);
		frame.getContentPane().add(btnY);
		
		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(true);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnU.setBounds(396, 206, 46, 28);
		frame.getContentPane().add(btnU);
		
		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(true);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnI.setBounds(452, 206, 46, 28);
		frame.getContentPane().add(btnI);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(true);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnO.setBounds(508, 206, 46, 28);
		frame.getContentPane().add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(true);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnP.setBounds(564, 206, 46, 28);
		frame.getContentPane().add(btnP);
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(true);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			
				}
		});
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnA.setBounds(89, 239, 46, 28);
		frame.getContentPane().add(btnA);
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(true);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnS.setBounds(145, 239, 46, 28);
		frame.getContentPane().add(btnS);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageD.setVisible(true);
				imageS.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnD.setBounds(201, 239, 46, 28);
		frame.getContentPane().add(btnD);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(true);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnF.setBounds(257, 239, 46, 28);
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(true);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnG.setBounds(313, 239, 46, 28);
		frame.getContentPane().add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(true);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnH.setBounds(369, 239, 46, 28);
		frame.getContentPane().add(btnH);
		
		JButton btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(true);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnJ.setBounds(425, 239, 46, 28);
		frame.getContentPane().add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(true);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);}
		});
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnK.setBounds(481, 239, 46, 28);
		frame.getContentPane().add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(true);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnL.setBounds(537, 239, 46, 28);
		frame.getContentPane().add(btnL);
		
		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(true);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnZ.setBounds(116, 274, 46, 28);
		frame.getContentPane().add(btnZ);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(true);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnX.setBounds(172, 274, 46, 28);
		frame.getContentPane().add(btnX);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(true);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnC.setToolTipText("");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnC.setBounds(228, 274, 46, 28);
		frame.getContentPane().add(btnC);
		
		
		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(true);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnV.setBounds(284, 274, 46, 28);
		frame.getContentPane().add(btnV);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(true);
				imageN.setVisible(false);
				imageM.setVisible(false);			}
		});
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnB.setBounds(340, 274, 46, 28);
		frame.getContentPane().add(btnB);
		
		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(true);
				imageM.setVisible(false);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnN.setBounds(396, 274, 46, 28);
		frame.getContentPane().add(btnN);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelimages_1.setVisible(false);
				imageQ.setVisible(false);
				imageW.setVisible(false);
				imageE.setVisible(false);
				imageR.setVisible(false);
				imageT.setVisible(false);
				imageY.setVisible(false);
				imageU.setVisible(false);
				imageI.setVisible(false);
				imageO.setVisible(false);
				imageP.setVisible(false);
				imageA.setVisible(false);
				imageS.setVisible(false);
				imageD.setVisible(false);
				imageF.setVisible(false);
				imageG.setVisible(false);
				imageH.setVisible(false);
				imageJ.setVisible(false);
				imageK.setVisible(false);
				imageL.setVisible(false);
				imageZ.setVisible(false);
				imageX.setVisible(false);
				imageC.setVisible(false);
				imageV.setVisible(false);
				imageB.setVisible(false);
				imageN.setVisible(false);
				imageM.setVisible(true);
			}
		});
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnM.setBounds(452, 274, 46, 28);
		frame.getContentPane().add(btnM);
		
		JButton button = new JButton(".");
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setBounds(508, 274, 46, 28);
		frame.getContentPane().add(button);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 193, 647, 2);
		frame.getContentPane().add(separator);
		
//		labelimages_1 = new JLabel("");
		
		
		labelimages_1.setHorizontalAlignment(SwingConstants.CENTER);
		labelimages_1.setIcon(new ImageIcon(learn.class.getResource("/image/one.png")));
		labelimages_1.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(labelimages_1);
		
		
//		if (btnNewButton.isSelected())
//		{
//		
//		imageQ = new JLabel("");
//		imageQ.setHorizontalAlignment(SwingConstants.CENTER);
//		imageQ.setIcon(new ImageIcon(learn.class.getResource("/image/q1.jpg")));
//		imageQ.setBounds(172, 45, 299, 137);
//		frame.getContentPane().add(imageQ);
//		imageQ.setVisible(true);
//		}
	
//		else if (btnA.isSelected())
//		{
//			System.out.print("a");
//
		imageA = new JLabel("");
		imageA.setHorizontalAlignment(SwingConstants.CENTER);
		imageA.setIcon(new ImageIcon(learn.class.getResource("/image/a.jpg")));
		imageA.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageA);
		imageA.setVisible(false);
		
		imageS = new JLabel("");
		imageS.setHorizontalAlignment(SwingConstants.CENTER);
		imageS.setIcon(new ImageIcon(learn.class.getResource("/image/s.jpg")));
		imageS.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageS);
		imageS.setVisible(false);
	
		
//		}
//		
//		else 
//		{
//			
//		}
		
		imageW = new JLabel("");
		imageW.setHorizontalAlignment(SwingConstants.CENTER);
		imageW.setIcon(new ImageIcon(learn.class.getResource("/image/w.jpg")));
		imageW.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageW);
		imageW.setVisible(false);
		
		imageE = new JLabel("");
		imageE.setHorizontalAlignment(SwingConstants.CENTER);
		imageE.setIcon(new ImageIcon(learn.class.getResource("/image/e.jpg")));
		imageE.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageE);
		imageE.setVisible(false);
		
		imageR = new JLabel("");
		imageR.setHorizontalAlignment(SwingConstants.CENTER);
		imageR.setIcon(new ImageIcon(learn.class.getResource("/image/r.jpg")));
		imageR.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageR);
		imageR.setVisible(false);
		
		imageT = new JLabel("");
		imageT.setHorizontalAlignment(SwingConstants.CENTER);
		imageT.setIcon(new ImageIcon(learn.class.getResource("/image/t.jpg")));
		imageT.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageT);
		imageT.setVisible(false);
		
		imageY = new JLabel("");
		imageY.setHorizontalAlignment(SwingConstants.CENTER);
		imageY.setIcon(new ImageIcon(learn.class.getResource("/image/y.jpg")));
		imageY.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageY);
		imageY.setVisible(false);
		
		imageU = new JLabel("");
		imageU.setHorizontalAlignment(SwingConstants.CENTER);
		imageU.setIcon(new ImageIcon(learn.class.getResource("/image/u.jpg")));
		imageU.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageU);
		imageU.setVisible(false);
		
		imageI = new JLabel("");
		imageI.setHorizontalAlignment(SwingConstants.CENTER);
		imageI.setIcon(new ImageIcon(learn.class.getResource("/image/i.jpg")));
		imageI.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageI);
		imageI.setVisible(false);
		
		imageO = new JLabel("");
		imageO.setHorizontalAlignment(SwingConstants.CENTER);
		imageO.setIcon(new ImageIcon(learn.class.getResource("/image/o.jpg")));
		imageO.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageO);
		imageO.setVisible(false);
		
		imageP = new JLabel("");
		imageP.setHorizontalAlignment(SwingConstants.CENTER);
		imageP.setIcon(new ImageIcon(learn.class.getResource("/image/p.jpg")));
		imageP.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageP);
		imageP.setVisible(false);
		
		imageS = new JLabel("");
		imageS.setHorizontalAlignment(SwingConstants.CENTER);
		imageS.setIcon(new ImageIcon(learn.class.getResource("/image/s.jpg")));
		imageS.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageS);
		imageS.setVisible(false);
		
		imageD = new JLabel("");
		imageD.setHorizontalAlignment(SwingConstants.CENTER);
		imageD.setIcon(new ImageIcon(learn.class.getResource("/image/d.jpg")));
		imageD.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageD);
		imageD.setVisible(false);
		
		imageF = new JLabel("");
		imageF.setHorizontalAlignment(SwingConstants.CENTER);
		imageF.setIcon(new ImageIcon(learn.class.getResource("/image/f.jpg")));
		imageF.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageF);
		imageF.setVisible(false);
		
		imageG = new JLabel("");
		imageG.setHorizontalAlignment(SwingConstants.CENTER);
		imageG.setIcon(new ImageIcon(learn.class.getResource("/image/g.jpg")));
		imageG.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageG);
		imageG.setVisible(false);
		
		imageH = new JLabel("");
		imageH.setHorizontalAlignment(SwingConstants.CENTER);
		imageH.setIcon(new ImageIcon(learn.class.getResource("/image/h.jpg")));
		imageH.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageH);
		imageH.setVisible(false);
		
		imageJ = new JLabel("");
		imageJ.setHorizontalAlignment(SwingConstants.CENTER);
		imageJ.setIcon(new ImageIcon(learn.class.getResource("/image/j.jpg")));
		imageJ.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageJ);
		imageJ.setVisible(false);
		
		imageK = new JLabel("");
		imageK.setHorizontalAlignment(SwingConstants.CENTER);
		imageK.setIcon(new ImageIcon(learn.class.getResource("/image/k.jpg")));
		imageK.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageK);
		imageK.setVisible(false);
		
		imageL = new JLabel("");
		imageL.setHorizontalAlignment(SwingConstants.CENTER);
		imageL.setIcon(new ImageIcon(learn.class.getResource("/image/l.jpg")));
		imageL.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageL);
		imageL.setVisible(false);
		
		imageZ = new JLabel("");
		imageZ.setHorizontalAlignment(SwingConstants.CENTER);
		imageZ.setIcon(new ImageIcon(learn.class.getResource("/image/z.jpg")));
		imageZ.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageZ);
		imageZ.setVisible(false);
		
		imageX = new JLabel("");
		imageX.setHorizontalAlignment(SwingConstants.CENTER);
		imageX.setIcon(new ImageIcon(learn.class.getResource("/image/x.jpg")));
		imageX.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageX);
		imageX.setVisible(false);
		
		imageC = new JLabel("");
		imageC.setHorizontalAlignment(SwingConstants.CENTER);
		imageC.setIcon(new ImageIcon(learn.class.getResource("/image/c.jpg")));
		imageC.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageC);
		imageC.setVisible(false);
		
		imageV = new JLabel("");
		imageV.setHorizontalAlignment(SwingConstants.CENTER);
		imageV.setIcon(new ImageIcon(learn.class.getResource("/image/v.jpg")));
		imageV.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageV);
		imageV.setVisible(false);
		
		imageB = new JLabel("");
		imageB.setHorizontalAlignment(SwingConstants.CENTER);
		imageB.setIcon(new ImageIcon(learn.class.getResource("/image/b.jpg")));
		imageB.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageB);
		imageB.setVisible(false);
		
		imageN = new JLabel("");
		imageN.setHorizontalAlignment(SwingConstants.CENTER);
		imageN.setIcon(new ImageIcon(learn.class.getResource("/image/n.jpg")));
		imageN.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageN);
		imageN.setVisible(false);
		
		imageM = new JLabel("");
		imageM.setHorizontalAlignment(SwingConstants.CENTER);
		imageM.setIcon(new ImageIcon(learn.class.getResource("/image/m.jpg")));
		imageM.setBounds(172, 45, 299, 137);
		frame.getContentPane().add(imageM);
		imageM.setVisible(false);
	}
}
