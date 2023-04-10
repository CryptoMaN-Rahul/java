import java.util.Scanner;
import java.util.*;
class combination
{

    public static void main(String[] args) {
        int r,n;
        System.out.println("enter values");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        r=s.nextInt();
int f=n;
        for(int i=n-1;i>=1;i--)
        {
 f=f*i;

        }

        int x=n-r;
        for(int i=n-1;i>=1;i--)
        {
x=x*i;


        }

        int comb=f/x;
        System.out.println("the combination is"+comb);
        s.close();

    }
}
