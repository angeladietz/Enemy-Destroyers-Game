import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Enemy characteristics
 * @author 96017die
 */
public class Enemy1 extends enemyAbstraction{

	private JLabel enemy; //JLabel for enemy	
	
	/**
	 * constructor method
	 * @param eL - enemy JLabel
	 */
	public Enemy1(JLabel eL) {
		super(eL);
		enemy = eL;
	}

	private int speed = 5; //character's speed
	private int length = 60; //length of character
	
	ImageIcon ii = new ImageIcon("e1.png");

	/**
	 * returns the speed of the enemy
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * enemy attack method
	 * moves enemy down
	 */
	public void Attack() {
			moveD();
	}
	
	/**
	 * @return - enemy JLabel
	 */
	public JLabel getLabel(){
		return enemy;
	}

	/**
	 * returns the image for the enemy
	 */
	public ImageIcon getII() {
		return ii;
	}

	/**
	 * returns the length of enemy
	 */
	public int getLength() {
		return length;
	}
}