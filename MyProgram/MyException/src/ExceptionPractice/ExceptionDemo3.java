package ExceptionPractice;

import java.util.Scanner;

public class ExceptionDemo3 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Dog jimmy = new Dog();
		Child ganesh=new Child();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Class Name");
		String className = sc.next();
		Item item = (Item)Class.forName(className).newInstance();
		ganesh.playWithDog(jimmy, item);
	}
}
class Child{
	public void playWithDog(Dog dog,Item item){
		try {
			dog.play(item);
		}
		catch(DogException e) {
			e.printStackTrace();
			e.vist();
		}
		
	}
}
class Dog{
	public void play(Item item) throws DogException {
		item.play();
	}
}
abstract class Item{
	abstract public void play() throws DogException;
}
class StickItem extends Item{

	@Override
	public void play() throws DogException {
	
		throw new DogBiteException();
	}
	
}
class StoneItem extends Item{

	@Override
	public void play() throws DogException {
		
		throw new DogBarkException();
	}
	
}
class BItem extends Item{

	@Override
	public void play() throws DogException {
		throw new DogHappy();
		
	}
	
}
abstract class DogException extends Exception{
	abstract public void vist() ;
}
class DogBiteException extends DogException{

	@Override
	public void vist() {
		new Handler911().handle(this);
		
	}
	
}
class DogBarkException extends DogException{

	@Override
	public void vist() {	
		new Handler911().handle(this);
	}

	
}
class DogHappy extends DogException{

	@Override
	public void vist() {
		new Handler911().handle(this);
		
	}
	
}
class Handler911{
	public void handle(DogBiteException e) {
		System.out.println("Hold On We are sending the Ambulance");
	}
	public void handle(DogBarkException e) {
		System.out.println("Barking Dog seldom Bite");
	}
	public void handle( DogHappy e) {
		System.out.println("Barking Dog seldom Bite");
	}
	
}
