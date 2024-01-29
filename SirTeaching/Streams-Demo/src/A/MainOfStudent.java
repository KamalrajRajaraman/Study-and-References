package A;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.LinkedHashSet;

public class MainOfStudent {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Student s1 = new Student();
//		s1.setName("Kamal");
//		s1.setAge(24);
//		serialization(s1);
//		System.out.println("KAmal");
		System.out.println("hi");

		LinkedHashSet<E>
	}
	
	public static void serialization(Student s) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("Student.dat");
		ObjectOutputStream os =new ObjectOutputStream(fos);
		os.writeObject(s);
		fos.close();
		os.close();
		
	}
	
//
//	public static void deserialization() throws IOException, ClassNotFoundException {
//		FileInputStream fis =new FileInputStream("Student.dat");
//		ObjectInputStream is = new ObjectInputStream(fis);
//		Student s1 =(Student) is.readObject();
//		System.out.println(s1.getName());
//		
//		
//	}
	

}
