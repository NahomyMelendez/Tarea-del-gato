/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tic.tac.toe;

import java.util.Scanner;
import static tic.tac.toe.Board.board;
import static tic.tac.toe.Board.initializeBoard;
import static tic.tac.toe.Board.showScreen;
import static tic.tac.toe.TicTacToe.symbol;
import static tic.tac.toe.Winner.winner;

/**
 *
 * @author Personal
 */
public class Player {
  static int turnPlayer = 1;
  
    /**
     *Metodo que 
     */
    public static void play(){
     Scanner n = new Scanner (System.in);
      System.out.print("jugador "+ turnPlayer+" juega con "+symbol[turnPlayer]+
             " indique posicion para jugar: ");
    int posi = n.nextInt();
    int x,y;
    switch(posi){
        case 1:  
            x=0;
            y=0;
            break;
        case 2:  
            x=0;
            y=1;
            break;
        case 3:  
            x=0;
            y=2;
            break;
        case 4:  
            x=1;
            y=0;
            break;
        case 5:  
            x=1;
            y=1;
            break; 
        case 6:  
            x=1;
            y=2;
            break;
        case 7:  
            x=2;
            y=0;
            break;
        case 8:  
            x=2;
            y=1;
            break;
        case 9:  
            x=2;
            y=2;
            break;
        default:
            System.out.println("posicion equibocada, intentar de nuevo:/");
            play();
            return;
    }
   if(board[x][y]=='X' ||board[x][y]=='O' ){
       System.out.println("Esta posicion esta ocupada, utiliza otra:]");
       play();
       return;
   }
   board[x][y]= symbol[turnPlayer];
   if(!winner()) {
       if(turnPlayer == 1){
           turnPlayer++;
       }else{
           turnPlayer--;
       }
       showScreen();
         play();
      }else{
      System.out.println("tenemos un ganador, desea volver a jaugar si:1/ no:0");   
      int continu = n.nextInt();
      if (continu == 1) {
    initializeBoard();
    showScreen();
    play();
    return;
}
       } 

    
  }
  
   
}
