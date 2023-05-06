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
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class delete_student_result {

	private JFrame frmSvemSchoolMurbad;
	private JTextField textField_roll_number;
	private JTextField textField_science;
	private JTextField textField_maths;
	private JTextField textField_english;
	private JTextField textField_hindi;
	private JTextField textField_sst;
	private JTextField textField_marathi;
	private JTextField textField_total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete_student_result window = new delete_student_result();
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
	public delete_student_result() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSvemSchoolMurbad = new JFrame();
		frmSvemSchoolMurbad.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmSvemSchoolMurbad.setTitle("S.V.E.M School Murbad");
		frmSvemSchoolMurbad.setBounds(100, 100, 795, 536);
		frmSvemSchoolMurbad.setLocationRelativeTo(null);
		frmSvemSchoolMurbad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSvemSchoolMurbad.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Student Result");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setBounds(204, 10, 399, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 53, 766, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Student Roll Number");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1.setBounds(20, 65, 319, 42);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1);
		
		textField_roll_number = new JTextField();
		textField_roll_number.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_roll_number.setBounds(335, 65, 119, 32);
		frmSvemSchoolMurbad.getContentPane().add(textField_roll_number);
		textField_roll_number.setColumns(10);
		
		JButton btnNewButton_roll_number = new JButton("Get Data");
		btnNewButton_roll_number.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int roll_number = Integer.parseInt(textField_roll_number.getText());
				
				ResultSet result;
				jdbcHandling j1 = new jdbcHandling();
				result = j1.get_result_row(roll_number);
				
				try {
					while(result.next()) {
						textField_english.setText(Integer.toString(result.getInt(6)));
						textField_hindi.setText(Integer.toString(result.getInt(7)));
						textField_marathi.setText(Integer.toString(result.getInt(8)));
						textField_maths.setText(Integer.toString(result.getInt(4)));
						textField_science.setText(Integer.toString(result.getInt(3)));
						textField_sst.setText(Integer.toString(result.getInt(5)));
						textField_total.setText(Integer.toString(result.getInt(9)));
						
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
		btnNewButton_roll_number.setForeground(Color.RED);
		btnNewButton_roll_number.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_roll_number.setBounds(579, 65, 141, 38);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton_roll_number);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 117, 766, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Science");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(20, 155, 141, 42);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Maths");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1_1_1_1.setBounds(20, 217, 113, 42);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("English");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1_1_1_2.setBounds(20, 284, 141, 42);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_1_2);
		
		textField_science = new JTextField();
		textField_science.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_science.setBounds(190, 165, 119, 26);
		frmSvemSchoolMurbad.getContentPane().add(textField_science);
		textField_science.setColumns(10);
		
		textField_maths = new JTextField();
		textField_maths.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_maths.setColumns(10);
		textField_maths.setBounds(190, 227, 119, 26);
		frmSvemSchoolMurbad.getContentPane().add(textField_maths);
		
		textField_english = new JTextField();
		textField_english.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_english.setColumns(10);
		textField_english.setBounds(190, 294, 119, 26);
		frmSvemSchoolMurbad.getContentPane().add(textField_english);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Hindi");
		lblNewLabel_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1_1_1_3.setBounds(428, 155, 113, 42);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_1_3);
		
		textField_hindi = new JTextField();
		textField_hindi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_hindi.setColumns(10);
		textField_hindi.setBounds(601, 165, 119, 26);
		frmSvemSchoolMurbad.getContentPane().add(textField_hindi);
		
		textField_sst = new JTextField();
		textField_sst.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_sst.setColumns(10);
		textField_sst.setBounds(601, 227, 119, 26);
		frmSvemSchoolMurbad.getContentPane().add(textField_sst);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("SST");
		lblNewLabel_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1_1_1_3_1.setBounds(434, 217, 107, 42);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_3_2 = new JLabel("Marathi");
		lblNewLabel_1_1_1_3_2.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1_1_1_3_2.setBounds(428, 284, 133, 42);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_1_3_2);
		
		textField_marathi = new JTextField();
		textField_marathi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_marathi.setColumns(10);
		textField_marathi.setBounds(601, 294, 119, 26);
		frmSvemSchoolMurbad.getContentPane().add(textField_marathi);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Total");
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_1_2.setBounds(64, 354, 107, 42);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_2);
		
		textField_total = new JTextField();
		textField_total.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_total.setColumns(10);
		textField_total.setBounds(209, 354, 141, 42);
		frmSvemSchoolMurbad.getContentPane().add(textField_total);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 426, 766, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator_2);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchoolMurbad.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(34, 438, 137, 42);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton);
		
		JButton btnDeleteData = new JButton("DELETE DATA");
		btnDeleteData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status =0;
				int roll_number = Integer.parseInt(textField_roll_number.getText());
				
				jdbcHandling j1 = new jdbcHandling();
				status = j1.delete_result_data(roll_number);
				
				if(status == 1) {
					JOptionPane.showMessageDialog(null,"Result Deleted Succesfully");
					textField_english.setText(null);
					textField_hindi.setText(null);
					textField_marathi.setText(null);
					textField_maths.setText(null);
					textField_science.setText(null);
					textField_sst.setText(null);
					textField_total.setText(null);
				}else {
					JOptionPane.showMessageDialog(null,"Problem in deleted result");
				}
			}
		});
		btnDeleteData.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnDeleteData.setBounds(275, 438, 218, 42);
		frmSvemSchoolMurbad.getContentPane().add(btnDeleteData);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(594, 438, 137, 42);
		frmSvemSchoolMurbad.getContentPane().add(btnExit);
	}
}
