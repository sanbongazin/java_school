package gui;

import java.awt.image.BufferedImage;;
public class GUIManager extends AbstractGUIManager{

	public void noEditSample() {
		BufferedImage image = sourceImages[0];
		editedImage = image.getSubimage(0, 0, image.getWidth(), image.getHeight());
		}
	@Override
	public void editKaiten(int rot) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

	@Override
	public void editSyukusyo() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

	@Override
	public void editHanten(boolean reverseV, boolean reverseH) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
