import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        boolean gameEnded = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameEnded) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 1-3, separated by space):");
            
            int row = -1, col = -1;
            boolean validInput = false;
            
            while (!validInput) {
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt() - 1;
                    if (scanner.hasNextInt()) {
                        col = scanner.nextInt() - 1;
                        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                            if (board[row][col] == '-') {
                                validInput = true;
                            } else {
                                System.out.println("That position is already taken. Try again:");
                            }
                        } else {
                            System.out.println("Row and column must be between 1 and 3. Try again:");
                        }
                    } else {
                        System.out.println("You must enter two integers. Try again:");
                        scanner.next(); // consume invalid token for column
                    }
                } else {
                    System.out.println("You must enter two integers. Try again:");
                    scanner.next(); // consume invalid token for row
                }
            }

            board[row][col] = currentPlayer;
            
            if (hasWon(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("The game is a draw!");
                gameEnded = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean hasWon(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }
}
