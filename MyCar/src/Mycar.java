

public class Mycar {
	private static int daisuu;
	private static final String DEFAULT_NAME ="川越号";


	private String carName;
	private int numberPlate;

	public Mycar (String name){
		daisuu++;
		this.carName = name;
		this.numberPlate= makeNumber();
	}

	public Mycar() {
		this (DEFAULT_NAME);
	}//オーバーロードとthisの組み合わせ


	public static void showDaisuu() {
		System.out.println("現在"+daisuu+"台");
	}

	private int makeNumber() {
			return (int) Math.floor(Math.random()*10000);
		}

	public void showCar() {
		System.out.println("名前"+carName);
		System.out.println("番号"+numberPlate);
	}


}
