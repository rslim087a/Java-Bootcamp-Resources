import java.util.Scanner;

public class TicTacToe {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\nLet's play tic tac toe");

		char[][] board = {
				{ '_', '_', '_' },
				{ '_', '_', '_' },
				{ '_', '_', '_' }
		};

		printBoard(board);

		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				System.out.println("Turn: X");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'X';
			} else {
				System.out.println("Turn: O");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'O';
			}
			printBoard(board);

			int count = checkWin(board);
			if (count == 3) {
				System.out.println("X WINS!");
				break;
			} else if (count == -3) {
				System.out.println("O WINS!");
				break;
			} else if (i == 8) {
				System.out.println("IT'S A TIE!");
			}

		}

		scan.close();
	}

	public static void printBoard(char[][] board) {
		System.out.print("\n");
		for (int i = 0; i < board.length; i++) {
			System.out.print("\t");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.print("\n\n");
		}
	}

	public static int[] askUser(char[][] board) {
		System.out.print(" - pick a row and column number: ");
		int row = scan.nextInt();
		int element = scan.nextInt();
		while (board[row][element] != '_') {
			System.out.print("Spot taken, try again: ");
			row = scan.nextInt();
			element = scan.nextInt();
		}
		return new int[] { row, element };
	}



	public static int checkWin(char[][] board) {
		int rows = checkRows(board);

		// Math.abs returns the absolute value of a given number, removing any negative
		// sign. 
		if (Math.abs(rows) == 3)
			return rows; // If the block of code consists of only one line, you can omit the curly
							// braces.

		int columns = checkColumns(board);
		if (Math.abs(columns) == 3)
			return columns;

		int leftDiagonal = checkLeft(board);
		if (Math.abs(leftDiagonal) == 3)
			return leftDiagonal;

		int rightDiagonal = checkRight(board);
		if (Math.abs(rightDiagonal) == 3)
			return rightDiagonal;

		return -1;
	}

	public static int checkRows(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'X') {
					count++;
				} else if (board[i][j] == 'O') {
					count--;
				}
			}
			if (Math.abs(count) == 3) {
				return count;
			} else {
				count = 0;
			}

		}
		return count;
	}

	public static int checkColumns(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[j][i] == 'X') {
					count++;
				} else if (board[j][i] == 'O') {
					count--;
				}
			}
			if (Math.abs(count) == 3) {
				return count;
			} else {
				count = 0;
			}

		}
		return count;
	}

	public static int checkLeft(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i][i] == 'X') {
				count++;
			} else if (board[i][i] == 'O') {
				count--;
			}
		}
		return count;
	}

	public static int checkRight(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[2 - i][i] == 'X') {
				count++;
			} else if (board[2 - i][i] == 'O') {
				count--;
			}
		}
		return count;
	}

}
