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
	         "NBB시그니처세트","NBB오리지널세트","NBB어메이징세트","미트마니아세트","메가바이트세트","산체스세트","스모키살사세트","데리마요세트","그릴드불고기세트","코울슬로세트",
	         "NBB시그니처","NBB오리지널","NBB어메이징","미트마니아","메가바이트","산체스","스모키살사","데리마요","그릴드불고기","코울슬로치킨",
	         "노치킨너겟","어니언 도넛","NBB치킨너겟","감자튀김M","감자튀김L","인절미치즈볼","치킨시저샐러드","그린샐러드","상하이핑거포크L","상하이핑거포크S",
	         "펩시콜라M","사이다M","미린다(오렌지)M","펩시맥스 (0)M","오렌지주스M","아메리카노Hot","아메리카노Iced"
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
		
		JButton btnNewButton_1 = new JButton("영업시작");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		  	  	SimpleDateFormat date = new SimpleDateFormat( "yyMMdd");
		  	  	Calendar time = Calendar.getInstance();
		  	  	String name = date.format(time.getTime());
		  	  	
				c.create(name);
				for(int i = 0; i < 36; i++){
					//코드 가격 메뉴 날짜
					in.insert(i,price[i], menu[i],name);
				}
				setEnabled(false);
				
				
			}
		});
		btnNewButton_1.setBounds(29, 109, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("주문창");
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

