/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tic.tac.toe;

import static tic.tac.toe.Board.board;
import static tic.tac.toe.Player.play;

/**
 *
 * @author Personal
 */
public class Winner {
  boolean winner ; 
int x,y;
    /**
     *
     * This method defines the winner of the game.
     */
    public static boolean winner(){
   if(board[0][0]== board[0][1] && board[0][1]== board[0][2] ){
       return true;
       
   }else if(board[1][0]== board[1][1] && board[1][1]== board[1][2] ){
       return true;
       
   }else if(board[2][0]== board[2][1] && board[2][1]== board[2][2] ){
       return true;}
   
   else if(board[0][0]== board[1][0] && board[1][0]== board[2][0] ){
       return true;
       
   }else if(board[1][0]== board[1][1] && board[1][1]== board[1][2] ){
       return true;
       
   }else if(board[2][0]== board[2][1] && board[2][1]== board[2][2] ){
       return true;
       
   }else if(board[0][0]== board[1][1] && board[1][1]== board[2][2] ){
       return true;
       
   }else if(board[2][0]== board[1][1] && board[1][0]== board[0][2] ){
       return true;
   } else{
      return false;
       }    
       
 }  
}
