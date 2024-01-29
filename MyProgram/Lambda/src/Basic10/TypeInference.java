package Basic10;

public class TypeInference {
	public static void main(String[] args) {
		StringLengthLambda strLenLambda = s->s.length();
		int size =strLenLambda.getLength("kamal");
		System.out.println(size);
	}
	public static void printLambda(StringLengthLambda  l) {
		
	}
}
