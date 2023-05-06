package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage {

	private JFrame frmloginpage;
	private JTextField textFieldlogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmloginpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmloginpage = new JFrame();
		frmloginpage.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmloginpage.setTitle("S.V.E.M  School Murbad");
		frmloginpage.setBounds(100, 100, 679, 406);
		frmloginpage.setLocationRelativeTo(null);
		frmloginpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmloginpage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("S.V.E.M  School Murbad");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel.setBounds(61, 10, 543, 40);
		frmloginpage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 63, 645, 2);
		frmloginpage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1.setBounds(38, 92, 189, 40);
		frmloginpage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(48, 180, 211, 40);
		frmloginpage.getContentPane().add(lblNewLabel_1_1);
		
		textFieldlogin = new JTextField();
		textFieldlogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldlogin.setBounds(291, 92, 228, 40);
		frmloginpage.getContentPane().add(textFieldlogin);
		textFieldlogin.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 262, 645, 2);
		frmloginpage.getContentPane().add(separator_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(291, 180, 228, 38);
		frmloginpage.getContentPane().add(passwordField);
		
		JButton btnNewButtonlogin = new JButton("LOGIN");
		btnNewButtonlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login= textFieldlogin.getText();
				String password = passwordField.getText();
				
				if(login.equals("prince1211") & password.equals("1211")) {
					JOptionPane.showMessageDialog(null,"Login Successfull");
					Studentdatabases.main(null);
				}else {
					JOptionPane.showMessageDialog(null,"incorrect password");
				}
			}
		});
		btnNewButtonlogin.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnNewButtonlogin.setBounds(258, 288, 155, 51);
		frmloginpage.getContentPane().add(btnNewButtonlogin);
		
		JButton btnNewButtonexit = new JButton("EXIT");
		btnNewButtonexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButtonexit.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnNewButtonexit.setBounds(479, 288, 155, 51);
		frmloginpage.getContentPane().add(btnNewButtonexit);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    textFieldlogin.setText(null);
			    passwordField.setText(null);
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnReset.setBounds(38, 288, 155, 51);
		frmloginpage.getContentPane().add(btnReset);
	}
}
