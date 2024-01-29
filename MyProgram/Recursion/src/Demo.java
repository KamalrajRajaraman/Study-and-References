import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		run(123);
	}
	static int digitCount(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;	
		}
		return count;
		
	}
	static void run(int a) {
		System.out.println(a);
		
		int index=0;
		int size = digitCount(a);
		int[] arr = new int[size];
		while(a>0) {
			arr[--size]=a%10;
			a=a/10;
		}
		int temp
		System.out.println(Arrays.toString(arr));
		
	}
}
