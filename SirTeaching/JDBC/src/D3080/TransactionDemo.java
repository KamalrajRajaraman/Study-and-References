package D3080;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Savepoint;
public class TransactionDemo {
	public static void main(String[] args)throws Exception {
		Connection con=ConnectionUtility.getConnection();
		
		Savepoint sp=null;
		try {
		PreparedStatement psup=con.prepareStatement("update employee set flag=0");
		psup.executeUpdate();
		
		 sp=con.setSavepoint("first");
		
		PreparedStatement ps=con.prepareStatement("update employee set esal=? where ename=?");
		ps.setInt(1, 1000);
		ps.setString(2, "ramu");
		ps.executeUpdate();
		
		ps=con.prepareStatement("update employee set esal=? where ename=?");
		
		ps.setInt(1, 3000);
		ps.setString(3, "somu");
		ps.executeUpdate();
		
		ConnectionUtility.closeConnection(null,null);
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, sp);
			e.printStackTrace();
		}
	}
		
}
