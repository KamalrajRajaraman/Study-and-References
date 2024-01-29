package Fact;
public interface ShoeManufacturer extends Manufacturer{
	default public Shoe make() {
		return makeShoe();
	}
	public Shoe makeShoe();
}