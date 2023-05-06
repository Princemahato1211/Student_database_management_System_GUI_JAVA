package package1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Individual_report {

	private JFrame frmSvemSchholMurbad;
	private JTextField textField_roll_num;
	private JTextField textField_Name;
	private JTextField textField_std;
	private JTextField textField_sci;
	private JTextField textField_maths;
	private JTextField textField_english;
	private JTextField textField_hindi;
	private JTextField textField_sst;
	private JTextField textField_marathi;
	private JTextField textField_total;
	private JTextField textField_percentage;
	private JTextField textField_status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Individual_report window = new Individual_report();
					window.frmSvemSchholMurbad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Individual_report() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSvemSchholMurbad = new JFrame();
		frmSvemSchholMurbad.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmSvemSchholMurbad.setTitle("S.V.E.M Schhol Murbad");
		frmSvemSchholMurbad.setBounds(100, 100, 800, 800);
		frmSvemSchholMurbad.setLocationRelativeTo(null);
		frmSvemSchholMurbad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSvemSchholMurbad.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Student Roll number");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 151, 388, 31);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel);
		
		textField_roll_num = new JTextField();
		textField_roll_num.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_roll_num.setBounds(438, 157, 110, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_roll_num);
		textField_roll_num.setColumns(10);
		
		JButton btnNewButton = new JButton("Get Result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int roll_num;
				roll_num = Integer.parseInt(textField_roll_num.getText());
				
				ResultSet result,result_1;
				jdbcHandling j1 = new jdbcHandling();
				result =j1.getrow(roll_num);
				
				try {
					while(result.next()) {
						textField_Name.setText(result.getString(2));
						textField_std.setText(result.getString(6));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				result_1 = j1.get_result_row(roll_num);
				try {
					while(result_1.next()) {
						textField_sci.setText(Integer.toString (result_1.getInt(3)));
						textField_maths.setText(Integer.toString(result_1.getInt(4)));
						textField_english.setText(Integer.toString(result_1.getInt(5)));
						textField_hindi.setText(Integer.toString(result_1.getInt(6)));
						textField_sst.setText(Integer.toString(result_1.getInt(7)));
						textField_marathi.setText(Integer.toString(result_1.getInt(8)));
						textField_total.setText(Integer.toString(result_1.getInt(9)));
						
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				try {
					result.close();
					result_1.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				int total= Integer.parseInt (textField_total.getText());
				int percentage;
				percentage = total/6;
				
				textField_percentage.setText(Integer.toString(percentage)+"%");
				
				int sci,maths,eng,hindi,marathi,sst;
				sci= Integer.parseInt(textField_sci.getText());
				maths = Integer.parseInt(textField_maths.getText());
				eng= Integer.parseInt(textField_english.getText());
				hindi= Integer.parseInt(textField_hindi.getText());
				marathi= Integer.parseInt(textField_marathi.getText());
				sst = Integer.parseInt(textField_sst.getText());
				
				
				if(sci>34 & maths>34 & eng>34 & hindi>34 & marathi>34 & sst>34) {
					textField_status.setText("PASSED");
				}else {
					textField_status.setText("FAILED");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(589, 152, 163, 32);
		frmSvemSchholMurbad.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 133, 766, 2);
		frmSvemSchholMurbad.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Swami Vivekananda English Medium");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(111, 10, 564, 39);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("School Murbad");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Algerian", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(268, 59, 250, 40);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblStudentName.setBounds(10, 243, 221, 31);
		frmSvemSchholMurbad.getContentPane().add(lblStudentName);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 215, 766, 2);
		frmSvemSchholMurbad.getContentPane().add(separator_1);
		
		textField_Name = new JTextField();
		textField_Name.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_Name.setBounds(241, 243, 307, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblStandard.setBounds(10, 299, 155, 31);
		frmSvemSchholMurbad.getContentPane().add(lblStandard);
		
		textField_std = new JTextField();
		textField_std.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_std.setColumns(10);
		textField_std.setBounds(241, 305, 307, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_std);
		
		JLabel lblNewLabel_2 = new JLabel("SCIENCE");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(20, 391, 121, 31);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_2);
		
		textField_sci = new JTextField();
		textField_sci.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_sci.setColumns(10);
		textField_sci.setBounds(185, 395, 110, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_sci);
		
		JLabel lblNewLabel_2_1 = new JLabel("MATHS");
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(20, 453, 97, 31);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("ENGLISH");
		lblNewLabel_2_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(20, 516, 121, 31);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("HNIDI");
		lblNewLabel_2_2_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2_2_1.setBounds(416, 391, 121, 31);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_2_2_1);
		
		textField_maths = new JTextField();
		textField_maths.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_maths.setColumns(10);
		textField_maths.setBounds(185, 453, 110, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_maths);
		
		textField_english = new JTextField();
		textField_english.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_english.setColumns(10);
		textField_english.setBounds(185, 516, 110, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_english);
		
		textField_hindi = new JTextField();
		textField_hindi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_hindi.setColumns(10);
		textField_hindi.setBounds(578, 391, 110, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_hindi);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("S.S.T");
		lblNewLabel_2_2_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2_2_1_1.setBounds(416, 453, 121, 31);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("MARATHI");
		lblNewLabel_2_2_1_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2_2_1_2.setBounds(416, 516, 121, 31);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_2_2_1_2);
		
		textField_sst = new JTextField();
		textField_sst.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_sst.setColumns(10);
		textField_sst.setBounds(578, 453, 110, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_sst);
		
		textField_marathi = new JTextField();
		textField_marathi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_marathi.setColumns(10);
		textField_marathi.setBounds(578, 516, 110, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_marathi);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Total");
		lblNewLabel_2_2_2.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel_2_2_2.setBounds(20, 587, 121, 31);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_2_2_2);
		
		textField_total = new JTextField();
		textField_total.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_total.setColumns(10);
		textField_total.setBounds(242, 593, 134, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_total);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Percentage");
		lblNewLabel_2_2_2_1.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel_2_2_2_1.setBounds(20, 647, 200, 31);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_2_2_2_1);
		
		textField_percentage = new JTextField();
		textField_percentage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_percentage.setColumns(10);
		textField_percentage.setBounds(241, 647, 134, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_percentage);
		
		textField_status = new JTextField();
		textField_status.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_status.setColumns(10);
		textField_status.setBounds(642, 647, 134, 31);
		frmSvemSchholMurbad.getContentPane().add(textField_status);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("STATUS");
		lblNewLabel_2_2_2_2.setForeground(Color.BLUE);
		lblNewLabel_2_2_2_2.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel_2_2_2_2.setBounds(469, 647, 155, 31);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel_2_2_2_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 695, 766, 2);
		frmSvemSchholMurbad.getContentPane().add(separator_2);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(618, 721, 134, 32);
		frmSvemSchholMurbad.getContentPane().add(btnExit);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchholMurbad.setVisible(false);
			}
		});
		btnBack.setForeground(Color.DARK_GRAY);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(414, 721, 147, 32);
		frmSvemSchholMurbad.getContentPane().add(btnBack);
	}
}
