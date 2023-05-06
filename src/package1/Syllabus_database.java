package package1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Syllabus_database {

	private JFrame framesvem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Syllabus_database window = new Syllabus_database();
					window.framesvem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Syllabus_database() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framesvem = new JFrame();
		framesvem.setTitle("S.V.E.M School Murbad");
		framesvem.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		framesvem.setBounds(100, 100, 669, 547);
		framesvem.setLocationRelativeTo(null);
		framesvem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framesvem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Syllabus databse");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 25));
		lblNewLabel.setBounds(200, 10, 255, 36);
        framesvem.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_syllabus_8.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(42, 129, 146, 62);
		framesvem.getContentPane().add(btnNewButton);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show_syllabus.main(null);
			}
		});
		btnShow.setForeground(Color.DARK_GRAY);
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnShow.setBounds(235, 275, 158, 45);
		framesvem.getContentPane().add(btnShow);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_syllabus.main(null);
			}
		});
		btnUpdate.setForeground(Color.DARK_GRAY);
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnUpdate.setBounds(247, 129, 146, 62);
		framesvem.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete_syllabus_data.main(null);
			}
		});
		btnDelete.setForeground(Color.DARK_GRAY);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDelete.setBounds(444, 129, 146, 62);
		framesvem.getContentPane().add(btnDelete);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 423, 635, 2);
		framesvem.getContentPane().add(separator);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.setBounds(501, 441, 112, 36);
		framesvem.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("BACK");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framesvem.setVisible(false);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2_1.setBounds(340, 441, 112, 36);
		framesvem.getContentPane().add(btnNewButton_2_1);
	}

}
