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
		System.out.println("���a��"+radius);
		System.out.println("�~��="+ circumference);
		System.out.println("�ʐ�="+ area);
		return;
	}

}
