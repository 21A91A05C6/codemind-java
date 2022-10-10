import java.util.Scanner;
class FloatingNumbers
{
    public static void main(String args[])
    {
        double a,b,res;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        res=a*b;
        System.out.printf("%.2f",res);
    }
}