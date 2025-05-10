//Q1. Input marks of 3 subject calculate % and find result
//import java.util.Scanner;
//class ElseIf
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter a:");
//        int a=kb.nextInt();
//        System.out.print("Enter b:");
//        int b= kb.nextInt();
//        System.out.print("Enter c:");
//        int c= kb.nextInt();
//        double p=(a+b+c)*100/300;
//        if(p>=75)
//            System.out.println("Distinction");
//        else if(p>=60 && p<75)
//            System.out.println("First Division");
//        else if(p>=50 && p<60)
//            System.out.println("Second Division");
//        else
//            System.out.println("Fail");
//    }
//}

//Q2. Input age and give remarks
//import java.util.Scanner;
//class ElseIf
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter age:");
//        int a=kb.nextInt();
//        if(a>=1 && a<=12)
//            System.out.println("Child");
//        else if(a>=13 && a<=19)
//            System.out.println("Teenager");
//        else if(a>=20 && a<=50)
//            System.out.println("Mature");
//        else
//            System.out.println("Old");
//    }
//}

//Q3. Input any character and check whether it is uppercase,lowercase,number otherwise special character
//import java.util.Scanner;
//class ElseIf
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter character:");
//        char c=kb.next().charAt(0);
//        if(c>=65 && c<=90)
//            System.out.println("Uppercase");
//        else if(c>=97 && c<=122)
//            System.out.println("Lowercase");
//        else if(c>=48 && c<=57)
//            System.out.println("Number");
//        else
//            System.out.println("Special Character");
//    }
//}

//Q4. Input any alphabet and check whether it is vowel or consonant
//import java.util.Scanner;
//class ElseIf
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter character:");
//        char c=kb.next().charAt(0);
//        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
//            System.out.println("Vowel");
//        else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//            System.out.println("Vowel");
//        else
//            System.out.println("Consonant");
//    }
//}

//Q5. Input any month and find season
//import java.util.Scanner;
//class ElseIf
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter month number:");
//        int m=kb.nextInt();
//        if(m==12||m==1||m==2)
//            System.out.println("Winter");
//        else if(m==3||m==4||m==5)
//            System.out.println("Spring");
//        else if(m==6||m==7||m==8)
//            System.out.println("Summer");
//        else if (m==9||m==10||m==11)
//            System.out.println("Autumn");
//        else
//            System.out.println("Invalid Month");
//    }
//}

//Q6. Maximum out of 3 numbers
//import java.util.Scanner;
//class ElseIf
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
//        if(a>=b && a>=c)
//            System.out.println("Max:"+a);
//        else if(b>=a && b>=c)
//            System.out.println("Max:"+b);
//        else
//            System.out.println("Max:"+c);
//    }
//}

//Q7. Input any month and year and find number of days of given month
//import java.util.Scanner;
//class ElseIf
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter month:");
//        int m=kb.nextInt();
//        System.out.print("Enter year:");
//        int y=kb.nextInt();
//        if(m==4||m==6||m==9||m==11)
//            System.out.println("30 days");
//        else if(m==2 && y%4==0)
//            System.out.println("29 days");
//        else if(m==2 && y%4!=0)
//            System.out.println("28 days");
//        else
//            System.out.println("31 days");
//    }
//}

//Q8. Input marital status,gender and age and check whether the driver can be insured or not
//import java.util.Scanner;
//class ElseIf
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter marital status:");
//        String m=kb.next();
//        System.out.print("Enter gender:");
//        String g=kb.next();
//        System.out.print("Enter age:");
//        int age=kb.nextInt();
//        if(m.equals("married"))
//            System.out.println("Can be insured");
//        else if(m.equals("unmarried") && g.equals("male") && age>25)
//            System.out.println("Can be insured");
//        else if(m.equals("unmarried") && g.equals("female") && age>35)
//            System.out.println("Can be insured");
//        else
//            System.out.println("Cannot be insured");
//    }
//}