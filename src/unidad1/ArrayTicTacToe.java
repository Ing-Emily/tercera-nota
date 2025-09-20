package unidad1;

import java.util.Scanner;

public class ArrayTicTacToe {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        char[] board = new char[9];
        int boardLength = board.length;
        
        //inicializar el tablero con espacios vacios
        for(int i = 0; i<boardLength ; i++){
            board[i] = ' ';
        }
        }

        char player = 'X';
        boolean isPlaying = true;
        while (isPlaying) {
            System.out.println("" + board[0] + "|" + board[1] + "|" + board[2]);
            System.out.println("---+---+---");
            System.out.println("" + board[3] + "|" + board[4] + "|" + board[5]);
            System.out.println("---+---+---");
            System.out.println("" + board[6] + "|" + board[7] + "|" + board[8]);

            //solicitar por pantalla al jugador

            System.out.println("jugador " + player + " Elige una posicion (1-9) para colocar: ");
            int position = sc.nextInt() - 1;
            if (position < 0 || position > 8 || board[position] != ' ') {
                System.out.println("Posicion invalida, intenta de nuevo.");
                continue; }

            }

            if (board[position] != ' ') {
                System.out.println("Esa casilla está ocupada, intente de nuevo.");
                continue;
            } 
            board[position] = player;

            //comprobar si gana el player
            if ((board[0] == player && board[1] == player && board[2] == player) ||
                (board[3] == player && board[4] == player && board[5] == player) ||
                (board[6] == player && board[7] == player && board[8] == player) ||
                (board[0] == player && board[3] == player && board[6] == player) ||
                (board[1] == player && board[4] == player && board[7] == player) ||
                (board[2] == player && board[5] == player && board[8] == player) ||
                (board[0] == player && board[4] == player && board[8] == player) ||
                (board[2] == player && board[4] == player && board[6] == player)) {
                System.out.println("¡Jugador " + player + " gana!");
                isPlaying = false;
                break;
            } 
            //comprobar si hay empate
            boolean isBoardFull = true;
            for (int i = 0; i < board.length; i++) {
                if (board[i] == ' ') {
                    isBoardFull = false;
                    break;
                }
            }
            if (isBoardFull) {
                System.out.println("¡Es un empate!");
                isPlaying = false;
                break;
            }
            //cambiar de jugador
            if (player == 'X') {
                player = 'O';
            } else {
                player = 'X';
            }
            sc.close();
        }
    }
