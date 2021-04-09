package Test3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Test.Main;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Ex01 extends JFrame {
	String[] menu  =  {
	         "NBB�ñ״�ó��Ʈ","NBB�������μ�Ʈ","NBB�����¡��Ʈ","��Ʈ���ϾƼ�Ʈ","�ް�����Ʈ��Ʈ","��ü����Ʈ","����Ű��缼Ʈ","�������似Ʈ","�׸���Ұ�⼼Ʈ","�ڿｽ�μ�Ʈ",
	         "NBB�ñ״�ó","NBB��������","NBB�����¡","��Ʈ���Ͼ�","�ް�����Ʈ","��ü��","����Ű���","��������","�׸���Ұ��","�ڿｽ��ġŲ",
	         "��ġŲ�ʰ�","��Ͼ� ����","NBBġŲ�ʰ�","����Ƣ��M","����Ƣ��L","������ġ�","ġŲ����������","�׸�������","�������ΰ���ũL","�������ΰ���ũS",
	         "����ݶ�M","���̴�M","�̸���(������)M","��øƽ� (0)M","�������ֽ�M","�Ƹ޸�ī��Hot","�Ƹ޸�ī��Iced"
	   };
	int[] price = 
		{5300,4700,6500,6900,5900,5700,5600,4700,3900,5800,
	     3500,2900,4900,5300,4300,3800,3700,2900,1900,3900,
	     2900,2500,2500,1500,2000,2900,3800,3300,15000,4200,
	     1500,1500,1500,1500,3000,2000,2000};
	
	Create c = new Create();
	Insert in = new Insert();
	public Ex01() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("��������");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		  	  	SimpleDateFormat date = new SimpleDateFormat( "yyMMdd");
		  	  	Calendar time = Calendar.getInstance();
		  	  	String name = date.format(time.getTime());
		  	  	
				c.create(name);
				for(int i = 0; i < 36; i++){
					//�ڵ� ���� �޴� ��¥
					in.insert(i,price[i], menu[i],name);
				}
				setEnabled(false);
				
				
			}
		});
		btnNewButton_1.setBounds(29, 109, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("�ֹ�â");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
                	new Main();
                	dispose();
                	} 
			});
		btnNewButton.setBounds(157, 109, 97, 23);
		getContentPane().add(btnNewButton);
		
		setVisible(true);
		setSize(300, 300);
	}
	
	public static void main(String[] args)  {
		new Ex01();
	}
}

