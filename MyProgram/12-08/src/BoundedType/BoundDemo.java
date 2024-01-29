package BoundedType;

import java.util.ArrayList;
import java.util.List;

public class BoundDemo {
	public static void main(String[] args) {
		
		
		
		Integer[] a = {1,2,3,4,5};
		Stats<Integer> b = new Stats<>(new Integer[]{1,2,3,4,5});
		
		double val =b.average();
		System.out.println("val:"+val);
		
		Double[] c = {1.0,2.0,3.0,4.0,5.0};
		
		Stats<Double> c1 = new Stats<>(c);
		
		double val1 = c1.average();
		System.out.println("val1:"+val1);
		
		String[] d = {"1","2"};
		
//		Stats<String> d1 = new Stats(d);//Bound mismatch:
		
		boolean flag = b.sameAverage(c1);
		System.out.println(flag);
		
		
	}
}
