package finalLab.viewData;
import finalLab.viewData.ListBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ListDao{
	public static Connection getConnection(){
		Connection con = null;
		String driver = "com.mysql.jdbc.Driver";
	 	String connectionUrl = "jdbc:mysql://localhost:3306/aiti_kaceattendance";
	 	String userName = "root";
	 	 String pwd = "";

	try{  
			Class.forName(driver);
			con = DriverManager.getConnection(connectionUrl, userName, pwd);
    	}catch(Exception e){
    		System.out.println(e);
    	}  
    		return con;  
	}

	public static int save(ListBean me){
			int status=0;
			try{
					Connection con = getConnection();
					PreparedStatement ps = con.prepareStatement(
				" insert into roll(monday, tuesday, wednesday, thursday, friday) values (?,?,?,?,?)"); 

					ps.setString(1, me.getMonday());
					ps.setString(2, me.getTuesday());
					ps.setString(3, me.getWednesday());
					ps.setString(4, me.getThursday());
					ps.setString(5, me.getFriday());	
					   // ps.setInt(6, me.getId());
					 status=ps.executeUpdate();  

				}catch(Exception e){
						System.out.println(e);
					}
						return status;
				}

	public static int update(ListBean me){
		int status = 0;
			try{
				Connection con = getConnection();
				PreparedStatement ps = con.prepareStatement(
					"insert into roll (monday, tuesday, wednesday, thursday, friday) values(?,?,?,?,?)");
					ps.setString(1, me.getMonday());
					ps.setString(2, me.getTuesday());
					ps.setString(3, me.getWednesday());
					ps.setString(4, me.getThursday());
					ps.setString(5, me.getFriday());	
				status=ps.executeUpdate();
			}catch(Exception e){
				System.out.println(e);
			}
			return status;
	}

	public static int delete(ListBean me){
			int status = 0;
				try{
					Connection con = getConnection();
					PreparedStatement ps =con.prepareStatement("delete from roll where where id=?");
					ps.setInt(1, me.getId());
					status=ps.executeUpdate();
				}catch(Exception e){
					System.out.println(e);
				}
				return status;
			}

	public static List<ListBean>getAllRecords(){
			List<ListBean> list = new ArrayList<ListBean>();
			try{
				Connection con = getConnection();
				PreparedStatement ps = con.prepareStatement("select * from roll");
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					ListBean me = new ListBean();
					me.setId(rs.getInt("id"));
					me.setMonday(rs.getString("monday"));
					me.setTuesday(rs.getString("tuesday"));
					me.setWednesday(rs.getString("wednesday"));
					me.setThursday(rs.getString("thursday"));
					me.setFriday(rs.getString("friday"));
					list.add(me);
				}
			}catch(Exception e){
				System.out.println(e);
			}
			return list;
		}

		public static ListBean getRecordById(int id){
				ListBean me = null;
				try{
					Connection con = getConnection();
					PreparedStatement ps = con.prepareStatement("select * from roll where id=?");
					ps.setInt(1, id);
					ResultSet rs=ps.executeQuery();
					while(rs.next()){
						me = new ListBean();
						me.setId(rs.getInt("id"));
						me.setMonday(rs.getString("monday"));
						me.setTuesday(rs.getString("tuesday"));
						me.setWednesday(rs.getString("wednesday"));
						me.setThursday(rs.getString("thursday"));
						me.setFriday(rs.getString("friday"));
					}
				}catch(Exception e){
					System.out.println(e);
				}return me;
			}



}

