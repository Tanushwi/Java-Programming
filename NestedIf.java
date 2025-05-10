//Q1. Maximum out of 3 numbers
//import java.util.Scanner;
//class NestedIf
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter a:");
//        int a=kb.nextInt();
//        System.out.print("Enter b:");
//        int b=kb.nextInt();
//        System.out.print("Enter c:");
//        int c=kb.nextInt();
//        if(a>b)
//        {
//            if(a>c)
//                System.out.println("Max:"+a);
//            else
//                System.out.println("Max:"+c);
//        }
//        else
//        {
//            if(b>c)
//                System.out.println("Max:"+b);
//            else
//                System.out.println("Max:"+c);
//        }
//    }
//}

//Q2. Maximum out of 4 numbers
//import java.util.Scanner;
//class NestedIf {
//    public static void main(String args[])
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter a:");
//        int a = kb.nextInt();
//        System.out.print("Enter b:");
//        int b = kb.nextInt();
//        System.out.print("Enter c:");
//        int c = kb.nextInt();
//        System.out.print("Enter d:");
//        int d = kb.nextInt();
//        if(a>b)
//        {
//            if(a>c)
//            {
//                if(a>d)
//                    System.out.println("Max:"+a);
//                else
//                    System.out.println("Max:"+d);
//            }
//            else
//            {
//                if(c>d)
//                    System.out.println("Max:"+c);
//                else
//                    System.out.println("Max:"+d);
//            }
//        }
//        else
//        {
//            if(b>c)
//            {
//                if(b>d)
//                    System.out.println("Max:"+b);
//                else
//                    System.out.println("Max:"+d);
//            }
//            else
//            {
//                if(c>d)
//                    System.out.println("Max:"+c);
//                else
//                    System.out.println("Max:"+d);
//            }
//        }
//    }
//}

//Q3. Input any month and year and find number of days in given month
//import java.util.Scanner;
//class NestedIf
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter month:");
//        int m=kb.nextInt();
//        if(m==4||m==6||m==9||m==11)
//            System.out.println("30 days");
//        else
//        {
//            if(m==2) {
//                System.out.print("Enter year:");
//                int y = kb.nextInt();
//                if (y % 4 == 0)
//                    System.out.println("29 days");
//                else
//                    System.out.println("28 days");
//            }
//            else
//                System.out.println("31 days");
//        }
//    }
//}

//Q4. Input marital status,gender and age and check whether the driver can be insured or not
//import java.util.Scanner;
//class NestedIf
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter marital status:");
//        String m=kb.next();
//        if(m.equals("married"))
//            System.out.println("Can be insured");
//        else
//        {
//            System.out.print("Enter gender:");
//            String g=kb.next();
//            System.out.print("Enter age:");
//            int age=kb.nextInt();
//            if(g.equals("male"))
//            {
//                if(age>25)
//                    System.out.println("Can be insured");
//                else
//                    System.out.println("Cannot be insured");
//            }
//            else
//            {
//                if(age>35)
//                    System.out.println("Can be insured");
//                else
//                    System.out.println("Cannot be insured");
//            }
//        }
//    }
//}