

public class Mycar {
	private static int daisuu;
	private static final String DEFAULT_NAME ="��z��";


	private String carName;
	private int numberPlate;

	public Mycar (String name){
		daisuu++;
		this.carName = name;
		this.numberPlate= makeNumber();
	}

	public Mycar() {
		this (DEFAULT_NAME);
	}//�I�[�o�[���[�h��this�̑g�ݍ��킹


	public static void showDaisuu() {
		System.out.println("����"+daisuu+"��");
	}

	private int makeNumber() {
			return (int) Math.floor(Math.random()*10000);
		}

	public void showCar() {
		System.out.println("���O"+carName);
		System.out.println("�ԍ�"+numberPlate);
	}


}
