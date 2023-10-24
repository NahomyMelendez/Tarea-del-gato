/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tic.tac.toe;

/**
 *
 * @author Personal
 */
public class Board {
    static char[][] board = new char[3][3];
    
    /**
     *method that initializes the board values.
     */
    public static void initializeBoard(){
        int posi='1';
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
               board[x][y]= (char) posi;
               posi++;
            }
        }
    }

    /**
     *method that shows the dashboard.
     */
    public static void showScreen(){
        
   System.out.println(board[0][0]+" | " +board[0][1]+" | "+board[0][2]+" | ");
   System.out.println("--------------");
   System.out.println(board[1][0]+" | " +board[1][1]+" | "+board[1][2]+" | ");
  System.out.println("--------------");
   System.out.println(board[2][0]+" | " +board[2][1]+" | "+board[2][2]+" | ");
   
    }
            
            
            
            
}
