package OneWay;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileFillter implements FilenameFilter {
	String s;

	public FileFillter(String s1) {
      s="."+s1;
	}

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Dell\\Desktop\\Book");
		FileFillter ff = new FileFillter("pdf");
		String [] name=f.list(ff);
		for(String x:name) {
			System.out.println(x);
		}
	}

	

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(s);
	}

}
