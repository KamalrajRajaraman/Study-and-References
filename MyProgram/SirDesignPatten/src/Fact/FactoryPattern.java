package Fact;
public class FactoryPattern {
	public static void main(String[] args) {
		ShoeShop seller=new RamuShoeShop();
		
		ShoeFactory bsf=new LakhaniShoeFactory();
		
		//dependency injection
		
		seller.setFactory(bsf);
		
		Customer customer=new Customer();
		customer.name="ramu";
		Shoe shoe=seller.sell(customer);
		System.out.println(shoe);
		
	}
}










