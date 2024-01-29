package edu.disease.asn5;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * class Container can store multiple of items
 *
 * 
 */
public class Container<T> {
	private List<T> t ;

	/**
	 * 
	 * 
	 */
	public Container(T... t) {
		if(t.length==0) {
			throw new IllegalArgumentException("No Arguments were supplied");
		}
		this.t=Arrays.asList(t);
		 
	}
	
	/**
	 * 
	 *
	 */
	public int size() {
		return t.size();
	}
	/**
	 * 
	 * 
	 */
	public T get(int index) {
		if(index<0 || index >= t.size()) {
			throw new IllegalArgumentException("Invalid Index");
		}
		return t.get(index);
	}

}
