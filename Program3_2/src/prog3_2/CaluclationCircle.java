package prog3_2;

public class CaluclationCircle {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Circle obj1 = new Circle();
		obj1.setRadius(10.0);
		obj1.calcCircumference();
		double area = obj1.calcArea();
		obj1.Show();
	}

}
