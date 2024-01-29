package trash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Consumer;

import DAO.CustomerDAO;
import DAO.CustomersDAO;
import DTO.Bill;
import DTO.Customer;

public class MainofCustomer {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/jdbcDemo";
		String user ="root";
		String password ="Kamalraj@123";
		Connection con = DriverManager.getConnection(url, user, password);
		CustomerDAO c = new CustomersDAO(con);
		
		Customer cm = new Customer();
		cm.setCustomerName("hari");
		cm.setCustomerId(1);
		cm.setCustomerTel(842883852);
		cm.setCustomerAddress("11,ms pillai nagar");
		c.insertCustomer(cm);
		
//		c.updateCustomerName(1, "Hari");
//		c.updateCustomerAddress(1, "10,J nagar");
//		c.updateCustomerTel(1, 94427180);
		
//		Customer cc  =c.retrieveCustomerById(1);
//		System.out.println(cc);
		
//		List<Customer> ccc =c.findAll();
//		System.out.println(ccc);
		
		//c.deleteCustomerById(1);
	}
	
	
}
