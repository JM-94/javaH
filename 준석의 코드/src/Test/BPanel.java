package Test;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class BPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JButton plus;
	private JButton plus2;
	private JButton plus3;
	private JButton plus4;
	private JButton plus5;
	private JButton plus6;
	private JButton plus7;
	private JButton plus8;
	private JButton plus9;
	private JButton plus10;
	private JButton min;
	private JButton min2;
	private JButton min3;
	private JButton min4;
	private JButton min5;
	private JButton min6;
	private JButton min7;
	private JButton min8;
	private JButton min9;
	private JButton min10;
	private JLabel lblN;
	private JLabel lblNbb;
	private JLabel lblNbb_1;
	private JLabel lblN_1;
	private JLabel lblN_2;
	private JLabel lblN_4;
	private JLabel lblN_4_1;
	private JLabel lblN_4_2;
	private JLabel lblN_4_3;
	private JLabel lblN_4_4;

	public BPanel() {
		setBackground(Color.ORANGE);
		setLayout(null);

		JButton menu1 = new JButton("New button");
		menu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				plus.setEnabled(true);
				min.setEnabled(true);
				textField.setText(""+Main.mount[10]);
			}
		});
		menu1.setBounds(40, 60, 100, 100);
		add(menu1);
		
		JButton menu2 = new JButton("New button");
		menu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus2.setEnabled(true);
				min2.setEnabled(true);
				textField_1.setText(""+Main.mount[11]);
			}
		});
		menu2.setBounds(180, 60, 100, 100);
		add(menu2);
		
		JButton menu3 = new JButton("New button");
		menu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus3.setEnabled(true);
				min3.setEnabled(true);
				textField_2.setText(""+Main.mount[12]);
			}
		});
		menu3.setBounds(320, 60, 100, 100);
		add(menu3);
		
		JButton menu4 = new JButton("New button");
		menu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus4.setEnabled(true);
				min4.setEnabled(true);
				textField_3.setText(""+Main.mount[13]);
			}
		});
		menu4.setBounds(460, 60, 100, 100);
		add(menu4);
		
		JButton menu5 = new JButton("New button");
		menu5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus5.setEnabled(true);
				min5.setEnabled(true);
				textField_4.setText(""+Main.mount[14]);
			}
		});
		menu5.setBounds(600, 60, 100, 100);
		add(menu5);
		
		JButton menu6 = new JButton("New button");
		menu6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus6.setEnabled(true);
				min6.setEnabled(true);
				textField_5.setText(""+Main.mount[15]);
			}
		});
		menu6.setBounds(40, 220, 100, 100);
		add(menu6);
		
		JButton menu7 = new JButton("New button");
		menu7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus7.setEnabled(true);
				min7.setEnabled(true);
				textField_6.setText(""+Main.mount[16]);
			}
		});
		menu7.setBounds(180, 220, 100, 100);
		add(menu7);
		
		JButton menu8 = new JButton("New button");
		menu8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus8.setEnabled(true);
				min8.setEnabled(true);
				textField_7.setText(""+Main.mount[17]);
			}
		});
		menu8.setBounds(320, 220, 100, 100);
		add(menu8);
		
		JButton menu9 = new JButton("New button");
		menu9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus9.setEnabled(true);
				min9.setEnabled(true);
				textField_8.setText(""+Main.mount[18]);
			}
		});
		menu9.setBounds(460, 220, 100, 100);
		add(menu9);
		
		JButton menu10 = new JButton("New button");
		menu10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus10.setEnabled(true);
				min10.setEnabled(true);
				textField_9.setText(""+Main.mount[19]);
			}
		});
		menu10.setBounds(600, 220, 100, 100);
		add(menu10);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(65, 160, 50, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(205, 160, 50, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(345, 160, 50, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(485, 160, 50, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(625, 160, 50, 20);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(65, 320, 50, 20);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(205, 320, 50, 20);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(345, 320, 50, 20);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(485, 320, 50, 20);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(625, 320, 50, 20);
		add(textField_9);
		
		
		
		/// @@@@@@@@@@@@@@@@@ ��,������
		
		
		
		plus = new JButton("+\r\n");
		plus.setHorizontalAlignment(SwingConstants.RIGHT);
		plus.setFont(new Font("����", Font.PLAIN, 10));
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[10] = Main.mount[10] + 1;
				textField.setText(""+Main.mount[10]);
			}
		});
		plus.setBounds(40, 160, 25, 20);
		add(plus);
		plus.setEnabled(false);
		
		plus2 = new JButton("+");
		plus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[11] = Main.mount[11] + 1;
				textField_1.setText(""+Main.mount[11]);
			}
		});
		plus2.setBounds(180, 160, 25, 20);
		add(plus2);
		plus2.setEnabled(false);
		
		plus3 = new JButton("+");
		plus3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[12] = Main.mount[12] + 1;
				textField_2.setText(""+Main.mount[12]);
			}
		});
		plus3.setBounds(320, 160, 25, 20);
		add(plus3);
		plus3.setEnabled(false);
		
		plus4 = new JButton("+");
		plus4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[13] = Main.mount[13] + 1;
				textField_3.setText(""+Main.mount[13]);
			}
		});
		plus4.setBounds(460, 160, 25, 20);
		add(plus4);
		plus4.setEnabled(false);
		
		plus5 = new JButton("+");
		plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[14] = Main.mount[14] + 1;
				textField_4.setText(""+Main.mount[14]);
			}
		});
		plus5.setBounds(600, 160, 25, 20);
		add(plus5);
		plus5.setEnabled(false);
		
		plus6 = new JButton("+");
		plus6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[15] = Main.mount[15] + 1;
				textField_5.setText(""+Main.mount[15]);
			}
		});
		plus6.setBounds(40, 320, 25, 20);
		add(plus6);
		plus6.setEnabled(false);
		
		plus7 = new JButton("+");
		plus7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[16] = Main.mount[16] + 1;
				textField_6.setText(""+Main.mount[16]);
			}
		});
		plus7.setBounds(180, 320, 25, 20);
		add(plus7);
		plus7.setEnabled(false);
		
		plus8 = new JButton("+");
		plus8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[17] = Main.mount[17] + 1;
				textField_7.setText(""+Main.mount[17]);
			}
		});
		plus8.setBounds(320, 320, 25, 20);
		add(plus8);
		plus8.setEnabled(false);
		
		plus9 = new JButton("+");
		plus9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[18] = Main.mount[18] + 1;
				textField_8.setText(""+Main.mount[18]);
			}
		});
		plus9.setBounds(460, 320, 25, 20);
		add(plus9);
		plus9.setEnabled(false);
		
		plus10 = new JButton("New button");
		plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[19] = Main.mount[19] + 1;
				textField_9.setText(""+Main.mount[19]);
			}
		});
		plus10.setBounds(600, 320, 25, 20);
		add(plus10);
		plus10.setEnabled(false);
		
		
		// @@@@@@@@@@@@@@@@ �������
		
		
		
		min = new JButton("-");
		min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[10] > 0){
					Main.mount[10] = Main.mount[10] -1;
					textField.setText(""+Main.mount[10]);
					min.setEnabled(true);
				}
				if(Main.mount[10] < 0){
					min.setEnabled(false);
				}
			}
		});
		min.setBounds(115, 160, 25, 20);
		add(min);
		min.setEnabled(false);
		
		min2 = new JButton("-");
		min2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[11] > 0){
					Main.mount[11] = Main.mount[11] -1;
					textField_1.setText(""+Main.mount[11]);
					min.setEnabled(true);
				}
				if(Main.mount[11] < 0){
					min.setEnabled(false);
				}
			}
		});
		min2.setBounds(255, 160, 25, 20);
		add(min2);
		min2.setEnabled(false);
		
		min3 = new JButton("-");
		min3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[12] > 0){
					Main.mount[12] = Main.mount[12] -1;
					textField_2.setText(""+Main.mount[12]);
					min.setEnabled(true);
				}
				if(Main.mount[12] < 0){
					min.setEnabled(false);
				}
			}
		});
		min3.setBounds(395, 160, 25, 20);
		add(min3);
		min3.setEnabled(false);
		
		min4 = new JButton("-");
		min4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[13] > 0){
					Main.mount[13] = Main.mount[13] -1;
					textField_3.setText(""+Main.mount[13]);
					min.setEnabled(true);
				}
				if(Main.mount[13] < 0){
					min.setEnabled(false);
				}
			}
		});
		min4.setEnabled(false);
		min4.setBounds(535, 159, 25, 20);
		add(min4);
		
		min5 = new JButton("-");
		min5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[14] > 0){
					Main.mount[14] = Main.mount[14] -1;
					textField_4.setText(""+Main.mount[14]);
					min.setEnabled(true);
				}
				if(Main.mount[14] < 0){
					min.setEnabled(false);
				}
			}
		});
		min5.setBounds(675, 160, 25, 20);
		add(min5);
		min5.setEnabled(false);
		
		min6 = new JButton("-");
		min6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[15] > 0){
					Main.mount[15] = Main.mount[15] -1;
					textField_5.setText(""+Main.mount[15]);
					min.setEnabled(true);
				}
				if(Main.mount[15] < 0){
					min.setEnabled(false);
				}
			}
		});
		min6.setBounds(115, 320, 25, 20);
		add(min6);
		min6.setEnabled(false);
		
		min7 = new JButton("-");
		min7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[16] > 0){
					Main.mount[16] = Main.mount[16] -1;
					textField_6.setText(""+Main.mount[16]);
					min.setEnabled(true);
				}
				if(Main.mount[16] < 0){
					min.setEnabled(false);
				}
			}
		});
		min7.setBounds(255, 320, 25, 20);
		add(min7);
		min7.setEnabled(false);
		
		min8 = new JButton("-");
		min8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[17] > 0){
					Main.mount[17] = Main.mount[17] -1;
					textField_7.setText(""+Main.mount[17]);
					min.setEnabled(true);
				}
				if(Main.mount[17] < 0){
					min.setEnabled(false);
				}
			}
		});
		min8.setBounds(395, 320, 25, 20);
		add(min8);
		min8.setEnabled(false);
		
		min9 = new JButton("-");
		min9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[18] > 0){
					Main.mount[18] = Main.mount[18] -1;
					textField_8.setText(""+Main.mount[18]);
					min.setEnabled(true);
				}
				if(Main.mount[18] < 0){
					min.setEnabled(false);
				}
			}
		});
		min9.setBounds(535, 320, 25, 20);
		add(min9);
		min9.setEnabled(false);
		
		min10 = new JButton("-");
		min10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[19] > 0){
					Main.mount[19] = Main.mount[19] -1;
					textField_9.setText(""+Main.mount[19]);
					min.setEnabled(true);
				}
				if(Main.mount[19] < 0){
					min.setEnabled(false);
				}
			}
		});
		min10.setBounds(675, 320, 25, 20);
		add(min10);
		min10.setEnabled(false);
		
		lblN = new JLabel("    NBB\uC2DC\uADF8\uB2C8\uCC98");
		lblN.setFont(new Font("����", Font.PLAIN, 11));
		lblN.setBounds(40, 185, 100, 15);
		add(lblN);
		
		lblNbb = new JLabel("    NBB\uC624\uB9AC\uC9C0\uB110");
		lblNbb.setFont(new Font("����", Font.PLAIN, 11));
		lblNbb.setBounds(180, 185, 100, 15);
		add(lblNbb);
		
		lblNbb_1 = new JLabel("    NBB\uC5B4\uBA54\uC774\uC9D5");
		lblNbb_1.setFont(new Font("����", Font.PLAIN, 11));
		lblNbb_1.setBounds(320, 185, 100, 15);
		add(lblNbb_1);
		
		lblN_1 = new JLabel("      \uBBF8\uD2B8\uB9C8\uB2C8\uC544");
		lblN_1.setFont(new Font("����", Font.PLAIN, 11));
		lblN_1.setBounds(460, 185, 100, 15);
		add(lblN_1);
		
		lblN_2 = new JLabel("      \uBA54\uAC00\uBC14\uC774\uD2B8");
		lblN_2.setFont(new Font("����", Font.PLAIN, 11));
		lblN_2.setBounds(600, 185, 100, 15);
		add(lblN_2);
		
		lblN_4 = new JLabel("        \uC0B0\uCCB4\uC2A4");
		lblN_4.setFont(new Font("����", Font.PLAIN, 11));
		lblN_4.setBounds(40, 340, 100, 15);
		add(lblN_4);
		
		lblN_4_1 = new JLabel("     \uC2A4\uBAA8\uD0A4\uC0B4\uC0AC");
		lblN_4_1.setFont(new Font("����", Font.PLAIN, 11));
		lblN_4_1.setBounds(180, 340, 100, 15);
		add(lblN_4_1);
		
		lblN_4_2 = new JLabel("       \uB370\uB9AC\uB9C8\uC694");
		lblN_4_2.setFont(new Font("����", Font.PLAIN, 11));
		lblN_4_2.setBounds(320, 340, 100, 15);
		add(lblN_4_2);
		
		lblN_4_3 = new JLabel("    \uADF8\uB9B4\uB4DC\uBD88\uACE0\uAE30");
		lblN_4_3.setFont(new Font("����", Font.PLAIN, 11));
		lblN_4_3.setBounds(460, 340, 100, 15);
		add(lblN_4_3);
		
		lblN_4_4 = new JLabel("       \uCF54\uC6B8\uC2AC\uB85C");
		lblN_4_4.setFont(new Font("����", Font.PLAIN, 11));
		lblN_4_4.setBounds(600, 340, 100, 15);
		add(lblN_4_4);
		
	}
	public void Clear(){
		for(int i = 10; i < 20; i++){
			Main.mount[i] = 0;
		}
		textField.setText(""+Main.mount[10]);
		textField_1.setText(""+Main.mount[11]);
		textField_2.setText(""+Main.mount[12]);
		textField_3.setText(""+Main.mount[13]);
		textField_4.setText(""+Main.mount[14]);
		textField_5.setText(""+Main.mount[15]);
		textField_6.setText(""+Main.mount[16]);
		textField_7.setText(""+Main.mount[17]);
		textField_8.setText(""+Main.mount[18]);
		textField_9.setText(""+Main.mount[19]);
		
		plus.setEnabled(false);
		plus2.setEnabled(false);
		plus3.setEnabled(false);
		plus4.setEnabled(false);
		plus5.setEnabled(false);
		plus6.setEnabled(false);
		plus7.setEnabled(false);
		plus8.setEnabled(false);
		plus9.setEnabled(false);
		plus10.setEnabled(false);
		
		min.setEnabled(false);
		min2.setEnabled(false);
		min3.setEnabled(false);
		min4.setEnabled(false);
		min5.setEnabled(false);
		min6.setEnabled(false);
		min7.setEnabled(false);
		min8.setEnabled(false);
		min9.setEnabled(false);
		min10.setEnabled(false);
	}

}
