package Test;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
class Mypanel extends JPanel{
	public String name;

	public Mypanel() {
		this.name = name;
	}
}
public class Main extends JFrame{
	public Main(){
		getContentPane().setLayout(null);
		
		JButton burger = new JButton("버거");
		burger.setBounds(12, 412, 97, 23);
		getContentPane().add(burger);
		
		JButton chicken = new JButton("치킨");
		chicken.setBounds(148, 412, 97, 23);
		getContentPane().add(chicken);
		
		JButton side = new JButton("사이드");
		side.setBounds(302, 412, 97, 23);
		getContentPane().add(side);
		
		JButton beverage = new JButton("음료");
		beverage.setBounds(462, 412, 97, 23);
		getContentPane().add(beverage);
		
		setVisible(true);
		setSize(600,900);
		
		JPanel panel = new JPanel();	//창추가
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 580, 390);
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
		
		JTextPane select = new JTextPane();
		select.setText("상품명 단가  수량  합계 \n\n");
		select.setBounds(0, 445, 584, 371);
		select.setEditable(false);
		getContentPane().add(select);
		
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
