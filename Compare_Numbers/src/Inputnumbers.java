import java.io.*;
public class Inputnumbers {

	public static void main(String[] args)  throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�ԍ����X�y�[�X��؂�œ���");
		String [] ss = br.readLine().split(" ");
		
		BubbleSort p = new BubbleSort();
		p.Boubble(ss);
		p.Conform(ss);
		
	}
}