//Q1. Sum of elements
//import java.util.Scanner;
//class Arrays1
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+n+" elements:");
//        int a[]=new int[n];
//        int sum=0;
//        for(int i=0;i<n;i++) {
//            a[i] = kb.nextInt();
//            sum = sum + a[i];
//        }
//        System.out.println("Sum of elements:"+sum);
//    }
//}

//Q2. Half even double odd
//import java.util.Scanner;
//class Arrays1
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+n+" elements:");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++) {
//            a[i] = kb.nextInt();
//        }
//        for(int i=0;i<n;i++)
//        {
//            if(a[i]%2==0)
//                a[i]=a[i]/2;
//            else
//                a[i]=a[i]*2;
//        }
//        System.out.print("New array:");
//        for(int i=0;i<n;i++)
//            System.out.print(a[i]+" ");
//    }
//}

//Q3. Count odd and even elements from an array
//import java.util.Scanner;
//class Arrays1
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+n+" elements:");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++) {
//            a[i] = kb.nextInt();
//        }
//        int o=0,e=0;
//        for(int i=0;i<n;i++)
//        {
//            if(a[i]%2==0)
//                e++;
//            else
//                o++;
//        }
//        System.out.println("Total odds:"+o);
//        System.out.println("Total evens:"+e);
//    }
//}

//Q4. Addition of 2 arrays
//import java.util.Scanner;
//class Arrays1
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+n+" elements:");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++) {
//            a[i] = kb.nextInt();
//        }
//        System.out.print("Enter "+n+" elements:");
//        int b[]=new int[n];
//        for(int i=0;i<n;i++) {
//            b[i] = kb.nextInt();
//        }
//        int c[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            c[i]=a[i]+b[i];
//        }
//        System.out.print("New array:");
//        for(int i=0;i<n;i++)
//            System.out.print(c[i]+" ");
//    }
//}

//Q5. Second largest element
//import java.util.Scanner;
//class Arrays1
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+n+" elements:");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            a[i]=kb.nextInt();
//        }
//        int max1= Integer.MIN_VALUE,max2=-1;
//        for(int i=0;i<n;i++)
//        {
//            if(a[i]>=max1)
//            {
//                max2=max1;
//                max1=a[i];
//            }
//            if(a[i]>=max2 && a[i]<max1)
//                max2=a[i];
//        }
//        System.out.println("Second largest element:"+max2);
//    }
//}

//Q6. Reversing of array
//import java.util.Scanner;
//class Arrays1
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+n+" elements:");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++)
//            a[i]=kb.nextInt();
//        System.out.print("New array:");
//        for(int i=n-1;i>=0;i--)
//            System.out.print(a[i]+" ");
//    }
//}

//Q7. Reverse of each element in array
//import java.util.Scanner;
//class Arrays1
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+n+" elements:");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++)
//            a[i]=kb.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            int num=a[i];
//            int temp=num;
//            int sum=0;
//            while(temp!=0)
//            {
//                int digit=temp%10;
//                sum=sum*10+digit;
//                temp=temp/10;
//            }
//            a[i]=sum;
//        }
//        System.out.print("New array:");
//        for(int i=0;i<n;i++)
//            System.out.print(a[i]+" ");
//    }
//}

//Q8. Swap adjacent elements
//import java.util.Scanner;
//class Arrays1
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+n+" elements:");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++)
//            a[i]=kb.nextInt();
//        for(int i=0;i<n-1;i+=2)
//        {
//            int temp=a[i];
//            a[i]=a[i+1];
//            a[i+1]=temp;
//        }
//        System.out.print("New array:");
//        for(int i=0;i<n;i++)
//            System.out.print(a[i]+" ");
//    }
//}

//Q9. Left Shift
//import java.util.Scanner;
//class Arrays1
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        System.out.print("Enter "+n+" elements:");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++)
//            a[i]=kb.nextInt();
//        int temp=a[0];
//        for(int i=0;i<n-1;i++)
//            a[i]=a[i+1];
//        a[n-1]=temp;
//        System.out.print("New array:");
//        for(int i=0;i<n;i++)
//            System.out.print(a[i]+" ");
//    }
//}
