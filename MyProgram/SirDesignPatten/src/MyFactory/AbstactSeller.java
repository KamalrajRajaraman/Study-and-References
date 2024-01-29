package MyFactory;

public abstract class AbstactSeller {
	private AbstractFactory fact;
	
	public abstract Mobile sell(Customer customer);
	
	public void setFact(AbstractFactory fact) {
		this.fact = fact;
	}
	
	public AbstractFactory getFact() {
		return fact;
	}
	
}
