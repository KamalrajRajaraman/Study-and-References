package GenericMethod;

public class GenMethDemo {
	public static <T extends Comparable<T>,V extends T> boolean isIn(T x,V[] y) {
		for(int i=0;i<y.length;i++)
			if(x.equals(y[i])) return true;
		return false;
	}
	public static void main(String[] args) {
		
		Integer[] nums = {1,2,3,4,5};
		
		if(isIn(2,nums)) System.out.println("2 is in nums");
		
		if(!isIn(7,nums)) System.out.println("7 is not in num");
		
		String[] str = {"one","two","three"};
		
		if(isIn("one",str)) System.out.println("one is in nums");
		
		if(!isIn("four",str)) System.out.println("four is in nums");
		
		if(isIn(4.0,nums)) System.out.println("one is in nums");
		
	}
}
