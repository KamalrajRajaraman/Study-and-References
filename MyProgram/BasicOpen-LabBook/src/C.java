import java.util.Arrays;

import javax.swing.JOptionPane;

public class C {
	
	static void sum(int ... a) {
		int sum =0;
		for(int b:a) {
			sum = sum+b;
		}
		System.out.println(sum);
	}
	static void sum(int a,String...b) {
		String temp=b[0];
		b[0]=b[1];
		b[1]=temp;
		System.out.println(a);
		System.out.println(Arrays.toString(b));
	}
	public static void main(String argv[]){  
		
		sum(1,"hi","hello");
		
	}
	
}
