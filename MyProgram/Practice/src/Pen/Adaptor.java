package Pen;

public class Adaptor extends PenBody{
	
	BlueRefill b1 = new BlueRefill();
	@Override
	public void write(String str) {
		b1.writeBlue(str);
		
	}

}
