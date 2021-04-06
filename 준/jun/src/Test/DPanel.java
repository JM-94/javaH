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

public class DPanel extends JPanel {
	int count = 0;
	String menu;
	int price;
	private JTextField Bul_Field;
	private JTextField Chi_Field;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	public DPanel() {
		setBackground(new Color(255, 215, 0));
		setLayout(null);
		
		
		
		// @@@@@@@@@@@@@@@@@@@@ 펩시콜라M
		JButton sn = new JButton("\uD3A9\uC2DC\uCF5C\uB77CM");
		sn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[30] = 0;
				Main.menu[30] = "펩시콜라M";
				Main.price[30] = 1500;
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
				if(Main.mount[30] > 0){
					Main.mount[30] = Main.mount[30] -1;
					getTextField().setText(Main.mount[30]+"");
					System.out.println(Main.mount[30]);
					sn_minus.setEnabled(true);
				}
				if(Main.mount[30] < 0){
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
				Main.mount[30] = Main.mount[30] + 1;
				getTextField().setText(Main.mount[30]+"");
			}
		});
		sn_plus.setBounds(102, 124, 41, 23);
		add(sn_plus);
		
		
		setTextField(new JTextField());
		getTextField().setText(""+Main.mount[30]);
		getTextField().setBounds(56, 123, 46, 23);
		add(getTextField());
		getTextField().setColumns(10);
		
		
		
		// @@@@@@@@@@@@@@@@@@@@ 사이다M
		JButton chi = new JButton("\uC0AC\uC774\uB2E4M");
		chi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[31] = 0;
				Main.menu[31] = "사이다M";
				Main.price[31] = 1500;
			}
		});
		chi.setBounds(162, 10, 135, 90);
		add(chi);
		// - 버튼
		JButton chi_minus = new JButton("-");
		chi_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[31] > 0){
					Main.mount[31] = Main.mount[31] -1;
					getTextField1().setText(Main.mount[31]+"");
					System.out.println(Main.mount[31]);
					chi_minus.setEnabled(true);
				}
				if(Main.mount[31] < 0){
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
				Main.mount[31] = Main.mount[31] + 1;
				getTextField1().setText(Main.mount[31]+"");
			}
		});
		chi_plus.setBounds(256, 124, 41, 23);
		add(chi_plus);
		
		Chi_Field = new JTextField();
		Chi_Field.setText(""+Main.mount[31]);
		Chi_Field.setColumns(10);
		Chi_Field.setBounds(208, 124, 46, 23);
		add(Chi_Field);
		
		
		
		// 미린다(오렌지)M
		JButton bul_1 = new JButton("\uBBF8\uB9B0\uB2E4(\uC624\uB80C\uC9C0)M");
		bul_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[32] = 0;
				Main.menu[32] = "미린다(오렌지)M";
				Main.price[32] = 1500;
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
				if(Main.mount[32] > 0){
					Main.mount[32] = Main.mount[32] -1;
					textField_1.setText(Main.mount[32]+"");
					System.out.println(Main.mount[32]);
					bul_minus_1.setEnabled(true);
				}
				if(Main.mount[32] < 0){
					bul_minus_1.setEnabled(false);
				}
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setText(""+Main.mount[32]);
		textField_1.setColumns(10);
		textField_1.setBounds(343, 123, 46, 23);
		add(textField_1);
		
		JButton bul_plus_1 = new JButton("+");
		bul_plus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.mount[32] = Main.mount[32] + 1;
				textField_1.setText(Main.mount[32]+"");
			}
		});
		bul_plus_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1.setBounds(389, 124, 41, 23);
		add(bul_plus_1);
		
		
		//펩시맥스(0)M
		JButton bul_1_1 = new JButton("\uD3A9\uC2DC\uB9E5\uC2A4(0)M");
		bul_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[33] = 0;
				Main.menu[33] = "펩시맥스(0)M";
				Main.price[33] = 1500;
			}
		});
		bul_1_1.setBounds(442, 10, 135, 90);
		add(bul_1_1);
		
		JButton bul_plus_1_1 = new JButton("+");
		bul_plus_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[33] = Main.mount[33] + 1;
				textField_2.setText(Main.mount[33]+"");
			}
		});
		bul_plus_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_1.setBounds(529, 124, 41, 23);
		add(bul_plus_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText(""+Main.mount[33]);
		textField_2.setColumns(10);
		textField_2.setBounds(483, 123, 46, 23);
		add(textField_2);
		
		JButton bul_minus_1_1 = new JButton("-");
		bul_minus_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[33] > 0){
					Main.mount[33] = Main.mount[33] -1;
					textField_2.setText(Main.mount[33]+"");
					System.out.println(Main.mount[33]);
					bul_minus_1_1.setEnabled(true);
				}
				if(Main.mount[33] < 0){
					bul_minus_1_1.setEnabled(false);
				}
			}
		});
		bul_minus_1_1.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_1.setBounds(442, 124, 41, 23);
		add(bul_minus_1_1);
		
		
		//오렌지주스M
		JButton bul_1_2 = new JButton("\uC624\uB80C\uC9C0\uC8FC\uC2A4M");
		bul_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[34] = 0;
				Main.menu[34] = "오렌지주스M";
				Main.price[34] = 3000;
			}
		});
		bul_1_2.setBounds(591, 10, 135, 90);
		add(bul_1_2);
		
		JButton bul_plus_1_2 = new JButton("+");
		bul_plus_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[34] = Main.mount[34] + 1;
				textField_3.setText(Main.mount[34]+"");
			}
		});
		bul_plus_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_2.setBounds(678, 124, 41, 23);
		add(bul_plus_1_2);
		
		textField_3 = new JTextField();
		textField_3.setText(""+Main.mount[34]);
		textField_3.setColumns(10);
		textField_3.setBounds(632, 123, 46, 23);
		add(textField_3);
		
		JButton bul_minus_1_2 = new JButton("-");
		bul_minus_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[34] > 0){
					Main.mount[34] = Main.mount[34] -1;
					textField_3.setText(Main.mount[34]+"");
					System.out.println(Main.mount[34]);
					bul_minus_1_2.setEnabled(true);
				}
				if(Main.mount[34] < 0){
					bul_minus_1_2.setEnabled(false);
				}
			}
		});
		bul_minus_1_2.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_2.setBounds(591, 124, 41, 23);
		add(bul_minus_1_2);
		
		
		//아메리카노Hot
		JButton bul_1_3 = new JButton("\uC544\uBA54\uB9AC\uCE74\uB178Hot");
		bul_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[35] = 0;
				Main.menu[35] = "아메리카노Hot";
				Main.price[35] = 2000;
			}
		});
		bul_1_3.setBounds(15, 183, 135, 90);
		add(bul_1_3);
		
		JButton bul_plus_1_3 = new JButton("+");
		bul_plus_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[35] = Main.mount[35] + 1;
				textField_4.setText(Main.mount[35]+"");
			}
		});
		bul_plus_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_3.setBounds(102, 297, 41, 23);
		add(bul_plus_1_3);
		
		textField_4 = new JTextField();
		textField_4.setText(""+Main.mount[35]);
		textField_4.setColumns(10);
		textField_4.setBounds(56, 296, 46, 23);
		add(textField_4);
		
		JButton bul_minus_1_3 = new JButton("-");
		bul_minus_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[35] > 0){
					Main.mount[35] = Main.mount[35] -1;
					textField_4.setText(Main.mount[35]+"");
					System.out.println(Main.mount[35]);
					bul_minus_1_3.setEnabled(true);
				}
				if(Main.mount[35] < 0){
					bul_minus_1_3.setEnabled(false);
				}
			}
		});
		bul_minus_1_3.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_3.setBounds(15, 297, 41, 23);
		add(bul_minus_1_3);
		
		
		//아메리카노Iced
		JButton bul_1_6 = new JButton("\uC544\uBA54\uB9AC\uCE74\uB178Iced");
		bul_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[36] = 0;
				Main.menu[36] = "아메리카노Iced";
				Main.price[36] = 2000;
			}
		});
		bul_1_6.setBounds(162, 183, 135, 90);
		add(bul_1_6);
		
		JButton bul_plus_1_6 = new JButton("+");
		bul_plus_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[36] = Main.mount[36] + 1;
				textField_7.setText(Main.mount[36]+"");
			}
		});
		bul_plus_1_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_6.setBounds(249, 297, 41, 23);
		add(bul_plus_1_6);
		
		textField_7 = new JTextField();
		textField_7.setText(""+Main.mount[36]);
		textField_7.setColumns(10);
		textField_7.setBounds(203, 296, 46, 23);
		add(textField_7);
		
		JButton bul_minus_1_6 = new JButton("-");
		bul_minus_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[36] > 0){
					Main.mount[36] = Main.mount[36] -1;
					textField_7.setText(Main.mount[36]+"");
					System.out.println(Main.mount[36]);
					bul_minus_1_6.setEnabled(true);
				}
				if(Main.mount[36] < 0){
					bul_minus_1_6.setEnabled(false);
				}
			}
		});
		bul_minus_1_6.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_6.setBounds(162, 297, 41, 23);
		add(bul_minus_1_6);
		
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
