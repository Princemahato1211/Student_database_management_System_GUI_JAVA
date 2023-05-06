package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class show_student_data {

	private JFrame frameShowStudentData;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					show_student_data window = new show_student_data();
					window.frameShowStudentData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public show_student_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameShowStudentData = new JFrame();
		frameShowStudentData.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frameShowStudentData.setTitle("S.V.E.M  School  Murbad");
		
		frameShowStudentData.setSize(1395,785);
		frameShowStudentData.setLocationRelativeTo(null);
		frameShowStudentData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameShowStudentData.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DATA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel.setBounds(525, 10, 331, 54);
		frameShowStudentData.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 84, 1361, 2);
		frameShowStudentData.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 659, 1361, 2);
		frameShowStudentData.getContentPane().add(separator_1);
		
		JButton btnNewButtonback = new JButton("BACK");
		btnNewButtonback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameShowStudentData.setVisible(false);
			}
		});
		btnNewButtonback.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButtonback.setBounds(41, 671, 159, 54);
		frameShowStudentData.getContentPane().add(btnNewButtonback);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jdbcHandling j1 = new jdbcHandling();
				ResultSet result = j1.getTable();
				
				DefaultTableModel model =new DefaultTableModel();
				String columnNames[]= {"ROLL NO", "NAME", "MOBILE NO", "ADDRESS", "GENDER", "STANDARD", "DOB", "BLOOD_GRP"};
				model.setColumnIdentifiers(columnNames);
				
				try {
					while(result.next()) {
						model.addRow(new Object[] {
								result.getInt(1),
								result.getString(2),
								result.getString(3),
								result.getString(4),
								result.getString(5),
								result.getString(6),
								result.getString(7),
								result.getString(8)
								
						});
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				
				
			}
		});
		btnShow.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnShow.setBounds(620, 671, 159, 54);
		frameShowStudentData.getContentPane().add(btnShow);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(1183, 671, 159, 54);
		frameShowStudentData.getContentPane().add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 96, 1361, 552);
		frameShowStudentData.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ROLL NO", "NAME", "MOBILE NO", "ADDRESS", "GENDER", "STANDARD", "DOB", "BLOOD_GRP"
			}
		));
		scrollPane.setViewportView(table);
	}
}
