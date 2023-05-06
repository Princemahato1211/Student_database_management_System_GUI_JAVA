package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class show_student_result {

	private JFrame frmSvemSchholMurbad;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					show_student_result window = new show_student_result();
					window.frmSvemSchholMurbad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public show_student_result() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSvemSchholMurbad = new JFrame();
		frmSvemSchholMurbad.setTitle("S.V.E.M Schhol Murbad");
		frmSvemSchholMurbad.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\coding file\\java coding\\java assignment\\MainProject\\src\\Image\\download (1).jpg"));
		frmSvemSchholMurbad.setBounds(100, 100, 1450, 800);
		frmSvemSchholMurbad.setLocationRelativeTo(null);
		frmSvemSchholMurbad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSvemSchholMurbad.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 96, 1364, 580);
		frmSvemSchholMurbad.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.RED);
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Roll Number", "Standard", "Science", "Maths", "English", "Hindi", "S.S.T", "Marathi", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 72, 1416, 2);
		frmSvemSchholMurbad.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Student Result ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel.setBounds(546, 10, 344, 51);
		frmSvemSchholMurbad.getContentPane().add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 693, 1406, 2);
		frmSvemSchholMurbad.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("SHOW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jdbcHandling j1 = new jdbcHandling();
				ResultSet result= j1.get_result_table();
				
				DefaultTableModel model = new DefaultTableModel();
				String ColumnNames[]={"Roll Number", "Standard", "Science", "Maths", "English", "Hindi", "S.S.T", "Marathi", "Total"};
				model.setColumnIdentifiers(ColumnNames);
				
				try {
					while(result.next()) {
						model.addRow(new Object[] {
								result.getInt(1),
								result.getString(2),
								result.getInt(3),
								result.getInt(4),
								result.getInt(5),
								result.getInt(6),
								result.getInt(7),
								result.getInt(8),
								result.getInt(9)
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
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 25));
		btnNewButton.setBounds(645, 705, 145, 35);
		frmSvemSchholMurbad.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSvemSchholMurbad.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 25));
		btnBack.setBounds(61, 705, 145, 35);
		frmSvemSchholMurbad.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 25));
		btnExit.setBounds(1191, 705, 145, 35);
		frmSvemSchholMurbad.getContentPane().add(btnExit);
	}
}
