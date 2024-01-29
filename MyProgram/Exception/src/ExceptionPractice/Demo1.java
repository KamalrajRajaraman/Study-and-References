package ExceptionPractice;

public class Demo1 {
	public static void main(String[] args) {
		try {
			try {
				Demo1 a = null;
				a.toString();
			}
			catch(NullPointerException e) {
				e.printStackTrace();
			}
			int i=1/0;
		}
		catch(Throwable e) {
			e.printStackTrace();
			try {
				throw new NullPointerException();
			}
			catch(NullPointerException e1) {
				e1.printStackTrace();
			}
		}
	}
}
