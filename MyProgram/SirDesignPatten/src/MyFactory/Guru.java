package MyFactory;

public class Guru extends AbstactSeller{

	@Override
	public Mobile sell(Customer customer) {	
		return getFact().makeMobile();
	}

	


}
