package TicTacToe;
public class Main {
public static void main(String[] args) {
		char[][] board = {{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'}};
		printboard(board);
		while(true) {
			playermove(board);
			if(isgamefinished(board)) {
				break;
			}
			printboard(board);
			computermove(board);

			if(isgamefinished(board)) {
				
				
				break;
			}
			printboard(board);
			
			
			
		}

			}
	private static void computermove(char[][] board) {
		Random random = new Random();
		char c= 'O';

         int computermove;
         while(true) {
         
         computermove = random.nextInt(9)+1;
         if(isvalidmove(board,computermove)){
        	 break;
         }}
         System.out.println(computermove+" is the computer move");
        makemove(board,computermove,c);
	
         }
	private static boolean isgamefinished(char[][] board) {
		contestwinner(board,'X');
		if(contestwinner(board,'X')) {
			System.out.println("-------------------");
			
			System.out.println("player wins the game");
			printboard(board);
			System.out.println("Thaks for playing!!!");
			return true;
			
		}
		if(contestwinner(board,'O')) {
			System.out.println("-------------------");

			System.out.println("computer wins the game");
			printboard(board);
			System.out.println("Thaks for playing!!!");
			return true;
			
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[i][j]!='X'||board[i][j]!='O') {
					
					return false;
				}
			}
		}
		System.out.println("-------------------");

		System.out.println("match is tie!!!");
		printboard(board);
		return true;
		
	}
	private static boolean contestwinner(char[][] board, char c) {
		if(     board[0][0]==c&&board[0][1]==c&&board[0][2]==c||
				board[1][0]==c&&board[1][1]==c&&board[1][2]==c||
				board[2][0]==c&&board[2][1]==c&&board[2][2]==c||
				board[0][0]==c&&board[1][1]==c&&board[2][2]==c||
				board[0][2]==c&&board[1][1]==c&&board[2][0]==c||
				board[0][0]==c&&board[1][0]==c&&board[2][0]==c||
				board[0][1]==c&&board[1][1]==c&&board[2][1]==c||
				board[0][2]==c&&board[1][2]==c&&board[2][2]==c) {
			return true;
			}
		return false;
	}
	private static void playermove(char[][] board) {
          Scanner sc = new Scanner(System.in);
		
		char c = 'X';
		int pos;
		while(true) {
			System.out.println("Enter the posistion to move(1-9)");
			//printboard(board);
			pos = sc.nextInt();
		if(isvalidmove(board,pos)) {
			break;
		}
		else{
			System.out.println("enter valid move");
		}
		}
		
		makemove(board,pos,c);
		
	}
	
	private static boolean makemove(char[][] board, int pos, char c) {
		switch(pos) {
		case 1:
			
			 board[0][0] = c;
			return true;
			
			
		case 2:
			board[0][1] = c;
			return true;
		case 3:
			board[0][2] = c;
			return true;
		case 4:
			board[1][0] = c;
			return true;
		case 5:
			board[1][1] = c;
			return true;
		case 6:
			board[1][2] = c;
			return true;
		case 7:
			board[2][0] = c;
			return true;
		case 8:
			board[2][1] = c;
			return true;
		case 9:
			board[2][2] = c;
			return true;
			default:
				//System.out.println("enter valid posisttion");
				return false;
			
		}
	}
	private static boolean isvalidmove(char[][] board, int pos) {
		switch(pos) {
		case 1:
			
			return board[0][0] == '1';
			
			
			
		case 2:
			return board[0][1] == '2';
			
		case 3:
			return board[0][2] ==  '3';
		case 4:
			return board[1][0] == '4';
		case 5:
			return board[1][1] == '5';
		case 6:
			return board[1][2] == '6';
		case 7:
			return board[2][0] == '7';
		case 8:
			return board[2][1] == '8';
		case 9:
			return board[2][2] == '9';
			default:
				//System.out.println("enter valid posisttion");
				return false;
			
		}
		
	}
	private static void printboard(char[][] board) {
		System.out.println(board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
		System.out.println("-+-+-");
		System.out.println(board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
		System.out.println("-+-+-");
		System.out.println(board[2][0]+"|"+board[2][1]+"|"+board[2][2]);


	}
}
