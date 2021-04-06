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

public class CPanel extends JPanel {
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
	public CPanel() {
		setBackground(new Color(255, 215, 0));
		setLayout(null);
		
		
		
		// @@@@@@@@@@@@@@@@@@@@ 노치킨너겟
		JButton sn = new JButton("\uB178\uCE58\uD0A8\uB108\uAC9F");
		sn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[20] = 0;
				Main.menu[20] = "노치킨너겟";
				Main.price[20] = 3500;
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
				if(Main.mount[20] > 0){
					Main.mount[20] = Main.mount[20] -1;
					getTextField().setText(Main.mount[20]+"");
					System.out.println(Main.mount[20]);
					sn_minus.setEnabled(true);
				}
				if(Main.mount[20] < 0){
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
				Main.mount[20] = Main.mount[20] + 1;
				getTextField().setText(Main.mount[20]+"");
			}
		});
		sn_plus.setBounds(102, 124, 41, 23);
		add(sn_plus);
		
		
		setTextField(new JTextField());
		getTextField().setText(""+Main.mount[20]);
		getTextField().setBounds(56, 123, 46, 23);
		add(getTextField());
		getTextField().setColumns(10);
		
		
		
		// @@@@@@@@@@@@@@@@@@@@ 어니언 도넛
		JButton chi = new JButton("\uC5B4\uB2C8\uC5B8 \uB3C4\uB11B");
		chi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[21] = 0;
				Main.menu[21] = "어니언 도넛";
				Main.price[21] = 2900;
			}
		});
		chi.setBounds(162, 10, 135, 90);
		add(chi);
		// - 버튼
		JButton chi_minus = new JButton("-");
		chi_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[21] > 0){
					Main.mount[21] = Main.mount[1] -1;
					getTextField1().setText(Main.mount[21]+"");
					System.out.println(Main.mount[21]);
					chi_minus.setEnabled(true);
				}
				if(Main.mount[21] < 0){
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
				Main.mount[21] = Main.mount[21] + 1;
				getTextField1().setText(Main.mount[21]+"");
			}
		});
		chi_plus.setBounds(256, 124, 41, 23);
		add(chi_plus);
		
		Chi_Field = new JTextField();
		Chi_Field.setText(""+Main.mount[21]);
		Chi_Field.setColumns(10);
		Chi_Field.setBounds(208, 124, 46, 23);
		add(Chi_Field);
		
		
		
		// NBB 치킨 너겟
		JButton bul_1 = new JButton("NBB\uCE58\uD0A8\uB108\uAC9F");
		bul_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[22] = 0;
				Main.menu[22] = "NBB 치킨 너겟";
				Main.price[22] = 4900;
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
				if(Main.mount[22] > 0){
					Main.mount[22] = Main.mount[22] -1;
					textField_1.setText(Main.mount[22]+"");
					System.out.println(Main.mount[22]);
					bul_minus_1.setEnabled(true);
				}
				if(Main.mount[22] < 0){
					bul_minus_1.setEnabled(false);
				}
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setText(""+Main.mount[22]);
		textField_1.setColumns(10);
		textField_1.setBounds(343, 123, 46, 23);
		add(textField_1);
		
		JButton bul_plus_1 = new JButton("+");
		bul_plus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.mount[22] = Main.mount[22] + 1;
				textField_1.setText(Main.mount[22]+"");
			}
		});
		bul_plus_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1.setBounds(389, 124, 41, 23);
		add(bul_plus_1);
		
		
		//감자튀김M
		JButton bul_1_1 = new JButton("\uAC10\uC790\uD280\uAE40M");
		bul_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[23] = 0;
				Main.menu[23] = "감자튀김M";
				Main.price[23] = 4000;
			}
		});
		bul_1_1.setBounds(442, 10, 135, 90);
		add(bul_1_1);
		
		JButton bul_plus_1_1 = new JButton("+");
		bul_plus_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[23] = Main.mount[23] + 1;
				textField_2.setText(Main.mount[23]+"");
			}
		});
		bul_plus_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_1.setBounds(529, 124, 41, 23);
		add(bul_plus_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText(""+Main.mount[23]);
		textField_2.setColumns(10);
		textField_2.setBounds(483, 123, 46, 23);
		add(textField_2);
		
		JButton bul_minus_1_1 = new JButton("-");
		bul_minus_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[23] > 0){
					Main.mount[23] = Main.mount[23] -1;
					textField_2.setText(Main.mount[23]+"");
					System.out.println(Main.mount[23]);
					bul_minus_1_1.setEnabled(true);
				}
				if(Main.mount[23] < 0){
					bul_minus_1_1.setEnabled(false);
				}
			}
		});
		bul_minus_1_1.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_1.setBounds(442, 124, 41, 23);
		add(bul_minus_1_1);
		
		
		//감자튀김L
		JButton bul_1_2 = new JButton("\uAC10\uC790\uD280\uAE40L");
		bul_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[25] = 0;
				Main.menu[25] = "감자튀김L";
				Main.price[25] = 3800;
			}
		});
		bul_1_2.setBounds(589, 10, 135, 90);
		add(bul_1_2);
		
		JButton bul_plus_1_2 = new JButton("+");
		bul_plus_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[25] = Main.mount[25] + 1;
				textField_3.setText(Main.mount[25]+"");
			}
		});
		bul_plus_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_2.setBounds(676, 124, 41, 23);
		add(bul_plus_1_2);
		
		textField_3 = new JTextField();
		textField_3.setText(""+Main.mount[25]);
		textField_3.setColumns(10);
		textField_3.setBounds(630, 123, 46, 23);
		add(textField_3);
		
		JButton bul_minus_1_2 = new JButton("-");
		bul_minus_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[25] > 0){
					Main.mount[25] = Main.mount[25] -1;
					textField_3.setText(Main.mount[25]+"");
					System.out.println(Main.mount[25]);
					bul_minus_1_2.setEnabled(true);
				}
				if(Main.mount[25] < 0){
					bul_minus_1_2.setEnabled(false);
				}
			}
		});
		bul_minus_1_2.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_2.setBounds(589, 124, 41, 23);
		add(bul_minus_1_2);
		
		
		//인절미 치즈볼
		JButton bul_1_3 = new JButton("\uC778\uC808\uBBF8\uCE58\uC988\uBCFC");
		bul_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[26] = 0;
				Main.menu[26] = "인절미 치즈볼";
				Main.price[26] = 3700;
			}
		});
		bul_1_3.setBounds(15, 183, 135, 90);
		add(bul_1_3);
		
		JButton bul_plus_1_3 = new JButton("+");
		bul_plus_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[26] = Main.mount[26] + 1;
				textField_4.setText(Main.mount[26]+"");
			}
		});
		bul_plus_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_3.setBounds(102, 297, 41, 23);
		add(bul_plus_1_3);
		
		textField_4 = new JTextField();
		textField_4.setText(""+Main.mount[26]);
		textField_4.setColumns(10);
		textField_4.setBounds(56, 296, 46, 23);
		add(textField_4);
		
		JButton bul_minus_1_3 = new JButton("-");
		bul_minus_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[26] > 0){
					Main.mount[26] = Main.mount[26] -1;
					textField_4.setText(Main.mount[26]+"");
					System.out.println(Main.mount[26]);
					bul_minus_1_3.setEnabled(true);
				}
				if(Main.mount[26] < 0){
					bul_minus_1_3.setEnabled(false);
				}
			}
		});
		bul_minus_1_3.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_3.setBounds(15, 297, 41, 23);
		add(bul_minus_1_3);
		
		
		//치킨시저샐러드
		JButton bul_1_4 = new JButton("\uCE58\uD0A8\uC2DC\uC800\uC0D0\uB7EC\uB4DC");
		bul_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[27] = 0;
				Main.menu[27] = "치킨시저샐러드";
				Main.price[27] = 2900;
			}
		});
		bul_1_4.setBounds(155, 183, 135, 90);
		add(bul_1_4);
		
		JButton bul_plus_1_4 = new JButton("+");
		bul_plus_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[27] = Main.mount[27] + 1;
				textField_5.setText(Main.mount[27]+"");
			}
		});
		bul_plus_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_4.setBounds(242, 297, 41, 23);
		add(bul_plus_1_4);
		
		textField_5 = new JTextField();
		textField_5.setText(""+Main.mount[27]);
		textField_5.setColumns(10);
		textField_5.setBounds(196, 296, 46, 23);
		add(textField_5);
		
		JButton bul_minus_1_4 = new JButton("-");
		bul_minus_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[27] > 0){
					Main.mount[27] = Main.mount[27] -1;
					textField_5.setText(Main.mount[27]+"");
					System.out.println(Main.mount[27]);
					bul_minus_1_4.setEnabled(true);
				}
				if(Main.mount[27] < 0){
					bul_minus_1_4.setEnabled(false);
				}
			}
		});
		bul_minus_1_4.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_4.setBounds(155, 297, 41, 23);
		add(bul_minus_1_4);
		
		
		//그린샐러드
		JButton bul_1_5 = new JButton("\uADF8\uB9B0\uC0D0\uB7EC\uB4DC");
		bul_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[28] = 0;
				Main.menu[28] = "그린샐러드";
				Main.price[28] = 1900;
			}
		});
		bul_1_5.setBounds(295, 183, 135, 90);
		add(bul_1_5);
		
		JButton bul_plus_1_5 = new JButton("+");
		bul_plus_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[28] = Main.mount[28] + 1;
				textField_6.setText(Main.mount[28]+"");
			}
		});
		bul_plus_1_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_5.setBounds(382, 297, 41, 23);
		add(bul_plus_1_5);
		
		textField_6 = new JTextField();
		textField_6.setText(""+Main.mount[28]);
		textField_6.setColumns(10);
		textField_6.setBounds(336, 296, 46, 23);
		add(textField_6);
		
		JButton bul_minus_1_5 = new JButton("-");
		bul_minus_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[28] > 0){
					Main.mount[28] = Main.mount[28] -1;
					textField_6.setText(Main.mount[28]+"");
					System.out.println(Main.mount[28]);
					bul_minus_1_5.setEnabled(true);
				}
				if(Main.mount[28] < 0){
					bul_minus_1_5.setEnabled(false);
				}
			}
		});
		bul_minus_1_5.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_5.setBounds(295, 297, 41, 23);
		add(bul_minus_1_5);
		
		
		//상하이 핑거포크L
		JButton bul_1_6 = new JButton("\uC0C1\uD558\uC774\uD551\uAC70\uD3EC\uD06CL");
		bul_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[24] = 0;
				Main.menu[24] = "상하이 핑거포크L";
				Main.price[24] = 4300;
			}
		});
		bul_1_6.setBounds(442, 183, 135, 90);
		add(bul_1_6);
		
		JButton bul_plus_1_6 = new JButton("+");
		bul_plus_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[24] = Main.mount[24] + 1;
				textField_7.setText(Main.mount[24]+"");
			}
		});
		bul_plus_1_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_6.setBounds(529, 297, 41, 23);
		add(bul_plus_1_6);
		
		textField_7 = new JTextField();
		textField_7.setText(""+Main.mount[24]);
		textField_7.setColumns(10);
		textField_7.setBounds(483, 296, 46, 23);
		add(textField_7);
		
		JButton bul_minus_1_6 = new JButton("-");
		bul_minus_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[24] > 0){
					Main.mount[24] = Main.mount[24] -1;
					textField_7.setText(Main.mount[24]+"");
					System.out.println(Main.mount[24]);
					bul_minus_1_6.setEnabled(true);
				}
				if(Main.mount[24] < 0){
					bul_minus_1_6.setEnabled(false);
				}
			}
		});
		bul_minus_1_6.setFont(new Font("Adobe Song Std L", Font.PLAIN, 14));
		bul_minus_1_6.setBounds(442, 297, 41, 23);
		add(bul_minus_1_6);
		
		
		//상하이 핑거포크S
		JButton bul_1_7 = new JButton("\uC0C1\uD558\uC774 \uD551\uAC70\uD3EC\uD06CS");
		bul_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[29] = 0;
				Main.menu[29] = "상하이 핑거포크S";
				Main.price[29] = 3900;
			}
		});
		bul_1_7.setBounds(582, 183, 135, 90);
		add(bul_1_7);
		
		JButton bul_plus_1_7 = new JButton("+");
		bul_plus_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[29] = Main.mount[29] + 1;
				textField_8.setText(Main.mount[29]+"");
			}
		});
		bul_plus_1_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		bul_plus_1_7.setBounds(669, 297, 41, 23);
		add(bul_plus_1_7);
		
		textField_8 = new JTextField();
		textField_8.setText(""+Main.mount[29]);
		textField_8.setColumns(10);
		textField_8.setBounds(623, 296, 46, 23);
		add(textField_8);
		
		JButton bul_minus_1_7 = new JButton("-");
		bul_minus_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[29] > 0){
					Main.mount[29] = Main.mount[29] -1;
					textField_8.setText(Main.mount[29]+"");
					System.out.println(Main.mount[29]);
					bul_minus_1_7.setEnabled(true);
				}
				if(Main.mount[29] < 0){
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
