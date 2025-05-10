//Q1. Input basic salary calculate bonus and total salary
//import java.util.Scanner;
//class Operators
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter basic salary:");
//        int basic= kb.nextInt();
//        double bonus=0.10*basic;
//        System.out.println("Bonus:"+bonus);
//        System.out.println("Total salary:"+(basic+bonus));
//    }
//}

//Q2. Input basic,HRA,DA,PF.Calculate gross and net salary
//import java.util.Scanner;
//class Operators
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter basic salary:");
//        int basic=kb.nextInt();
//        System.out.print("Enter HRA:");
//        int HRA=kb.nextInt();
//        System.out.print("Enter DA:");
//        int DA= kb.nextInt();
//        System.out.print("Enter PF:");
//        int PF=kb.nextInt();
//        int gross=basic+HRA+DA;
//        int net=gross-PF;
//        System.out.println("Gross salary:"+gross);
//        System.out.println("Net salary:"+net);
//    }
//}

//Q3. Input previous reading,new reading and rate per unit.Calculate unit consumed and bill.
//import java.util.Scanner;
//class Operators
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter previous reading:");
//        int p=kb.nextInt();
//        System.out.print("Enter new reading:");
//        int n=kb.nextInt();
//        System.out.print("Enter rate per unit:");
//        int r=kb.nextInt();
//        int u=n-p;
//        System.out.println("Unit consumed:"+u);
//        System.out.println("Bill:"+(u*r));
//    }
//}

//Q4. Calculate hypotenuse from perpendicular and base.
//import java.util.Scanner;
//class Operators
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter perpendicular:");
//        int p=kb.nextInt();
//        System.out.print("Enter base:");
//        int b=kb.nextInt();
//        double h=Math.sqrt((p*p)+(b*b));
//        System.out.println("Hypotenuse:"+h);
//    }
//}

//Q5. Calculate amount and compound interest.
//import java.util.Scanner;
//class Operators
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter p:");
//        int p=kb.nextInt();
//        System.out.print("Enter r:");
//        int r=kb.nextInt();
//        System.out.print("Enter t:");
//        int t=kb.nextInt();
//        double a=p*Math.pow(1+r/100,t);
//        System.out.println("Amount is:"+a);
//        System.out.println("Compound Interest:"+(a-p));
//    }
//}

//Q6. Calculate area of triangle using heron's formula
//import java.util.Scanner;
//class Operators
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter first side:");
//        int a=kb.nextInt();
//        System.out.print("Enter second side:");
//        int b=kb.nextInt();
//        System.out.print("Enter third side:");
//        int c=kb.nextInt();
//        double s=(a+b+c)/2;
//        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
//        System.out.println("Area of triangle is:"+area);
//    }
//}