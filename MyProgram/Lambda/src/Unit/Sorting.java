package Unit;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		String[] a1=new String[]{"kamal","hari","ab","aa"};
		sort(a1);
		System.out.println(Arrays.toString(a1));
//		String a="kamal";
//		String b="hari";
//		System.out.println(a.compareTo(b));
//		if(a.compareTo(b)>0){
//			String temp =a;
//			a=b;
//			b=temp;
//		
//			}
//		System.out.println(a+b);
//		sort(a);
//		System.out.println(Arrays.toString(a));
		System.out.println((int)'H');
	}
	public static  void sort(String[] a) {
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				
				if(a[i].compareTo(a[j])>0){
					String temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
	}
}
