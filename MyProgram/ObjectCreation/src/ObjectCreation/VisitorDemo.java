package ObjectCreation;
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
class Child{
	public void play(Item item,Animal animal) {
		animal.play(item);
	}
}
abstract class Item{
	abstract void executeItem();
}
class Stick extends Item{
	public Stick() {
		
	}
	@Override
	void executeItem() {
		System.out.println("beat with stick....");
	}
}
class Stone extends Item{
	public Stone() {
		
	}
	@Override
	void executeItem() {
		System.out.println("beat with stone....");
	}
}
abstract class Animal{
	abstract void play(Item item);
}
class Dog extends Animal{
	@Override
	void play(Item item) {
		item.executeItem();
	}
}