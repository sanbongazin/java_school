package prog3_2;

public class Circle {
	double radius;
	double circumference;
	double area;

	void setRadius(double radius) {
		this.radius = radius;
		return;
		}

	double calcArea(){

		area = 3.14*radius*radius;
		return area;
	}

	void calcCircumference() {
		circumference = 2.0 * 3.14 * radius;
		return;
	}

	void Show () {
		System.out.println("”¼Œa"+radius);
		System.out.println("‰~ü="+ circumference);
		System.out.println("–ÊÏ="+ area);
		return;
	}

}
