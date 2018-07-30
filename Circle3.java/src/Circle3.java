
public class Circle3 {
	private double radius;
	private double cx;
	private double cy;

	public Circle3(double radius,double cx, double cy) {
		this.radius = radius;
		this.cx = cx;
		this.cy = cy;
	}

	public Circle3(double radius) {
		this(radius,0.0,0.0);
	}

	public Circle3() {
		this( 1.0,0.0,0.0);
	}

	public Circle3(double cx ,double cy) {
		this(1.0,cx,cy);
	}

	public void Show() {
		System.out.print("îºåaÅF"+radius);
		System.out.println(";íÜêS=(" + cx +"," +cy+")");
	}

}
