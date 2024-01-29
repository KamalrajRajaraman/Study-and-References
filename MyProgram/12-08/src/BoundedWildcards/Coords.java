package BoundedWildcards;

public class Coords<T extends TwoD> {
	T[] coords;
	
	public Coords(T[] o) {
		coords = o;
	}
	
	public static void showXY(Coords<?> c) {
		System.out.println(" X Y Coordinates :");
		for (int i =0;i<c.coords.length;i++) {
			System.out.print(c.coords[i].x+" "+c.coords[i].y);
			System.out.println();
		}
	}
	public static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println(" X Y Z Coordinates :");
		for (int i =0;i<c.coords.length;i++) {
			System.out.print(c.coords[i].x+" "+c.coords[i].y + " "+c.coords[i].z);
			System.out.println();
		}
	}
	public static void showXYZT(Coords<? extends FourD> c) {
		System.out.println(" X Y Z T Coordinates :");
		for (int i =0;i<c.coords.length;i++) {
			System.out.print(c.coords[i].x+" "+c.coords[i].y + " "+c.coords[i].z+ " "+c.coords[i].t);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		
		Coords<TwoD> a = new Coords<>(new TwoD[]{new TwoD(5,6),new TwoD(7,6)});
		Coords.showXY(a);
//		Coords.showXYZ(a);
		
		Coords<ThreeD> a1 = new Coords<>(new ThreeD[]{new ThreeD(5,6,54),new ThreeD(7,6,86)});
		Coords.showXYZ(a1);
		
		Coords<FourD> a2 = new Coords<>(new FourD[]{new FourD(5,6,54,55),new FourD(7,6,86,78)});
		Coords.showXY(a2);
		Coords.showXYZ(a2);
		Coords.showXYZT(a2);
	}
}
