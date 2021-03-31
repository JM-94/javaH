import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.CardLayout;

class Memupanel extends JPanel{
	public String name;
	public Memupanel(String name) {
		this.name = name;
		this.add(new JButton(name));
	}
}
public class SwingTest extends JFrame{
	public SwingTest() {
		getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("버거");
		btn1.setBounds(12, 528, 97, 23);
		getContentPane().add(btn1);
		
		JButton btn2 = new JButton("세트");
		btn2.setBounds(154, 528, 97, 23);
		getContentPane().add(btn2);
		
		JButton btn3 = new JButton("사이드");
		btn3.setBounds(467, 528, 97, 23);
		getContentPane().add(btn3);
		
		JButton btn4 = new JButton("디저트");
		btn4.setBounds(615, 528, 97, 23);
		getContentPane().add(btn4);
		
		JButton btn5 = new JButton("음료");
		btn5.setBounds(309, 528, 97, 23);
		getContentPane().add(btn5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(12, 0, 700, 518);
		panel.setLayout(new CardLayout(0, 0));
		
		Memupanel mp1 = new Memupanel("1");
		Memupanel mp2 = new Memupanel("2");
		panel.add(mp1,"1");
		panel.add(mp2,"2");
		
		MMPanel mp3 = new MMPanel();
		NNPanel mp4 = new NNPanel();
		panel.add(mp3,"3");
		panel.add(mp4,"4");
		
		CPanel cp1 = new CPanel();
		panel.add(cp1,"cp1");
		
		getContentPane().add(panel);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "1");
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "2");
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "3");
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "4");
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "cp1");
			}
		});
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SwingTest();
	}
}

