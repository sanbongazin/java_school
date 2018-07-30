package gui;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;;


public class convertArray {
	public String path;

	public convertArray(String path){
		path = this.path;
	}

	public int[] RunConvert() throws IOException{
		BufferedImage image = ImageIO.read(new File("E:\\homework\\color\\Lenna.bmp"));

		int width = image.getWidth();
		int height = image.getHeight();

		int [] rgbArray = new int [width*height];
		image.getRGB(0, 0, width, height, rgbArray, 0, width);
		return rgbArray;
	}
	
	public static final int[] reverse(int[] arr) {
	    final int len = arr.length;
	    int tmp;
	    for (int i = 0; i < len / 2; i++) {
	        tmp = arr[i];
	        arr[i] = arr[len - 1 - i];
	        arr[len - 1 - i] = tmp;
	    }
	    return arr;
	}


}
