package GenericInterface;

public class Myclass<T extends Comparable<T>> implements MinMax<T > {
	T[] vals;
	
	public Myclass(T[] vals) {
		this.vals=vals;
	}

	@Override
	public T min() {
		T v=vals[0];
		for(T t:vals) {
			if(t.compareTo(v)<0) v=t;
			
		}
		return v;
	}

	@Override
	public T max() {
		T v=vals[0];
		for(T t:vals) {
			if(t.compareTo(v)>0) v=t;
			
		}
		return v;
	}


}
