import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        double a,b,res;
        a=sc.nextDouble();
        b=sc.nextDouble();
        res=(a+b)/2;
        System.out.printf("%.4f",res);
    }
}