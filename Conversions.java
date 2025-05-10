//Q1. Binary to decimal conversion
//import java.util.Scanner;
//class Conversions
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter binary num:");
//        int num=kb.nextInt();
//        int i=0;
//        int temp=num;
//        int sum=0;
//        while(temp!=0)
//        {
//            int digit=temp%10;
//            sum=sum+digit*(int)Math.pow(2,i);
//            i=i+1;
//            temp=temp/10;
//        }
//        System.out.println("Decimal number:"+sum);
//    }
//}

//Q2. Decimal to binary conversion
//import java.util.Scanner;
//class Conversions
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter decimal value:");
//        int num= kb.nextInt();
//        int temp=num;
//        StringBuilder sb=new StringBuilder();
//        while(temp!=0)
//        {
//            sb=sb.append(temp%2);
//            temp=temp/2;
//        }
//        String res=sb.reverse().toString();
//        System.out.print("Binary value is:"+res);
//    }
//}