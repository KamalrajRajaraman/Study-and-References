package MyFactory;



public class KamalFactory extends AbstractFactory{

	@Override
	public Mobile makeMobile() {
		return new Vivo();
	}

}
