import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.printf("%d",sum);
    }
}