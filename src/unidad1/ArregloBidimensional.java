package unidad1;

import java.util.Scanner;

public class ArrayTicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];

        // Inicializar el tablero con espacios vacíos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        // El jugadror elige X o O
        System.out.print("¿Quieres ser X o O? ");
        char player = sc.next().toUpperCase().charAt(0);
        char opponent = (player == 'X') ? 'O' : 'X';

        boolean isPlaying = true;

        do {
            // Mostrar el tablero
            for (int i = 0; i < 3; i++) {
                System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                if (i < 2) System.out.println("---+---+---");
            }

            // Solicitar posición
            System.out.print("Jugador " + player + ", elige una posición (1-9): ");
            int pos = sc.nextInt() - 1;
            int row = pos / 3;
            int col = pos % 3;

            if (pos < 0 || pos > 8 || board[row][col] != ' ') {
                System.out.println("Posición inválida o ocupada, intenta de nuevo.");
                continue;
            }

            board[row][col] = player;

            // Verificar victoria
            if (
                (board[0][0] == player && board[0][1] == player && board[0][2] == player) ||
                (board[1][0] == player && board[1][1] == player && board[1][2] == player) ||
                (board[2][0] == player && board[2][1] == player && board[2][2] == player) ||
                (board[0][0] == player && board[1][0] == player && board[2][0] == player) ||
                (board[0][1] == player && board[1][1] == player && board[2][1] == player) ||
                (board[0][2] == player && board[1][2] == player && board[2][2] == player) ||
                (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            ) {
                System.out.println("¡Jugador " + player + " gana!");
                isPlaying = false;
                break;
            }

            // Verificar empate
            boolean isBoardFull = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        isBoardFull = false;
                        break;
                    }
                }
            }

            if (isBoardFull) {
                System.out.println("¡Es un empate!");
                isPlaying = false;
                break;
            }

            // Cambiar de jugador
            char temp = player;
            player = opponent;
            opponent = temp;

        } while (isPlaying);

        sc.close();
    }
}