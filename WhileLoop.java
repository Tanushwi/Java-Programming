//Q1. Sum of digits of a number
//import java.util.Scanner;
//class WhileLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter number:");
//        int num= kb.nextInt();
//        int temp=num;
//        int sum=0;
//        while(temp!=0)
//        {
//            int digit=temp%10;
//            sum=sum+digit;
//            temp=temp/10;
//        }
//        System.out.println("Sum of digits:"+sum);
//    }
//}

//Q2. Reverse of a number
//import java.util.Scanner;
//class WhileLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter number:");
//        int num= kb.nextInt();
//        int temp=num;
//        int sum=0;
//        while(temp!=0)
//        {
//            int digit=temp%10;
//            sum=sum*10+digit;
//            temp=temp/10;
//        }
//        System.out.println("Reverse of num:"+sum);
//    }
//}

//Q3. Check number is pallindrome or not
//import java.util.Scanner;
//class WhileLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter number:");
//        int num= kb.nextInt();
//        int temp=num;
//        int sum=0;
//        while(temp!=0)
//        {
//            int digit=temp%10;
//            sum=sum*10+digit;
//            temp=temp/10;
//        }
//        if(num==sum)
//            System.out.println("Pallindrome");
//        else
//            System.out.println("Not Pallindrome");
//    }
//}

//Q4. Check number is armstrong or not
//import java.util.Scanner;
//class WhileLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter number:");
//        int num= kb.nextInt();
//        int temp=num;
//        int sum=0;
//        int count=0;
//        while(temp!=0)
//        {
//            count=count+1;
//            temp=temp/10;
//        }
//        temp=num;
//        while(temp!=0)
//        {
//            int digit=temp%10;
//            sum=sum+(int)Math.pow(digit,count);
//            temp=temp/10;
//        }
//        if(num==sum)
//            System.out.println("Armstrong number");
//        else
//            System.out.println("Not armstrong number");
//    }
//}

//Q5. Count digits of a number
//import java.util.Scanner;
//class WhileLoop
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter number:");
//        int num= kb.nextInt();
//        int temp=num;
//        int count=0;
//        while(temp!=0)
//        {
//            count=count+1;
//            temp=temp/10;
//        }
//        System.out.println("Total digits:"+count);
//    }
//}
