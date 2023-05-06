package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class update_syllabus {

	private JFrame frmSvemSchoolMurbad;
	private JTextField textField_no;
	private JTextField textField_sci;
	private JTextField textField_maths;
	private JTextField textField_english;
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
					update_syllabus window = new update_syllabus();
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
	public update_syllabus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSvemSchoolMurbad = new JFrame();
		frmSvemSchoolMurbad.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmSvemSchoolMurbad.setTitle("S.V.E.M School Murbad");
		frmSvemSchoolMurbad.setBounds(100, 100, 734, 642);
		frmSvemSchoolMurbad.setLocationRelativeTo(null);
		frmSvemSchoolMurbad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSvemSchoolMurbad.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter chapter no ");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel.setBounds(20, 10, 246, 36);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel);
		
		textField_no = new JTextField();
		textField_no.setColumns(10);
		textField_no.setBounds(272, 14, 96, 32);
		frmSvemSchoolMurbad.getContentPane().add(textField_no);
		
		JLabel lblNewLabel_2 = new JLabel("standard");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(20, 72, 171, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox_std = new JComboBox();
		comboBox_std.setModel(new DefaultComboBoxModel(new String[] {"8th", "9th", "10th"}));
		comboBox_std.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_std.setBounds(272, 68, 131, 35);
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
							textField_english.setText(result.getString(4));
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
							textField_english.setText(result.getString(4));
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
							textField_english.setText(result.getString(4));
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
		btnNewButton.setBounds(528, 69, 113, 34);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 133, 697, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("SCIENCE");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 157, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MATHS");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(20, 215, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ENGLISH");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(20, 278, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("HINDI");
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(20, 335, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("SST");
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(20, 399, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("MARATHI");
		lblNewLabel_1_5.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(20, 460, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_5);
		
		textField_sci = new JTextField();
		textField_sci.setColumns(10);
		textField_sci.setBounds(187, 160, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_sci);
		
		textField_maths = new JTextField();
		textField_maths.setColumns(10);
		textField_maths.setBounds(187, 218, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_maths);
		
		textField_english = new JTextField();
		textField_english.setColumns(10);
		textField_english.setBounds(187, 278, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_english);
		
		textField_hindi = new JTextField();
		textField_hindi.setColumns(10);
		textField_hindi.setBounds(187, 335, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_hindi);
		
		textField_sst = new JTextField();
		textField_sst.setColumns(10);
		textField_sst.setBounds(187, 399, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_sst);
		
		textField_marathi = new JTextField();
		textField_marathi.setColumns(10);
		textField_marathi.setBounds(187, 463, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_marathi);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 514, 700, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator_1);
		
		JButton btnexit = new JButton("BACK");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchoolMurbad.setVisible(false);
			}
		});
		btnexit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnexit.setBounds(562, 541, 113, 36);
		frmSvemSchoolMurbad.getContentPane().add(btnexit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String std,sci,maths,eng,hindi, sst,marathi;
				int chapter_no;
				
				chapter_no = Integer.parseInt(textField_no.getText());
				std = (String) comboBox_std.getSelectedItem();
				sci = textField_sci.getText();
				maths = textField_maths.getText();
				eng = textField_english.getText();
				hindi = textField_hindi.getText();
				sst = textField_sst.getText();
				marathi = textField_marathi.getText();				
				
				int status =0;
				jdbcHandling j1 = new jdbcHandling();
				
				if(std == "8th") {
					status = j1.Update_syllabus_8(chapter_no, sci, maths, eng, hindi, sst, marathi);
					textField_english.setText(null);
					textField_hindi.setText(null);
					textField_marathi.setText(null);
					textField_maths.setText(null);
					textField_no.setText(null);
					textField_sci.setText(null);
					textField_sst.setText(null);
					
				}else if(std == "9th") {
					status = j1.Update_syllabus_9(chapter_no, sci, maths, eng, hindi, sst, marathi);
					textField_english.setText(null);
					textField_hindi.setText(null);
					textField_marathi.setText(null);
					textField_maths.setText(null);
					textField_no.setText(null);
					textField_sci.setText(null);
					textField_sst.setText(null);
					
				}else if(std == "10th") {
					status = j1.Update_syllabus_10(chapter_no, sci, maths, eng, hindi, sst, marathi);
					textField_english.setText(null);
					textField_hindi.setText(null);
					textField_marathi.setText(null);
					textField_maths.setText(null);
					textField_no.setText(null);
					textField_sci.setText(null);
					textField_sst.setText(null);
					
				}
							
				if(status == 1) {
					JOptionPane.showMessageDialog(null,"Data Updated Succesfully");
				}else {
					JOptionPane.showMessageDialog(null, "problem in updating data");
				}
				
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUpdate.setBounds(272, 541, 113, 36);
		frmSvemSchoolMurbad.getContentPane().add(btnUpdate);
		
		JButton btnback_2 = new JButton("BACK");
		btnback_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchoolMurbad.setVisible(false);
			}
		});
		btnback_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnback_2.setBounds(30, 541, 113, 36);
		frmSvemSchoolMurbad.getContentPane().add(btnback_2);
	}
}
