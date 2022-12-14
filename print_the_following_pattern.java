import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>i;j--)
            {
                System.out.printf(" ");
            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.printf("%d",i);
            }
            System.out.printf("
");
        }
    }
}