package Streams;

public class MainOfPersons {
	public static void main(String[] args) {

	}

	public void demo() throws CloneNotSupportedException {
		clone();
	}

	class Demo implements Cloneable{
		public Object clone() {
			return this;
		}
	}
}
