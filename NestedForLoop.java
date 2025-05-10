//Q1.
//1
//12
//123
//1234
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//                System.out.print(j);
//            System.out.println();
//        }
//    }
//}

//Q2.
//12345
//1234
//123
//12
//1
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=n;i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//                System.out.print(j);
//            System.out.println();
//        }
//    }
//}

//Q3.
//54321
//5432
//543
//54
//5
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=n;j>=i;j--)
//                System.out.print(j);
//            System.out.println();
//        }
//    }
//}

//Q4.
//5
//54
//543
//5432
//54321
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=n;i>=1;i--)
//        {
//            for(int j=n;j>=i;j--)
//                System.out.print(j);
//            System.out.println();
//        }
//    }
//}

//Q5.
//1
//21
//321
//4321
//54321
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=i;j>=1;j--)
//                System.out.print(j);
//            System.out.println();
//        }
//    }
//}

//Q6.
//54321
//4321
//321
//21
//1
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=5;i>=1;i--)
//        {
//            for(int j=i;j>=1;j--)
//                System.out.print(j);
//            System.out.println();
//        }
//    }
//}

//Q7.
//12345
//2345
//345
//45
//5
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=i;j<=n;j++)
//                System.out.print(j);
//            System.out.println();
//        }
//    }
//}

//Q8.
//5
//45
//345
//2345
//12345
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=n;i>=1;i--)
//        {
//            for(int j=i;j<=n;j++)
//                System.out.print(j);
//            System.out.println();
//        }
//    }
//}

//Q9.
//*
//***
//*****
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<2*i;j++)
//                System.out.print("*");
//            System.out.println();
//        }
//    }
//}

//Q10.
//*
//##
//***
//####
//*****
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                if(i%2==0)
//                    System.out.print("#");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//Q11.
//*
//*#
//*#*#
//*#*#*
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                if(j%2==0)
//                    System.out.print("#");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//Q12.
//1
//23
//456
//78910
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        int k=1;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(k);
//                k++;
//            }
//            System.out.println();
//        }
//    }
//}

//Q13.
//abcd
//abc
//ab
//a
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=n;i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print((char)(j+96));
//            }
//            System.out.println();
//        }
//    }
//}

//Q14.
//a
//ab
//abc
//abcd
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print((char)(j+96));
//            }
//            System.out.println();
//        }
//    }
//}

//Q15.
//A
//ABC
//ABCDE
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<2*i;j++)
//            {
//                System.out.print((char)(j+64));
//            }
//            System.out.println();
//        }
//    }
//}

//Q16.
//0
//01
//011
//0112
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            int a=0,b=1,c;
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(a);
//                c=a+b;
//                a=b;
//                b=c;
//            }
//            System.out.println();
//        }
//    }
//}

//Q17.
//1
//11
//121
//1331
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            int num=1;
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print(num);
//                num=num*(i-j)/(j+1);
//            }
//            System.out.println();
//        }
//    }
//}

//Q18.
//1
//01
//101
//0101
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                if((i+j)%2==0)
//                    System.out.print("1");
//                else
//                    System.out.print("0");
//            }
//            System.out.println();
//        }
//    }
//}

//Q19.
//  *
// ***
//*****
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n= kb.nextInt();
//        int sp=n-1;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=sp;j++)
//                System.out.print(" ");
//            for(int j=1;j<=i;j++)
//                System.out.print("*");
//            for(int j=i-1;j>=1;j--)
//                System.out.print("*");
//            sp--;
//            System.out.println();
//        }
//    }
//}

//Q20.
//  1
// 121
//12321
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n= kb.nextInt();
//        int sp=n-1;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=sp;j++)
//                System.out.print(" ");
//            for(int j=1;j<=i;j++)
//                System.out.print(j);
//            for(int j=i-1;j>=1;j--)
//                System.out.print(j);
//            sp--;
//            System.out.println();
//        }
//    }
//}

//Q21.
//  1
// 212
//32123
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n= kb.nextInt();
//        int sp=n-1;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=sp;j++)
//                System.out.print(" ");
//            for(int j=i;j>=1;j--)
//                System.out.print(j);
//            for(int j=2;j<=i;j++)
//                System.out.print(j);
//            sp--;
//            System.out.println();
//        }
//    }
//}

//Q22.
//  1
// 232
//34543
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n= kb.nextInt();
//        int sp=n-1;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=sp;j++)
//                System.out.print(" ");
//            for(int j=i;j<2*i;j++)
//                System.out.print(j);
//            for(int j=2*i-2;j>=i;j--)
//                System.out.print(j);
//            sp--;
//            System.out.println();
//        }
//    }
//}

//Q23.
//123321
//12  21
//1    1
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n= kb.nextInt();
//        int sp=0;
//        for(int i=n;i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//                System.out.print(j);
//            for(int j=1;j<=sp;j++)
//                System.out.print(" ");
//            for(int j=i;j>=1;j--)
//                System.out.print(j);
//            sp+=2;
//            System.out.println();
//        }
//    }
//}

//Q24.
//  *
// * *
//* * *
//import java.util.Scanner;
//class NestedForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n= kb.nextInt();
//        int sp=n-1;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=sp;j++)
//                System.out.print(" ");
//            for(int j=1;j<=i;j++)
//                System.out.print("* ");
//            System.out.println();
//            sp--;
//        }
//    }
//}
