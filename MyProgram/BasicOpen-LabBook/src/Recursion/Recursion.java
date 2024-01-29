package Recursion;

public class Recursion {
	public int fact(int x) {
		if(x==0)
			return 1;
		return x*fact(x-1);
	}
	public String fib(int n1,int n2,int range) {
		String r="";
		if(range==0)
			return r;
		return r+n1+fib(n1=n2,n1+n2,range--);
	}
}
