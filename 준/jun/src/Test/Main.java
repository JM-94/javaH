package Test;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
//class Mypanel extends JPanel{
//	public String name;
//
//	public Mypanel() {
//		this.name = name;
//	}
//}
public class Main extends JFrame{
	static int[] price = new int[100];
	static int[] mount = new int [100];
	static String[] menu = new String[100];
	Order_save os= new Order_save();
	int a = 0;
	JTable table = new JTable();


	public Main(){
		getContentPane().setLayout(null);
		
		JButton burger = new JButton("\uBC84\uAC70\uC138\uD2B8");
		burger.setBounds(750, 0, 134, 97);
		getContentPane().add(burger);
		
		JButton chicken = new JButton("\uBC84\uAC70");
		chicken.setBounds(750, 97, 134, 103);
		getContentPane().add(chicken);
		
		JButton side = new JButton("���̵�");
		side.setBounds(750, 196, 134, 97);
		getContentPane().add(side);
		
		JButton beverage = new JButton("����");
		beverage.setBounds(750, 293, 134, 97);
		getContentPane().add(beverage);
		
		setVisible(true);
		setSize(900,900);
		
		JPanel panel = new JPanel();	//â�߰�
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 750, 390);
		getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		APanel a = new APanel();
		panel.add(a,"1");
		BPanel b = new BPanel();
		panel.add(b,"2");
		CPanel c = new CPanel();
		panel.add(c,"3");
		DPanel d = new DPanel();
		panel.add(d,"4");
		
		
		JButton check = new JButton("Ȯ��");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// select.setText("\t��ǰ��\t\t\t����\t\t\t�հ� \n");
				// if(a.menu != null && a.count !=0){
				// select.append(a.menu+"/t/t"+a.count+"/t/t
				// "+(a.price*a.count)+"\n");
				// }
				// jtable �߰�
				//ǥ
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setNumRows(0);
				String str[] = new String[4];
				for (int i = 0; i < 100; i++) {
					if (menu[i] != null && mount[i] != 0)
						model = (DefaultTableModel) table.getModel();
					// model.addRow(menu[i]+" "+mount[i]+"
					// "+(price[i]*mount[i]));
					str[0] = "" + menu[i];
					str[1] = "" + price[i];
					str[2] = "" + mount[i];
					str[3] = "" + (price[i] * mount[i]);
					if ( !(str[0].equals("null")) ){//null���� �ƴϸ�
						model.addRow(str);//���������
					}
				}
			}

		});

		
		check.setBounds(0, 388, 447, 58);
		getContentPane().add(check);		
		
		JButton clear = new JButton("�ʱ�ȭ");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setNumRows(0);
				String str[] = new String[4];
				for (int i = 0; i < 4; i++) {
					model = (DefaultTableModel) table.getModel();
					// model.addRow(menu[i]+" "+mount[i]+"
					// "+(price[i]*mount[i]));
					str[i] = null;
				}
			}
		});
		clear.setBounds(445, 388, 439, 58);
		getContentPane().add(clear);
		
		
		JButton btnNewButton_2 = new JButton("����");
		btnNewButton_2.setBounds(336, 827, 97, 23);
		getContentPane().add(btnNewButton_2);
		
		
		JButton exit = new JButton("����");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(445, 827, 97, 23);
		getContentPane().add(exit);
		
		JButton order = new JButton("�ֹ�");
//		order.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				os.Order();
//				select.setText("\t��ǰ��\t\t\t����\t\t\t�հ� \n");
//				for(int i = 0; i < 2; i++){
//					menu[i] = null;
//					mount[i] = 0;
//				}
//				a.getTextField().setText("0");
//				a.getTextField1().setText("0");
//			}
//		});
		order.setBounds(229, 828, 97, 23);
		getContentPane().add(order);
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "\uC0C1\uD488\uBA85", "\uAC00\uACA9", "\uC218\uB7C9", "\uD569\uACC4" }));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 441, 884, 376);
		getContentPane().add(scrollPane);
		table.setBounds(0, 0, 0, 0);
	
		
		burger.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "1");
			}
		});
		chicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "2");
			}
		});
		side.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "3");
			}
		});
		beverage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "4");
			}
		});
		
		
	}
	public static void main(String[] args) {
		new Main();
	}
}
