//Q1. Create a color menu
//import java.util.Scanner;
//class SwitchCase
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.println("COLOR MENU");
//        System.out.println("R for Red");
//        System.out.println("G for Green");
//        System.out.println("B for Blue");
//        System.out.print("Enter choice:");
//        char choice=kb.next().charAt(0);
//        switch(choice)
//        {
//            case 'r': case 'R':
//            System.out.println("Roses are red");
//            break;
//            case 'g': case 'G':
//            System.out.println("Grasses are green");
//            break;
//            case 'b': case 'B':
//            System.out.println("Sky is blue");
//            break;
//            default:
//            System.out.println("Invalid choice");
//        }
//    }
//}

//Q2. Math Menu
//import java.util.Scanner;
//class SwitchCase
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter first number:");
//        int a=kb.nextInt();
//        System.out.print("Enter second number:");
//        int b=kb.nextInt();
//        System.out.println();
//        System.out.println("Math Menu");
//        System.out.println("1. Add");
//        System.out.println("2. Subtract");
//        System.out.print("Enter choice:");
//        int choice=kb.nextInt();
//        switch(choice)
//        {
//            case 1:
//                System.out.println("Sum:"+(a+b));
//                break;
//            case 2:
//                System.out.println("Difference:"+(a-b));
//                break;
//            default:
//                System.out.println("Invalid Choice");
//        }
//    }
//}

//Q3. Calculator
//import java.util.Scanner;
//class SwitchCase
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter first number:");
//        int a=kb.nextInt();
//        System.out.print("Enter second number:");
//        int b=kb.nextInt();
//        System.out.println();
//        System.out.println("Calculator");
//        System.out.println("+ Add");
//        System.out.println("- Subrract");
//        System.out.println("* Multiply");
//        System.out.println("/ Divide");
//        System.out.print("Enter choice:");
//        char choice=kb.next().charAt(0);
//        switch(choice)
//        {
//            case '+':
//                System.out.println("Sum:"+(a+b));
//                break;
//            case '-':
//                System.out.println("Difference:"+(a-b));
//                break;
//            case '*':
//                System.out.println("Product:"+(a*b));
//                break;
//            case '/':
//                System.out.println("Quotient:"+(a/b));
//                break;
//            default:
//                System.out.println("Invalid Choice");
//        }
//    }
//}

//Q4. Area menu
//import java.util.Scanner;
//class SwitchCase
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.println("Area Menu");
//        System.out.println("1. Rectangle");
//        System.out.println("2. Circle");
//        System.out.print("Enter choice:");
//        int ch=kb.nextInt();
//        switch(ch)
//        {
//            case 1:
//                System.out.print("Enter length:");
//                int l=kb.nextInt();
//                System.out.print("Enter breadth:");
//                int b=kb.nextInt();
//                System.out.println("Area of rectangle is:"+(l*b));
//                break;
//            case 2:
//                System.out.print("Enter radius:");
//                int r=kb.nextInt();
//                System.out.println("Area of circle is:"+(Math.PI*r*r));
//                break;
//            default:
//                System.out.println("Invalid Choice");
//        }
//    }
//}

//Q5. Input any alphabet and check whether it is vowel or consonant
//import java.util.Scanner;
//class SwitchCase
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter alphabet:");
//        char ch=kb.next().charAt(0);
//        switch (ch)
//        {
//            case 'a': case 'e': case 'i': case 'o': case 'u':
//            case 'A': case 'E': case 'I': case 'O': case 'U':
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("Consonant");
//        }
//    }
//}

//Q6. Input any month and year and print number of days
//import java.util.Scanner;
//class SwitchCase
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter month number:");
//        int m= kb.nextInt();
//        switch (m)
//        {
//            case 4: case 6: case 9: case 11:
//            System.out.println("30 days");
//            break;
//            case 2:
//                System.out.print("Enter year:");
//                int y=kb.nextInt();
//                switch(y%4)
//                {
//                    case 0:
//                        System.out.println("29 days");
//                        break;
//                    default:
//                        System.out.println("28 days");
//                        break;
//                }
//                break;
//            default:
//                System.out.println("31 days");
//        }
//    }
//}

//Q7. Input any month number and tell season
//import java.util.Scanner;
//class SwitchCase
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter month number:");
//        int m=kb.nextInt();
//        switch (m)
//        {
//            case 12: case 1: case 2:
//            System.out.println("Winter season");
//            break;
//            case 3: case 4: case 5:
//            System.out.println("Spring season");
//            break;
//            case 6: case 7: case 8:
//            System.out.println("Summer season");
//            break;
//            case 9: case 10: case 11:
//            System.out.println("Autumn season");
//            break;
//            default:
//            System.out.println("Invalid Month");
//        }
//    }
//}