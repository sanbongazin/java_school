import java.io.*;
public class Inputnumbers {

	public static void main(String[] args)  throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("番号をスペース区切りで入力");
		String [] ss = br.readLine().split(" ");
		
		BubbleSort p = new BubbleSort();
		p.Boubble(ss);
		p.Conform(ss);
		
	}
}