import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j)
                {
                    System.out.printf("0");
                }
                else
                {
                    System.out.printf("x");
                }
            }
            System.out.printf("
");
        }
    }
}