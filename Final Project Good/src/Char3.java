import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * user 3 characteristics
 * @author 96017die
 */
public class Char3 extends CharAbstraction{

	/**
	 * constructor method
	 * @param uL - user JLabel
	 */
	public Char3(JLabel uL) {
		super(uL); 
	}

	private int speed = 9; //characters speed
	private int length = 150; //length of character
	
	ImageIcon ii = new ImageIcon("violet.png");

	/**
	 * returns character speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * returns character length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * returns image icon
	 */
	public ImageIcon getII() {
		return ii;
	}
}