package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Add_Student_Data {

	private JFrame frameAddStudentData;
	private JTextField textFieldname;
	private JTextField textFieldrollno;
	private JTextField textFieldmobile;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Student_Data window = new Add_Student_Data();
					window.frameAddStudentData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_Student_Data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAddStudentData = new JFrame();
		frameAddStudentData.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frameAddStudentData.setTitle("S.V.E.M  School  Murbad");
		frameAddStudentData.setBounds(100, 100, 900, 800);
		frameAddStudentData.setLocationRelativeTo(null);
		frameAddStudentData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAddStudentData.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD STUDENT DATA");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(209, 10, 468, 51);
		frameAddStudentData.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 59, 980, 2);
		frameAddStudentData.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1.setBounds(30, 77, 282, 45);
		frameAddStudentData.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ROLL NO.");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(30, 147, 168, 45);
		frameAddStudentData.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ADDRESS");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(22, 290, 186, 45);
		frameAddStudentData.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("MOBILE NO");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(30, 225, 201, 45);
		frameAddStudentData.getContentPane().add(lblNewLabel_1_1_1);
		
		textFieldname = new JTextField();
		textFieldname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldname.setBounds(340, 77, 462, 40);
		frameAddStudentData.getContentPane().add(textFieldname);
		textFieldname.setColumns(10);
		
		textFieldrollno = new JTextField();
		textFieldrollno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldrollno.setColumns(10);
		textFieldrollno.setBounds(340, 152, 462, 40);
		frameAddStudentData.getContentPane().add(textFieldrollno);
		
		textFieldmobile = new JTextField();
		textFieldmobile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldmobile.setColumns(10);
		textFieldmobile.setBounds(340, 225, 462, 40);
		frameAddStudentData.getContentPane().add(textFieldmobile);
		
		JTextArea textAreaAddress = new JTextArea();
		textAreaAddress.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textAreaAddress.setBounds(344, 308, 532, 98);
		frameAddStudentData.getContentPane().add(textAreaAddress);
		
		JLabel lblNewLabel_2 = new JLabel("DATE OF BIRTH");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(30, 532, 186, 40);
		frameAddStudentData.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(159, 445, 221, 45);
		frameAddStudentData.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnmale = new JRadioButton("MALE");
		buttonGroup.add(rdbtnmale);
		rdbtnmale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnmale.setBounds(6, 6, 83, 21);
		panel.add(rdbtnmale);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnFemale.setBounds(115, 6, 103, 21);
		panel.add(rdbtnFemale);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(242, 539, 186, 33);
		frameAddStudentData.getContentPane().add(dateChooser);
		
		JComboBox comboBoxstd = new JComboBox();
		comboBoxstd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboBoxstd.setModel(new DefaultComboBoxModel(new String[] {"8th", "9th", "10th"}));
		comboBoxstd.setBounds(636, 443, 201, 40);
		frameAddStudentData.getContentPane().add(comboBoxstd);
		
		JComboBox comboBoxbldgrp = new JComboBox();
		comboBoxbldgrp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxbldgrp.setModel(new DefaultComboBoxModel(new String[] {"AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-"}));
		comboBoxbldgrp.setBounds(654, 532, 183, 31);
		frameAddStudentData.getContentPane().add(comboBoxbldgrp);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 657, 866, 2);
		frameAddStudentData.getContentPane().add(separator_1);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frameAddStudentData.setVisible(false);
			}
		});
		btnback.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnback.setBounds(45, 693, 163, 33);
		frameAddStudentData.getContentPane().add(btnback);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldname.getText();
				String address = textAreaAddress.getText();
				String mobileno = textFieldmobile.getText();
				
				String b= textFieldrollno.getText();
				int roll_no = Integer.parseInt(b);
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String date_of_B = sdf.format(dateChooser.getDate());
				
				String gender = null;
				if(rdbtnmale.isSelected()) {
					gender = "Male";
				}else if(rdbtnFemale.isSelected()) {
					gender = "Female";
				}
				
				String standard;
				standard = (String) comboBoxstd.getSelectedItem();
				
				
				String bld_grp;
				bld_grp = (String) comboBoxbldgrp.getSelectedItem();
				
				
//				System.out.println(name);
//				System.out.println(address);
//				System.out.println(mobileno);
//				System.out.println(roll_no);
//				System.out.println(gender);
//				System.out.println(date_of_B);				
//				System.out.println(standard);
//				System.out.println(bld_grp);
				
				int status=0;
				jdbcHandling j1 = new jdbcHandling();
				status = j1.insertdata(roll_no, name, mobileno, address, gender, standard, date_of_B, bld_grp);
				if(status == 1) {
					JOptionPane.showMessageDialog(null,"add data Succesfully");
				}else {
					JOptionPane.showMessageDialog(null,"problem in adding a result");
				}
				
			}
		});
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnSave.setBounds(255, 693, 163, 33);
		frameAddStudentData.getContentPane().add(btnSave);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnExit.setBounds(659, 693, 163, 33);
		frameAddStudentData.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaAddress.setText(null);
				textFieldmobile.setText(null);
				textFieldname.setText(null);
				textFieldrollno.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnReset.setBounds(458, 693, 163, 33);
		frameAddStudentData.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_3 = new JLabel("GENDER");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3.setBounds(31, 443, 108, 33);
		frameAddStudentData.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("STANDARD");
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(458, 443, 145, 33);
		frameAddStudentData.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("BLOOD GROUP");
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(458, 532, 186, 33);
		frameAddStudentData.getContentPane().add(lblNewLabel_3_1_1);
	}
}
