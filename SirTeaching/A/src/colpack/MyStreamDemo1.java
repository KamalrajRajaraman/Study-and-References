package colpack;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class MyStreamDemo1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,6,8,10);
		//boolean b=list.stream().allMatch(new MyPredicate());
		//boolean b=list.stream().allMatch(MyStreamDemo1::mytest);
		boolean b=list.stream().allMatch((t)->{return t%2==0;});
		System.out.println("All Even Numbers...:"+b);
		
	}
	public static boolean mytest(Integer t) {
		if(t%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
class MyPredicate implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		if(t%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
}



