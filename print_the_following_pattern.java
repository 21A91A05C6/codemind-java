import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j || ((i+j)+1)==n)
                {
                    System.out.printf("x");
                }
                else
                {
                    System.out.printf("0");
                }
            }
            System.out.printf("
");
        }
    }
}