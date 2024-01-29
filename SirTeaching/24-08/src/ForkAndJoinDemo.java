import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
public class ForkAndJoinDemo {
	public static void main(String[] args) {
		String arr[]= {"chennai","banglore","chennai","kanpur","delhi","japur","hyderabad","madurai","chennai","mumbai"};
		int count=0;
		for(String s:arr) {
			if(s.equals("chennai")) {
				count++;
			}
		}	
		System.out.println("Number of chennais are..:"+count);
		
		ForkJoinPool fjp=new ForkJoinPool().commonPool();
		
		MyTask task1=new MyTask(arr,0,3,"chennai");
		MyTask task2=new MyTask(arr,3,5,"chennai");
		MyTask task3=new MyTask(arr,5,7,"chennai");
		MyTask task4=new MyTask(arr,7,9,"chennai");
		
		int result1=fjp.invoke(task1);
		int result2=fjp.invoke(task2);
		int result3=fjp.invoke(task3);
		int result4=fjp.invoke(task4);
		
		int total=result1+result2+result3+result4;
		System.out.println("The Total count of chennai is.."+total);
	}
}
class MyTask extends RecursiveTask<Integer>{
	String arr[];
	int start,end;
	String searchString;
	public MyTask(String arr[],int start,int end,String searchString) {
		this.arr=arr;
		this.start=start;
		this.end=end;
		this.searchString=searchString;
	}
	@Override
	protected Integer compute() {
		int count=0;
		for(int i=start;i<end;i++) {
			if(arr[i].equals("chennai")) {
				count++;
			}
		}
		return count;
	}
}