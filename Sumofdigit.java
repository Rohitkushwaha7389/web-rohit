import java.util.*;
public class Sumofdigit {
    public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int sum=0;
    while(x>0)
    {
        sum=sum+x%10;
        x/=10;
    }
        System.out.println(sum);
    }
}    

