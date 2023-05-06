package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.format.DateTimeParseException;
import java.awt.event.ActionEvent;

public class update_result_data {

	private JFrame frmSvemSchoolMurbad;
	private JTextField textField_roll_number;
	private JTextField textField_name;
	private JTextField textField_std;
	private JTextField textField_science;
	private JTextField textField_maths;
	private JTextField textField_english;
	private JTextField textField_hindi;
	private JTextField textField_SSt;
	private JTextField textField_marathi;
	private JTextField textField_total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update_result_data window = new update_result_data();
					window.frmSvemSchoolMurbad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public update_result_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSvemSchoolMurbad = new JFrame();
		frmSvemSchoolMurbad.setTitle("S.V.E.M School Murbad");
		frmSvemSchoolMurbad.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmSvemSchoolMurbad.setBounds(100, 100, 800, 659);
		frmSvemSchoolMurbad.setLocationRelativeTo(null);
		frmSvemSchoolMurbad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSvemSchoolMurbad.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Roll number");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 10, 307, 34);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel);
		
		textField_roll_number = new JTextField();
		textField_roll_number.setBounds(343, 10, 96, 34);
		frmSvemSchoolMurbad.getContentPane().add(textField_roll_number);
		textField_roll_number.setColumns(10);
		
		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                int rollnumber = Integer.parseInt(textField_roll_number.getText());
				
				ResultSet result;
				jdbcHandling j1 = new jdbcHandling();
				result =j1.getrow(rollnumber);
				
				try {
					while(result.next()) {
						textField_name.setText(result.getString(2));
						textField_std.setText(result.getString(6));
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(524, 13, 142, 32);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 68, 757, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 80, 179, 34);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1);
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		textField_name.setBounds(199, 80, 252, 34);
		frmSvemSchoolMurbad.getContentPane().add(textField_name);
		
		JLabel lblNewLabel_1_1 = new JLabel("Standard");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 139, 142, 34);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1);
		
		textField_std = new JTextField();
		textField_std.setColumns(10);
		textField_std.setBounds(199, 139, 252, 34);
		frmSvemSchoolMurbad.getContentPane().add(textField_std);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 197, 757, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("( NOTE:  If student name and standard are correct the update that result data )");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(20, 209, 547, 26);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Science");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(20, 258, 114, 34);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Maths");
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(20, 322, 114, 34);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("English");
		lblNewLabel_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_3.setBounds(20, 387, 114, 34);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Hindi");
		lblNewLabel_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_4.setBounds(393, 258, 122, 34);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("SST");
		lblNewLabel_1_1_5.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_5.setBounds(393, 322, 114, 34);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("marathi");
		lblNewLabel_1_1_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_6.setBounds(393, 387, 122, 34);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_6);
		
		textField_science = new JTextField();
		textField_science.setBounds(160, 258, 106, 31);
		frmSvemSchoolMurbad.getContentPane().add(textField_science);
		textField_science.setColumns(10);
		
		textField_maths = new JTextField();
		textField_maths.setColumns(10);
		textField_maths.setBounds(160, 325, 106, 31);
		frmSvemSchoolMurbad.getContentPane().add(textField_maths);
		
		textField_english = new JTextField();
		textField_english.setColumns(10);
		textField_english.setBounds(160, 393, 106, 31);
		frmSvemSchoolMurbad.getContentPane().add(textField_english);
		
		textField_hindi = new JTextField();
		textField_hindi.setColumns(10);
		textField_hindi.setBounds(545, 261, 106, 31);
		frmSvemSchoolMurbad.getContentPane().add(textField_hindi);
		
		textField_SSt = new JTextField();
		textField_SSt.setColumns(10);
		textField_SSt.setBounds(545, 322, 106, 31);
		frmSvemSchoolMurbad.getContentPane().add(textField_SSt);
		
		textField_marathi = new JTextField();
		textField_marathi.setColumns(10);
		textField_marathi.setBounds(545, 387, 106, 31);
		frmSvemSchoolMurbad.getContentPane().add(textField_marathi);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("TOTAL");
		lblNewLabel_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_1_3_1.setBounds(67, 455, 142, 47);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_3_1);
		
		textField_total = new JTextField();
		textField_total.setColumns(10);
		textField_total.setBounds(211, 455, 106, 47);
		frmSvemSchoolMurbad.getContentPane().add(textField_total);
		
		JButton btnGetTotal = new JButton("Get Total");
		btnGetTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String timepass;
				int sci, maths ,english, hindi, marathi, sst, total;
				
				timepass = textField_english.getText();
				english = Integer.parseInt(timepass);
				
				timepass = textField_hindi.getText();
				hindi = Integer.parseInt(timepass);
				
				timepass = textField_marathi.getText();
				marathi = Integer.parseInt(timepass);
				
				timepass = textField_maths.getText();
				maths = Integer.parseInt(timepass);
				
				timepass = textField_science.getText();
				sci = Integer.parseInt(timepass);
				
				timepass = textField_SSt.getText();
				sst = Integer.parseInt(timepass);
				
				total = english+hindi+marathi+maths+sci+sst;
				textField_total.setText(Integer.toString(total));
				
			}
		});
		btnGetTotal.setForeground(Color.RED);
		btnGetTotal.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnGetTotal.setBounds(393, 465, 142, 37);
		frmSvemSchoolMurbad.getContentPane().add(btnGetTotal);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 535, 765, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator_2);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchoolMurbad.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1.setBounds(20, 555, 114, 34);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("UPDATE");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int rollnumber = Integer.parseInt(textField_roll_number.getText());
				
				String timepass;
				int sci, maths ,english, hindi, marathi, sst, total;
				
				timepass = textField_english.getText();
				english = Integer.parseInt(timepass);
				
				timepass = textField_hindi.getText();
				hindi = Integer.parseInt(timepass);
				
				timepass = textField_marathi.getText();
				marathi = Integer.parseInt(timepass);
				
				timepass = textField_maths.getText();
				maths = Integer.parseInt(timepass);
				
				timepass = textField_science.getText();
				sci = Integer.parseInt(timepass);
				
				timepass = textField_SSt.getText();
				sst = Integer.parseInt(timepass);
				
				timepass = textField_total.getText();
				total = Integer.parseInt(timepass);
				
				timepass = textField_std.getText();
				
				int status =0;
				jdbcHandling j1 = new jdbcHandling();
				status = j1.Update_result_data(rollnumber, timepass, sci, maths, english, hindi, sst, marathi,total);
				
				if(status == 1) {
					JOptionPane.showMessageDialog(null,"Data Updated Succesfully");
					textField_english.setText(null);
					textField_hindi.setText(null);
					textField_marathi.setText(null);
					textField_maths.setText(null);
					textField_science.setText(null);
					textField_SSt.setText(null);
					textField_total.setText(null);
					textField_name.setText(null);
					textField_roll_number.setText(null);
					textField_std.setText(null);
				}else {
					JOptionPane.showMessageDialog(null, "problem in updating data");
				}
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(289, 555, 142, 34);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("EXIT");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(614, 555, 127, 34);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton_1_1_1);
	}
}
