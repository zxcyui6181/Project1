package main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import cafeDAO.CafeDAO;
import cafeVO.CafeMemVO;
import cafejoin.CafeJoin;
import cafepay.PayMain; 

public class Maina extends JFrame {

	private JPanel contentPane;
	private String meun[]  = {"¾Æ¸Þ¸®Ä«³ë", "Ä«Æä¶ó¶¼", "¹Ù´Ò¶ó¶ó¶¼", "Ä«Æä¸ðÄ«", "ÃÊÄÚ¶ó¶¼", "³ìÂ÷¶ó¶¼", "¹ÐÅ©Æ¼","¾ÆÀÌ½ºÆ¼"};
	private int price[] = {4000,4500, 5000,5000,3500,4000,4000,3000};
	private JTextArea textArea = new JTextArea();
	private JComboBox comboBox = new JComboBox();
	private JSpinner spinner = new JSpinner();
	private JComboBox comboBox_4 = new JComboBox();
	private JSpinner spinner_4 = new JSpinner();
	JComboBox comboBox_3_2 = new JComboBox();
	JSpinner spinner_3_2 = new JSpinner();
	JComboBox comboBox_3_3 = new JComboBox();
	JSpinner spinner_3_3 = new JSpinner();
	JComboBox comboBox_3_4 = new JComboBox(); 
	JSpinner spinner_3_4 = new JSpinner(); 
	
	
	CafeDAO cdao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maina frame = new Maina(null);////////////¼öÁ¤
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Maina(CafeMemVO cmvo) {//////////////////////¼öÁ¤
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("\uB2F4\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(meun[0]+"\t"+price[0]+"¿ø"+"\t"+comboBox.getSelectedItem()+"\t"+spinner.getValue()+"ÀÜ"+"\t"+"\n");  
			} 
		}); 
		
		
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ICE", "HOT"}));
		
		JLabel am = new JLabel("\uC544\uBA54\uB9AC\uCE74\uB178");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ICE", "HOT"}));
		
		JLabel latte = new JLabel("\uCE74\uD398\uB77C\uB5BC");
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		
		JButton btnNewButton_1 = new JButton("\uB2F4\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(meun[1]+"\t"+price[1]+"¿ø"+"\t"+comboBox_1.getSelectedItem()+"\t"+spinner_1.getValue()+"ÀÜ"+"\t"+"\n");
			}
		}); 
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"ICE", "HOT"}));
		
		JLabel lblNewLabel_2 = new JLabel("\uBC14\uB2D0\uB77C\uB77C\uB5BC");
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		
		JButton btnNewButton_2 = new JButton("\uB2F4\uAE30");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(meun[2]+"\t"+price[2]+"¿ø"+"\t"+comboBox_2.getSelectedItem()+"\t"+spinner_2.getValue()+"ÀÜ"+"\t"+"\n");
			}
		});
		 
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"ICE", "HOT"}));
		
		JLabel lblNewLabel_3 = new JLabel("\uCE74\uD398\uBAA8\uCE74");
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		
		JButton btnNewButton_3 = new JButton("\uB2F4\uAE30");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(meun[3]+"\t"+price[3]+"¿ø"+"\t"+comboBox_3.getSelectedItem()+"\t"+spinner_3.getValue()+"ÀÜ"+"\t"+"\n");
			}
		});
		
		JButton btnNewButton_3_1 = new JButton("\uB2F4\uAE30");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(meun[4]+"\t"+price[4]+"¿ø"+"\t"+comboBox_4.getSelectedItem()+"\t"+spinner_4.getValue()+"ÀÜ"+"\t"+"\n");
			}
		});
		

		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"ICE", "HOT"}));
		

		spinner_4.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		 
		JLabel lblNewLabel_3_1 = new JLabel("\uCD08\uCF54\uB77C\uB5BC");
		
		JButton btnNewButton_3_2 = new JButton("\uB2F4\uAE30");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(meun[5]+"\t"+price[5]+"¿ø"+"\t"+comboBox_3_2.getSelectedItem()+"\t"+spinner_3_2.getValue()+"ÀÜ"+"\t"+"\n");
			}
		});
		

		comboBox_3_2.setModel(new DefaultComboBoxModel(new String[] {"ICE", "HOT"}));
		
		
		spinner_3_2.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		
		JLabel lblNewLabel_3_2 = new JLabel("\uB179\uCC28\uB77C\uB5BC");
		
		JButton btnNewButton_3_3 = new JButton("\uB2F4\uAE30");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(meun[6]+"\t"+price[6]+"¿ø"+"\t"+comboBox_3_3.getSelectedItem()+"\t"+spinner_3_3.getValue()+"ÀÜ"+"\t"+"\n");
			}
		});
		

		comboBox_3_3.setModel(new DefaultComboBoxModel(new String[] {"ICE", "HOT"}));
		
		 
		
		JLabel lblNewLabel_3_3 = new JLabel("\uBC00\uD06C\uD2F0");
		
		JButton btnNewButton_3_4 = new JButton("\uB2F4\uAE30");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(meun[7]+"\t"+price[7]+"¿ø"+"\t"+comboBox_3_4.getSelectedItem()+"\t"+spinner_3_4.getValue()+"ÀÜ"+"\t"+"\n");
			}
		});
		 

		comboBox_3_4.setModel(new DefaultComboBoxModel(new String[] {"ONLY ICE"}));
		

		spinner_3_4.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		
		JLabel lblNewLabel_3_4 = new JLabel("\uC544\uC774\uC2A4\uD2F0");
		
		JButton btnNewButton_4 = new JButton("\uC8FC\uBB38");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new PayMain().setVisible(true);
			}
		});
		
		
		
		JButton btnNewButton_4_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new CafeJoin().setVisible(true);
				
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(am, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(latte, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(71)
									.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(71)
									.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(71)
									.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(14, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addComponent(comboBox, 0, 115, Short.MAX_VALUE)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
							.addGap(453))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(71)
									.addComponent(spinner_4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)) 
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(71)
									.addComponent(spinner_3_2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBox_3_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_3_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(71)
									.addComponent(spinner_3_3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBox_3_3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_3_3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(71)
									.addComponent(spinner_3_4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBox_3_4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_3_4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
							.addGap(14))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(200)
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(234, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 539, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnNewButton_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(am, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(latte, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnNewButton_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnNewButton_3)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(spinner_3_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(comboBox_3_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(btnNewButton_3_3))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(spinner_3_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(comboBox_3_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(btnNewButton_3_2))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(spinner_3_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(comboBox_3_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(btnNewButton_3_4)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(spinner_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnNewButton_3_1)))
					.addGap(74)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_4_1))
					.addContainerGap())
		); 
		contentPane.setLayout(gl_contentPane);
	}
}
