import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * base abstract class for user
 * @author 96017die
 *
 */
public abstract class CharAbstraction {

	private int X; //x coordinate of user
	private int Y; // Y coordinate of user
	public JLabel user; //user image on screen
	
	/**
	 * constructor to initialize the user
	 * @param uL
	 */
	public CharAbstraction(JLabel uL){
		user = uL;
	}
	
	/**
	 * @return user JLabel
	 */
	public JLabel getLabel(){
		return user;
	}
	
	/**
	 * @return - X coordinate of user
	 */
	public int getx(){
		return user.getX();
	}
	
	/**
	 * @return Y coordinate of user
	 */
	public int gety(){
		return user.getY();
	}
	
	/**
	 * moves user right
	 */
	public void moveR(){
		X= getx();
		Y = gety();
		user.setLocation(X+getSpeed(),Y);
	}
	
	
	/**
	 * moves user left
	 */
	public void moveL(){
		X= getx();
		Y = gety();
		user.setLocation(X-getSpeed(),Y);
	}
	
	/**
	 * abstract method that returns speed for each character
	 * @return character speed
	 */
	public abstract int getSpeed();
	
	/**
	 * abstract method that returns length for each character
	 * @return character length
	 */
	public abstract int getLength();
	
	/**
	 * abstract method that returns the image for each character
	 * @return character image (colour)
	 */
	public abstract ImageIcon getII();
}