import java.io.*;
public class CalcRectangle2 {

	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
			System.out.print("�c�F");
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			String inData = br.readLine();
			double length = Double.parseDouble(inData);

			System.out.print("��:");
			inData = br.readLine();
			double width = Double.parseDouble(inData);



			Rectangle2 obj1 = new Rectangle2(length,width);
			Rectangle2 obj2 = new Rectangle2(length);
			Rectangle2 obj3 = new Rectangle2();

			System.out.println(obj1.getArea());
			System.out.println(obj2.getArea());
			System.out.println(obj3.getArea());

			//syso=>ctrl + space�Ŏ�������
	}

}
