package core;

import java.io.IOException;

import gui.GUIManager;
import gui.convertArray;

public class imageEdit {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		GUIManager guiMng = new GUIManager();

		guiMng.setImage("E:\\homework\\color\\Lenna.bmp");
		guiMng.showImage();

		convertArray conArray = new convertArray("E:\\homework\\color\\Lenna.bmp");
		conArray.RunConvert();
		guiMng.editKaiten(3);
		guiMng.showImage();


	}

}
