import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainOfStudent {
	public static void main(String[] args) throws IOException {
		Student s1 = new Student();
		s1.setName("Kamal");
		s1.setAge(24);
		serialization(s1);
		
	}
	
	public static void serialization(Student s) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("Student.dat");
		ObjectOutputStream os =new ObjectOutputStream(fos);
		os.writeObject(s);
		fos.close();
		os.close();
		
	}
	

	public static Student deserialization() {
		return null;
		
	}

}
