package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class delete_student_data {

	private JFrame frmdelete_student_data;
	private JTextField txtRollnumber;
	private JTextField txtstudentname;
	private JTextField txtmobileno;
	private JTextField txtDOB;
	private JTextField txtstandard;
	private JTextField txtaddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete_student_data window = new delete_student_data();
					window.frmdelete_student_data.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public delete_student_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmdelete_student_data =new JFrame();
		frmdelete_student_data.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmdelete_student_data.setTitle("S.V.E.M  School  Murbad");
		frmdelete_student_data.setSize(800,600);
		frmdelete_student_data.setLocationRelativeTo(null);
		frmdelete_student_data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmdelete_student_data.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Roll Number");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 10, 433, 51);
		frmdelete_student_data.getContentPane().add(lblNewLabel);
		
		txtRollnumber = new JTextField();
		txtRollnumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtRollnumber.setBounds(464, 20, 125, 41);
		frmdelete_student_data.getContentPane().add(txtRollnumber);
		txtRollnumber.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 90, 766, 2);
		frmdelete_student_data.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("GET DATA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rollnumber = Integer.parseInt(txtRollnumber.getText());
				
				ResultSet result;
				jdbcHandling j1 = new jdbcHandling();
				result =j1.getrow(rollnumber);
				
				try {
					while(result.next()) {
						txtstudentname.setText(result.getString(2));
						txtmobileno.setText(result.getString(3));
						txtDOB.setText(result.getString(7));
						txtstandard.setText(result.getString(6));
						txtaddress.setText(result.getString(4));
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
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(609, 24, 167, 38);
		frmdelete_student_data.getContentPane().add(btnNewButton);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentName.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblStudentName.setBounds(10, 102, 222, 51);
		frmdelete_student_data.getContentPane().add(lblStudentName);
		
		txtstudentname = new JTextField();
		txtstudentname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtstudentname.setColumns(10);
		txtstudentname.setBounds(239, 112, 290, 31);
		frmdelete_student_data.getContentPane().add(txtstudentname);
		
		JLabel lblRollNumber = new JLabel("Mobile No");
		lblRollNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNumber.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblRollNumber.setBounds(10, 227, 167, 51);
		frmdelete_student_data.getContentPane().add(lblRollNumber);
		
		txtmobileno = new JTextField();
		txtmobileno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtmobileno.setColumns(10);
		txtmobileno.setBounds(239, 239, 290, 31);
		frmdelete_student_data.getContentPane().add(txtmobileno);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblAddress.setBounds(10, 349, 145, 41);
		frmdelete_student_data.getContentPane().add(lblAddress);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateOfBirth.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblDateOfBirth.setBounds(10, 287, 207, 51);
		frmdelete_student_data.getContentPane().add(lblDateOfBirth);
		
		txtDOB = new JTextField();
		txtDOB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDOB.setColumns(10);
		txtDOB.setBounds(239, 299, 290, 31);
		frmdelete_student_data.getContentPane().add(txtDOB);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 467, 766, 2);
		frmdelete_student_data.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmdelete_student_data.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBounds(56, 496, 135, 38);
		frmdelete_student_data.getContentPane().add(btnBack);
		
		JButton btnDeleteData = new JButton("DELETE DATA");
		btnDeleteData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status=0;
				int rollnumber = Integer.parseInt(txtRollnumber.getText());
				
				jdbcHandling j1 = new jdbcHandling();
				status = j1.delete_data(rollnumber);
				
				if(status == 1) {
					JOptionPane.showMessageDialog(null,"Data Deleted Succesfully");
					txtstudentname.setText(null);
					txtRollnumber.setText(null);
					txtDOB.setText(null);
					txtstandard.setText(null);
					txtmobileno.setText(null);
					txtaddress.setText(null);
				}else {
					JOptionPane.showMessageDialog(null,"Problem in Deleting Data");
				}

			}
		});
		btnDeleteData.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnDeleteData.setBounds(292, 496, 222, 38);
		frmdelete_student_data.getContentPane().add(btnDeleteData);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(598, 496, 135, 38);
		frmdelete_student_data.getContentPane().add(btnExit);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setHorizontalAlignment(SwingConstants.CENTER);
		lblStandard.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblStandard.setBounds(10, 166, 151, 51);
		frmdelete_student_data.getContentPane().add(lblStandard);
		
		txtstandard = new JTextField();
		txtstandard.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtstandard.setColumns(10);
		txtstandard.setBounds(239, 178, 125, 31);
		frmdelete_student_data.getContentPane().add(txtstandard);
		
		txtaddress = new JTextField();
		txtaddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtaddress.setColumns(10);
		txtaddress.setBounds(239, 366, 290, 90);
		frmdelete_student_data.getContentPane().add(txtaddress);
	}
}
