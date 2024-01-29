package Fact;
public interface ShoeSeller extends Seller{
	
	default public Shoe sell(Customer customer) {
		return sellShoe(customer);
	}
	public Shoe sellShoe(Customer customer);
}
