package ex3A;

public class Rectangle {
		double length;
		double width;
		double permiter;
		double area;
		
		void setSide(double length,double width) {
			this.length = length;
			this.width = width;
			return;
		}
		
		double calcPerimeter(){
			return 2*length + 2*width;
		}
		
		double calcArea() {
			return length * width;
		}
		
		void Show(){
			System.out.println("äOâè="+this.calcPerimeter());
			System.out.println("ñ êœ="+this.calcArea());
		}
}
