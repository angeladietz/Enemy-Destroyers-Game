import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * base class for enemy abstraction
 * @author 96017die
 */
public abstract class enemyAbstraction {

	private int lives = 3;
	private int X; //X coordinate of enemy
	private int Y; //Y coordinate of enemy 
	public JLabel enemy;

	/**
	 * constructor to initialize the user
	 * @param uL
	 */
	public enemyAbstraction(JLabel eL){
		enemy = eL;
	}

	/**
	 * @return - enemy JLabel
	 */
	public JLabel getLabel(){
		return enemy;
	}

	/**
	 * sets the colour of the enemy according to how many times it has been hit
	 */
	public void setImage(){
		if (lives ==2){
			enemy.setIcon(new ImageIcon("medBlue.png"));
		}
		else if (lives ==1){
			enemy.setIcon(new ImageIcon("darkBlue.png"));
		}
	}

	/**
	 * moves the enemy back up to the top
	 */
	public void moveBack(){
		X= getx();
		Y = gety();
		enemy.setLocation(X,-20);
	}

	/**
	 * @return - X coordinate of user
	 */
	public int getx(){
		return enemy.getX();
	}

	/**
	 * @return Y coordinate of user
	 */
	public int gety(){
		return enemy.getY();
	}

	/**
	 * moves user right
	 */
	public void moveR(){
		X= getx();
		Y = gety();
		enemy.setLocation(X+getSpeed(),Y);
	}

	/**
	 * returns the number of lives of an enemy
	 */
	public int getLives(){
		return lives;
	}

	/**
	 * moves user left
	 */
	public void moveL(){
		X= getx();
		Y = gety();
		enemy.setLocation(X-getSpeed(),Y);
	}
	/**
	 * moves enemy down
	 */
	public void moveD(){
		X= getx();
		Y = gety();
		enemy.setLocation(X,Y+getSpeed());
	}

	/**
	 * subtracts 1 from the lives	
	 */
	public void lostLife(){
		lives-=1;
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

	/**
	 * Abstract attack method
	 */
	public abstract void Attack();
}

