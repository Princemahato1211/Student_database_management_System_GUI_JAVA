package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcHandling {
	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt;
	ResultSet result;
	
	public jdbcHandling() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("we got a connection");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println("we didn,t get a connection");
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdata", "root" ,"prince@1a");
//			System.out.println("we got a driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println("we didn,t get a driver");
		}
	}
	
	int insertdata(int n,String name,String mobileno,String address,String gender,String standard , String dob,String blood_grp){
		int status =0;
		
		try {
			pstmt = con.prepareStatement("insert into datastudent(roll_no, name, mobile_no, address, gender, standard , DOB, blood_grp) values(?,?,?,?,?,?,?,?)");
			pstmt.setInt(1,n);
			pstmt.setString(2,name);
			pstmt.setString(3,mobileno);
			pstmt.setString(4,address);
			pstmt.setString(5,gender);
			pstmt.setString(6,standard);
			pstmt.setString(7,dob);
			pstmt.setString(8, blood_grp);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	ResultSet getTable() {
		
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			result = stmt.executeQuery("select * from datastudent");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	ResultSet getrow(int n) {
		
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query = "select * from datastudent where roll_no="+n;
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	int update_insert(int roll,String name,String mobile,String address,String gender , String std, String dob, String blood_grp) {
		int status=0;
		
		try {
			pstmt=con.prepareStatement("update datastudent set roll_no=?,name=?,mobile_no=?,address=?,gender=?,standard=?,DOB=?,blood_grp=? where roll_no="+roll);
			pstmt.setInt(1,roll);
			pstmt.setString(2, name);
			pstmt.setString(3, mobile);
			pstmt.setString(4, address);
			pstmt.setString(5, gender);
			pstmt.setString(6, std);
			pstmt.setString(7, dob);
			pstmt.setString(8, blood_grp);
			
			status = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	
	int delete_data(int n) {
		int status =0;
		
		try {
			pstmt = con.prepareStatement("delete from datastudent where roll_no ="+n);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	int insert_result(int roll, String std, int sci, int maths, int sst, int english , int hindi, int marathi, int total) {
		int status =0;
		
		try {
			pstmt = con.prepareStatement("insert into result_data(roll_number,standard,science,maths,sst,english,hindi,marathi,total) values(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, roll);
			pstmt.setString(2,std);
			pstmt.setInt(3,sci);
			pstmt.setInt(4,maths);
			pstmt.setInt(5,sst);
			pstmt.setInt(6,english);
			pstmt.setInt(7,hindi);
			pstmt.setInt(8,marathi);
			pstmt.setInt(9,total);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	ResultSet get_result_row(int n) {
		
		try {
			stmt= con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query= "select * from result_data where roll_number="+n;
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return result;
	}
	
	int Update_result_data(int n, String std, int sci, int maths, int english, int hindi, int sst, int marathi, int total) {
		int status =0;
		try {
			pstmt = con.prepareStatement("update result_data set roll_number=?,standard=?,science=?,maths=?,sst=?,english=?,hindi=?,marathi=?,total=? where roll_number= "+n);
			pstmt.setInt(1,n);
			pstmt.setString(2, std);
			pstmt.setInt(3, sci);
			pstmt.setInt(4,maths);
			pstmt.setInt(5, english);
			pstmt.setInt(6, hindi);
			pstmt.setInt(7, sst);
			pstmt.setInt(8, marathi);
			pstmt.setInt(9, total);
			
			status = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	int delete_result_data(int n) {
		int status =0;
		
		try {
			pstmt = con.prepareStatement("delete from result_data where roll_number ="+n);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	ResultSet get_result_table() {
		
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			result = stmt.executeQuery("select * from result_data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	int add_syllabus_8(int n,String sci, String maths, String eng, String hindi, String sst, String marathi) {
		int status =0;
		
		try {
			pstmt=con.prepareStatement("insert into std_eight(chapter_no,science,maths,english,hindi,sst,marathi) values(?,?,?,?,?,?,?)");
			pstmt.setInt(1,n);
			pstmt.setString(2,sci);
			pstmt.setString(3,marathi);
			pstmt.setString(4,eng);
			pstmt.setString(5,hindi);
			pstmt.setString(6,sst);
			pstmt.setString(7,marathi);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	int add_syllabus_10(int n,String sci, String maths, String eng, String hindi, String sst, String marathi) {
		int status =0;
		
		try {
			pstmt=con.prepareStatement("insert into std_ten(chapter_no,science,maths,english,hindi,sst,marathi) values(?,?,?,?,?,?,?)");
			pstmt.setInt(1,n);
			pstmt.setString(2,sci);
			pstmt.setString(3,marathi);
			pstmt.setString(4,eng);
			pstmt.setString(5,hindi);
			pstmt.setString(6,sst);
			pstmt.setString(7,marathi);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	int add_syllabus_9(int n,String sci, String maths, String eng, String hindi, String sst, String marathi) {
		int status =0;
		
		try {
			pstmt=con.prepareStatement("insert into std_nine(chapter_no,science,maths,english,hindi,sst,marathi) values(?,?,?,?,?,?,?)");
			pstmt.setInt(1,n);
			pstmt.setString(2,sci);
			pstmt.setString(3,marathi);
			pstmt.setString(4,eng);
			pstmt.setString(5,hindi);
			pstmt.setString(6,sst);
			pstmt.setString(7,marathi);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	int delete_8(int n) {
		int status =0;
		
		try {
			pstmt = con.prepareStatement("delete from std_eight where chapter_no ="+n);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	int delete_9(int n) {
		int status =0;
		
		try {
			pstmt = con.prepareStatement("delete from std_nine where chapter_no ="+n);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	int delete_10(int n) {
		int status =0;
		
		try {
			pstmt = con.prepareStatement("delete from std_ten where chapter_no ="+n);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
    ResultSet get_result_row_8(int n) {
		
		try {
			stmt= con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query= "select * from std_eight where chapter_no="+n;
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return result;
	}
    
ResultSet get_result_row_9(int n) {
		
		try {
			stmt= con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query= "select * from std_nine where chapter_no="+n;
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return result;
	}

ResultSet get_result_row_10(int n) {
	
	try {
		stmt= con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String query= "select * from std_ten where chapter_no="+n;
	
	try {
		result = stmt.executeQuery(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	return result;
}

int Update_syllabus_8(int n, String sci,String maths, String eng, String hindi, String sst, String marathi){
	int status =0;
	try {
		pstmt = con.prepareStatement("update std_eight set chapter_no=?, science=?,maths=?, english=?, hindi=?,sst=?, marathi=?  where chapter_no= "+n);
		pstmt.setInt(1,n);
		pstmt.setString(2, sci);
		pstmt.setString(3, maths);
		pstmt.setString(4, eng);
		pstmt.setString(5, hindi);
		pstmt.setString(6, sst);
		pstmt.setString(7, marathi);
		
		status = pstmt.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return status;
}

int Update_syllabus_10(int n, String sci,String maths, String eng, String hindi, String sst, String marathi){
	int status =0;
	try {
		pstmt = con.prepareStatement("update std_ten set chapter_no=?, science=?,maths=?,english=?, hindi=?,sst=?, marathi=?  where chapter_no= "+n);
		pstmt.setInt(1,n);
		pstmt.setString(2, sci);
		pstmt.setString(3, maths);
		pstmt.setString(4, eng);
		pstmt.setString(5, hindi);
		pstmt.setString(6, sst);
		pstmt.setString(7, marathi);
		
		status = pstmt.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return status;
}

int Update_syllabus_9(int n, String sci,String maths, String eng, String hindi, String sst, String marathi){
	int status =0;
	try {
		pstmt = con.prepareStatement("update std_nine set chapter_no=?, science=?,maths=?,english=?, hindi=?,sst=?, marathi=?  where chapter_no= "+n);
		pstmt.setInt(1,n);
		pstmt.setString(2, sci);
		pstmt.setString(3, maths);
		pstmt.setString(4, eng);
		pstmt.setString(5, hindi);
		pstmt.setString(6, sst);
		pstmt.setString(7, marathi);
		
		status = pstmt.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return status;
}


ResultSet get_syllabus_Table_8() {
	
	try {
		stmt=con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		result = stmt.executeQuery("select * from std_eight");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return result;
}

ResultSet get_syllabus_Table_9() {
	
	try {
		stmt=con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		result = stmt.executeQuery("select * from std_nine");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return result;
}

ResultSet get_syllabus_Table_10() {
	
	try {
		stmt=con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		result = stmt.executeQuery("select * from std_ten");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return result;
}

}
