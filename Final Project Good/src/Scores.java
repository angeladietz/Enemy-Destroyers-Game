import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * High Score Class that records the scores
 * @author 96017die
 */
public class Scores {

	private ArrayList<Long> scores; //array list of scores
	private long plSc; //users score
	private String plNm; //players name
	private File f; // file that will contain the high scores
	private PrintWriter pw;

	public Scores(long plSc, String plNm){
		this.plSc = plSc;
		this.plNm = plNm;
		long temp; // temporary variable for inputting scores
		scores = new ArrayList<Long>(); //defines array list of top scores
		try {

			f = new File("HighScores.txt"); //file with existing highscores
			pw = new PrintWriter(new FileOutputStream(f,true /* append = true */));
			pw.println(plSc +"\n"); //adds your score to the file

			pw.close();
			
			Scanner sc = new Scanner(f); //creates scanner to read through the file

			/**
			 * adds scores from file to the list
			 */
			while (sc.hasNext()){
				temp = sc.nextInt();
				scores.add(temp);
			}
			sc.close();
			
			/**
			 * sorts high scores from high to low
			 */
			Collections.sort(scores);
			Collections.reverse(scores);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return list of scores
	 */
	public ArrayList<Long> getList(){
		return scores;
	}
}

