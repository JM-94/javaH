package Test;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class APanel extends JPanel {
	int count = 0;
	Update up = new Update();
	private JTextField textField;
	public APanel() {
		setBackground(new Color(255, 215, 0));
		setLayout(null);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(15, 10, 111, 90);
		add(btnNewButton_2);
		setSize(580, 380);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count > 0){
					count = count -1;
					textField.setText(count+"");
					System.out.println(count);
					btnNewButton.setEnabled(true);
				}
				if(count < 0){
					btnNewButton.setEnabled(false);
				}
			}
		});
		btnNewButton.setBounds(15, 110, 24, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = count + 1;
				textField.setText(count+"");
			}
		});
		btnNewButton_1.setBounds(102, 110, 24, 23);
		add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setText(""+count);
		textField.setBounds(51, 110, 46, 23);
		add(textField);
		textField.setColumns(10);
	}
}
