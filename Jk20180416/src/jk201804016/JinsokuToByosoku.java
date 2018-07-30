package jk201804016;
import java.io.*;
public class JinsokuToByosoku {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
			System.out.println("時速を入力");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String inData = br.readLine();
			double r = Double.parseDouble(inData);
			double d = r*1000/3600;
			System.out.println("秒速"+d+"m");
	}

}
