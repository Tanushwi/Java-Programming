//Q1. 1+1/2+1/3+1/4+----------+1/n
//import java.util.Scanner;
//class HarmonicSeries
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n= kb.nextInt();
//        double sum=0;
//        for(int i=1;i<=n;i++)
//        {
//            sum=sum+(double)1/i;
//        }
//        System.out.println("Result:"+sum);
//    }
//}

//Q2. 1+2/2!+3/3!+-------+n/n!
//import java.util.Scanner;
//class HarmonicSeries
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n= kb.nextInt();
//        double sum=0;
//        int f=1;
//        for(int i=1;i<=n;i++)
//        {
//            f=f*i;
//            sum=sum+(double)i/f;
//        }
//        System.out.println("Result:"+sum);
//    }
//}

//Q3. 1+2/3!+3/5!+-------
//import java.util.Scanner;
//class HarmonicSeries
//{
//    public static int fact(int num)
//    {
//        int f=1;
//        for(int i=1;i<=num;i++)
//            f=f*i;
//        return f;
//    }
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n= kb.nextInt();
//        double sum=0;
//        int den=1;
//        for(int i=1;i<=n;i++)
//        {
//            sum=sum+(double)i/fact(den);
//            den=den+2;
//        }
//        System.out.println("Result:"+sum);
//    }
//}

//Q4. x+x^2/2!+x^3/3!+----
//import java.util.Scanner;
//class HarmonicSeries
//{
//    public static int fact(int num)
//    {
//        int f=1;
//        for(int i=1;i<=num;i++)
//            f=f*i;
//        return f;
//    }
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter value of x:");
//        int x= kb.nextInt();
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        double sum=0;
//        for(int i=1;i<=n;i++)
//        {
//            sum=sum+Math.pow(x,i)/fact(i);
//        }
//        System.out.println("Result:"+sum);
//    }
//}

////Q5. x-x^2/2!+x^3/3!-x^4/4!+----
//import java.util.Scanner;
//class HarmonicSeries
//{
//    public static int fact(int num)
//    {
//        int f=1;
//        for(int i=1;i<=num;i++)
//            f=f*i;
//        return f;
//    }
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter value of x:");
//        int x= kb.nextInt();
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        double sum=0;
//        for(int i=1;i<=n;i++)
//        {
//            if(i%2==0)
//                sum=sum-Math.pow(x,i)/fact(i);
//            else
//                sum=sum+Math.pow(x,i)/fact(i);
//        }
//        System.out.println("Result:"+sum);
//    }
//}