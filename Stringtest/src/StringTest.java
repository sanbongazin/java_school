
public class StringTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "Tumurac野菜人間";
				System.out.println("文字列＝"+str);

		int len = str.length();
		System.out.println("文字数＝" + len);

		char c = str.charAt(0);
		System.out.println("0番目の文字＝" + c);

		c = str.charAt(5);
		System.out.println("5番目の文字＝"+ c/*str.charAt(5)*/);

		int k = str.indexOf('e');
		System.out.println("eは"+k+"文字目");

		k = str.indexOf(c);
		System.out.println(c+"は"+k+"文字目");

		String ss = str.substring(5);
		System.out.println("5番目以降の文字は"+ss);

		ss = str.substring(2,5);
		System.out.println("2番めから3文字は"+ ss);

		String slow = str.toLowerCase();
		System.out.println("小文字化後="+slow);

		String supper = str.toUpperCase();
		System.out.println("大文字化後="+supper);

		System.out.println("変数str=" + str);

	}

}
