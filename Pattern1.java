import java.util.*;
public class Pattern1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0 && j>0 && j<(n-1)/2 ||j==0 && i>0 ||i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0 ){
                 System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
