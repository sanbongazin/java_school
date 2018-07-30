package jk201804016;
import java.io.*;

public class Haneki {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("半径は？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String inData = br.readLine();

		double r = Double.parseDouble(inData);
		double d = 2*3.14*r;
		System.out.println("円周は"+d);
	}

}
