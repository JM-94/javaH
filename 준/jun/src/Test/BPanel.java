package Test;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class BPanel extends JPanel {
	int count = 0;
	String menu;
	int price;
	private JTextField Bul_Field;
	private JTextField Chi_Field;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	public BPanel() {
		setBackground(new Color(255, 215, 0));
		setLayout(null);
		
		
		
		// @@@@@@@@@@@@@@@@@@@@ NBB시그니처
		JButton sn = new JButton("NBB\uC2DC\uADF8\uB2C8\uCC98");
		sn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[10] = 0;
				Main.menu[10] = "NBB시그니처";
				Main.price[10] = 3500;
			}
		});
		sn.setBounds(15, 10, 135, 90);
		add(sn);
		setSize(900, 380);
		//- 버튼
		JButton sn_minus = new JButton("-");
		sn_minus.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		sn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[10] > 0){
					Main.mount[10] = Main.mount[10] -1;
					getTextField().setText(Main.mount[10]+"");
					System.out.println(Main.mount[10]);
					sn_minus.setEnabled(true);
				}
				if(Main.mount[10] < 0){
					sn_minus.setEnabled(false);
				}
			}
		});
		sn_minus.setBounds(15, 124, 41, 23);
		add(sn_minus);
		// + 버튼
		JButton sn_plus = new JButton("+");
		sn_plus.setFont(new Font("Dialog", Font.PLAIN, 12));
		sn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[10] = Main.mount[10] + 1;
				getTextField().setText(Main.mount[10]+"");
			}
		});
		sn_plus.setBounds(102, 124, 41, 23);
		add(sn_plus);
		
		
		setTextField(new JTextField());
		getTextField().setText(""+Main.mount[10]);
		getTextField().setBounds(56, 123, 46, 23);
		add(getTextField());
		getTextField().setColumns(10);
		
		
		
		// @@@@@@@@@@@@@@@@@@@@ NBB오리지날
		JButton chi = new JButton("NBB\uC624\uB9AC\uC9C0\uB110");
		chi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[11] = 0;
				Main.menu[11] = "NBB오리지날";
				Main.price[11] = 2900;
			}
		});
		chi.setBounds(162, 10, 135, 90);
		add(chi);
		// - 버튼
		JButton chi_minus = new JButton("-");
		chi_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[11] > 0){
					Main.mount[11] = Main.mount[11] -1;
					getTextField1().setText(Main.mount[11]+"");
					System.out.println(Main.mount[11]);
					chi_minus.setEnabled(true);
				}
				if(Main.mount[11] < 0){
					chi_minus.setEnabled(false);
				}
			
			}
		});
		chi_minus.setBounds(162, 124, 41, 23);
		add(chi_minus);
		// +버튼
		JButton chi_plus = new JButton("+");
		chi_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[11] = Main.mount[11] + 1;
				getTextField1().setText(Main.mount[11]+"");
			}
		});
		chi_plus.setBounds(256, 124, 41, 23);
		add(chi_plus);
		
		Chi_Field = new JTextField();
		Chi_Field.setText(""+Main.mount[11]);
		Chi_Field.setColumns(10);
		Chi_Field.setBounds(208, 124, 46, 23);
		add(Chi_Field);
		
		
		
		// nbb어메이징
		JButton bul_1 = new JButton("NBB\uC5B4\uBA54\uC774\uC9D5");
		bul_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[12] = 0;
				Main.menu[12] = "NBB어메이징";
				Main.price[12] = 4900;
			}
		});
		bul_1.setBounds(302, 10, 135, 90);
		add(bul_1);
		
		JButton bul_minus_1 = new JButton("-");
		bul_minus_1.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1.setBounds(302, 124, 41, 23);
		add(bul_minus_1);
		bul_minus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[12] > 0){
					Main.mount[12] = Main.mount[12] -1;
					textField_1.setText(Main.mount[12]+"");
					System.out.println(Main.mount[12]);
					bul_minus_1.setEnabled(true);
				}
				if(Main.mount[12] < 0){
					bul_minus_1.setEnabled(false);
				}
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setText(""+Main.mount[12]);
		textField_1.setColumns(10);
		textField_1.setBounds(343, 123, 46, 23);
		add(textField_1);
		
		JButton bul_plus_1 = new JButton("+");
		bul_plus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.mount[12] = Main.mount[12] + 1;
				textField_1.setText(Main.mount[12]+"");
			}
		});
		bul_plus_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1.setBounds(389, 124, 41, 23);
		add(bul_plus_1);
		
		
		//미트마니아
		JButton bul_1_1 = new JButton("\uBBF8\uD2B8\uB9C8\uB2C8\uC544");
		bul_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[13] = 0;
				Main.menu[13] = "미트마니아";
				Main.price[13] = 4000;
			}
		});
		bul_1_1.setBounds(442, 10, 135, 90);
		add(bul_1_1);
		
		JButton bul_plus_1_1 = new JButton("+");
		bul_plus_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[13] = Main.mount[13] + 1;
				textField_2.setText(Main.mount[13]+"");
			}
		});
		bul_plus_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_1.setBounds(529, 124, 41, 23);
		add(bul_plus_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText(""+Main.mount[13]);
		textField_2.setColumns(10);
		textField_2.setBounds(483, 123, 46, 23);
		add(textField_2);
		
		JButton bul_minus_1_1 = new JButton("-");
		bul_minus_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[13] > 0){
					Main.mount[13] = Main.mount[13] -1;
					textField_2.setText(Main.mount[13]+"");
					System.out.println(Main.mount[13]);
					bul_minus_1_1.setEnabled(true);
				}
				if(Main.mount[13] < 0){
					bul_minus_1_1.setEnabled(false);
				}
			}
		});
		bul_minus_1_1.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_1.setBounds(442, 124, 41, 23);
		add(bul_minus_1_1);
		
		
		//산체스
		JButton bul_1_2 = new JButton("\uC0B0\uCCB4\uC2A4");
		bul_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[15] = 0;
				Main.menu[15] = "산체스";
				Main.price[15] = 3800;
			}
		});
		bul_1_2.setBounds(15, 183, 135, 90);
		add(bul_1_2);
		
		JButton bul_plus_1_2 = new JButton("+");
		bul_plus_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[15] = Main.mount[15] + 1;
				textField_3.setText(Main.mount[15]+"");
			}
		});
		bul_plus_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_2.setBounds(102, 297, 41, 23);
		add(bul_plus_1_2);
		
		textField_3 = new JTextField();
		textField_3.setText(""+Main.mount[15]);
		textField_3.setColumns(10);
		textField_3.setBounds(56, 296, 46, 23);
		add(textField_3);
		
		JButton bul_minus_1_2 = new JButton("-");
		bul_minus_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[15] > 0){
					Main.mount[15] = Main.mount[15] -1;
					textField_3.setText(Main.mount[15]+"");
					System.out.println(Main.mount[15]);
					bul_minus_1_2.setEnabled(true);
				}
				if(Main.mount[15] < 0){
					bul_minus_1_2.setEnabled(false);
				}
			}
		});
		bul_minus_1_2.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_2.setBounds(15, 297, 41, 23);
		add(bul_minus_1_2);
		
		
		//스모키살사
		JButton bul_1_3 = new JButton("\uC2A4\uBAA8\uD0A4\uC0B4\uC0AC");
		bul_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[16] = 0;
				Main.menu[16] = "스모키살사";
				Main.price[16] = 3700;
			}
		});
		bul_1_3.setBounds(162, 183, 135, 90);
		add(bul_1_3);
		
		JButton bul_plus_1_3 = new JButton("+");
		bul_plus_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[16] = Main.mount[16] + 1;
				textField_4.setText(Main.mount[16]+"");
			}
		});
		bul_plus_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_3.setBounds(249, 297, 41, 23);
		add(bul_plus_1_3);
		
		textField_4 = new JTextField();
		textField_4.setText(""+Main.mount[16]);
		textField_4.setColumns(10);
		textField_4.setBounds(203, 296, 46, 23);
		add(textField_4);
		
		JButton bul_minus_1_3 = new JButton("-");
		bul_minus_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[16] > 0){
					Main.mount[16] = Main.mount[16] -1;
					textField_4.setText(Main.mount[16]+"");
					System.out.println(Main.mount[16]);
					bul_minus_1_3.setEnabled(true);
				}
				if(Main.mount[16] < 0){
					bul_minus_1_3.setEnabled(false);
				}
			}
		});
		bul_minus_1_3.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_3.setBounds(162, 297, 41, 23);
		add(bul_minus_1_3);
		
		
		//데리마요
		JButton bul_1_4 = new JButton("\uB370\uB9AC\uB9C8\uC694");
		bul_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[17] = 0;
				Main.menu[17] = "데리마요";
				Main.price[17] = 2900;
			}
		});
		bul_1_4.setBounds(302, 183, 135, 90);
		add(bul_1_4);
		
		JButton bul_plus_1_4 = new JButton("+");
		bul_plus_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[17] = Main.mount[17] + 1;
				textField_5.setText(Main.mount[17]+"");
			}
		});
		bul_plus_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_4.setBounds(389, 297, 41, 23);
		add(bul_plus_1_4);
		
		textField_5 = new JTextField();
		textField_5.setText(""+Main.mount[17]);
		textField_5.setColumns(10);
		textField_5.setBounds(343, 296, 46, 23);
		add(textField_5);
		
		JButton bul_minus_1_4 = new JButton("-");
		bul_minus_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[17] > 0){
					Main.mount[17] = Main.mount[17] -1;
					textField_5.setText(Main.mount[17]+"");
					System.out.println(Main.mount[17]);
					bul_minus_1_4.setEnabled(true);
				}
				if(Main.mount[17] < 0){
					bul_minus_1_4.setEnabled(false);
				}
			}
		});
		bul_minus_1_4.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_4.setBounds(302, 297, 41, 23);
		add(bul_minus_1_4);
		
		
		//그릴드불고기
		JButton bul_1_5 = new JButton("\uADF8\uB9B4\uB4DC\uBD88\uACE0\uAE30");
		bul_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[18] = 0;
				Main.menu[18] = "그릴드불고기";
				Main.price[18] = 1900;
			}
		});
		bul_1_5.setBounds(442, 183, 135, 90);
		add(bul_1_5);
		
		JButton bul_plus_1_5 = new JButton("+");
		bul_plus_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[18] = Main.mount[18] + 1;
				textField_6.setText(Main.mount[18]+"");
			}
		});
		bul_plus_1_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_5.setBounds(529, 297, 41, 23);
		add(bul_plus_1_5);
		
		textField_6 = new JTextField();
		textField_6.setText(""+Main.mount[18]);
		textField_6.setColumns(10);
		textField_6.setBounds(483, 296, 46, 23);
		add(textField_6);
		
		JButton bul_minus_1_5 = new JButton("-");
		bul_minus_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[18] > 0){
					Main.mount[18] = Main.mount[18] -1;
					textField_6.setText(Main.mount[18]+"");
					System.out.println(Main.mount[18]);
					bul_minus_1_5.setEnabled(true);
				}
				if(Main.mount[18] < 0){
					bul_minus_1_5.setEnabled(false);
				}
			}
		});
		bul_minus_1_5.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_5.setBounds(442, 297, 41, 23);
		add(bul_minus_1_5);
		
		
		//메가바이트
		JButton bul_1_6 = new JButton("\uBA54\uAC00\uBC14\uC774\uD2B8");
		bul_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[14] = 0;
				Main.menu[14] = "메가바이트";
				Main.price[14] = 4300;
			}
		});
		bul_1_6.setBounds(582, 10, 135, 90);
		add(bul_1_6);
		
		JButton bul_plus_1_6 = new JButton("+");
		bul_plus_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[14] = Main.mount[14] + 1;
				textField_7.setText(Main.mount[14]+"");
			}
		});
		bul_plus_1_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_6.setBounds(669, 124, 41, 23);
		add(bul_plus_1_6);
		
		textField_7 = new JTextField();
		textField_7.setText(""+Main.mount[14]);
		textField_7.setColumns(10);
		textField_7.setBounds(623, 123, 46, 23);
		add(textField_7);
		
		JButton bul_minus_1_6 = new JButton("-");
		bul_minus_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[14] > 0){
					Main.mount[14] = Main.mount[14] -1;
					textField_7.setText(Main.mount[14]+"");
					System.out.println(Main.mount[14]);
					bul_minus_1_6.setEnabled(true);
				}
				if(Main.mount[14] < 0){
					bul_minus_1_6.setEnabled(false);
				}
			}
		});
		bul_minus_1_6.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_6.setBounds(582, 124, 41, 23);
		add(bul_minus_1_6);
		
		
		//코울슬로치킨
		JButton bul_1_7 = new JButton("\uCF54\uC6B8\uC2AC\uB85C\uCE58\uD0A8");
		bul_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[19] = 0;
				Main.menu[19] = "코울슬로치킨";
				Main.price[19] = 3900;
			}
		});
		bul_1_7.setBounds(582, 183, 135, 90);
		add(bul_1_7);
		
		JButton bul_plus_1_7 = new JButton("+");
		bul_plus_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[19] = Main.mount[19] + 1;
				textField_8.setText(Main.mount[19]+"");
			}
		});
		bul_plus_1_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_7.setBounds(669, 297, 41, 23);
		add(bul_plus_1_7);
		
		textField_8 = new JTextField();
		textField_8.setText(""+Main.mount[19]);
		textField_8.setColumns(10);
		textField_8.setBounds(623, 296, 46, 23);
		add(textField_8);
		
		JButton bul_minus_1_7 = new JButton("-");
		bul_minus_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[19] > 0){
					Main.mount[19] = Main.mount[19] -1;
					textField_8.setText(Main.mount[19]+"");
					System.out.println(Main.mount[19]);
					bul_minus_1_7.setEnabled(true);
				}
				if(Main.mount[19] < 0){
					bul_minus_1_7.setEnabled(false);
				}
			}
		});
		bul_minus_1_7.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_7.setBounds(582, 297, 41, 23);
		add(bul_minus_1_7);
		
	}
	//@@@@@ 불고기 버거
		public JTextField getTextField() {
			return Bul_Field;
		}
		public void setTextField(JTextField textField) {
			this.Bul_Field = textField;
		}
		//@@@@@ 치킨버거 chi_
		public JTextField getTextField1() {
			return Chi_Field;
		}
		public void setTextField2(JTextField txtddffgg) {
			this.Chi_Field = txtddffgg;
		}
