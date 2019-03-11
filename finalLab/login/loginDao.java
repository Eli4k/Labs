package finalLab.login;
import java.sql.*;
import finalLab.dbLink.conProcess;

public class loginDao{
	public static boolean validate(loginBean bean){
		boolean status = false;
		try{
			Connection con = conProcess.getCon();

			PreparedStatement ps = con.prepareStatement(
				"select * from student where email=? and pass=?");

			ps.setString(1, bean.getEmail());
			ps.setString(2, bean.getPwd());

			ResultSet rs = ps.executeQuery();
			status=rs.next();
		}
		catch(Exception e){
		}
				return status;
	}	
}