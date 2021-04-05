import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SetPanel extends JPanel {
	static int count1 = 0;
	static String show = "";
	public SetPanel() {
		int count = 0;

		setLayout(null);

		String menu[] = { "NBB 오리지널 Set", "NBB 시그니처 Set", "NBB 어메이징 Set", "그릴드불고기 Set", "데리마요 Set", "산체스 Set",
				"스모키살사 Set", "코울슬로치킨 Set", "스리라차치킨 Set", "미트마니아 Set", "메가바이트 Set" };
		int price[] = { 5000, 5500, 6000, 6500, 7000, 7500, 8000, 8000, 8000, 8000, 8000 };
		JButton bt[] = new JButton[menu.length];
		TextField suja[] = new TextField[menu.length];
		Button minus[] = new Button[menu.length];
		Button plus[] = new Button[menu.length];
		JButton ok[] = new JButton[menu.length];
		Label l[] = new Label[menu.length];
		ImageIcon icon[] = new ImageIcon[menu.length];

		// 버튼 설정 부분
		for (int i = 0; i < menu.length; i++) {

			// 햄버거 버튼
			bt[i] = new JButton(menu[i]);
			if (i < 6) {
				bt[i].setBounds(25 + i * 150, 50, 100, 100);
			} else {
				bt[i].setBounds(25 + (i - 6) * 150, 300, 100, 100);
			}
			icon[i] = new ImageIcon(i + ".png");
			bt[i].setIcon(icon[i]);

			// 숫자 txt 버튼
			suja[i] = new TextField("0");
			suja[i].setBackground(Color.white);
			suja[i].setEditable(false);
			suja[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 130, 40, 20);

			// "-" 버튼
			minus[i] = new Button("-");
			minus[i].setBounds(bt[i].getX(), suja[i].getY(), 20, 20);
			minus[i].setEnabled(false);
			

			// "+" 버튼
			plus[i] = new Button("+");
			plus[i].setBounds(bt[i].getX() + (100 - 20), suja[i].getY(), 20, 20);
			plus[i].setEnabled(false);

			// 가격
			l[i] = new Label(price[i] + "원");
			l[i].setBounds(bt[i].getX() + 20, suja[i].getY() - 25, 100, 20);

			// 확인 버튼
			ok[i] = new JButton("확인");
			ok[i].setBounds(bt[i].getX(), suja[i].getY() + 30, 100, 20);
			ok[i].setEnabled(false);
			
			
		
			
			
			
			
			add(bt[i]);
			add(suja[i]);
			add(minus[i]);
			add(plus[i]);
			add(l[i]);
			add(ok[i]);
		}
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setText("   상품명                                 단가                           수량                         합계\r\n\r\n");
		ta.setBackground(Color.white);
		ta.setEditable(false);
		
		for (int i1 = 0; i1 < menu.length; i1++) {
			int j = i1;
			
			// 햄버그 버튼 이벤트
						bt[i1].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								minus[j].setEnabled(true);
								plus[j].setEnabled(true);
								bt[j].setEnabled(false);
								ok[j].setEnabled(true);

								count1 = 0;
							}
						});
			
			// "-" 버튼 이벤트
			minus[i1].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (count1 > 0) {
						count1 = count1 - 1;
						suja[j].setText(count + "");
						ok[j].setEnabled(true);
					} else {
						minus[j].setEnabled(false);
					}
				}
			});

			// "+" 버튼 이벤트
			plus[i1].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					count1 = count1 + 1;
					suja[j].setText(count1 + "");
					ok[j].setEnabled(true);
					if (count1 > 0) {
						minus[j].setEnabled(true);
					}
				}
			});

			// 확인 버튼 이벤트
			ok[i1].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					show = bt[j].getActionCommand();
					ta.append("   " + show + "       " + price[j] + "        " + count + "         " + price[j] * count
							+ "원" + "\n");
					ok[j].setEnabled(false);
				}
			});

		}
		JFrame frame = new JFrame("");
		
		// 끄기
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}