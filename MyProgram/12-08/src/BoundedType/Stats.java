package BoundedType;

import java.util.function.Predicate;
 
public class Stats<T extends Number & Comparable<T>> {
	T[] nums;
	
	public Stats(T[] nums) {
	 this.nums=nums;
	}
	
	public double average() {
		double  sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum = sum +nums[i].doubleValue();	
		}
		return sum/nums.length;
	}
	
	//this wont Work
//	public boolean sameAverage(Stats<T> nums) {
//		if(this.average()==nums.average()) {
//			return true;
//		}
//		return false;
//	}
	
	public boolean sameAverage(Stats<?> nums) {
		if(this.average()==nums.average()) {
			return true;
		}
		return false;
	}

}
