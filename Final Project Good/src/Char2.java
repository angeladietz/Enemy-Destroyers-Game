import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * user 2 characteristics
 * @author 96017die
 *
 */
public class Char2 extends CharAbstraction{

	/**
	 * constructor
	 * @param uL - user JLabel
	 */
	public Char2(JLabel uL) {
		super(uL);
		}

	private int speed = 7; //characters speed
	private int length = 100; //characters size
	
	ImageIcon ii = new ImageIcon("green.png");

	/**
	 * returns the characters speed
	 */
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}
	
	/**
	 * returns characters length
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