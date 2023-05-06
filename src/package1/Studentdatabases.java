package package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import java.awt.datatransfer.Clipboard;
import java.awt.font.TextAttribute;
import java.awt.im.InputMethodHighlight;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.PrintJob;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Studentdatabases {

	private JFrame frmStudentdatabases;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentdatabases window = new Studentdatabases();
					window.frmStudentdatabases.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Studentdatabases() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentdatabases = new JFrame();
		frmStudentdatabases.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmStudentdatabases.setTitle("S.V.E.M  School  Murbad");
		
		frmStudentdatabases.setSize(1395,785);
		frmStudentdatabases.setLocationRelativeTo(null);
		frmStudentdatabases.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentdatabases.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Data Management System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(452, 0, 617, 43);
		frmStudentdatabases.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 54, 1502, 2);
		frmStudentdatabases.getContentPane().add(separator);
		
		JButton btnaddstudentdata = new JButton("");
		btnaddstudentdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Student_Data.main(null);
			}
		});
		btnaddstudentdata.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download.png"));
		btnaddstudentdata.setBounds(87, 66, 250, 242);
		frmStudentdatabases.getContentPane().add(btnaddstudentdata);
		
		JButton btnshowdata = new JButton("");
		btnshowdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show_student_data.main(null);
			}
		});
		btnshowdata.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\images.png"));
		btnshowdata.setBounds(578, 66, 250, 242);
		frmStudentdatabases.getContentPane().add(btnshowdata);
		
		JButton btnupdatestudentdata = new JButton("");
		btnupdatestudentdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_student_data.main(null);
				
			}
		});
		btnupdatestudentdata.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\25599-8-update-button-file-thumb.png"));
		btnupdatestudentdata.setBounds(1055, 66, 250, 242);
		frmStudentdatabases.getContentPane().add(btnupdatestudentdata);
		
		JLabel lblNewLabel_1 = new JLabel("add Studentdata");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(87, 318, 250, 22);
		frmStudentdatabases.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("show student data");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(578, 318, 250, 22);
		frmStudentdatabases.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(828, 318, 192, 22);
		frmStudentdatabases.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("update student data");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(1065, 318, 240, 22);
		frmStudentdatabases.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnstudentresult = new JButton("");
		btnstudentresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_database.main(null);
			}
		});
		btnstudentresult.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\387-3871730_results-images-in-collection-get-result-hd-png.png"));
		btnstudentresult.setBounds(578, 362, 250, 242);
		frmStudentdatabases.getContentPane().add(btnstudentresult);
		
		JButton btnsyllabus = new JButton("");
		btnsyllabus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Syllabus_database.main(null);
			}
		});
		btnsyllabus.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\Syllabus.png"));
		btnsyllabus.setBounds(1055, 362, 250, 242);
		frmStudentdatabases.getContentPane().add(btnsyllabus);
		
		JButton btndeletestudentdata_5 = new JButton("");
		btndeletestudentdata_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete_student_data.main(null);
			}
		});
		btndeletestudentdata_5.setIcon(new ImageIcon("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\images (1).png"));
		btndeletestudentdata_5.setBounds(87, 362, 250, 242);
		frmStudentdatabases.getContentPane().add(btndeletestudentdata_5);
		
		JLabel lblNewLabel_1_3 = new JLabel("delete Studentdata");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(87, 614, 250, 22);
		frmStudentdatabases.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("result data");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(578, 614, 248, 22);
		frmStudentdatabases.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Syllabus");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(1055, 614, 248, 22);
		frmStudentdatabases.getContentPane().add(lblNewLabel_1_4_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 660, 1361, 2);
		frmStudentdatabases.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentdatabases.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnNewButton.setBounds(1005, 683, 135, 43);
		frmStudentdatabases.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnExit.setBounds(1221, 683, 135, 43);
		frmStudentdatabases.getContentPane().add(btnExit);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentdatabases.setVisible(false);
			}
		});
		btnLogout.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnLogout.setBounds(61, 683, 184, 43);
		frmStudentdatabases.getContentPane().add(btnLogout);
		
	}
}
