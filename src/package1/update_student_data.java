package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

public class update_student_data {

	private JFrame frmupdate_student_data;
	private JTextField txtroll_no;
	private JTextField txtname;
	private JTextField txtmobileno;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update_student_data window = new update_student_data();
					window.frmupdate_student_data.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public update_student_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmupdate_student_data = new JFrame();
		frmupdate_student_data.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmupdate_student_data.setTitle("S.V.E.M  School  Murbad");
		frmupdate_student_data.setBounds(100, 100, 809, 603);
		frmupdate_student_data.setLocationRelativeTo(null);
		frmupdate_student_data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmupdate_student_data.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER ROLL NUMBER ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 10, 438, 45);
		frmupdate_student_data.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("GET DATA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rollnumber = Integer.parseInt(txtroll_no.getText());
				
				ResultSet result;
				jdbcHandling j1 = new jdbcHandling();
				result = j1.getrow(rollnumber);
				
				try {
					while(result.next()) {
						txtname.setText(result.getString(2));
						txtmobileno.setText(result.getString(3));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton.setBounds(638, 10, 147, 34);
		frmupdate_student_data.getContentPane().add(btnNewButton);
		
		txtroll_no = new JTextField();
		txtroll_no.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtroll_no.setBounds(458, 10, 117, 31);
		frmupdate_student_data.getContentPane().add(txtroll_no);
		txtroll_no.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 65, 775, 2);
		frmupdate_student_data.getContentPane().add(separator);
		
		txtname = new JTextField();
		txtname.setBounds(325, 77, 438, 38);
		frmupdate_student_data.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 70, 282, 45);
		frmupdate_student_data.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("MOBILE NO");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(10, 133, 201, 45);
		frmupdate_student_data.getContentPane().add(lblNewLabel_1_1_1);
		
		txtmobileno = new JTextField();
		txtmobileno.setColumns(10);
		txtmobileno.setBounds(325, 140, 438, 38);
		frmupdate_student_data.getContentPane().add(txtmobileno);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("GENDER");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(25, 306, 133, 45);
		frmupdate_student_data.getContentPane().add(lblNewLabel_1_2_1);
		
		JRadioButton rdbtnmale = new JRadioButton("male");
		buttonGroup.add(rdbtnmale);
		rdbtnmale.setFont(new Font("Arial Black", Font.BOLD, 20));
		rdbtnmale.setBounds(175, 318, 86, 21);
		frmupdate_student_data.getContentPane().add(rdbtnmale);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 20));
		rdbtnFemale.setBounds(263, 316, 105, 25);
		frmupdate_student_data.getContentPane().add(rdbtnFemale);
		
		JComboBox comboBoxbloodgrp = new JComboBox();
		comboBoxbloodgrp.setModel(new DefaultComboBoxModel(new String[] {"AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-"}));
		comboBoxbloodgrp.setFont(new Font("Arial Black", Font.BOLD, 20));
		comboBoxbloodgrp.setBounds(608, 386, 177, 34);
		frmupdate_student_data.getContentPane().add(comboBoxbloodgrp);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("standard");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_2_1_1.setBounds(421, 302, 168, 45);
		frmupdate_student_data.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JComboBox comboBoxstd = new JComboBox();
		comboBoxstd.setFont(new Font("Arial Black", Font.BOLD, 20));
		comboBoxstd.setModel(new DefaultComboBoxModel(new String[] {"8th", "9th", "10th"}));
		comboBoxstd.setBounds(608, 309, 177, 34);
		frmupdate_student_data.getContentPane().add(comboBoxstd);
		
		
		JLabel lblNewLabel_1_2 = new JLabel("ADDRESS");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(10, 188, 178, 45);
		frmupdate_student_data.getContentPane().add(lblNewLabel_1_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(206, 387, 186, 33);
		frmupdate_student_data.getContentPane().add(dateChooser);
		
		JTextArea txtarea = new JTextArea();
		txtarea.setBounds(325, 206, 438, 77);
		frmupdate_student_data.getContentPane().add(txtarea);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmupdate_student_data.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1.setBounds(25, 522, 117, 34);
		frmupdate_student_data.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("UPDATE");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rollnumber = Integer.parseInt(txtroll_no.getText());
				
				String name=txtname.getText();
				String mobile = txtmobileno.getText();
				String address = txtarea.getText();
				
				String gender=null;
				if(rdbtnmale.isSelected()) {
					gender = "male";
				}
				if(rdbtnFemale.isSelected()) {
					gender = "female";
				}
				
				String standard;
				standard = (String)comboBoxstd.getSelectedItem();
				
				String blood;
				blood = (String)comboBoxbloodgrp.getSelectedItem();
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String date_of_B = sdf.format(dateChooser.getDate());
				
				int status =0;
				jdbcHandling j1 = new jdbcHandling();
				status = j1.update_insert(rollnumber, name, mobile, address, gender, standard, date_of_B, blood);
				
				if(status == 1) {
					JOptionPane.showMessageDialog(null,"Data Updated Succesfully");
				}else {
					JOptionPane.showMessageDialog(null, "problem in updating data");
				}
				
//				System.out.println(rollnumber);
//				System.out.println(name);
//				System.out.println(mobile);
//				System.out.println(address);
//				System.out.println(gender);
//				System.out.println(standard);
//				System.out.println(blood);
//				System.out.println(date_of_B);
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(443, 522, 146, 34);
		frmupdate_student_data.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("EXIT");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(646, 522, 117, 34);
		frmupdate_student_data.getContentPane().add(btnNewButton_1_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 496, 775, 2);
		frmupdate_student_data.getContentPane().add(separator_1);
		
		
		JLabel lblNewLabel_3_1_1 = new JLabel("BLOOD GROUP");
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(403, 387, 186, 33);
		frmupdate_student_data.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("DATE OF BIRTH");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 383, 186, 40);
		frmupdate_student_data.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1_1_2 = new JButton("RESET");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtname.setText(null);
				txtmobileno.setText(null);
				
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_1_2.setBounds(211, 522, 146, 34);
		frmupdate_student_data.getContentPane().add(btnNewButton_1_1_2);
		
	}
}
