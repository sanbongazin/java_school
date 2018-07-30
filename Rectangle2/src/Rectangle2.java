
public class Rectangle2 {
	private double length;
	private double width;
	private double area;

//	public Rectangle2(double length,double width,double area) {
//		this.length = length;
//		this.width = width;
//		this.area = area;
//	}//ctrl + /で一括でコメントアウト

	public Rectangle2(double length, double width) {
		this.length = length;
		this.width = width;
		calcArea();
	}

	public Rectangle2(double side) {
		this(side,side);
		//calcArea();
	}

	public Rectangle2() {
		this(1.0,1.0);
		//calcArea();//処理がかぶるので消去
	}

	public double getArea() {
		return area;
	}

	private double calcArea() {
		area = length * width;
		return area;
	}

}
