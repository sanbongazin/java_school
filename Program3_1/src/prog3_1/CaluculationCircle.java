package prog3_1;

public class CaluculationCircle {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Circle obj1;
		obj1 = new Circle();
		
		obj1.radius = 10.0;
		
		obj1.circumference = 2.0 * 3.14 * obj1.radius;
		
		System.out.println("���a="+obj1.radius);
		System.out.println("�~��="+obj1.circumference);
		return;
	}

}
