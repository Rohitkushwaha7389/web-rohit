import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Gusser{ int gnum;
   int gassNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("gusser enter your number");
        gnum=sc.nextInt();
        return gnum;
     }
}
class Player{
    int p1num;
    int p2num;
    int p3num;
     void playernum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Player no.1 enter your number");
        p1num=sc.nextInt();
        System.out.println("Player no.2 enter your number");
        p2num=sc.nextInt();
        System.out.println("player no.3 enter your number");
        p3num=sc.nextInt();
            // u1.compare();
       }

}
class umpire{
    int gnum;
    int p1num;
    int p2num;
    int p3num;

   void compare(){
            if(gnum==p1num){
                if(gnum==p2num && gnum==p3num ){
                System.out.println("Game is tied");
                }
            else if(gnum==p2num){

                System.out.println("player no.1 and Player no.2 both are winner");
            }
            else if(gnum==p3num){

                System.out.println("player no.1 and Player no.2 both are winner");
            }
            else {
                System.out.println("player no.1 is winner");
            }
            }
            if(gnum==p2num){
                if(gnum==p3num){
                System.out.println("Player no.2 and Player no. 3 both are winner");
                }
               else{
                System.out.println("player no.2 you are win");
               }
            }
            if(gnum==p3num){
                System.out.println("player no. 3 you are win");
                 

            }

    }



}

class Project1{
    public static void main(String args[]){
        System.out.println("Game is Started");
        Gusser g1=new Gusser();
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        umpire u1=new umpire();

          g1.gassNum();
          p1.playernum();
          p2.playernum();
          p3.playernum();
          u1.compare();
    }
}
