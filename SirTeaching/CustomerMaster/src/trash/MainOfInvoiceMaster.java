package trash;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import DAO.InvoiceMastersDAO;
import DTO.Bill;
import DTO.InvoiceMaster;

public class MainOfInvoiceMaster {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/jdbcDemo";
		String user ="root";
		String password ="Kamalraj@123";
		Connection con = DriverManager.getConnection(url, user, password);
		InvoiceMastersDAO i = new InvoiceMastersDAO(con);
//		
//		InvoiceMaster invoice = new InvoiceMaster();
//		invoice.setInvoiceId(2);
//		invoice.setDiscount(50);
//		invoice.setInvoiceDate(new Date(1999, 01, 29));
//		invoice.setCustomerId(1);
//		i.insertInvoice(invoice);
		//i.updateDate(1, Date.valueOf(LocalDate.now()));
		//i.updateDiscount(1, 100);
//		InvoiceMaster iii= i.retrieveInvoice(1);
//		System.out.println(iii);
		
//		List<InvoiceMaster> l = i.findAll();
//		System.out.println(l);
//		i.deleteInvoiceById(1);'
		Bill b = new Bill();
		b.setInvoiceId(112);
		b.setInvoiceDate(Date.valueOf("2023-08-2"));
		b.setDiscount(4);
		b.setCustomerId(999);
		b.setCustomerName("HAri");
		b.setCustomerAddress("ms pillai nagar");
		b.setCustomerTel(9888);
		b.setItemId(99);
		b.setQty(7);
		b.setItemName("Lays");
		b.setUnit("2kg");
		b.setPrice(1000);
		b.setImage(null);
		i.insertEntireinvoiceData(b);
		
		System.out.println(i.invoice(112));
		
		
	}
}
