package Kowsi;
import java.util.Scanner;

public class Palindrom_Demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String n= sc.next();
		Demo1 demo= new Demo1();
		demo.palindra(n);
//		System.out.println("Enter the number..");
//		int nu= sc.nextInt();
//		int temp=0;
//		int sum=0;
//		while(nu>0) {
//			temp=nu%10;
//			sum=temp+(sum*10);
//			nu=nu/10;
//		}
//		System.out.println(sum);
	}

}
class Demo1{
	public void palindra(String name) {
		 char str1='a' ;
		for(int i=0;i<name.length();i++) {
			 str1=name.charAt(i);
			 System.out.println(str1);
			
		}

	 char str ='a' ;
	 for(int i=name.length()-1;i>=0;i--) {
		
		 str=name.charAt(i);
		 
		System.out.println(str);
		
	 }
	 
	 if(str==str1) {
		 System.out.println("this is polindrom");
	 }
	 else {
		 System.out.println("this is not a polindrom");
	 }
	}
}