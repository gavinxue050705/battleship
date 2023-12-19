/**
 * description
 * 
 * modified		20210726
 * date			20210726
 * 
 * @filename	XueGavinBattleship.java
 * @author 		Gavin Xue
 * @version		1.0
 * @see			unit 5.2 content
 */

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class battleship extends JFrame {

	int userShip1 = 0, userShip2 = 0, userShip3 = 0;
	int botShip1 = 0, botShip2 = 0, botShip3 = 0;
	int userTarget = 0;
	int [] botTarget = new int [10];
	int userScore = 0, botScore = 0;
	int userShipsLeft = 3, botShipsLeft = 3;
	int buttonPress = 0;
	int movesLeft = 9;
	String userResult = "", botResult = "";
	
	JButton btnUser1;
	JButton btnUser2;
	JButton btnUser3;
	JButton btnUser4;
	JButton btnUser5;
	JButton btnUser6;
	JButton btnUser7;
	JButton btnUser8;
	JButton btnUser9;
	JButton btnUser10;
	JButton btnUser11;
	JButton btnUser12;
	JButton btnUser13;
	JButton btnUser14;
	JButton btnUser15;
	JButton btnUser16;
	JButton btnUser17;
	JButton btnUser18;
	JButton btnUser19;
	JButton btnUser20;
	JButton btnUser21;
	JButton btnUser22;
	JButton btnUser23;
	JButton btnUser24;
	JButton btnUser25;
	
	JButton btnBot1;
	JButton btnBot2;
	JButton btnBot3;
	JButton btnBot4;
	JButton btnBot5;
	JButton btnBot6;
	JButton btnBot7;
	JButton btnBot8;
	JButton btnBot9;
	JButton btnBot10;
	JButton btnBot11;
	JButton btnBot12;
	JButton btnBot13;
	JButton btnBot14;
	JButton btnBot15;
	JButton btnBot16;
	JButton btnBot17;
	JButton btnBot18;
	JButton btnBot19;
	JButton btnBot20;
	JButton btnBot21;
	JButton btnBot22;
	JButton btnBot23;
	JButton btnBot24;
	JButton btnBot25;
	
	JLabel lblMessage;
	JLabel lblMovesLeft;
	JLabel lblUserShipsLeft;
	JLabel lblBotShipsLeft;
	JLabel lblBotShipsDestroyed;
	JLabel lblUserShipsDestroyed;
	
	private JPanel contentPane;	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					battleship frame = new battleship();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	public void userHitOrMiss() {
		
		if (movesLeft > 0) {
			
			if ((userTarget == botShip1) || (userTarget == botShip2) || (userTarget == botShip3)) {
				userResult = "Hit";
				userScore = userScore + 1;
				botShipsLeft = botShipsLeft - 1;
				
				if ((userScore == 3) && (botShipsLeft == 0)) {
					gameFinish();
				}
				
			}
			else if ((userTarget != botShip1) || (userTarget != botShip2) || (userTarget != botShip3)) {
				userResult = "Miss";
			}							
		}
		
		else if (movesLeft == 0) {		
			gameFinish();	
		}
		
		movesLeft = movesLeft - 1;
		
		lblUserShipsLeft.setText("Allied ships remaining: " + userShipsLeft);
		lblUserShipsDestroyed.setText("Enemy ships destroyed: " + userScore);
		lblBotShipsLeft.setText("Enemy ships remaining: " + botShipsLeft);
		lblBotShipsDestroyed.setText("Allied ships destroyed: " + botScore);
		lblMovesLeft.setText("Moves remaining: " + (movesLeft + 1));
	
		if (userTarget == 1) {
			btnBot1.setText(userResult);
		}
		else if (userTarget == 2) {
			btnBot2.setText(userResult);
		}
		else if (userTarget == 3) {
			btnBot3.setText(userResult);
		}
		else if (userTarget == 4) {
			btnBot4.setText(userResult);
		}
		else if (userTarget == 5) {
			btnBot5.setText(userResult);
		}
		else if (userTarget == 6) {
			btnBot6.setText(userResult);
		}
		else if (userTarget == 7) {
			btnBot7.setText(userResult);
		}
		else if (userTarget == 8) {
			btnBot8.setText(userResult);
		}
		else if (userTarget == 9) {
			btnBot9.setText(userResult);
		}
		else if (userTarget == 10) {
			btnBot10.setText(userResult);
		}
		else if (userTarget == 11) {
			btnBot11.setText(userResult);
		}
		else if (userTarget == 12) {
			btnBot12.setText(userResult);
		}
		else if (userTarget == 13) {
			btnBot13.setText(userResult);
		}
		else if (userTarget == 14) {
			btnBot14.setText(userResult);
		}
		else if (userTarget == 15) {
			btnBot15.setText(userResult);
		}
		else if (userTarget == 16) {
			btnBot16.setText(userResult);
		}
		else if (userTarget == 17) {
			btnBot17.setText(userResult);
		}
		else if (userTarget == 18) {
			btnBot18.setText(userResult);
		}
		else if (userTarget == 19) {
			btnBot19.setText(userResult);
		}
		else if (userTarget == 20) {
			btnBot20.setText(userResult);
		}
		else if (userTarget == 21) {
			btnBot21.setText(userResult);
		}
		else if (userTarget == 22) {
			btnBot22.setText(userResult);
		}
		else if (userTarget == 23) {
			btnBot23.setText(userResult);
		}
		else if (userTarget == 24) {
			btnBot24.setText(userResult);
		}
		else if (userTarget == 25) {
			btnBot25.setText(userResult);
		}			
	}
	
	public void botHitOrMiss() {
		
		int j = 9 - movesLeft - 1;	
		
		if ((botTarget[j] == userShip1) || (botTarget[j] == userShip2) || (botTarget[j] == userShip3)) {
			botResult = "Hit";
			botScore = botScore + 1;
			userShipsLeft = userShipsLeft - 1;
			
			if ((botScore == 3) && (userShipsLeft == 0)) {
				gameFinish();
			}
			
		}
		else if ((botTarget[j] != userShip1) || (botTarget[j] != userShip2) || (botTarget[j] != userShip3)) {
			botResult = "Miss";
		}
		
		lblUserShipsLeft.setText("Allied ships remaining: " + userShipsLeft);
		lblUserShipsDestroyed.setText("Enemy ships destroyed: " + userScore);
		lblBotShipsLeft.setText("Enemy ships remaining: " + botShipsLeft);
		lblBotShipsDestroyed.setText("Allied ships destroyed: " + botScore);
		
		if (botTarget[j] == 1) {
			btnUser1.setText(botResult);
		}
		else if (botTarget[j] == 2) {
			btnUser2.setText(botResult);
		}
		else if (botTarget[j] == 3) {
			btnUser3.setText(botResult);
		}
		else if (botTarget[j] == 4) {
			btnUser4.setText(botResult);
		}
		else if (botTarget[j] == 5) {
			btnUser5.setText(botResult);
		}
		else if (botTarget[j] == 6) {
			btnUser6.setText(botResult);
		}
		else if (botTarget[j] == 7) {
			btnUser7.setText(botResult);
		}
		else if (botTarget[j] == 8) {
			btnUser8.setText(botResult);
		}
		else if (botTarget[j] == 9) {
			btnUser9.setText(botResult);
		}
		else if (botTarget[j] == 10) {
			btnUser10.setText(botResult);
		}
		else if (botTarget[j] == 11) {
			btnUser11.setText(botResult);
		}
		else if (botTarget[j] == 12) {
			btnUser12.setText(botResult);
		}
		else if (botTarget[j] == 13) {
			btnUser13.setText(botResult);
		}
		else if (botTarget[j] == 14) {
			btnUser14.setText(botResult);
		}
		else if (botTarget[j] == 15) {
			btnUser15.setText(botResult);
		}
		else if (botTarget[j] == 16) {
			btnUser16.setText(botResult);
		}
		else if (botTarget[j] == 17) {
			btnUser17.setText(botResult);
		}
		else if (botTarget[j] == 18) {
			btnUser18.setText(botResult);
		}
		else if (botTarget[j] == 19) {
			btnUser19.setText(botResult);
		}
		else if (botTarget[j] == 20) {
			btnUser20.setText(botResult);
		}
		else if (botTarget[j] == 21) {
			btnUser21.setText(botResult);
		}
		else if (botTarget[j] == 22) {
			btnUser22.setText(botResult);
		}
		else if (botTarget[j] == 23) {
			btnUser23.setText(botResult);
		}
		else if (botTarget[j] == 24) {
			btnUser24.setText(botResult);
		}
		else if (botTarget[j] == 25) {
			btnUser25.setText(botResult);
		}			
	}
	
	public void gameFinish() {
		
		btnBot1.setEnabled(false);
		btnBot2.setEnabled(false);
		btnBot3.setEnabled(false);
		btnBot4.setEnabled(false);
		btnBot5.setEnabled(false);
		btnBot6.setEnabled(false);
		btnBot7.setEnabled(false);
		btnBot8.setEnabled(false);
		btnBot9.setEnabled(false);
		btnBot10.setEnabled(false);
		btnBot11.setEnabled(false);
		btnBot12.setEnabled(false);
		btnBot13.setEnabled(false);
		btnBot14.setEnabled(false);
		btnBot15.setEnabled(false);
		btnBot16.setEnabled(false);
		btnBot17.setEnabled(false);
		btnBot18.setEnabled(false);
		btnBot19.setEnabled(false);
		btnBot20.setEnabled(false);
		btnBot21.setEnabled(false);
		btnBot22.setEnabled(false);
		btnBot23.setEnabled(false);
		btnBot24.setEnabled(false);
		btnBot25.setEnabled(false);	
		
		if (userScore == 3) {		
			lblMessage.setText("Congratualations! You destroyed all enemy ships!");
		}
		else if (botScore == 3) {
			lblMessage.setText("All your ships were destroyed! Better luck next time!");
		}	
		else if (movesLeft == 0) {
			lblMessage.setText("You ran out of moves! Better luck next time!");
		}
	}
	
	public battleship() {	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSetShips = new JButton("Set Ships");
		
		JButton btnStart = new JButton("Start Game");
		
		JLabel lblHeader = new JLabel("Battleship");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setBounds(10, 11, 625, 22);
		contentPane.add(lblHeader);
		
		JLabel lblUserGrid = new JLabel("You");
		lblUserGrid.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserGrid.setBounds(10, 44, 290, 14);
		contentPane.add(lblUserGrid);
		
		JLabel lblBotGrid = new JLabel("Bot");
		lblBotGrid.setHorizontalAlignment(SwingConstants.CENTER);
		lblBotGrid.setBounds(345, 44, 290, 14);
		contentPane.add(lblBotGrid);
		
		lblMessage = new JLabel("Please select the location of your three ships on your grid.");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(10, 452, 625, 14);
		contentPane.add(lblMessage);	

		lblMovesLeft = new JLabel("Moves remaining: 10");
		lblMovesLeft.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovesLeft.setBounds(10, 427, 625, 14);
		lblMovesLeft.setVisible(false);
		contentPane.add(lblMovesLeft);
		
		btnUser1 = new JButton("");
		btnUser1.setForeground(new Color(0, 0, 0));
		btnUser1.setBackground(new Color(0, 191, 255));
		btnUser1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 1;
					btnUser1.setEnabled(false);
					btnUser1.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 1;
					btnUser1.setEnabled(false);
					btnUser1.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 1;
					btnUser1.setEnabled(false);			
					btnUser1.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser1.setBounds(10, 69, 50, 50);
		contentPane.add(btnUser1);
		
		btnUser2 = new JButton("");
		btnUser2.setBackground(new Color(0, 191, 255));
		btnUser2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 2;
					btnUser2.setEnabled(false);
					btnUser2.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 2;
					btnUser2.setEnabled(false);
					btnUser2.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 2;
					btnUser2.setEnabled(false);			
					btnUser2.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser2.setBounds(70, 69, 50, 50);
		contentPane.add(btnUser2);
		
		btnUser3 = new JButton("");
		btnUser3.setBackground(new Color(0, 191, 255));
		btnUser3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 3;
					btnUser3.setEnabled(false);
					btnUser3.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 3;
					btnUser3.setEnabled(false);
					btnUser3.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 3;
					btnUser3.setEnabled(false);			
					btnUser3.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser3.setBounds(130, 69, 50, 50);
		contentPane.add(btnUser3);
		
		btnUser4 = new JButton("");
		btnUser4.setBackground(new Color(0, 191, 255));
		btnUser4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 4;
					btnUser4.setEnabled(false);
					btnUser4.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 4;
					btnUser4.setEnabled(false);
					btnUser4.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 4;
					btnUser4.setEnabled(false);			
					btnUser4.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser4.setBounds(190, 69, 50, 50);
		contentPane.add(btnUser4);
		
		btnUser5 = new JButton("");
		btnUser5.setBackground(new Color(0, 191, 255));
		btnUser5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 5;
					btnUser5.setEnabled(false);
					btnUser5.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 5;
					btnUser5.setEnabled(false);
					btnUser5.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 5;
					btnUser5.setEnabled(false);			
					btnUser5.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser5.setBounds(250, 69, 50, 50);
		contentPane.add(btnUser5);
		
		btnUser6 = new JButton("");
		btnUser6.setBackground(new Color(0, 191, 255));
		btnUser6.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 6;
					btnUser6.setEnabled(false);
					btnUser6.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 6;
					btnUser6.setEnabled(false);
					btnUser6.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 6;
					btnUser6.setEnabled(false);			
					btnUser6.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser6.setBounds(10, 130, 50, 50);
		contentPane.add(btnUser6);
		
		btnUser7 = new JButton("");
		btnUser7.setBackground(new Color(0, 191, 255));
		btnUser7.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 7;
					btnUser7.setEnabled(false);
					btnUser7.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 7;
					btnUser7.setEnabled(false);
					btnUser7.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 7;
					btnUser7.setEnabled(false);			
					btnUser7.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser7.setBounds(70, 130, 50, 50);
		contentPane.add(btnUser7);
		
		btnUser8 = new JButton("");
		btnUser8.setBackground(new Color(0, 191, 255));
		btnUser8.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 8;
					btnUser8.setEnabled(false);
					btnUser8.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 8;
					btnUser8.setEnabled(false);
					btnUser8.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 8;
					btnUser8.setEnabled(false);			
					btnUser8.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser8.setBounds(130, 130, 50, 50);
		contentPane.add(btnUser8);
		
		btnUser9 = new JButton("");
		btnUser9.setBackground(new Color(0, 191, 255));
		btnUser9.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 9;
					btnUser9.setEnabled(false);
					btnUser9.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 9;
					btnUser9.setEnabled(false);
					btnUser9.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 9;
					btnUser9.setEnabled(false);			
					btnUser9.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser9.setBounds(190, 130, 50, 50);
		contentPane.add(btnUser9);
		
		btnUser10 = new JButton("");
		btnUser10.setBackground(new Color(0, 191, 255));
		btnUser10.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 10;
					btnUser10.setEnabled(false);
					btnUser10.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 10;
					btnUser10.setEnabled(false);
					btnUser10.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 10;
					btnUser10.setEnabled(false);			
					btnUser10.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser10.setBounds(250, 130, 50, 50);
		contentPane.add(btnUser10);
		
		btnUser11 = new JButton("");
		btnUser11.setBackground(new Color(0, 191, 255));
		btnUser11.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 11;
					btnUser11.setEnabled(false);
					btnUser11.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 11;
					btnUser11.setEnabled(false);
					btnUser11.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 11;
					btnUser11.setEnabled(false);			
					btnUser11.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser11.setBounds(10, 191, 50, 50);
		contentPane.add(btnUser11);
		
		btnUser12 = new JButton("");
		btnUser12.setBackground(new Color(0, 191, 255));
		btnUser12.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 12;
					btnUser12.setEnabled(false);
					btnUser12.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 12;
					btnUser12.setEnabled(false);
					btnUser12.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 12;
					btnUser12.setEnabled(false);			
					btnUser12.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser12.setBounds(70, 191, 50, 50);
		contentPane.add(btnUser12);
		
		btnUser13 = new JButton("");
		btnUser13.setBackground(new Color(0, 191, 255));
		btnUser13.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 13;
					btnUser13.setEnabled(false);
					btnUser13.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 13;
					btnUser13.setEnabled(false);
					btnUser13.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 13;
					btnUser13.setEnabled(false);			
					btnUser13.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser13.setBounds(130, 191, 50, 50);
		contentPane.add(btnUser13);
		
		btnUser14 = new JButton("");
		btnUser14.setBackground(new Color(0, 191, 255));
		btnUser14.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 14;
					btnUser14.setEnabled(false);
					btnUser14.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 14;
					btnUser14.setEnabled(false);
					btnUser14.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 14;
					btnUser14.setEnabled(false);			
					btnUser14.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser14.setBounds(190, 191, 50, 50);
		contentPane.add(btnUser14);
		
		btnUser15 = new JButton("");
		btnUser15.setBackground(new Color(0, 191, 255));
		btnUser15.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 15;
					btnUser15.setEnabled(false);
					btnUser15.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 15;
					btnUser15.setEnabled(false);
					btnUser15.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 15;
					btnUser15.setEnabled(false);			
					btnUser15.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser15.setBounds(250, 191, 50, 50);
		contentPane.add(btnUser15);
		
		btnUser16 = new JButton("");
		btnUser16.setBackground(new Color(0, 191, 255));
		btnUser16.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 16;
					btnUser16.setEnabled(false);
					btnUser16.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 16;
					btnUser16.setEnabled(false);
					btnUser16.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 16;
					btnUser16.setEnabled(false);			
					btnUser16.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser16.setBounds(10, 252, 50, 50);
		contentPane.add(btnUser16);
		
		btnUser17 = new JButton("");
		btnUser17.setBackground(new Color(0, 191, 255));
		btnUser17.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 17;
					btnUser17.setEnabled(false);
					btnUser17.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 17;
					btnUser17.setEnabled(false);
					btnUser17.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 17;
					btnUser17.setEnabled(false);			
					btnUser17.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser17.setBounds(70, 252, 50, 50);
		contentPane.add(btnUser17);
		
		btnUser18 = new JButton("");
		btnUser18.setBackground(new Color(0, 191, 255));
		btnUser18.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 18;
					btnUser18.setEnabled(false);
					btnUser18.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 18;
					btnUser18.setEnabled(false);
					btnUser18.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 18;
					btnUser18.setEnabled(false);			
					btnUser18.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser18.setBounds(130, 252, 50, 50);
		contentPane.add(btnUser18);
		
		btnUser19 = new JButton("");
		btnUser19.setBackground(new Color(0, 191, 255));
		btnUser19.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 19;
					btnUser19.setEnabled(false);
					btnUser19.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 19;
					btnUser19.setEnabled(false);
					btnUser19.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 19;
					btnUser19.setEnabled(false);			
					btnUser19.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser19.setBounds(190, 252, 50, 50);
		contentPane.add(btnUser19);
		
		btnUser20 = new JButton("");
		btnUser20.setBackground(new Color(0, 191, 255));
		btnUser20.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 20;
					btnUser20.setEnabled(false);
					btnUser20.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 20;
					btnUser20.setEnabled(false);
					btnUser20.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 20;
					btnUser20.setEnabled(false);			
					btnUser20.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser20.setBounds(250, 252, 50, 50);
		contentPane.add(btnUser20);
		
		btnUser21 = new JButton("");
		btnUser21.setBackground(new Color(0, 191, 255));
		btnUser21.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 21;
					btnUser21.setEnabled(false);
					btnUser21.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 21;
					btnUser21.setEnabled(false);
					btnUser21.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 21;
					btnUser21.setEnabled(false);			
					btnUser21.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser21.setBounds(10, 313, 50, 50);
		contentPane.add(btnUser21);
		
		btnUser22 = new JButton("");
		btnUser22.setBackground(new Color(0, 191, 255));
		btnUser22.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 22;
					btnUser22.setEnabled(false);
					btnUser22.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 22;
					btnUser22.setEnabled(false);
					btnUser22.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 22;
					btnUser22.setEnabled(false);			
					btnUser22.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser22.setBounds(70, 313, 50, 50);
		contentPane.add(btnUser22);
		
		btnUser23 = new JButton("");
		btnUser23.setBackground(new Color(0, 191, 255));
		btnUser23.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 23;
					btnUser23.setEnabled(false);
					btnUser23.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 23;
					btnUser23.setEnabled(false);
					btnUser23.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 23;
					btnUser23.setEnabled(false);			
					btnUser23.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser23.setBounds(130, 313, 50, 50);
		contentPane.add(btnUser23);
		
		btnUser24 = new JButton("");
		btnUser24.setBackground(new Color(0, 191, 255));
		btnUser24.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 24;
					btnUser24.setEnabled(false);
					btnUser24.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 24;
					btnUser24.setEnabled(false);
					btnUser24.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 24;
					btnUser24.setEnabled(false);			
					btnUser24.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser24.setBounds(190, 313, 50, 50);
		contentPane.add(btnUser24);
		
		btnUser25 = new JButton("");
		btnUser25.setBackground(new Color(0, 191, 255));
		btnUser25.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonPress = buttonPress + 1;
				
				if (buttonPress == 1) {
					userShip1 = 25;
					btnUser25.setEnabled(false);
					btnUser25.setText("Ship");
				}
				else if (buttonPress == 2) {
					userShip2 = 25;
					btnUser25.setEnabled(false);
					btnUser25.setText("Ship");
				}
				else if (buttonPress == 3) {
					userShip3 = 25;
					btnUser25.setEnabled(false);			
					btnUser25.setText("Ship");
					btnSetShips.setEnabled(true);
					lblMessage.setText("Click button to set ships.");
				}				
				else {
					lblMessage.setText("You have no more ships. Please click the button to set ships.");
				}
			}
		});
		btnUser25.setBounds(250, 313, 50, 50);
		contentPane.add(btnUser25);
		
		btnBot1 = new JButton("");
		btnBot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 1;
				userHitOrMiss();
				botHitOrMiss();			
			}
		});
		btnBot1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot1.setBackground(new Color(250, 128, 114));
		btnBot1.setEnabled(false);
		btnBot1.setBounds(345, 69, 50, 50);
		contentPane.add(btnBot1);
		
		btnBot2 = new JButton("");
		btnBot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 2;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot2.setBackground(new Color(250, 128, 114));
		btnBot2.setEnabled(false);
		btnBot2.setBounds(405, 69, 50, 50);
		contentPane.add(btnBot2);
		
		btnBot3 = new JButton("");
		btnBot3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 3;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot3.setBackground(new Color(250, 128, 114));
		btnBot3.setEnabled(false);
		btnBot3.setBounds(465, 69, 50, 50);
		contentPane.add(btnBot3);
		
		btnBot4 = new JButton("");
		btnBot4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 4;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot4.setBackground(new Color(250, 128, 114));
		btnBot4.setEnabled(false);
		btnBot4.setBounds(525, 69, 50, 50);
		contentPane.add(btnBot4);
		
		btnBot5 = new JButton("");
		btnBot5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 5;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot5.setBackground(new Color(250, 128, 114));
		btnBot5.setEnabled(false);
		btnBot5.setBounds(585, 69, 50, 50);
		contentPane.add(btnBot5);
		
		btnBot6 = new JButton("");
		btnBot6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 6;
				userHitOrMiss();
				botHitOrMiss();				
			}
			
		});
		btnBot6.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot6.setBackground(new Color(250, 128, 114));
		btnBot6.setEnabled(false);
		btnBot6.setBounds(345, 130, 50, 50);
		contentPane.add(btnBot6);
		
		btnBot7 = new JButton("");
		btnBot7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 7;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot7.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot7.setBackground(new Color(250, 128, 114));
		btnBot7.setEnabled(false);
		btnBot7.setBounds(405, 130, 50, 50);
		contentPane.add(btnBot7);
		
		btnBot8 = new JButton("");
		btnBot8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 8;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot8.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot8.setBackground(new Color(250, 128, 114));
		btnBot8.setEnabled(false);
		btnBot8.setBounds(465, 130, 50, 50);
		contentPane.add(btnBot8);
		
		btnBot9 = new JButton("");
		btnBot9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 9;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot9.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot9.setBackground(new Color(250, 128, 114));
		btnBot9.setEnabled(false);
		btnBot9.setBounds(525, 130, 50, 50);
		contentPane.add(btnBot9);
		
		btnBot10 = new JButton("");
		btnBot10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 10;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot10.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot10.setBackground(new Color(250, 128, 114));
		btnBot10.setEnabled(false);
		btnBot10.setBounds(585, 130, 50, 50);
		contentPane.add(btnBot10);
		
		btnBot11 = new JButton("");
		btnBot11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 11;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot11.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot11.setBackground(new Color(250, 128, 114));
		btnBot11.setEnabled(false);
		btnBot11.setBounds(345, 191, 50, 50);
		contentPane.add(btnBot11);
		
		btnBot12 = new JButton("");
		btnBot12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 12;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot12.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot12.setBackground(new Color(250, 128, 114));
		btnBot12.setEnabled(false);
		btnBot12.setBounds(405, 191, 50, 50);
		contentPane.add(btnBot12);
		
		btnBot13 = new JButton("");
		btnBot13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 13;
				userHitOrMiss();
				botHitOrMiss();				
			}
		});
		btnBot13.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot13.setBackground(new Color(250, 128, 114));
		btnBot13.setEnabled(false);
		btnBot13.setBounds(465, 191, 50, 50);
		contentPane.add(btnBot13);
		
		btnBot14 = new JButton("");
		btnBot14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 14;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot14.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot14.setBackground(new Color(250, 128, 114));
		btnBot14.setEnabled(false);
		btnBot14.setBounds(525, 191, 50, 50);
		contentPane.add(btnBot14);
		
		btnBot15 = new JButton("");
		btnBot15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 15;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot15.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot15.setBackground(new Color(250, 128, 114));
		btnBot15.setEnabled(false);
		btnBot15.setBounds(585, 191, 50, 50);
		contentPane.add(btnBot15);
		
		btnBot16 = new JButton("");
		btnBot16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 16;
				userHitOrMiss();
				botHitOrMiss();		
				
			}
		});
		btnBot16.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot16.setBackground(new Color(250, 128, 114));
		btnBot16.setEnabled(false);
		btnBot16.setBounds(345, 252, 50, 50);
		contentPane.add(btnBot16);
		
		btnBot17 = new JButton("");
		btnBot17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 17;
				userHitOrMiss();
				botHitOrMiss();			
			}
		});
		btnBot17.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot17.setBackground(new Color(250, 128, 114));
		btnBot17.setEnabled(false);
		btnBot17.setBounds(405, 252, 50, 50);
		contentPane.add(btnBot17);
		
		btnBot18 = new JButton("");
		btnBot18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 18;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot18.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot18.setBackground(new Color(250, 128, 114));
		btnBot18.setEnabled(false);
		btnBot18.setBounds(465, 252, 50, 50);
		contentPane.add(btnBot18);
		
		btnBot19 = new JButton("");
		btnBot19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 19;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot19.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot19.setBackground(new Color(250, 128, 114));
		btnBot19.setEnabled(false);
		btnBot19.setBounds(525, 252, 50, 50);
		contentPane.add(btnBot19);
		
		btnBot20 = new JButton("");
		btnBot20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 20;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot20.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot20.setBackground(new Color(250, 128, 114));
		btnBot20.setEnabled(false);
		btnBot20.setBounds(585, 252, 50, 50);
		contentPane.add(btnBot20);

		btnBot21 = new JButton("");
		btnBot21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 21;
				userHitOrMiss();
				botHitOrMiss();			
			}
		});
		btnBot21.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot21.setBackground(new Color(250, 128, 114));
		btnBot21.setEnabled(false);
		btnBot21.setBounds(345, 313, 50, 50);
		contentPane.add(btnBot21);
				
		btnBot22 = new JButton("");
		btnBot22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 22;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot22.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot22.setBackground(new Color(250, 128, 114));
		btnBot22.setEnabled(false);
		btnBot22.setBounds(405, 313, 50, 50);
		contentPane.add(btnBot22);
		
		btnBot23 = new JButton("");
		btnBot23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 23;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot23.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot23.setBackground(new Color(250, 128, 114));
		btnBot23.setEnabled(false);
		
		btnBot23.setBounds(465, 313, 50, 50);
		contentPane.add(btnBot23);
		btnBot24 = new JButton("");
		btnBot24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTarget = 24;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot24.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot24.setBackground(new Color(250, 128, 114));
		btnBot24.setEnabled(false);
		btnBot24.setBounds(525, 313, 50, 50);
		contentPane.add(btnBot24);
		
		btnBot25 = new JButton("");
		btnBot25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				userTarget = 25;
				userHitOrMiss();
				botHitOrMiss();		
			}
		});
		btnBot25.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBot25.setBackground(new Color(250, 128, 114));
		btnBot25.setEnabled(false);
		btnBot25.setBounds(585, 313, 50, 50);
		contentPane.add(btnBot25);
		
		btnSetShips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnUser1.setEnabled(false);
				btnUser2.setEnabled(false);
				btnUser3.setEnabled(false);
				btnUser4.setEnabled(false);
				btnUser5.setEnabled(false);
				btnUser6.setEnabled(false);
				btnUser7.setEnabled(false);
				btnUser8.setEnabled(false);
				btnUser9.setEnabled(false);
				btnUser10.setEnabled(false);
				btnUser11.setEnabled(false);
				btnUser12.setEnabled(false);
				btnUser13.setEnabled(false);
				btnUser14.setEnabled(false);
				btnUser15.setEnabled(false);
				btnUser16.setEnabled(false);
				btnUser17.setEnabled(false);
				btnUser18.setEnabled(false);
				btnUser19.setEnabled(false);
				btnUser20.setEnabled(false);
				btnUser21.setEnabled(false);
				btnUser22.setEnabled(false);
				btnUser23.setEnabled(false);
				btnUser24.setEnabled(false);
				btnUser25.setEnabled(false);	
				
				btnSetShips.setEnabled(false);
				
				btnStart.setEnabled(true);
				
				botShip1 = (int) Math.round(Math.random() * 24 + 1);
				botShip2 = (int) Math.round(Math.random() * 24 + 1);
				botShip3 = (int) Math.round(Math.random() * 24 + 1);
				
				while (botShip2 == botShip1) {				
					botShip2 = (int) Math.round(Math.random() * 24 + 1);
				}
				
				while ((botShip3 == botShip1) || (botShip3 == botShip2)) {				
					botShip3 = (int) Math.round(Math.random() * 24 + 1);
				}
				
				for (int i = 0;i < 10; i ++) {
					botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
				
					if (i == 1) {
						while (botTarget[i] == botTarget[i - 1]) {
							botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
						}
					}
					else if (i == 2) {
						while ((botTarget[i] == botTarget[i - 1]) || (botTarget[i] == botTarget[i - 2])) {
							botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
						}	
					}
					else if (i == 3) {
						while ((botTarget[i] == botTarget[i - 1]) || (botTarget[i] == botTarget[i - 2]) || (botTarget[i] == botTarget[i - 3])) {
							botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
						}	
					}
					else if (i == 4) {
						while ((botTarget[i] == botTarget[i - 1]) || (botTarget[i] == botTarget[i - 2]) || (botTarget[i] == botTarget[i - 3]) || 
								(botTarget[i] == botTarget[i - 4])) {
							botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
						}	
					}
					else if (i == 5) {
						while ((botTarget[i] == botTarget[i - 1]) || (botTarget[i] == botTarget[i - 2]) || (botTarget[i] == botTarget[i - 3]) ||
								(botTarget[i] == botTarget[i - 4]) || (botTarget[i] == botTarget[i - 5])) {
							botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
						}	
					}
					else if (i == 6) {
						while ((botTarget[i] == botTarget[i - 1]) || (botTarget[i] == botTarget[i - 2]) || (botTarget[i] == botTarget[i - 3]) ||
								(botTarget[i] == botTarget[i - 4]) || (botTarget[i] == botTarget[i - 5]) || (botTarget[i] == botTarget[i - 6])) {
							botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
						}	
					}
					else if (i == 7) {
						while ((botTarget[i] == botTarget[i - 1]) || (botTarget[i] == botTarget[i - 2]) || (botTarget[i] == botTarget[i - 3]) ||
								(botTarget[i] == botTarget[i - 4]) || (botTarget[i] == botTarget[i - 5]) || (botTarget[i] == botTarget[i - 6]) ||
								(botTarget[i] == botTarget[i - 7])) {
							botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
						}	
					}
					else if (i == 8) {
						while ((botTarget[i] == botTarget[i - 1]) || (botTarget[i] == botTarget[i - 2]) || (botTarget[i] == botTarget[i - 3]) ||
								(botTarget[i] == botTarget[i - 4]) || (botTarget[i] == botTarget[i - 5]) || (botTarget[i] == botTarget[i - 6]) ||
								(botTarget[i] == botTarget[i - 7]) || (botTarget[i] == botTarget[i - 8])) {
							botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
						}	
					}
					else if (i == 9) {
						while ((botTarget[i] == botTarget[i - 1]) || (botTarget[i] == botTarget[i - 2]) || (botTarget[i] == botTarget[i - 3]) ||
								(botTarget[i] == botTarget[i - 4]) || (botTarget[i] == botTarget[i - 5]) || (botTarget[i] == botTarget[i - 6]) ||
								(botTarget[i] == botTarget[i - 7]) || (botTarget[i] == botTarget[i - 8]) || (botTarget[i] == botTarget[i - 9])) {
							botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
						}	
					}
					else if (i == 10) {
						while ((botTarget[i] == botTarget[i - 1]) || (botTarget[i] == botTarget[i - 2]) || (botTarget[i] == botTarget[i - 3]) ||
								(botTarget[i] == botTarget[i - 4]) || (botTarget[i] == botTarget[i - 5]) || (botTarget[i] == botTarget[i - 6]) ||
								(botTarget[i] == botTarget[i - 7]) || (botTarget[i] == botTarget[i - 8]) || (botTarget[i] == botTarget[i - 9]) ||
								(botTarget[i] == botTarget[i - 10])) {
							botTarget[i] = (int) Math.round(Math.random() * 24 + 1);
						}	
					}
				}
				
				lblMessage.setText("Click start game to begin.");
			}
		});
		btnSetShips.setEnabled(false);
		btnSetShips.setBounds(267, 477, 106, 23);
		contentPane.add(btnSetShips);
		
		lblUserShipsLeft = new JLabel("Allied ships remaining: 3");
		lblUserShipsLeft.setBounds(10, 374, 290, 14);
		contentPane.add(lblUserShipsLeft);
		
		lblBotShipsLeft = new JLabel("Enemy ships remaining: 3");
		lblBotShipsLeft.setBounds(345, 374, 286, 14);
		contentPane.add(lblBotShipsLeft);
		
		lblUserShipsDestroyed = new JLabel("Enemy ships destroyed: 0");
		lblUserShipsDestroyed.setBounds(10, 399, 290, 14);
		contentPane.add(lblUserShipsDestroyed);
		
		lblBotShipsDestroyed = new JLabel("Allied ships destroyed: 0");
		lblBotShipsDestroyed.setBounds(345, 399, 290, 14);
		contentPane.add(lblBotShipsDestroyed);
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnBot1.setEnabled(true);
				btnBot2.setEnabled(true);
				btnBot3.setEnabled(true);
				btnBot4.setEnabled(true);
				btnBot5.setEnabled(true);
				btnBot6.setEnabled(true);
				btnBot7.setEnabled(true);
				btnBot8.setEnabled(true);
				btnBot9.setEnabled(true);
				btnBot10.setEnabled(true);
				btnBot11.setEnabled(true);
				btnBot12.setEnabled(true);
				btnBot13.setEnabled(true);
				btnBot14.setEnabled(true);
				btnBot15.setEnabled(true);
				btnBot16.setEnabled(true);
				btnBot17.setEnabled(true);
				btnBot18.setEnabled(true);
				btnBot19.setEnabled(true);
				btnBot20.setEnabled(true);
				btnBot21.setEnabled(true);
				btnBot22.setEnabled(true);
				btnBot23.setEnabled(true);
				btnBot24.setEnabled(true);
				btnBot25.setEnabled(true);	
				
				btnStart.setEnabled(false);
				
				lblMovesLeft.setVisible(true);
				
				lblMessage.setText("Select target on enemy grid.");
			}
		});
		btnStart.setEnabled(false);
		btnStart.setBounds(267, 511, 106, 23);
		contentPane.add(btnStart);		
	}	
			
	
}
