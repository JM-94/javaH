import javax.swing.JPanel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class MMPanel extends JPanel {
	int count = 0;
	
	public MMPanel() {
		setLayout(null);

		String menu[] = { "치킨시저샐러드", "그린샐러드", "콤비 피자바게트", "페퍼로니 피자바게트", "상하이핑커포크 S", "상하이핑거포크 L"};
		int price[] = { 5000, 5500, 6000, 6500, 7000, 7500};
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

			// 이벤트단
//			for (int i1 = 0; i1 < menu.length; i1++) {
//				int j = i1;
//
//				// 햄버그 버튼 이벤트
//				bt[i1].addActionListener(new ActionListener() {
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						minus[j].setEnabled(true);
//						plus[j].setEnabled(true);
//						bt[j].setEnabled(false);
//						ok[j].setEnabled(true);
//
//						count = 0;
//					}
//				});
//
//				// "-" 버튼 이벤트
//				minus[i1].addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						if (count  > 0) {
//							count = count - 1;
//							suja[j].setText(count + "");
//							ok[j].setEnabled(true);
//						} else {
//							minus[j].setEnabled(false);
//						}
//					}
//				});
//
//				// "+" 버튼 이벤트
//				plus[i1].addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						count = count + 1;
//						suja[j].setText(count + "");
//						ok[j].setEnabled(true);
//						if (count > 0) {
//							minus[j].setEnabled(true);
//						}
//					}
//				});
//
//				// 확인 버튼 이벤트
//				ok[i1].addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						show = bt[j].getActionCommand();
//						ta.append("   " + show + "       " + price[j] + "        " + count + "         "
//								+ price[j] * count + "원" + "\n");
//						ok[j].setEnabled(false);
//					}
//				});
//
//			}
		}
	}
}
