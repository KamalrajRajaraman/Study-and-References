package trash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import DAO.InvoiceTransfersDAO;
import DTO.InvoiceTransfer;

public class MainOfInvoiceTransfer {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		Connection con = DriverManager.getConnection(url, user, password);
		InvoiceTransfersDAO  a= new InvoiceTransfersDAO(con);
//		InvoiceTransfer b = new InvoiceTransfer();
//		b.setItemId(1);
//		b.setInvoiceId(2);
//		b.setQty(90);
//		a.insertInvoiceTransfer(b);
//		a.updateItemIDByInvoiceId(2, 300);
//		a.updateQtyInvoiceId(2, 1000);
//		a.updateInvoiceIdByItemId(1, 300);
//		a.updateQtyByItemId(300, 900);
//		InvoiceTransfer bb = a.retrieveInvoiceTransferByInvoiceId(1);
//		System.out.println(bb);
		
//		InvoiceTransfer c = a.retrieveInvoiceTransferByItemId(300);
//		System.out.println(c);
		
//		List<InvoiceTransfer> d = a.findAll();
//		System.out.println(d);
//		a.deleteInvoiceTransferByInvoiceId(1);
		a.deleteInvoiceTransferByItemId(300);
	}
}
