package SirStrategy;
public class OpenCloseDemo {
	public static void main(String[] args) {
		BadExtention gp = new BadExtention();
		gp.doPaint(1);
		gp.doPaint(new BluePaint());
//		GoodPaintBrush gp=new GoodPaintBrush();
//		gp.doPaint(new BluePaint());
	}
}
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red paint.....");
		}
		else if(i==2) {
			System.out.println("blue paint....");
		}
	}
}
class BadExtention extends BadPaintBrush{
	public void doPaint(Paint p) {
		p.color();
	}
}



class GoodPaintBrush{
	public void doPaint(Paint p) {
		p.color();
	}
}
abstract class Paint{
	public abstract void color();
}
class RedPaint extends Paint{
	@Override
	public void color() {
		System.out.println("red colour...");
	}
}
class BluePaint extends Paint{
	@Override
	public void color() {
		System.out.println("blue colour....");
	}
}