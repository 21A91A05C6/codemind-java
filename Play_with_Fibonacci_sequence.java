import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c=0,i;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=b;
            b=c;
            System.out.printf("%d ",c);
            c=a+b;
        }
    }
}