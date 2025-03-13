package com.tictactoe;

import com.tictactoe.Player.Color;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Juguemos al tic tac toe");
        System.out.println( "El tablero se compone de fila 0 - 1 y 2 y de columna 0 - 1 y 2");

        int cells = 3;
        char [][] Board = new char [cells][cells];

        for (int x = 0; x < cells; x++) {
            for (int y = 0; y < cells; y++) {
                Board[x][y] = '-';
            }
        }

        Player Player1 = new Player(Color.Yellow, '1');
        

}

}
