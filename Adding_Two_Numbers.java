import java.util.Scanner;
class Addition
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int a,b,sum;
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.printf("%d",sum);
    }
}