//	해야할듯
//	//@@@@@ NBB어메이징
//	public JTextField textField_1() {
//		return amazing;
//	}
//	public void textField_1(JTextField textamazing) {
//		this.amazing = textamazing;
//	}
//	
//	
//	//@@@@@ 미트마니아
//	public JTextField textField_1() {
//		return textField_1;
//	}
//	public void textField_1(JTextField txtddffgg) {
//		this.textField_1 = txtddffgg;
//	}
//	//@@@@@ 메가바이트
//	public JTextField getTextField1() {
//		return Chi_Field;
//	}
//	public void setTextField2(JTextField txtddffgg) {
//		this.Chi_Field = txtddffgg;
//	}
//	//@@@@@ 산체스
//	public JTextField getTextField1() {
//		return Chi_Field;
//	}
//	public void setTextField2(JTextField txtddffgg) {
//		this.Chi_Field = txtddffgg;
//	}
//	//@@@@@ 스모키살사
//	public JTextField getTextField1() {
//		return Chi_Field;
//	}
//	public void setTextField2(JTextField txtddffgg) {
//		this.Chi_Field = txtddffgg;
//	}
//	//@@@@@ 데리마요
//	public JTextField getTextField1() {
//		return Chi_Field;
//	}
//	public void setTextField2(JTextField txtddffgg) {
//		this.Chi_Field = txtddffgg;
//	}
//	//@@@@@ 그릴드불고기
//	public JTextField getTextField1() {
//		return Chi_Field;
//	}
//	public void setTextField2(JTextField txtddffgg) {
//		this.Chi_Field = txtddffgg;
//	}
//	//@@@@@ 코울슬로치킨
//	public JTextField getTextField1() {
//		return Chi_Field;
//	}
//	public void setTextField2(JTextField txtddffgg) {
//		this.Chi_Field = txtddffgg;
//	}
//		
}
