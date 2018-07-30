
public class StringBufferTest {

	public void show(String h, StringBuffer sb) {
		System.out.println(h+'"'+sb+'"');
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBufferTest sbTest = new StringBufferTest();
		StringBuffer sb = new StringBuffer();
		sbTest.show("初期値",sb);

		sb.append('A');
		sbTest.show("文字追加後", sb);

		sb.append("Java");
		sbTest.show("文字列追加後", sb);

		sb.insert(1, "the");
		sbTest.show("文字列挿入後", sb);

		sb.delete(0, 1);
		sbTest.show("文字削除後", sb);

		sb.replace(0, 3, "my");//endIndexは-1番目になるので注意すること（２文字置換なら3になる）
		sbTest.show("文字列置換後", sb);

		sb.reverse();
		sbTest.show("逆順", sb);

	}

}
