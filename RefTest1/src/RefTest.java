
public class RefTest {
	
	static void halfCut(StringBuffer sb) {
		int len = sb.length();
		sb.delete(len/2, len);
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		StringBuffer sb = new StringBuffer("���݂����ɓ���");
		
		System.out.println(sb + "(" + sb.length()+")");
		halfCut(sb);
		
		System.out.println(sb+ "("+ sb.length()+")");

	}

}
