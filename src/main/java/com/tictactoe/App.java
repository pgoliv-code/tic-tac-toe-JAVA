package com.tictactoe;

import com.tictactoe.Player.Color;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Juguemos al tic tac toe");
        System.out.println( "El tablero se compone de fila 0 - 1 y 2 y de columna 0 - 1 y 2");

        Player Player1 = new Player(Color.Yellow, '1');
        Player Player2 = new Player(Color.Magenta, '2');

        
        char [][] Board = new char [3][3];
        printBoard(Board);
        
        boolean P1 = true;
        
        boolean Endgame = false;
        
        System.out.println("Turno: ");
        
    }
    
    public static void printBoard(char [][] Board) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
            Board[x][y] = '-';
            System.out.println(Board);
        }}}

}
