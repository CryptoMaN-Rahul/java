
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int n,ele;
        int[] arr=new int[60];
        System.out.println("enter values");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
System.out.println("ENTER ELEMENTS");
for(int i=0;i<n;i++)
{
     arr[i]=s.nextInt();
}
System.out.println("enter element to search");
 ele=s.nextInt();
 for(int i=0;i<n;i++)
 {
    if ( ele==arr[i] )
    
    {
        System.out.println("element found at "+(i+1));
    }
 }
s.close();
    }
}
