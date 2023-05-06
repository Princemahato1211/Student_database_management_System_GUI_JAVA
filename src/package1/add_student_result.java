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
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class add_student_result {

	private JFrame frmSvemSchoolMurbad;
	private JTextField textField_rollnumber;
	private JTextField textField_sci;
	private JTextField textField_maths;
	private JTextField textField_eng;
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
					add_student_result window = new add_student_result();
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
	public add_student_result() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSvemSchoolMurbad = new JFrame();
		frmSvemSchoolMurbad.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmSvemSchoolMurbad.setTitle("S.V.E.M  School  Murbad");
		frmSvemSchoolMurbad.setBounds(100, 100, 851, 671);
		frmSvemSchoolMurbad.setLocationRelativeTo(null);
		frmSvemSchoolMurbad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSvemSchoolMurbad.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Roll Number");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblNewLabel.setBounds(23, 80, 248, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel);
		
		JLabel lblStandard = new JLabel("standard");
		lblStandard.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblStandard.setBounds(23, 153, 190, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblStandard);
		
		textField_rollnumber = new JTextField();
		textField_rollnumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_rollnumber.setBounds(327, 84, 219, 36);
		frmSvemSchoolMurbad.getContentPane().add(textField_rollnumber);
		textField_rollnumber.setColumns(10);
		
		JComboBox comboBox_std = new JComboBox();
		comboBox_std.setFont(new Font("Arial Black", Font.BOLD, 20));
		comboBox_std.setModel(new DefaultComboBoxModel(new String[] {"8th", "9th", "10th"}));
		comboBox_std.setBounds(327, 153, 203, 36);
		frmSvemSchoolMurbad.getContentPane().add(comboBox_std);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 60, 816, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Add Student Result");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel_1.setBounds(255, 10, 325, 40);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1);
		
		JLabel lblScience = new JLabel("Science");
		lblScience.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblScience.setBounds(23, 237, 145, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblScience);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblMaths.setBounds(25, 304, 110, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblEnglish.setBounds(23, 365, 134, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblEnglish);
		
		textField_sci = new JTextField();
		textField_sci.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_sci.setColumns(10);
		textField_sci.setBounds(215, 240, 129, 33);
		frmSvemSchoolMurbad.getContentPane().add(textField_sci);
		
		textField_maths = new JTextField();
		textField_maths.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_maths.setColumns(10);
		textField_maths.setBounds(215, 302, 129, 33);
		frmSvemSchoolMurbad.getContentPane().add(textField_maths);
		
		textField_eng = new JTextField();
		textField_eng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_eng.setColumns(10);
		textField_eng.setBounds(215, 363, 129, 33);
		frmSvemSchoolMurbad.getContentPane().add(textField_eng);
		
		JLabel lblHindi = new JLabel("Hindi");
		lblHindi.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblHindi.setBounds(446, 237, 100, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblHindi);
		
		JLabel lblSst = new JLabel("S.S.T");
		lblSst.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblSst.setBounds(446, 304, 100, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblSst);
		
		JLabel lblMarathi = new JLabel("Marathi");
		lblMarathi.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblMarathi.setBounds(446, 365, 134, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblMarathi);
		
		textField_hindi = new JTextField();
		textField_hindi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_hindi.setColumns(10);
		textField_hindi.setBounds(612, 235, 129, 33);
		frmSvemSchoolMurbad.getContentPane().add(textField_hindi);
		
		textField_sst = new JTextField();
		textField_sst.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_sst.setColumns(10);
		textField_sst.setBounds(612, 302, 129, 33);
		frmSvemSchoolMurbad.getContentPane().add(textField_sst);
		
		textField_marathi = new JTextField();
		textField_marathi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_marathi.setColumns(10);
		textField_marathi.setBounds(612, 363, 129, 33);
		frmSvemSchoolMurbad.getContentPane().add(textField_marathi);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblTotal.setBounds(23, 430, 112, 40);
		frmSvemSchoolMurbad.getContentPane().add(lblTotal);
		
		textField_total = new JTextField();
		textField_total.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_total.setColumns(10);
		textField_total.setBounds(162, 434, 219, 36);
		frmSvemSchoolMurbad.getContentPane().add(textField_total);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 506, 816, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchoolMurbad.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(23, 549, 129, 31);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton);
		
		JButton btnAddResult = new JButton("ADD RESULT");
		btnAddResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int  english, science, maths, marathi, sst, hindi,total,roll_number;
				String timepass,std;
				
				timepass = textField_eng.getText();
				english = Integer.parseInt(timepass);
				
				timepass= textField_sci.getText();
				science = Integer.parseInt(timepass);
				
				timepass = textField_maths.getText();
				maths = Integer.parseInt(timepass);
				
				timepass= textField_marathi.getText();
				marathi = Integer.parseInt(timepass);
				
				timepass= textField_sst.getText();
				sst = Integer.parseInt(timepass);
				
				timepass= textField_hindi.getText();
				hindi = Integer.parseInt(timepass);
				
				timepass= textField_total.getText();
				total = Integer.parseInt(timepass);
				
				timepass= textField_rollnumber.getText();
				roll_number = Integer.parseInt(timepass);
				
				std = (String) comboBox_std.getSelectedItem();
				
//				System.out.println(english+" "+science+" "+maths+" "+marathi+" "+sst+" "+hindi+" "+total+" "+roll_number+" "+std);
				
				int status =0;
				jdbcHandling j1 = new jdbcHandling();
				status =j1.insert_result(roll_number, std, science, maths, sst, english, hindi, marathi, total);
				if(status == 1) {
					JOptionPane.showMessageDialog(null,"Add Result Successfully");
				}else {
					JOptionPane.showMessageDialog(null," Problem in Adding Result");
				}
				
			}
		});
		btnAddResult.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnAddResult.setBounds(201, 549, 192, 31);
		frmSvemSchoolMurbad.getContentPane().add(btnAddResult);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(654, 549, 129, 31);
		frmSvemSchoolMurbad.getContentPane().add(btnExit);
		
		JButton btnNewButton_1 = new JButton("Get Total");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int  english, science, maths, marathi, sst, hindi,total;
				String timepass;
				
				timepass = textField_eng.getText();
				english = Integer.parseInt(timepass);
				
				timepass= textField_sci.getText();
				science = Integer.parseInt(timepass);
				
				timepass = textField_maths.getText();
				maths = Integer.parseInt(timepass);
				
				timepass= textField_marathi.getText();
				marathi = Integer.parseInt(timepass);
				
				timepass= textField_sst.getText();
				sst = Integer.parseInt(timepass);
				
				timepass= textField_hindi.getText();
				hindi = Integer.parseInt(timepass);
				
				total = english+science+marathi+maths+sst+hindi;
				
				textField_total.setText(Integer.toString(total));
//				System.out.println(total);
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1.setBounds(416, 441, 164, 31);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton_1);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_eng.setText(null);
				textField_hindi.setText(null);
				textField_marathi.setText(null);
				textField_maths.setText(null);
				textField_rollnumber.setText(null);
				textField_sci.setText(null);
				textField_sst.setText(null);
				textField_total.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(448, 549, 156, 31);
		frmSvemSchoolMurbad.getContentPane().add(btnReset);
	}
}
