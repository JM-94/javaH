package Test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

//class Mypanel extends JPanel{
//	public String name;
//
//	public Mypanel() {
//		this.name = name;
//	}
//}
public class Main extends JFrame {
	static int [] code = new int [40];
	static String[] menu  = {
			"a","a2","a3","a4","a5","a6","a7","a8","a9","a10",
			"a11","a12","a13","a14","a15","a16","a17","a18","a19","a20",
			"a21","a22","a23","a24","a25","a26","a27","a28","a29","a30",
			"a31","a32","a33","a34","a35","a36","a37","a38","a39","a40"
	};
	static int[] price = 
			{1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,};
	static int[] mount = new int[40];


	Save os = new Save();
	JTable table = new JTable();
	public Main() {
		for(int i = 0; i < 40; i++){
			code[i] = i;
		}
		getContentPane().setLayout(null);

		JButton burger = new JButton("����");
		burger.setBounds(750, 0, 134, 97);
		getContentPane().add(burger);

		JButton chicken = new JButton("��Ʈ �޴�");
		chicken.setBounds(750, 97, 134, 103);
		getContentPane().add(chicken);

		JButton side = new JButton("���̵�");
		side.setBounds(750, 196, 134, 97);
		getContentPane().add(side);

		JButton beverage = new JButton("����");
		beverage.setBounds(750, 293, 134, 97);
		getContentPane().add(beverage);

		setVisible(true);
		setSize(900, 900);

		JPanel panel = new JPanel(); // â�߰�
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 750, 390);
		getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		APanel a = new APanel();
		panel.add(a, "1");
		BPanel b = new BPanel();
		panel.add(b, "2");
		CPanel c = new CPanel();
		panel.add(c, "3");
		DPanel d = new DPanel();
		panel.add(d, "4");

		JButton check = new JButton("Ȯ��");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// select.setText("\t��ǰ��\t\t\t����\t\t\t�հ� \n");
				// if(a.menu != null && a.count !=0){
				// select.append(a.menu+"/t/t"+a.count+"/t/t
				// "+(a.price*a.count)+"\n");
				// }
				// jtable �߰�
				// ǥ
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setNumRows(0);
				String str[] = new String[4];
				for (int i = 0; i < 40; i++) {
					if (menu[i] != null && mount[i] != 0)
						model = (DefaultTableModel) table.getModel();
					// model.addRow(menu[i]+" "+mount[i]+"
					// "+(price[i]*mount[i]));
					str[0] = "" + menu[i];
					str[1] = "" + price[i];
					str[2] = "" + mount[i];
					str[3] = "" + (price[i] * mount[i]);
					if ( !(str[2].equals("0")) ){//null���� �ƴϸ�
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
				String str[] = new String[40];
				for (int i = 0; i < 40; i++) {
					model = (DefaultTableModel) table.getModel();
					// model.addRow(menu[i]+" "+mount[i]+"
					// "+(price[i]*mount[i]));
					str[i] = null;
				}
				a.Clear();
				b.Clear();
				c.Clear();
				d.Clear();
			}
		});
		clear.setBounds(445, 388, 439, 58);
		getContentPane().add(clear);

		JButton btnNewButton_2 = new JButton("����");
		btnNewButton_2.setBounds(329, 827, 97, 23);
		getContentPane().add(btnNewButton_2);

		JButton exit = new JButton("����");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(491, 827, 97, 23);
		getContentPane().add(exit);

		JButton order = new JButton("�ֹ�");
		order.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			os.Order();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setNumRows(0);
			String str[] = new String[40];
			for (int i = 0; i < 40; i++) {
				model = (DefaultTableModel) table.getModel();
				// model.addRow(menu[i]+" "+mount[i]+"
				// "+(price[i]*mount[i]));
				str[i] = null;
			}
		 //select.setText("\t��ǰ��\t\t\t����\t\t\t�հ� \n");
			for(int i = 0; i < 40; i++){
				 mount[i] = 0;
			}
			a.Clear();
			b.Clear();
			c.Clear();
			d.Clear();
		 }
		 });
		order.setBounds(0, 814, 127, 47);
		getContentPane().add(order);
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "��ǰ��", "����", "����", "�հ�" }));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 441, 884, 376);
		getContentPane().add(scrollPane);
		table.setBounds(0, 0, 0, 0);
		// getContentPane().add(table);

		burger.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards = (CardLayout) panel.getLayout();
				cards.show(panel, "1");
			}
		});
		chicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cards = (CardLayout) panel.getLayout();
				cards.show(panel, "2");
			}
		});
		side.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards = (CardLayout) panel.getLayout();
				cards.show(panel, "3");
			}
		});
		beverage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards = (CardLayout) panel.getLayout();
				cards.show(panel, "4");
			}
		});

	}

	public static void main(String[] args) {
		new Main();
	}
}
