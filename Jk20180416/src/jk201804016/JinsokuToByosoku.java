package jk201804016;
import java.io.*;
public class JinsokuToByosoku {

	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
			System.out.println("���������");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String inData = br.readLine();
			double r = Double.parseDouble(inData);
			double d = r*1000/3600;
			System.out.println("�b��"+d+"m");
	}

}
