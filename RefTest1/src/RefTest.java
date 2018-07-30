
public class RefTest {
	
	static void halfCut(StringBuffer sb) {
		int len = sb.length();
		sb.delete(len/2, len);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuffer sb = new StringBuffer("かみこく伊藤園");
		
		System.out.println(sb + "(" + sb.length()+")");
		halfCut(sb);
		
		System.out.println(sb+ "("+ sb.length()+")");

	}

}
