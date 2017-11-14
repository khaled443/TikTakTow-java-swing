
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * 
 * @author Khaled Halabieh
 * Matrikelnummer:556290
 *
 */
public class Controller implements ActionListener {
	private JButton b;
	private static int counter;
	private static JTextField result ;
	private static boolean isFertig=false;
	/**
	 * Constructor that Receive an Object from type JButton
	 * @param b
	 */
	 public Controller(JButton b) {
		 this.b=b;
	}
	 /**
	  * Constructor that Receive an Object from type JTextField
	  * @param result
	  */
	  public Controller(JTextField result) {
		 this.result=result;
	}
	  /**
	   * General Constructor
	   */
	  public Controller() {
	}
	  
	  Random random = new Random();
	  /**
	   * The Method actionPerformed receive an Object from type ActionEvent
	   * if the filed already been taken and the game is not finished , it shows an Error massage
	   * if not, it prints X or O depends on whos turn is it .
	   * if there is more than 9 filds been taken , it cheks if there is a winner
	   * if all Filds been taken and no Winner , it shows a massage with "Match is a draw!"
	   */

		@Override
	public void actionPerformed(ActionEvent e) {
	  if (isFertig==false) {
		
	
			if (b.getText()=="X"||b.getText()=="O"){
	            JOptionPane.showMessageDialog(null, "Error : this field is already been taken !!");
			}else{
		
		if (counter%2==0&&isFertig==false) {
			result.setText("It is Player O turn");
			b.setText("X");
			counter++;

			if (counter%2==1&& counter!=25) {
				
				
				result.setText("Its Player X turn");
				int x = random.nextInt(5)+0;
				int y =random.nextInt(5)+0;
				while (TikTak.buttons[x][y].getText()!=" ") {
					x=random.nextInt(5)+0;
					y=random.nextInt(5)+0;
				}
				TikTak.buttons[x][y].setText("O");
				
				counter++;
				

			}
		}
			}
		
			
		
		if (counter>=9) {
			winnerCheck();
		}
		if (isFertig==false&&counter==25) {
            JOptionPane.showMessageDialog(null, "Match is a draw!");
            isFertig=true;
		
		}
	  }
	  else{
		    JOptionPane.showMessageDialog(null, "The Game is finished !!");


	  }
		
	}
		
		
		/**
		 * the Method winnerCheck checks if there is a winner and it change the Color of the winning  Filds to Red
		 *
		 */
		
