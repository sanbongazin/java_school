
public class IntegerTest {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("MAX=" + Integer.MAX_VALUE);
		System.out.println("MIN=" + Integer.MIN_VALUE);
		System.out.println("Size=" + Integer.SIZE);
		System.out.println("TYPE=" + Integer.TYPE);

		int n = 707;
		System.out.println("Binary of " + n + " is " + Integer.toBinaryString(n));
		System.out.println("Hex of " + n + " is " + Integer.toHexString(n));
		System.out.println("Ocutal of "+ n + " is " + Integer.toOctalString(n));


	}

}
