
public class StringTest {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String str = "Tumurac��ؐl��";
				System.out.println("������"+str);

		int len = str.length();
		System.out.println("��������" + len);

		char c = str.charAt(0);
		System.out.println("0�Ԗڂ̕�����" + c);

		c = str.charAt(5);
		System.out.println("5�Ԗڂ̕�����"+ c/*str.charAt(5)*/);

		int k = str.indexOf('e');
		System.out.println("e��"+k+"������");

		k = str.indexOf(c);
		System.out.println(c+"��"+k+"������");

		String ss = str.substring(5);
		System.out.println("5�Ԗڈȍ~�̕�����"+ss);

		ss = str.substring(2,5);
		System.out.println("2�Ԃ߂���3������"+ ss);

		String slow = str.toLowerCase();
		System.out.println("����������="+slow);

		String supper = str.toUpperCase();
		System.out.println("�啶������="+supper);

		System.out.println("�ϐ�str=" + str);

	}

}