		public void winnerCheck(){
			if (TikTak.buttons[0][0].getText()!=" " &&
				TikTak.buttons[0][0].getText()==TikTak.buttons[0][1].getText()&&
				TikTak.buttons[0][1].getText()==TikTak.buttons[0][2].getText()&&
				TikTak.buttons[0][2].getText()==TikTak.buttons[0][3].getText()&&
				TikTak.buttons[0][3].getText()==TikTak.buttons[0][4].getText()
					) {
				TikTak.buttons[0][0].setBackground(Color.red);
				TikTak.buttons[0][1].setBackground(Color.red);
				TikTak.buttons[0][2].setBackground(Color.red);
				TikTak.buttons[0][3].setBackground(Color.red);
				TikTak.buttons[0][4].setBackground(Color.red);

	            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[0][0].getText());
	            isFertig=true;

			}else if (TikTak.buttons[1][0].getText()!=" " &&
					TikTak.buttons[1][0].getText()==TikTak.buttons[1][1].getText()&&
					TikTak.buttons[1][1].getText()==TikTak.buttons[1][2].getText()&&
					TikTak.buttons[1][2].getText()==TikTak.buttons[1][3].getText()&&
					TikTak.buttons[1][3].getText()==TikTak.buttons[1][4].getText()
						) {
				TikTak.buttons[1][0].setBackground(Color.red);
				TikTak.buttons[1][1].setBackground(Color.red);
				TikTak.buttons[1][2].setBackground(Color.red);
				TikTak.buttons[1][3].setBackground(Color.red);
				TikTak.buttons[1][4].setBackground(Color.red);


		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[1][0].getText());
		            isFertig=true;

				}
			else if (TikTak.buttons[2][0].getText()!=" " &&
					TikTak.buttons[2][0].getText()==TikTak.buttons[2][1].getText()&&
					TikTak.buttons[2][1].getText()==TikTak.buttons[2][2].getText()&&
					TikTak.buttons[2][2].getText()==TikTak.buttons[2][3].getText()&&
					TikTak.buttons[2][3].getText()==TikTak.buttons[2][4].getText()
						) {
				TikTak.buttons[2][0].setBackground(Color.red);
				TikTak.buttons[2][1].setBackground(Color.red);
				TikTak.buttons[2][2].setBackground(Color.red);
				TikTak.buttons[2][3].setBackground(Color.red);
				TikTak.buttons[2][4].setBackground(Color.red);


		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[2][0].getText());
		            isFertig=true;

				}
			else if (TikTak.buttons[3][0].getText()!=" " &&
					TikTak.buttons[3][0].getText()==TikTak.buttons[3][1].getText()&&
					TikTak.buttons[3][1].getText()==TikTak.buttons[3][2].getText()&&
					TikTak.buttons[3][2].getText()==TikTak.buttons[3][3].getText()&&
					TikTak.buttons[3][3].getText()==TikTak.buttons[3][4].getText()
						) {
				TikTak.buttons[3][0].setBackground(Color.red);
				TikTak.buttons[3][1].setBackground(Color.red);
				TikTak.buttons[3][2].setBackground(Color.red);
				TikTak.buttons[3][3].setBackground(Color.red);
				TikTak.buttons[3][4].setBackground(Color.red);

		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[3][0].getText());
		            isFertig=true;

				}
			else if (TikTak.buttons[4][0].getText()!=" " &&
					TikTak.buttons[4][0].getText()==TikTak.buttons[4][1].getText()&&
					TikTak.buttons[4][1].getText()==TikTak.buttons[4][2].getText()&&
					TikTak.buttons[4][2].getText()==TikTak.buttons[4][3].getText()&&
					TikTak.buttons[4][3].getText()==TikTak.buttons[4][4].getText()
						) {
				TikTak.buttons[4][0].setBackground(Color.red);
				TikTak.buttons[4][1].setBackground(Color.red);
				TikTak.buttons[4][2].setBackground(Color.red);
				TikTak.buttons[4][3].setBackground(Color.red);
				TikTak.buttons[4][4].setBackground(Color.red);

		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[4][0].getText());
		            isFertig=true;

				}
			else if (TikTak.buttons[0][0].getText()!=" " &&
					TikTak.buttons[0][0].getText()==TikTak.buttons[1][0].getText()&&
					TikTak.buttons[1][0].getText()==TikTak.buttons[2][0].getText()&&
					TikTak.buttons[2][0].getText()==TikTak.buttons[3][0].getText()&&
					TikTak.buttons[3][0].getText()==TikTak.buttons[4][0].getText()
						) {
				TikTak.buttons[0][0].setBackground(Color.red);
				TikTak.buttons[1][0].setBackground(Color.red);
				TikTak.buttons[2][0].setBackground(Color.red);
				TikTak.buttons[3][0].setBackground(Color.red);
				TikTak.buttons[4][0].setBackground(Color.red);

		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[0][0].getText());
		            isFertig=true;

				}
			else if (TikTak.buttons[0][1].getText()!=" " &&
					TikTak.buttons[0][1].getText()==TikTak.buttons[1][1].getText()&&
					TikTak.buttons[1][1].getText()==TikTak.buttons[2][1].getText()&&
					TikTak.buttons[2][1].getText()==TikTak.buttons[3][1].getText()&&
					TikTak.buttons[3][1].getText()==TikTak.buttons[4][1].getText()
						) {
				TikTak.buttons[0][1].setBackground(Color.red);
				TikTak.buttons[0][2].setBackground(Color.red);
				TikTak.buttons[0][3].setBackground(Color.red);
				TikTak.buttons[0][4].setBackground(Color.red);
				TikTak.buttons[0][5].setBackground(Color.red);

		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[4][1].getText());
		            isFertig=true;

				}
			else if (TikTak.buttons[0][2].getText()!=" " &&
					TikTak.buttons[0][2].getText()==TikTak.buttons[1][2].getText()&&
					TikTak.buttons[1][2].getText()==TikTak.buttons[2][2].getText()&&
					TikTak.buttons[2][2].getText()==TikTak.buttons[3][2].getText()&&					
					TikTak.buttons[3][2].getText()==TikTak.buttons[4][2].getText()
						) {
				TikTak.buttons[0][2].setBackground(Color.red);
				TikTak.buttons[1][2].setBackground(Color.red);
				TikTak.buttons[2][2].setBackground(Color.red);
				TikTak.buttons[3][2].setBackground(Color.red);
				TikTak.buttons[4][2].setBackground(Color.red);


		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[4][2].getText());
		            isFertig=true;

				}
			else if (TikTak.buttons[0][3].getText()!=" " &&
					TikTak.buttons[0][3].getText()==TikTak.buttons[1][3].getText()&&
					TikTak.buttons[1][3].getText()==TikTak.buttons[2][3].getText()&&
					TikTak.buttons[2][3].getText()==TikTak.buttons[3][3].getText()&&
					TikTak.buttons[3][3].getText()==TikTak.buttons[4][3].getText()
						) {
				TikTak.buttons[0][3].setBackground(Color.red);
				TikTak.buttons[1][3].setBackground(Color.red);
				TikTak.buttons[2][3].setBackground(Color.red);
				TikTak.buttons[3][3].setBackground(Color.red);
				TikTak.buttons[4][3].setBackground(Color.red);

		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[4][3].getText());
		            isFertig=true;

				}
			else if (TikTak.buttons[0][4].getText()!=" " &&
					TikTak.buttons[0][4].getText()==TikTak.buttons[1][4].getText()&&
					TikTak.buttons[1][4].getText()==TikTak.buttons[2][4].getText()&&
					TikTak.buttons[2][4].getText()==TikTak.buttons[3][4].getText()&&
					TikTak.buttons[3][4].getText()==TikTak.buttons[4][4].getText()
						) {
					TikTak.buttons[0][4].setBackground(Color.red);
					TikTak.buttons[1][4].setBackground(Color.red);
					TikTak.buttons[2][4].setBackground(Color.red);
					TikTak.buttons[3][4].setBackground(Color.red);
					TikTak.buttons[4][4].setBackground(Color.red);
		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[4][4].getText());

		            isFertig=true;

				}
			else if (TikTak.buttons[0][0].getText()!=" " &&
					TikTak.buttons[0][0].getText()==TikTak.buttons[1][1].getText()&&
					TikTak.buttons[1][1].getText()==TikTak.buttons[2][2].getText()&&
					TikTak.buttons[2][2].getText()==TikTak.buttons[3][3].getText()&&
					TikTak.buttons[3][3].getText()==TikTak.buttons[4][4].getText()
						) {
				TikTak.buttons[0][0].setBackground(Color.red);
				TikTak.buttons[1][1].setBackground(Color.red);
				TikTak.buttons[2][2].setBackground(Color.red);
				TikTak.buttons[3][3].setBackground(Color.red);
				TikTak.buttons[4][4].setBackground(Color.red);

		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[0][0].getText());
		            isFertig=true;

				}
			else if (TikTak.buttons[0][4].getText()!=" " &&
					TikTak.buttons[0][4].getText()==TikTak.buttons[1][3].getText()&&
					TikTak.buttons[1][3].getText()==TikTak.buttons[2][2].getText()&&
					TikTak.buttons[2][2].getText()==TikTak.buttons[3][1].getText()&&
					TikTak.buttons[3][1].getText()==TikTak.buttons[4][0].getText()
						) {
				TikTak.buttons[0][4].setBackground(Color.red);
				TikTak.buttons[1][3].setBackground(Color.red);
				TikTak.buttons[2][2].setBackground(Color.red);
				TikTak.buttons[3][1].setBackground(Color.red);
				TikTak.buttons[4][0].setBackground(Color.red);

		            JOptionPane.showMessageDialog(null, "Congratulations!!"+"\n"+"the winner is :"+TikTak.buttons[4][0].getText());
		            isFertig=true;

				}
		}

	
}
