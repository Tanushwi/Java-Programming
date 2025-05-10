//Q1. WAP to input electricity unit charges and calculate total electricity bill according to given conditions.
// For first 50 units RS.0.50/unit
// For next 100 units RS.0.75/unit
// For next 100 units RS.1.20/unit
// For unit above 250 RS.1.50/unit
//Additonal 20% is added to bill

//import java.util.Scanner;
//class SlabBased
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter units:");
//        int u=kb.nextInt();
//        double amt;
//        if(u<=50)
//            amt=0.50*u;
//        else if(u>50 && u<=150)
//            amt=0.50*50+(u-50)*0.75;
//        else if(u>150 && u<=250)
//            amt=0.50*50+100*0.75+(u-150)*1.20;
//        else
//            amt=0.50*50+100*0.75+100*1.20+(u-250)*1.50;
//        double extra=20*amt/100;
//        System.out.println("Bill to be paid:"+(amt+extra));
//    }
//}

//Q2. WAP to calculate tax the person has to pay based on their income
// if income<=250000 then tax=0
// if income>250000 && income<=500000 then tax 5%
// if income>500000 && income<=1000000 then tax 10%
// if income>1000000 then tax 15%

//import java.util.Scanner;
//class SlabBased
//{
//    public static void main(String args[])
//    {
//        Scanner kb=new Scanner(System.in);
//        System.out.print("Enter income:");
//        int income=kb.nextInt();
//        double tax;
//        if(income<=250000)
//            tax=0;
//        else if(income>250000 && income<=500000)
//            tax=(income-250000)*5/100;
//        else if(income>500000 && income<1000000)
//            tax=250000*5/100+(income-500000)*10/100;
//        else
//            tax=250000*5/100+500000*10/100+(income-1000000)*15/100;
//        System.out.println("Tax to be paid:"+tax);
//    }
//}