package Fact;

public class RamuShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe(Customer customer) {
		return getFactory().makeShoe();
	}
}