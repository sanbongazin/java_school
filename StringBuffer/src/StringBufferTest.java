
public class StringBufferTest {

	public void show(String h, StringBuffer sb) {
		System.out.println(h+'"'+sb+'"');
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		StringBufferTest sbTest = new StringBufferTest();
		StringBuffer sb = new StringBuffer();
		sbTest.show("�����l",sb);

		sb.append('A');
		sbTest.show("�����ǉ���", sb);

		sb.append("Java");
		sbTest.show("������ǉ���", sb);

		sb.insert(1, "the");
		sbTest.show("������}����", sb);

		sb.delete(0, 1);
		sbTest.show("�����폜��", sb);

		sb.replace(0, 3, "my");//endIndex��-1�ԖڂɂȂ�̂Œ��ӂ��邱�Ɓi�Q�����u���Ȃ�3�ɂȂ�j
		sbTest.show("������u����", sb);

		sb.reverse();
		sbTest.show("�t��", sb);

	}

}
