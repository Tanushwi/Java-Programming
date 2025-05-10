//Q1. Taking input and printing elements
//import java.util.Scanner;
//class JaggedArray
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter m:");
//        int m=kb.nextInt();
//        int a[][]=new int[m][];
//        for(int i=0;i<m;i++)
//        {
//            System.out.print("Enter n:");
//            int n=kb.nextInt();
//            a[i]=new int[n];
//            System.out.print("Enter "+n+" elements:");
//            for(int j=0;j<n;j++)
//                a[i][j]=kb.nextInt();
//        }
//        System.out.println("Array:");
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<a[i].length;j++)
//                System.out.print(a[i][j]+" ");
//            System.out.println();
//        }
//    }
//}