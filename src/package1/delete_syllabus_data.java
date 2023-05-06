package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class delete_syllabus_data {

	private JFrame frmSvemSchoolMurbad;
	private JTextField textField_no;
	private JTextField textField_sci;
	private JTextField textField_maths;
	private JTextField textField_eng;
	private JTextField textField_hindi;
	private JTextField textField_sst;
	private JTextField textField_marathi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete_syllabus_data window = new delete_syllabus_data();
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
	public delete_syllabus_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSvemSchoolMurbad = new JFrame();
		frmSvemSchoolMurbad.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmSvemSchoolMurbad.setTitle("S.V.E.M School Murbad");
		frmSvemSchoolMurbad.setBounds(100, 100, 724, 578);
		frmSvemSchoolMurbad.setLocationRelativeTo(null);
		frmSvemSchoolMurbad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSvemSchoolMurbad.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter chapter no ");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 19, 246, 36);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel);
		
		textField_sci = new JTextField();
		textField_sci.setColumns(10);
		textField_sci.setBounds(172, 94, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_sci);
		
		textField_maths = new JTextField();
		textField_maths.setColumns(10);
		textField_maths.setBounds(172, 161, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_maths);
		
		textField_eng = new JTextField();
		textField_eng.setColumns(10);
		textField_eng.setBounds(172, 223, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_eng);
		
		textField_hindi = new JTextField();
		textField_hindi.setColumns(10);
		textField_hindi.setBounds(172, 284, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_hindi);
		
		textField_sst = new JTextField();
		textField_sst.setColumns(10);
		textField_sst.setBounds(172, 345, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_sst);
		
		textField_marathi = new JTextField();
		textField_marathi.setColumns(10);
		textField_marathi.setBounds(172, 400, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_marathi);
		
		textField_no = new JTextField();
		textField_no.setBounds(260, 19, 96, 32);
		frmSvemSchoolMurbad.getContentPane().add(textField_no);
		textField_no.setColumns(10);
		
		JComboBox comboBox_std = new JComboBox();
		comboBox_std.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_std.setModel(new DefaultComboBoxModel(new String[] {"8th", "9th", "10th"}));
		comboBox_std.setBounds(481, 24, 96, 21);
		frmSvemSchoolMurbad.getContentPane().add(comboBox_std);
		
		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String std;
				int chapter_no;
				chapter_no = Integer.parseInt(textField_no.getText());
				std = (String) comboBox_std.getSelectedItem();
				
				ResultSet result;
				jdbcHandling j1 = new jdbcHandling();
				
				if(std == "8th") {
					result = j1.get_result_row_8(chapter_no);
					try {
						while(result.next()) {
							textField_sci.setText(result.getString(2));
							textField_maths.setText(result.getString(3));
							textField_eng.setText(result.getString(4));
							textField_hindi.setText(result.getString(5));
							textField_sst.setText(result.getString(6));
							textField_marathi.setText(result.getString(7));
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				else if(std == "9th") {
					result = j1.get_result_row_9(chapter_no);
					try {
						while(result.next()) {
							textField_sci.setText(result.getString(2));
							textField_maths.setText(result.getString(3));
							textField_eng.setText(result.getString(4));
							textField_hindi.setText(result.getString(5));
							textField_sst.setText(result.getString(6));
							textField_marathi.setText(result.getString(7));
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(std == "10th") {
					result = j1.get_result_row_10(chapter_no);
					try {
						while(result.next()) {
							textField_sci.setText(result.getString(2));
							textField_maths.setText(result.getString(3));
							textField_eng.setText(result.getString(4));
							textField_hindi.setText(result.getString(5));
							textField_sst.setText(result.getString(6));
							textField_marathi.setText(result.getString(7));
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(587, 26, 113, 34);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 82, 690, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("SCIENCE");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 94, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MATHS");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(21, 161, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ENGLISH");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(20, 220, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("HINDI");
		lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(21, 281, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("SST");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1.setBounds(20, 339, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("MARATHI");
		lblNewLabel_1_2_1_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2.setBounds(21, 397, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_2_1_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 450, 690, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator_1);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchoolMurbad.setVisible(false);
			}
		});
		btnback.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnback.setBounds(53, 483, 113, 36);
		frmSvemSchoolMurbad.getContentPane().add(btnback);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String std , sci,maths,english,hindi,sst,marathi;
				int status=0;
				int chapter_no;
				std = (String) comboBox_std.getSelectedItem();
				
				chapter_no = Integer.parseInt(textField_no.getText());
				
				sci= textField_sci.getText();
				maths=textField_maths.getText();
				english=textField_eng.getText();
				hindi = textField_hindi.getText();
				sst = textField_sst.getText();
				marathi=textField_marathi.getText();
				
				jdbcHandling j1 = new jdbcHandling();
				
				if(std == "8th") {
					status = j1.delete_8(chapter_no);
				}else if(std == "9th") {
					status = j1.delete_9(chapter_no);
				}else if ( std == "10th") {
					status = j1.delete_10(chapter_no);
				}
				
				if(status == 1) {
					JOptionPane.showMessageDialog(null,"data deleted successfully");
				}else {
					JOptionPane.showMessageDialog(null, "problem in deleting data");
				}
				
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDelete.setBounds(300, 483, 113, 36);
		frmSvemSchoolMurbad.getContentPane().add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(545, 483, 113, 36);
		frmSvemSchoolMurbad.getContentPane().add(btnExit);
		
		
		JLabel lblNewLabel_2 = new JLabel("standard");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(376, 19, 108, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_2);
	}

}
