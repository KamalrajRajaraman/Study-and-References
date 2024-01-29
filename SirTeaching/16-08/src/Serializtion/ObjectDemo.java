package Serializtion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class ObjectDemo {
	public static void main(String[] args) throws Exception{
		String s ="D:\\software";
		Laddu laddu=new Laddu();
		System.out.println("size of laddu...:"+laddu.size);
		System.out.println("gadothgajan serializes the laddu before eating....");
		FileOutputStream fos=new FileOutputStream(s+"\\myladdu.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(laddu);//saves the laddu in serialized form (in a file)....
		
		System.out.println("gadothgajan eats the laddu.....");
		laddu.size=0;
		System.out.println("You see....laddus..."+laddu.size);
		
		FileInputStream fis=new FileInputStream(s+"\\myladdu.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		System.out.println("jee boomba......laddu come back.....");
		Laddu laddu2=(Laddu)ois.readObject();
		System.out.println("You see laddus.....:"+laddu2.size);
		
		
	}
}
class Laddu implements Serializable{
	int size=10;
}