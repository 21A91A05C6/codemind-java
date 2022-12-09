import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int i,j,n,m,c=0,c1=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if(isPrime(i))
            {
                c+=1;
                //System.out.printf("%d ",i);
            }
        }
        System.out.printf("%d",c);
    }
    static boolean isPrime (int n)
    {
        int c= 0;
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}