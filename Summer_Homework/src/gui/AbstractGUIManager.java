package gui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;



/**
 * このクラスは変更しないものとする．
 *
 */
@SuppressWarnings("serial")
public abstract class AbstractGUIManager extends JFrame {
	private static final int DEFAULT_IMAGE_SIZE = 256;
	private static final int SPACE = 10;

	protected BufferedImage editedImage = null;
	protected BufferedImage[] sourceImages = new BufferedImage[1];
	private int sourceMaxWidth = 0;
	private int sourceHeight = 0;



	/**
	 * Constructor.<br />
	 * Initialize images, and make window with default status.
	 */
	public AbstractGUIManager() {
		sourceImages[0] = makeNullImage(BufferedImage.TYPE_INT_RGB);
		editedImage = makeNullImage(BufferedImage.TYPE_INT_RGB);

		makeWindow();
	}



	private void makeWindow() {
		setProperties();
		makeComponents();

		repaint();
		pack();
	}



	private void setProperties() {
		setWindowSize();

		this.setTitle("Image Viewer");	// Set title
		this.setVisible(true);	// Set visibility
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Set as parent window
	}



	private void setWindowSize() {
		calcSourceSize();

		int windowWidth = sourceMaxWidth + editedImage.getWidth() + SPACE*3;
		int windowHeight = ((sourceHeight > editedImage.getHeight())? sourceHeight:editedImage.getHeight()) + SPACE*3 + 2;

		this.getContentPane().setPreferredSize(new Dimension(windowWidth, windowHeight));	// Set size
	}



	private void calcSourceSize() {
		sourceMaxWidth = 0;
		sourceHeight = 0;

		for (BufferedImage sourceImage: sourceImages) {
			if ( sourceMaxWidth < sourceImage.getWidth() ) {
				sourceMaxWidth = sourceImage.getWidth();
			}

			sourceHeight += sourceImage.getHeight() + SPACE;
		}

		sourceHeight -= SPACE;
	}



	private void makeComponents() {
		// Set panel layout
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.WHITE);

		// Make image label
		makeLabels();
	}



	private void makeLabels() {
		// Source
		makeLabel(SPACE, 0, "Source(s)");

		// Edited
		makeLabel(sourceMaxWidth + SPACE*2, 0, "Edited");
	}



	private void makeLabel(int x, int y, String title) {
		// Title
		JLabel titleLabel = new JLabel(title);
		titleLabel.setBounds(x , y, titleLabel.getPreferredSize().width, titleLabel.getPreferredSize().height);
		this.getContentPane().add(titleLabel);

		// Images
		BufferedImage[] images = (title.equals("Edited"))? new BufferedImage[]{editedImage}: sourceImages;

		int newHeight = 0;

		for (BufferedImage image: images) {
			JLabel imageLabel = new JLabel(new ImageIcon(image));
			imageLabel.setBounds(x, 20 + newHeight, image.getWidth(), image.getHeight());
			this.getContentPane().add(imageLabel);

			newHeight += image.getHeight() + SPACE;
		}

	}



	/**
	 * Read images from <i>imagePaths</i>, and set to <i>sourceImages</i>.
	 *
	 * @param imagePaths = <i>file directory</i> + <i>file name</i>
	 */
	public void setImage(String... imagePaths) {
		sourceImages = new BufferedImage[imagePaths.length];

		for (int i=0; i<imagePaths.length; i++) {
			readImage(imagePaths[i], i);
		}

		editedImage = makeNullImage(sourceImages[0].getType());
	}



	private void readImage(String imagePath, int i) {
		try {
			sourceImages[i] = ImageIO.read(new File(imagePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	private BufferedImage makeNullImage(int imageType) {
		int[] imageData = new int[DEFAULT_IMAGE_SIZE*DEFAULT_IMAGE_SIZE];

		drawBorderLine(imageData);

		BufferedImage nullImage = new BufferedImage(DEFAULT_IMAGE_SIZE, DEFAULT_IMAGE_SIZE, imageType);
		nullImage.setRGB(0, 0, DEFAULT_IMAGE_SIZE, DEFAULT_IMAGE_SIZE, imageData, 0, DEFAULT_IMAGE_SIZE);

		return nullImage;
	}



	private void drawBorderLine(int[] imageData) {
		for (int i=0; i<imageData.length; i++) {
			if ( 0 < i && i < DEFAULT_IMAGE_SIZE || 							// Top border
					imageData.length - DEFAULT_IMAGE_SIZE < i ||				// Bottom border
					i % DEFAULT_IMAGE_SIZE == DEFAULT_IMAGE_SIZE - 1 || 	// Right border
					i % DEFAULT_IMAGE_SIZE == 0 ){							// Left border
//				imageData[i] = 0 << 16 | 0 << 8 | 0;							// No need: 0 is initial value.
			} else {
				imageData[i] = 255 << 16 | 255 << 8 | 255;
			}
		}
	}



	/**
	 * Repaint and resize window with latest images.
	 */
	public void showImage() {
		this.getContentPane().removeAll();
		setProperties();
		makeLabels();

		repaint();
		pack();
	}



	// 共通課題
	public abstract void editKaiten(int rot);
	public abstract void editSyukusyo();
	public abstract void editHanten(boolean reverseV, boolean reverseH);

	// 個別課題
//	public abstract void editPersonal();


}
