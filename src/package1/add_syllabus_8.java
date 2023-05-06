package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add_syllabus_8 {

	private JFrame frmSvemSchoolMurbad;
	private JTextField textField_no;
	private JTextField textField_sci;
	private JTextField textField_maths;
	private JTextField textField__eng;
	private JTextField textField_hindi;
	private JTextField textField__sst;
	private JTextField textField_marathi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_syllabus_8 window = new add_syllabus_8();
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
	public add_syllabus_8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSvemSchoolMurbad = new JFrame();
		frmSvemSchoolMurbad.setTitle("S.V.E.M School Murbad");
		frmSvemSchoolMurbad.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmSvemSchoolMurbad.setBounds(100, 100, 668, 684);
		frmSvemSchoolMurbad.setLocationRelativeTo(null);
		frmSvemSchoolMurbad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSvemSchoolMurbad.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Chapter No");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel.setBounds(28, 97, 288, 35);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel);
		
		textField_no = new JTextField();
		textField_no.setBounds(311, 104, 128, 33);
		frmSvemSchoolMurbad.getContentPane().add(textField_no);
		textField_no.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("SCIENCE");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(28, 167, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MATHS");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(28, 236, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ENGLISH");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(28, 311, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_2);
		
		textField_sci = new JTextField();
		textField_sci.setBounds(159, 173, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_sci);
		textField_sci.setColumns(10);
		
		textField_maths = new JTextField();
		textField_maths.setColumns(10);
		textField_maths.setBounds(159, 239, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_maths);
		
		textField__eng = new JTextField();
		textField__eng.setColumns(10);
		textField__eng.setBounds(159, 311, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField__eng);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("HINDI");
		lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(28, 380, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("SST");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1.setBounds(28, 447, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("MARATHI");
		lblNewLabel_1_2_1_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2.setBounds(28, 510, 113, 33);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_2_1_2);
		
		textField_hindi = new JTextField();
		textField_hindi.setColumns(10);
		textField_hindi.setBounds(159, 380, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_hindi);
		
		textField__sst = new JTextField();
		textField__sst.setColumns(10);
		textField__sst.setBounds(159, 450, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField__sst);
		
		textField_marathi = new JTextField();
		textField_marathi.setColumns(10);
		textField_marathi.setBounds(159, 516, 376, 30);
		frmSvemSchoolMurbad.getContentPane().add(textField_marathi);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 562, 632, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchoolMurbad.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(46, 593, 113, 30);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(494, 593, 113, 30);
		frmSvemSchoolMurbad.getContentPane().add(btnExit);
		
		JComboBox comboBox_std = new JComboBox();
		comboBox_std.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_std.setModel(new DefaultComboBoxModel(new String[] {"8th", "9th", "10th"}));
		comboBox_std.setBounds(287, 39, 140, 30);
		frmSvemSchoolMurbad.getContentPane().add(comboBox_std);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String std , sci,maths,english,hindi,sst,marathi;
				int status , chapter_no;
				std = (String) comboBox_std.getSelectedItem();
				
				chapter_no = Integer.parseInt(textField_no.getText());
				
				sci= textField_sci.getText();
				maths=textField_maths.getText();
				english=textField__eng.getText();
				hindi = textField_hindi.getText();
				sst = textField__sst.getText();
				marathi=textField_marathi.getText();
				
				jdbcHandling j1 = new jdbcHandling();
				
				if(std == "8th") {
					status = j1.add_syllabus_8(chapter_no, sci, maths, english, hindi, sst, marathi);
					if(status == 1) {
						JOptionPane.showMessageDialog(null, "syllabus Add Successfully of 8th std");
					}else {
						JOptionPane.showMessageDialog(null, "problem in adding syllabus data");
					}
				}else if(std =="9th") {
					status = j1.add_syllabus_9(chapter_no, sci, maths, english, hindi, sst, marathi);
					if(status == 1) {
						JOptionPane.showMessageDialog(null, "syllabus Add Successfully of 9th std");
					}else {
						JOptionPane.showMessageDialog(null, "problem in adding syllabus data");
					}
				}else if(std == "10th") {
					status = j1.add_syllabus_10(chapter_no, sci, maths, english, hindi, sst, marathi);
					if(status == 1) {
						JOptionPane.showMessageDialog(null, "syllabus Add Successfully of 10th std");
					}else {
						JOptionPane.showMessageDialog(null, "problem in adding syllabus data");
					}
				}
				
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSave.setBounds(203, 593, 113, 30);
		frmSvemSchoolMurbad.getContentPane().add(btnSave);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 85, 632, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Select Standard");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Algerian", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(28, 39, 234, 35);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_2);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField__eng.setText(null);
				textField__sst.setText(null);
				textField_hindi.setText(null);
				textField_marathi.setText(null);
				textField_maths.setText(null);
				textField_no.setText(null);
				textField_sci.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(347, 593, 113, 30);
		frmSvemSchoolMurbad.getContentPane().add(btnReset);
	}
}
