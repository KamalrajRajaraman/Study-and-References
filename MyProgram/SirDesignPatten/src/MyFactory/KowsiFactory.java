package MyFactory;

public class KowsiFactory extends AbstractFactory {

	@Override
	public Mobile makeMobile() {
	
		return new RealMe();
	}

}
