//Q1. Reverse each word
//Method-1 without using string buffer
//import java.util.Scanner;
//class Strings
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter any string:");
//        String string=kb.next();
//        String s[]=string.split(",");
//        for(int i=0;i<s.length;i++)
//        {
//            char c[]=s[i].toCharArray();
//            int k=c.length;
//            for(int j=0;j<k/2;j++)
//            {
//                char dummy=c[j];
//                c[j]=c[k-1-j];
//                c[k-1-j]=dummy;
//            }
//            s[i]=new String(c);
//        }
//        String res=String.join(",",s);
//        System.out.println("Resultant string:"+res);
//    }
//}

//Method-2 Using String Buffer
//import java.util.Scanner;
//class Strings
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter any string:");
//        String string=kb.next();
//        String s[]=string.split(",");
//        for(int i=0;i<s.length;i++)
//        {
//            StringBuffer sb=new StringBuffer(s[i]);
//            s[i]=sb.reverse().toString();
//        }
//        String res=String.join(",",s);
//        System.out.println("Resultant string:"+res);
//    }
//}

//Q2. Reverse the sentence without reversing word
//Method-1 Using string buffer
//import java.util.Scanner;
//class Strings
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter any string:");
//        String string=kb.nextLine();
//        StringBuffer sb=new StringBuffer();
//        String s[]=string.split(" ");
//        for(int i=s.length-1;i>=0;i--)
//        {
//            sb.append(s[i]);
//            if(i!=0)
//                sb.append(" ");
//        }
//        System.out.println("Resultant string:"+sb.toString());
//
//    }
//}

//Method-2 without using string buffer
//import java.util.Scanner;
//class Strings
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter any string:");
//        String string=kb.nextLine();
//        String res="";
//        String s[]=string.split(" ");
//        for(int i=s.length-1;i>=0;i--)
//        {
//            res=res+s[i]+" ";
//        }
//        System.out.println("Resultant string:"+res.trim());
//    }
//}

//Q3. Check whether entered character is vowel or consonant
//import java.util.Scanner;
//class Strings
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter any character:");
//        char c=kb.next().charAt(0);
//        if("AEIOUaeiou".contains(String.valueOf(c)))
//            System.out.println("Vowel");
//        else
//            System.out.println("Consonant");
//    }
//}

//Q4. WAP to remove all vowels from the string "Programming is fun" using StringBuffer
//class Strings
//{
//    public static void main(String args[])
//    {
//        String text="Programming is fun";
//        StringBuffer sb=new StringBuffer(text);
//        for(int i=0;i<sb.length();i++)
//        {
//            char c=sb.charAt(i);
//            if("AEIOUaeiou".contains(String.valueOf(c)))
//            {
//                sb.deleteCharAt(i);
//                i--;
//            }
//        }
//        System.out.println("String without vowels:"+sb.toString());
//    }
//}