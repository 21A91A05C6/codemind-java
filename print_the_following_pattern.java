import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=n;j>=1;j--)
            {
                System.out.printf("%d ",j);
            }
            System.out.printf("
");
        }
    }
}