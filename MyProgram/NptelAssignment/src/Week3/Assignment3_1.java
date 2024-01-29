package Week3;

public class Assignment3_1 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
			Point p1 = new Point();
			System.out.println("Enter value of x for point1");
			p1.x=sc.nextDouble();
			System.out.println("Enter value of y for point1");
			p1.y=sc.nextDouble();
			
			Point p2 = new Point();
			System.out.println("Enter value of x for point2");
			p2.x=sc.nextDouble();
			System.out.println("Enter value of y for point2");
			p2.y=sc.nextDouble();
			
			double result = Point.distance(p1, p2);
			System.out.println("Distance between Two Points :"+result);
	}

}
class Point{
	double x;
	double y;
	
	public static double distance(Point p1,Point p2) {
		return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
	}
}