package com.tictactoe;

public class Player {
    
    public String Yellow = "\u001B[43m";
    public String Magenta = "\u001B[45m";

    enum Color {
        Yellow,
        Magenta
    }

    private Color color;
    private char playernum;

    public Player (Color color, char playernum){
        this.color = color;
        this.playernum = playernum;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public char getPlayerNum() {
        return this.playernum;
    }

    public void setPlayerNum(char playernum) {
        this.playernum = playernum;
    }

}
