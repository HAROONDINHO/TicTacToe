package tictactoeproject;
import java.util.Scanner;

//the process of the game
public class InGame {
	public void restart() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 1 for a new game or 0 to exit");
		int x = scanner.nextInt();
		if(x == 1)
			gamePlay();
		else if(x == 0)
			System.exit(0);
		else {
			System.out.println("invalid input!");
			restart();
			
		}
		
	}
	public void gamePlay() {
		Tictactoe newGame = new Tictactoe();    //making a new game grid
		newGame.initgrid(); 
		
		newGame.player1 = new Player();
		newGame.player2 = new Player();
		newGame.player1.C = 'X';               // player1 is player X
		newGame.player2.C = 'O';               // player2 is player O
		
		
		//taking names from players
		Scanner name1 = new Scanner(System.in);                 
		System.out.println("enter X player name: ");
		newGame.player1.name = name1.nextLine();
	    Scanner name2 = new Scanner(System.in); 
		System.out.println("enter O player name: ");
		newGame.player2.name = name2.nextLine();
	   
		                  
		newGame.display();
		
		
		// the in-game process until a winner is found
		//players take turns to play and a check for a winner is made after each turn 
		while(!newGame.win) {
			System.out.println(newGame.player1.name+"'s turn");              //player X 's turn
			newGame.player1.play(newGame);
			newGame.display();
			newGame.winCheck();
			if(newGame.win) { 
				System.out.println(newGame.player1.name+" wins");
				break;
				
			}
			else {
				System.out.println(newGame.player2.name+"'s turn");
				newGame.player2.play(newGame);                              //then player O 's turn
				newGame.display();
				newGame.winCheck();
				if(newGame.win) { 
					System.out.println(newGame.player2.name+" wins");
					break;
				
			}
			
				
			
		}
			
			//the game is a draw if all places are full and still not a winner found
			if(newGame.turns == 20) {
				System.out.println("TIE!");
				break;
			}
			else
        newGame.turns++;                        //turns counter
			
	    }
		
		restart();
		
			name1.close();
			name2.close();
	    }
		}	


