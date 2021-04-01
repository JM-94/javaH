import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class NNPanel extends JPanel {
	public NNPanel() {
		setLayout(null);

		setLayout(null);

		String menu[] = { "인절미 치즈볼", "치킨텐더 3조각", "치킨텐더 5조각", "NBB 치킨너겟", "어니언 도넛", "감자튀김 M", "감자튀김 L" };
		int price[] = { 5000, 5500, 6000, 6500, 7000, 7500, 8000 };
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
			if (i < 4) {
				bt[i].setBounds(25 + i * 150, 50, 100, 100);
			} else {
				bt[i].setBounds(25 + (i - 4) * 150, 300, 100, 100);
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
	}
}
