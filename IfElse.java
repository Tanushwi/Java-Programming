//Q1. WAP to check whether numbe is odd or even
//import java.util.Scanner;
//class IfElse
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter number:");
//        int num=kb.nextInt();
//        if(num%2==0)
//            System.out.println("Even");
//        else
//            System.out.println("Odd");
//    }
//}

//Q2. WAP to check maximum out of 2 numbers
//import java.util.Scanner;
//class IfElse
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter first number:");
//        int a=kb.nextInt();
//        System.out.print("Enter second number:");
//        int b= kb.nextInt();
//        if(a>=b)
//            System.out.println("Max:"+a);
//        else
//            System.out.println("Max:"+b);
//    }
//}

//Q3. WAP to check whether entered number is positive or negative.
//import java.util.Scanner;
//class IfElse
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter number:");
//        int num=kb.nextInt();
//        if(num>=0)
//            System.out.println("Positive");
//        else
//            System.out.println("Negative");
//    }
//}

//Q4. WAP to check whether person can cast vote or not
//import java.util.Scanner;
//class IfElse
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter age:");
//        int num=kb.nextInt();
//        if(num>=18)
//            System.out.println("Eligible");
//        else
//            System.out.println("Not Eligible");
//    }
//}

//Q5. WAP to check whether year is leap or not
//import java.util.Scanner;
//class IfElse
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter year:");
//        int num=kb.nextInt();
//        if((num%100==0 && num%400==0)||(num%100!=0 && num%4==0))
//            System.out.println("Leap");
//        else
//            System.out.println("Not Leap");
//    }
//}

//Q6. Input CP and SP.Calculate profit or loss
//import java.util.Scanner;
//class IfElse
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter SP:");
//        int sp=kb.nextInt();
//        System.out.print("Enter CP:");
//        int cp=kb.nextInt();
//        if(sp>=cp)
//            System.out.println("Profit:"+(sp-cp));
//        else
//            System.out.println("Loss:"+(cp-sp));
//    }
//}

//Q7. Input gender and greet accordingly.
//import java.util.Scanner;
//class IfElse
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter gender:");
//        char c=kb.next().charAt(0);
//        if(c=='m'||c=='M')
//            System.out.println("Good morning sir");
//        else
//            System.out.println("Good morning mam");
//    }
//}

//Q8. Input basic salary calculate bonus and total salary.
//              basic>=10000               bonus=0.10*basic
//                otherwise                bonus=0.05*basic
//import java.util.Scanner;
//class IfElse
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter basic salary:");
//        int basic=kb.nextInt();
//        double bonus;
//        if(basic>=10000)
//            bonus=0.10*basic;
//        else
//            bonus=0.05*basic;
//        System.out.println("Bonus:"+(bonus));
//        System.out.println("Total salary:"+(basic+bonus));
//    }
//}

//Q9. Input previous reading,new reading and meter type 'D' or 'C' calculate unit consumed and bill.
//           if M.T.      'D' -> r=5.50
//                        'C' -> r=6.50
//import java.util.Scanner;
//class IfElse
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter previous reading:");
//        int p= kb.nextInt();
//        System.out.print("Enter new reading:");
//        int n= kb.nextInt();
//        System.out.print("Enter meter type:");
//        char m=kb.next().charAt(0);
//        double r;
//        if(m=='d'||m=='D')
//            r=5.50;
//        else
//            r=6.50;
//        int u=n-p;
//        System.out.println("Unit consumed:"+(u));
//        System.out.println("Bill:"+(u*r));
//    }
//}