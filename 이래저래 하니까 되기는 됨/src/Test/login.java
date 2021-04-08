package Test;
import Test3.*;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {
	private JPasswordField txtPass;
	public login() {
		getContentPane().setLayout(null);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(111, 68, 120, 25);
		getContentPane().add(txtPass);
		txtPass.setColumns(10);
		
		JButton logBtn = new JButton("로그인");
		logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel label = new JLabel("비밀번호");
		label.setBounds(34, 68, 60, 25);
		getContentPane().add(label);
		logBtn.setBounds(255, 68, 80, 25);
		getContentPane().add(logBtn);
		
		logBtn.addActionListener( new ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                String pass = "1234";
                if(pass.equals(txtPass.getText())) {
                	new Ex01();
                	dispose();
                        } else {
                            JOptionPane.showMessageDialog( null , " 땡 ");
                        }
                }
            } );
		setVisible(true);		 
        setSize(400 , 200); 
        setLocationRelativeTo(null); 
        setResizable(false); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		new login();	

	}
}
