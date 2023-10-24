/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tic.tac.toe;
import static tic.tac.toe.Board.initializeBoard;
import static tic.tac.toe.Board.showScreen;
import static tic.tac.toe.Player.play;

/**
 *
 * @author Personal
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     * 
     */
    static char[]symbol= new char[3];
    public static void main(String[] args) {
 symbol[0] =' ';
 symbol[1] ='X';
 symbol[2] ='O';
 initializeBoard();
 showScreen();
 play();
    }
    
}
