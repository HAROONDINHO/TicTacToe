package tictactoeproject;

//class contains the array in which the game will be played amd the two players
public class Tictactoe {
	Player player1 = new Player();
	Player player2 = new Player();
	static char[][] grid = new char[6][7];
	boolean win = false;
	int turns = 0;
	
	//initializing the game grid
	public void initgrid() {
		int i,j;
		for(i=0; i<6; i++) {
			for(j=0; j<7; j++)
				grid[i][j]=' ';
		}
		
	}
	
	//out printing the game grid with borders
	public void display() {
		int i,j;
		for(i=0; i<6; i++) {
			System.out.print("\n");
			if (i!=0)
				System.out.println("-+-+-+-+-+-+-");
			for(j=0; j<7; j++)
				if(j!=6)
					System.out.print((char)grid[i][j]+"|");
				else
					System.out.print((char)grid[i][j]);
		}
		System.out.println();
		System.out.println();
		
	}

	//checking for 3 Xs or 3 Os in a downward diagonal
	public void downDiagCheck() {
		int i,j;
       {
		for(i=0; i<4; i++) {
			for(j=0; j<5; j++) {
				if(grid[i][j]=='X' || grid[i][j]=='O') {
				if(grid[i][j]==grid[i+1][j+1]&&grid[i][j]==grid[i+2][j+2])
					this.win = true;
				}
			}
		}
		}
	}
	
	//checking for 3 Xs or 3 Os in an upward diagonal
	public void upDiagCheck() {
		int i,j;
		for(i=5; i>1; i--) {
			for(j=0; j<5; j++) {
				if(grid[i][j]=='X' || grid[i][j]=='O') {
				if(grid[i][j]==grid[i-1][j+1]&&grid[i][j]==grid[i-2][j+2])
					win = true;
				}
			}
		}
	}
	
	//checking for 3 Xs or 3 Os in a horizontal line
	public void horizontalCheck() {
		int i,j;
		for(i=0; i<6; i++) {
			for(j=0; j<5; j++) {
				if(grid[i][j]=='X' || grid[i][j]=='O') {
				if(grid[i][j]==grid[i][j+1]&&grid[i][j]==grid[i][j+2])
					win = true;
				}
			}
		}
	}
	
	//checking for 3 Xs or 3 Os in a vertical line
	public void verticalCheck() {
		int i,j;
		for(i=0; i<4; i++) {
			for(j=0; j<7; j++) {
				if(grid[i][j]=='X' || grid[i][j]=='O') {
				if(grid[i][j]==grid[i+1][j]&&grid[i][j]==grid[i+2][j])
					win = true;
				}
			}
		}
	}

	//checking for all possible winning cases
	public void winCheck() {
		downDiagCheck();
		upDiagCheck();
		horizontalCheck();
		verticalCheck();
		
		}
			
	} 