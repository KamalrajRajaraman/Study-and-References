package IOppt;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("MyFile.txt");
		System.out.println(file.getName());
		System.out.println(file.exists());
		
	}

}
