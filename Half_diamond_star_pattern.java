import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        if(n<3 || n>100)
        {
            System.out.printf("The pattern is not possible");
        }
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.printf("*");
                }
                System.out.printf("
");
            }
            for(i=1;i<n;i++)
            {
                for(j=n-1;j>=i;j--)
                {
                    System.out.printf("*");
                }
                System.out.printf("
");
            }
        }
        
    }
}