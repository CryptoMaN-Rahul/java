import java.util.*;
public class Permutations{



    public static void main(String[] args)
    {


        int n,r, per, f1,f2,f3,combination;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n and r");
        n=sc.nextInt();
        r=sc.nextInt();
        f1=n;

        for(int i=n-1;i>=1;i--)
        {
            f1=f1*i;
        }
        int number;
        number=n-r;
        f2=number;

         for(int i= number - 1;i >= 1;i--)
        {
            f2=f2*i;
        }
per=f1/f2;

f3=r;
 for(int i=r-1;i>=1;i--)
        {
            f3=f3*i;
        }
        combination= f1 / (f2*f3);
    System.out.println("the permutation of p(n,r)="+per);
    System.out.println("the combination of p(n,r)="+combination);
    sc.close();
    }
}
