package Fact;
public class BataShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
}