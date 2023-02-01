import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
import java.util.*;
class Guesser{
    int guessNum;
  int  gussingNumber(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Guesser! Kindly guess the number");
    guessNum =sc.nextInt();
    return guessNum;

  }
}
class Players{
    int guessNum;
    int gussingNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Players! kindly guess the number");
        guessNum=sc.nextInt();
        return guessNum;
    }
}
class umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumFromguesser(){
        Guesser g=new Guesser();
        numFromGuesser=g.gussingNumber();

    }
    void collectNumFromPlayers(){
        Players p1=new Players();
        Players p2=new Players();
        Players p3=new Players();
        numFromPlayer1=p1.gussingNumber();
        numFromPlayer2=p2.gussingNumber();
        numFromPlayer3=p3.gussingNumber();
    }
    void compare(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("Game tied all player guessed corretly answer");
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("player1 and player2 won the game ");
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("player1 and three won the game");
            }
            else{
            System.out.println("Player1 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3){
                System.out.println("player2 and three won the game");
            }
            else{
            System.out.println("player2 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("player3 won the game");

        }
        else{
            System.out.println("You lost ! try again");
        }
    }
}

class Launch1{
    public static void main(String[] args) {
        System.out.println("Game start");
        umpire u=new umpire();
        u.collectNumFromguesser();
        u.collectNumFromPlayers();
        u.compare();
        
    }
}