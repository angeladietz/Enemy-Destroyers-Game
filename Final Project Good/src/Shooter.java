import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.Timer;

public class Shooter {

	private Timer t; //timer for bullet movement
	private int bulletNum; //number of bullets
	private CharAbstraction user; //the user

	private static int bOnScreen=0; //bullets on the screen
	private static ArrayList <Integer> onScrn = new <Integer>ArrayList() ;
	
	private JLabel blt; //JLabel for the bullet
	//private JLabel newBlt;

	/**
	 * constructor that builds the shooters
	 * @param u - the user that moves
	 * @param bl - the bullet label that shoots up
	 */
	public Shooter(CharAbstraction u,JLabel bl) {
		blt = bl;
		user = u;
		bulletNum = 0;
		/**
		 * starts the timer
		 */
		t = new Timer(100, new actTimer()); 
		t.start();
	}

	/**
	 * adds a bullet to the screen
	 */
	public void shoot(){

		/**
		 * gets the users location
		 */
		int X = user.getx();
		int Y = user.gety();
		int l = user.getLength();

		bulletNum += 1; //adds one to the bullet counter
		blt.setLocation(X+(l/2), Y); //sets the initial location of the bullet
		onScrn.add(1);
		
		bOnScreen ++;
	}	

/**
 * 
 * @author 96017die
 *moves bullet up the screen
 */
	private class actTimer implements ActionListener{

		public actTimer(){
		}

		public void actionPerformed(ActionEvent e) {
			if (bulletNum >=1){
				
				int X = blt.getX(); // blAL.get(bulletNum-1).getX();
				int Y = blt.getY();

				if (Y>-10){
					blt.setLocation(X, Y-10);}			
			}
		}
	}
}