import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int t,n,m,d=0,c=0,i;
        t=sc.nextInt();
        while(t>0)
        {
            c=0;
            n=sc.nextInt();
            m=sc.nextInt();
            for(i=n;i<=m;i++)
            {
                d=i%10;
                if(d==2 || d==3 || d==9)
                {
                    c++;
                }
            }
            System.out.printf("%d
",c);
            t--;
        }
        
    }
}