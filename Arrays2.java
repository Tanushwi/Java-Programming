//Q1. Taking input and print all elements
//import java.util.Scanner;
//class Arrays2
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter m:");
//        int m=kb.nextInt();
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+(m*n)+" elements:");
//        int a[][]=new int[m][n];
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                a[i][j]=kb.nextInt();
//        }
//        System.out.print("Array:\n");
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                System.out.print(a[i][j]+" ");
//            System.out.println();
//        }
//    }
//}

//Q2. Addition of 2 arrays
//import java.util.Scanner;
//class Arrays2
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter m:");
//        int m=kb.nextInt();
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+(m*n)+" elements:");
//        int a[][]=new int[m][n];
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                a[i][j]=kb.nextInt();
//        }
//        System.out.print("Enter "+(m*n)+" elements:");
//        int b[][]=new int[m][n];
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                b[i][j]=kb.nextInt();
//        }
//        int c[][]=new int[m][n];
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                c[i][j]=a[i][j]+b[i][j];
//        }
//        System.out.print("New Array:\n");
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                System.out.print(c[i][j]+" ");
//            System.out.println();
//        }
//    }
//}

//Q3. Transpose of matrix
//import java.util.Scanner;
//class Arrays2
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter m:");
//        int m=kb.nextInt();
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+(m*n)+" elements:");
//        int a[][]=new int[m][n];
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                a[i][j]=kb.nextInt();
//        }
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(i!=j && j>i) {
//                    int temp = a[i][j];
//                    a[i][j] = a[j][i];
//                    a[j][i] = temp;
//                }
//            }
//        }
//        System.out.print("Array:\n");
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                System.out.print(a[i][j]+" ");
//            System.out.println();
//        }
//    }
//}

//Q4. Multiplication of 2 matrix
//import java.util.Scanner;
//class Arrays2
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter m:");
//        int m=kb.nextInt();
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+(m*n)+" elements:");
//        int a[][]=new int[m][n];
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                a[i][j]=kb.nextInt();
//        }
//        System.out.print("Enter "+(m*n)+" elements:");
//        int b[][]=new int[m][n];
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                b[i][j]=kb.nextInt();
//        }
//        int c[][]=new int[m][n];
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                c[i][j]=0;
//                for(int k=1;k<n;k++)
//                    c[i][j]+=a[i][k]*b[k][j];
//            }
//        }
//        System.out.print("New array:");
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                System.out.print(c[i][j]+" ");
//            System.out.println();
//        }
//    }
//}

//Q5. Sum of diagonal elements
//import java.util.Scanner;
//class Arrays
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter m:");
//        int m=kb.nextInt();
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        int a[][]=new int[m][n];
//        System.out.print("Enter "+(m*n)+" elements:");
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                a[i][j]=kb.nextInt();
//        }
//        int sum=0;
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(i==j)
//                    sum=sum+a[i][j];
//            }
//        }
//        System.out.println("Sum of diagonal elements:"+sum);
//    }
//}

//Q6. Row wise Sum
//import java.util.Scanner;
//class Arrays {
//    public static void main(String args[]) {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter m:");
//        int m = kb.nextInt();
//        System.out.print("Enter n:");
//        int n = kb.nextInt();
//        int a[][] = new int[m][n];
//        System.out.print("Enter " + (m * n) + " elements:");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++)
//                a[i][j] = kb.nextInt();
//        }
//        int row[]=new int[m];
//        for(int i=0;i<m;i++)
//        {
//            row[i]=0;
//            for(int j=0;j<n;j++)
//                row[i]+=a[i][j];
//        }
//        System.out.println("New array");
//        for(int i=0;i<m;i++)
//            System.out.println(row[i]);
//    }
//}

//Q7. Column wise sum
//import java.util.Scanner;
//class Arrays {
//    public static void main(String args[]) {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter m:");
//        int m = kb.nextInt();
//        System.out.print("Enter n:");
//        int n = kb.nextInt();
//        int a[][] = new int[m][n];
//        System.out.print("Enter " + (m * n) + " elements:");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++)
//                a[i][j] = kb.nextInt();
//        }
//        int row[]=new int[n];
//        for(int j=0;j<n;j++)
//        {
//            row[j]=0;
//            for(int i=0;i<m;i++)
//                row[j]+=a[i][j];
//        }
//        System.out.println("New array");
//        for(int i=0;i<n;i++)
//            System.out.println(row[i]);
//    }
//}