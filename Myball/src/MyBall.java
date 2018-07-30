
public class MyBall {
	private static int kosuu = 0;
	private int bangou;

	public MyBall() {
		kosuu++;
		bangou = kosuu;
	}

	public void showBangou() {
		System.out.println("Ball #"+ bangou);
	}

	public static void showKosuu() {
//		int i = 0;
//		if (i == 0) {
		System.out.println(MyBall.kosuu + "balls");
//		i++;
//		}else {
//		System.out.println(MyBall.kosuu+"balls");
//		}
	}
}
