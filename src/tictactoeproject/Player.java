package tictactoeproject;
import java.util.*;

//class has the info of the players: name and the char(X,O)
public class Player {
	String name;
	char C;
	
	//taking the position of the preferred place to play in by taking the number of the row then the column
	public void play(Tictactoe game) {
		
		 Scanner row = new Scanner(System.in); 
		System.out.println("enter row's number: ");
	    int i = row.nextInt();
	    i--;
	    
		 Scanner clmn = new Scanner(System.in); 
		System.out.println("enter column's number: ");
	    int j = clmn.nextInt();
	    j--;
	    
	   
	    
	   
	    
	    //validation of input
	    if(i>5 || j>6) {
	    	System.out.println("****invalid position!****");
	    	System.out.println();
	    	this.play(game);
	    }
	    else if(Tictactoe.grid[i][j]=='X' || Tictactoe.grid[i][j]=='O') {
	    	System.out.println("****position already taken****");
	    	System.out.println();
	    	this.play(game);
	    }
	    else
	        Tictactoe.grid[i][j] = this.C;     //putting the char(X,O) in the preferred position 
	    
	    

	}

	
}
