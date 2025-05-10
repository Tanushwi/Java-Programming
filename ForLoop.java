//Q1. Squares and cubes of first n natural numbers
//import java.util.Scanner;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter value of n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            System.out.println(i+" "+(i*i)+" "+(i*i*i));
//        }
//    }
//}

//Q2. Sum of first n natural numbers
//import java.util.Scanner;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter value of n:");
//        int n= kb.nextInt();
//        int sum=0;
//        for(int i=1;i<=n;i++)
//        {
//            sum=sum+i;
//        }
//        System.out.print("Sum is:"+sum);
//    }
//}

//Q3. Factorial of a number
//import java.util.*;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter value of num:");
//        int num=kb.nextInt();
//        int f=1;
//        for(int i=num;i>=1;i--)
//        {
//            f=f*i;
//        }
//        System.out.println("Factorial is:"+f);
//    }
//}

//Q4. Table of a number
//import java.util.*;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter value of num:");
//        int num=kb.nextInt();
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(num+"*"+i+"="+(num*i));
//        }
//    }
//}

//Q5. Power of a number
//import java.util.*;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter base:");
//        int b=kb.nextInt();
//        System.out.print("Enter exponent:");
//        int e= kb.nextInt();
//        int res=1;
//        for(int i=1;i<=e;i++)
//            res=res*b;
//        System.out.println("Result:"+res);
//    }
//}

//Q6. Sum of factors of a number
//import java.util.*;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter value of num:");
//        int num=kb.nextInt();
//        int sum=0;
//        for(int i=1;i<=num;i++)
//        {
//            if(num%i==0)
//                sum=sum+i;
//        }
//        System.out.println("Sum is:"+sum);
//    }
//}

//Q7. Number is perfect or not
//import java.util.*;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter value of num:");
//        int num=kb.nextInt();
//        int sum=0;
//        for(int i=1;i<num;i++)
//        {
//            if(num%i==0)
//                sum=sum+i;
//        }
//        if(num==sum)
//            System.out.println("Perfect number");
//        else
//            System.out.println("Not a perfect number");
//    }
//}

//Q8. Print fibonacci series
//import java.util.*;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter value of num:");
//        int num=kb.nextInt();
//        int a=0,b=1,c;
//        for(int i=1;i<=num;i++)
//        {
//            System.out.println(a);
//            c=a+b;
//            a=b;
//            b=c;
//        }
//    }
//}

//Q9. Sum and average of n numbers
//import java.util.*;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter value of n:");
//        int n=kb.nextInt();
//        int sum=0;
//        double avg;
//        for(int i=1;i<=n;i++)
//        {
//            System.out.print("Enter number:");
//            int num=kb.nextInt();
//            sum=sum+num;
//        }
//        avg=(double)sum/n;
//        System.out.println("Sum:"+sum);
//        System.out.println("Average:"+avg);
//    }
//}

//Q10. Out of n numbers count odd or even
//import java.util.*;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        int o=0,e=0;
//        for(int i=1;i<=n;i++)
//        {
//            System.out.print("Enter num:");
//            int num=kb.nextInt();
//            if(num%2==0)
//                e++;
//            else
//                o++;
//        }
//        System.out.println("Even:"+e);
//        System.out.println("Odd:"+o);
//    }
//}

//Q11. Check number is prime or not
//import java.util.*;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter num:");
//        int num=kb.nextInt();
//        int ctr=0;
//        for(int i=2;i<num;i++)
//        {
//            if(num%i==0)
//            {
//                ctr=1;
//                break;
//            }
//        }
//        if(ctr==0)
//            System.out.println("Prime");
//        else
//            System.out.println("Not Prime");
//    }
//}

//Q12. Print armstrong number from 1-n
//import java.util.*;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n=kb.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            int temp=i;
//            int count=0;
//            while(temp!=0)
//            {
//                count=count+1;
//                temp=temp/10;
//            }
//            temp=i;
//            int sum=0;
//            while(temp!=0)
//            {
//                int digit=temp%10;
//                sum=sum+(int)Math.pow(digit,count);
//                temp=temp/10;
//            }
//            if(i==sum)
//                System.out.println(i);
//        }
//    }
//}

//Q13. WAP to check number is strong or not
//import java.util.*;
//class ForLoop
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
//        System.out.print("Enter num:");
//        int num=kb.nextInt();
//        int temp=num;
//        int sum=0;
//        while(temp!=0)
//        {
//            int digit=temp%10;
//            sum=sum+fact(digit);
//            temp=temp/10;
//        }
//        if(num==sum)
//            System.out.println("Strong number");
//        else
//            System.out.println("Not a strong number");
//    }
//}

//Q14. WAP to find lcm of 2 number
//import java.util.Scanner;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter first number:");
//        int a= kb.nextInt();
//        System.out.print("Enter second number:");
//        int b=kb.nextInt();
//        int hcf=1;
//        for(int i=1;i<=a ||i<=b;i++)
//        {
//            if((a%i==0)&& (b%i==0))
//                hcf=i;
//        }
//        int lcm=(a*b)/hcf;
//        System.out.println("LCM:"+lcm);
//    }
//}

//Q15. HCF of two numbers
//import java.util.Scanner;
//class ForLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter first number:");
//        int a= kb.nextInt();
//        System.out.print("Enter second number:");
//        int b=kb.nextInt();
//        int hcf=1;
//        for(int i=1;i<=a ||i<=b;i++)
//        {
//            if((a%i==0)&& (b%i==0))
//                hcf=i;
//        }
//        System.out.println("HCF:"+hcf);
//    }
//}

//Q16. Print prime numbers in particular range
//import java.util.Scanner;
//class ForLoop
//{
//    public static boolean isprime(int num)
//    {
//        if(num<2)
//            return false;
//        for(int i=2;i<num;i++)
//        {
//            if(num%i==0)
//                return false;
//        }
//        return true;
//    }
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter number:");
//        int num= kb.nextInt();
//        for(int i=1;i<=num;i++)
//        {
//            if(isprime(i))
//                System.out.println(i);
//        }
//    }
//}