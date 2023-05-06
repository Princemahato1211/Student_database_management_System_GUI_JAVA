package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class show_syllabus {

	private JFrame frmSvemSchoolMurbad;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					show_syllabus window = new show_syllabus();
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
	public show_syllabus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSvemSchoolMurbad = new JFrame();
		frmSvemSchoolMurbad.setTitle("S.V.E.M School Murbad");
		frmSvemSchoolMurbad.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmSvemSchoolMurbad.setBounds(100, 100, 1086, 712);
		frmSvemSchoolMurbad.setLocationRelativeTo(null);
		frmSvemSchoolMurbad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSvemSchoolMurbad.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 72, 1052, 518);
		frmSvemSchoolMurbad.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"chapter_no", "science", "maths", "english", "hindi", "sst", "marathi"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("SYLLABUS");
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 35));
		lblNewLabel.setBounds(444, 26, 183, 31);
		frmSvemSchoolMurbad.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"8th", "9th", "10th"}));
		comboBox.setBounds(908, 10, 133, 34);
		frmSvemSchoolMurbad.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(908, 620, 119, 31);
		frmSvemSchoolMurbad.getContentPane().add(btnNewButton);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String std = (String) comboBox.getSelectedItem();
				
				if(std == "8th") {
					jdbcHandling j1 = new jdbcHandling();
					ResultSet result= j1.get_syllabus_Table_8();
					
					DefaultTableModel model = new DefaultTableModel();
					String ColumnNames[]={"chapter_no", "science", "maths", "english", "hindi", "sst", "marathi"};
					model.setColumnIdentifiers(ColumnNames);
					
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
							});
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					table.setModel(model);
					table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					
				}else if(std == "9th"){
					jdbcHandling j1 = new jdbcHandling();
					ResultSet result= j1.get_syllabus_Table_9();
					
					DefaultTableModel model = new DefaultTableModel();
					String ColumnNames[]={"chapter_no", "science", "maths", "english", "hindi", "sst", "marathi"};
					model.setColumnIdentifiers(ColumnNames);
					
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
							});
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					table.setModel(model);
					table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					
				}else if(std == "10th") {
					jdbcHandling j1 = new jdbcHandling();
					ResultSet result= j1.get_syllabus_Table_10();
					
					DefaultTableModel model = new DefaultTableModel();
					String ColumnNames[]={"chapter_no", "science", "maths", "english", "hindi", "sst", "marathi"};
					model.setColumnIdentifiers(ColumnNames);
					
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
							});
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					table.setModel(model);
					table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				}
				
				
				
				
				
				
			}
		});
		btnShow.setBounds(493, 620, 119, 31);
		frmSvemSchoolMurbad.getContentPane().add(btnShow);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchoolMurbad.setVisible(false);
			}
		});
		btnBack.setBounds(725, 620, 119, 31);
		frmSvemSchoolMurbad.getContentPane().add(btnBack);
	}
}
