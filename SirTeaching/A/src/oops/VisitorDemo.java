package oops;
import java.util.Scanner;
public class VisitorDemo {
	public static void main(String[] args) throws Exception{
		Child baby=new Child();
		Dog tiger=new Dog();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the item class name..:");
		String itemclassname=scan.nextLine();
		Item item=(Item)Class.forName(itemclassname).getConstructor().newInstance();
		
		baby.play(item, tiger);
		
	}
}
abstract class DogExceptions extends Exception{
	abstract void visit();
}
class DogBiteException extends DogExceptions{
	String s;
	public DogBiteException(String s) {
		this.s=s;
	}
	@Override
	public String toString() {
		return "Exception is...:"+s;
	}
	@Override
	void visit() {
		new Handler911().handle(this);			
	}
}
class DogBarkException extends DogExceptions{
	String s;
	public DogBarkException(String s) {
		this.s=s;
	}
	@Override
	public String toString() {
		return "Exception is...:"+s;
	}
	void visit() {
		new Handler911().handle(this);			
	}
}
class DogHappyException extends DogExceptions{
	String s;
	public DogHappyException(String s) {
		this.s=s;
	}
	@Override
	public String toString() {
		return "Exception is...:"+s;
	}
	void visit() {
		new Handler911().handle(this);			
	}
}
class Handler911 {
	public void handle(DogBiteException dbe) {
		dbe.printStackTrace();
		System.out.println("Will send you ambulance.....dont be panic...");
	}
	public void handle(DogBarkException dbe) {
		dbe.printStackTrace();
		System.out.println("Barking dogs seldom bite........dont be panic...");
	}
	public void handle(DogHappyException dbe) {
		dbe.printStackTrace();
		System.out.println("just enjoy..dog loves biscuit........dont be panic...");
	}
}
class Child{
	public void play(Item item,Animal animal) {
		try {
			animal.play(item);
		}	
		catch(DogExceptions de) {
			de.visit();
		}
	}
}
abstract class Item{
	abstract void executeItem()throws DogExceptions;
}
class Stick extends Item{
	public Stick() {
		// TODO Auto-generated constructor stub
	}
	@Override
	void executeItem()throws DogExceptions {
		System.out.println("beat with stick....");
		throw new DogBiteException("you beat I bite...");
	}
}
class Stone extends Item{
	public Stone() {
		// TODO Auto-generated constructor stub
	}
	@Override
	void executeItem()throws DogExceptions {
		System.out.println("throw stone at dog....");
		throw new DogBarkException("you throw stone I bark at you....");
	}
}
class Biscuit extends Item{
	public Biscuit() {
		// TODO Auto-generated constructor stub
	}
	@Override
	void executeItem()throws DogExceptions {
		System.out.println("dog eating the biscuit....");
		throw new DogHappyException("I love biscuits......");
	}
}
abstract class Animal{
	abstract void play(Item item)throws DogExceptions;
}
class Dog extends Animal{
	@Override
	void play(Item item)throws DogExceptions {
		item.executeItem();
	}
}



