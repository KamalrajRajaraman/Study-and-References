package BasicOpenLabBook;

public class ArraySum {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum =0;
		for(int i :arr) {
			sum =sum+i;
		}
		System.out.println("Sum of Array = "+sum);
		System.out.println(arr.toString());
	}
}
