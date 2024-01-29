package colpack;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class MyStreamDemo2 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,6,8,10);
		list.stream().forEach(System.out::print);
		System.out.println();
		list.parallelStream().forEachOrdered(System.out::print);
		
		int sum=list.stream().mapToInt((t)->{return t+100;}).sum();
		System.out.println(sum);
		
		int sum2=list.parallelStream().mapToInt((t)->{return t+100;}).sum();
		System.out.println(sum2);
	}
}

