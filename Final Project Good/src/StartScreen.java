import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import java.awt.Color;

/**
 * opening screen that opens when the game is run
 * @author 96017die
 *
 */
public class StartScreen {

	private JFrame frmEnemyDestroyers; //opening frame
	private JTextField txtPName; //allows for input of players name
	private JOptionPane Instructions; //instructions message box
	private int userV; // character number that was selected
	
	// radio buttons for selection of character
	private JRadioButton radC1;
	private JRadioButton radC2;
	private JRadioButton radC3;
	
	private ButtonGroup bG; //group box for selection
	private String pName;//players name
	private JOptionPane name; //for error message of not entering name
	
	//images showing each character
	private ImageIcon ii1;
	private ImageIcon ii2;
	private ImageIcon ii3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartScreen window = new StartScreen();
					window.frmEnemyDestroyers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public StartScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEnemyDestroyers = new JFrame();
		frmEnemyDestroyers.setTitle("ENEMY DESTROYERS");
		frmEnemyDestroyers.setBounds(100, 100, 450, 300);
		frmEnemyDestroyers.setContentPane(new JLabel(new ImageIcon("space.png")));
		frmEnemyDestroyers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEnemyDestroyers.getContentPane().setLayout(null);

		txtPName = new JTextField();
		txtPName.setBounds(214, 91, 119, 20);
		frmEnemyDestroyers.getContentPane().add(txtPName);
		txtPName.setColumns(10);
		txtPName.setText("");

		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setForeground(new Color(224, 255, 255));
		lblEnterName.setFont(new Font("Castellar", Font.PLAIN, 12));
		lblEnterName.setBounds(101, 94, 103, 14);
		frmEnemyDestroyers.getContentPane().add(lblEnterName);

		JButton btnStart = new JButton("Start");
		btnStart.setFont(new Font("Castellar", Font.PLAIN, 14));
		btnStart.addActionListener(new ActionListener() {
			/**
			 * starts the game
			 */
			public void actionPerformed(ActionEvent e) {

				pName = txtPName.getText(); //gets the user name
				
				/**
				 * requests a username if one has not been inputed
				 */
				if (pName.equals("")){
					name.showMessageDialog(null,"Please enter user name.");
				}
				else{
					
					/**
					 * determines which character was selected
					 */
					if (radC1.isSelected()){
						userV=1;
					}
					else if(radC2.isSelected()){
						userV=2;
					}
					else{
						userV=3;
					}

					/**
					 * initializes the game screen
					 */
					GameScreen gs = new GameScreen(userV, pName);
					gs.start();
					frmEnemyDestroyers.setVisible(false);
				}
			}
		});
		btnStart.setBounds(32, 191, 89, 36);
		frmEnemyDestroyers.getContentPane().add(btnStart);

		JButton btnInstructions = new JButton("Instructions");
		btnInstructions.setFont(new Font("Castellar", Font.PLAIN, 14));
		btnInstructions.addActionListener(new ActionListener() {
			/**
			 * displays the instructions
			 */
			public void actionPerformed(ActionEvent e) {
				Instructions.showMessageDialog(null,"Select your character and press Start to begin. \n Shoot with the up arrow to destroy the enemies! \n Shoot each enemy 3 times to kill it! \n Using the left and right arrow keys, move to aim. \n Tip: destroy the enemies fast with few \n bullets to get a high score!");
			}
		});
		btnInstructions.setBounds(142, 191, 154, 36);
		frmEnemyDestroyers.getContentPane().add(btnInstructions);

		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Castellar", Font.PLAIN, 14));
		btnExit.addActionListener(new ActionListener() {
			/**
			 * exits the game
			 */
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(306, 191, 89, 36);
		frmEnemyDestroyers.getContentPane().add(btnExit);
	
		radC1 = new JRadioButton("");
		radC1.setBackground(new Color(0, 0, 51));
		radC1.setFont(new Font("Castellar", Font.PLAIN, 12));
		radC1.setSelected(true);
		radC1.setBounds(42, 147, 20, 23);
		frmEnemyDestroyers.getContentPane().add(radC1);

		/**
		 * image that shows user option 1
		 */
		ii1 = new ImageIcon("lightBlue.png");
		JLabel lblC1 = new JLabel(ii1);
		lblC1.setBounds(66, 152, 50, 14);
		frmEnemyDestroyers.getContentPane().add(lblC1);
		
		
		radC2 = new JRadioButton("");
		radC2.setBackground(new Color(0, 0, 51));
		radC2.setFont(new Font("Castellar", Font.PLAIN, 12));
		radC2.setBounds(142, 147, 20, 23);
		frmEnemyDestroyers.getContentPane().add(radC2);

		/**
		 * image that shows user option 2
		 */
		ii2 = new ImageIcon("green.png");
		JLabel lblC2 = new JLabel(ii2);
		lblC2.setBounds(166, 152, 90, 14);
		frmEnemyDestroyers.getContentPane().add(lblC2);
		
		radC3 = new JRadioButton("");
		radC3.setBackground(new Color(0, 0, 51));
		radC3.setFont(new Font("Castellar", Font.PLAIN, 12));
		radC3.setBounds(265, 147, 20, 23);
		frmEnemyDestroyers.getContentPane().add(radC3);
		
		/**
		 * image that shows user option 3
		 */
		ii3 = new ImageIcon("violet.png");
		JLabel lblC3 = new JLabel(ii3);
		lblC3.setBounds(289, 152, 130, 14);
		frmEnemyDestroyers.getContentPane().add(lblC3);

		JLabel lblChar = new JLabel("Character Select:");
		lblChar.setForeground(new Color(224, 255, 255));
		lblChar.setFont(new Font("Castellar", Font.PLAIN, 12));
		lblChar.setBounds(123, 126, 154, 14);
		frmEnemyDestroyers.getContentPane().add(lblChar);

		JLabel lblTitle = new JLabel("Enemy Destroyers");
		lblTitle.setForeground(new Color(224, 255, 255));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Castellar", Font.PLAIN, 36));
		lblTitle.setBounds(10, 21, 414, 59);
		frmEnemyDestroyers.getContentPane().add(lblTitle);

		/**
		 * adds raadio buttons to group box
		 */
		bG=new ButtonGroup();
		bG.add(radC1);
		bG.add(radC2);
		bG.add(radC3);
		

	}
	
	/**
	 * 
	 * @return character value
	 */
	public int getuV(){
		return userV;
	}
}
