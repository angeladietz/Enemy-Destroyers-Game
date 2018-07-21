import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * user 1 characteristics
 * @author 96017die
 *
 */
public class Char1 extends CharAbstraction{

	/**
	 * constructor for character
	 * @param uL
	 */
	public Char1(JLabel uL) {
		super(uL);
	}

	private int speed = 20; //character's speed
	private int length = 50; //length of character
	
	ImageIcon ii = new ImageIcon("lightBlue.png");

	/**
	 * returns the characters speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * returns characters length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * returns characters picture
	 */
	public ImageIcon getII() {
		return ii;
	}
}