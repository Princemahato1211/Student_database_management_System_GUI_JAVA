package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class result_database {

	private JFrame frmSvemSchoolMurbad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					result_database window = new result_database();
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
	public result_database() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSvemSchoolMurbad = new JFrame();
		frmSvemSchoolMurbad.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmSvemSchoolMurbad.setTitle("S.V.E.M  School  Murbad");
		frmSvemSchoolMurbad.setBounds(100, 100, 1117, 824);
		frmSvemSchoolMurbad.setLocationRelativeTo(null);
		frmSvemSchoolMurbad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSvemSchoolMurbad.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Result Database");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel.setBounds(392, 10, 385, 47);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 67, 1149, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator);
		
		JButton btn_add_result = new JButton("New button");
		btn_add_result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_student_result.main(null);
			}
		});
		btn_add_result.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\images.jpg"));
		btn_add_result.setBounds(32, 104, 235, 226);
		frmSvemSchoolMurbad.getContentPane().add(btn_add_result);
		
		JButton btndelete_result = new JButton("New button");
		btndelete_result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete_student_result.main(null);
			}
		});
		btndelete_result.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download_3.jfif"));
		btndelete_result.setBounds(407, 106, 250, 222);
		frmSvemSchoolMurbad.getContentPane().add(btndelete_result);
		
		JButton btnupdate_result = new JButton("New button");
		btnupdate_result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_result_data.main(null);
			}
		});
		btnupdate_result.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).png"));
		btnupdate_result.setBounds(794, 109, 250, 217);
		frmSvemSchoolMurbad.getContentPane().add(btnupdate_result);
		
		JLabel lblNewLabel_1 = new JLabel("Add Result");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(56, 353, 181, 32);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("delete result data");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(424, 356, 217, 27);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Update Result Data");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(804, 356, 233, 27);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnstudent_result = new JButton("New button");
		btnstudent_result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show_student_result.main(null);
			}
		});
		btnstudent_result.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\images.jfif"));
		btnstudent_result.setBounds(192, 414, 256, 222);
		frmSvemSchoolMurbad.getContentPane().add(btnstudent_result);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Students Result");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(212, 646, 217, 27);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_2);
		
		JButton btnstudent_report_card = new JButton("New button");
		btnstudent_report_card.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Individual_report.main(null);
			}
		});
		btnstudent_report_card.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\images (2).png"));
		btnstudent_report_card.setBounds(627, 414, 250, 222);
		frmSvemSchoolMurbad.getContentPane().add(btnstudent_report_card);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Student individual Report Card");
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBounds(584, 646, 367, 27);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 691, 1083, 2);
		frmSvemSchoolMurbad.getContentPane().add(separator_1);
		
		JButton btnNewButton_4 = new JButton("BACK");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchoolMurbad.setVisible(false);
			}
		});
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_4.setBounds(642, 720, 135, 40);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("EXIT");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_4_1.setBounds(886, 720, 135, 40);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton_4_1);
	}
}
