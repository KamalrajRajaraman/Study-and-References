package trash;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import DAO.ItemsDAO;
import DTO.Item;

public class MainOFItem {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		Connection con = DriverManager.getConnection(url, user, password);
		
		ItemsDAO a =new ItemsDAO(con);
//		Item item = new Item();
//		item.setItemId(1);
//		item.setItemName("biriyani");
//		item.setUnit("1 kg");
//		item.setPrice(100.00f);
//		a.insertItem(item);
//		
//		a.updateItemName(1, "chicken biriyani");
//		a.updateUnit(1, "2 kg");
//		a.updatePrice(1, 200);
//		a.updateImage(1, "C:\\Users\\Dell\\Desktop\\SirTeaching\\kamal.png");
//		Item it =a.retrieveItem(1);
//		System.out.println(it);
//		List<Item> l = a.findAll();
//		System.out.println(l);
		a.deleteItembyId(1);
	}
}
