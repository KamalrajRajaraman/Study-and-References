package colpack;
public class UtilDemo1 {
	public static void main(String[] args) {
		//GANDHI WAY
		final int num[]= {10,20,30,40,50};
		System.out.println(num[2]);
		//INDRA GANDHI WAY
		System.out.println(MyCons.num1);
		//RAHUL GANDHI WAY
		System.out.println(MyConsEnum.num1.getI());
		
		
		switch(MyConsEnum.num1.getI()) {
		case 10:{
			
		}
		case 20:{
			
		}
		}
		
		Fruits f=Fruits.apple;
		switch(f) {
		case apple:{
			
		}
		case banana:{
			
		}
		case jack:{
			
		}
		}
		
		Fruits ff[]=Fruits.values();
		for(Fruits x:ff) {
			System.out.println(x);
		}
		System.out.println(Fruits.valueOf("apple"));
	}
}
enum Fruits{
	apple,jack,banana;
}
interface MyCons{
	public final static int num1=10;
	public final static int num2=20;
	public final static int num3=20;
}
enum MyConsEnum{	
	num1(10),num2(20),num3(30);
	int i;
	MyConsEnum(int i){
		this.i=i;
	}
	public int getI() {
		return this.i;
	}
}


