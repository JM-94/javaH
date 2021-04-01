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
		btn1.setBounds(924, 10, 97, 66);
		getContentPane().add(btn1);
		
		JButton btn2 = new JButton("세트");
		btn2.setBounds(924, 110, 97, 66);
		getContentPane().add(btn2);
		
		JButton btn3 = new JButton("사이드");
		btn3.setBounds(924, 325, 97, 66);
		getContentPane().add(btn3);
		
		JButton btn4 = new JButton("디저트");
		btn4.setBounds(924, 434, 97, 66);
		getContentPane().add(btn4);
		
		JButton btn5 = new JButton("음료");
		btn5.setBounds(924, 219, 97, 66);
		getContentPane().add(btn5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(12, 0, 900, 500);
		panel.setLayout(new CardLayout(0, 0));
		
		BgPanel mp1 = new BgPanel();
		SetPanel mp2 = new SetPanel();
		panel.add(mp1,"버거");
		panel.add(mp2,"세트");
		
		MMPanel mp3 = new MMPanel();
		NNPanel mp4 = new NNPanel();
		panel.add(mp3,"사이드");
		panel.add(mp4,"디저트");
		
		CPanel cp1 = new CPanel();
		panel.add(cp1,"음료");
		
		getContentPane().add(panel);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "버거");
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "세트");
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "사이드");
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "디저트");
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "음료");
			}
		});
		
		setSize(1200, 1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SwingTest();
	}
}

