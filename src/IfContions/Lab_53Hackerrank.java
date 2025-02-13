package IfContions;

import java.util.Scanner;

public class Lab_53Hackerrank {
    public static void main(String[] args) {
        //Triangle classifier
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side1");
        double Side1=sc.nextDouble();
        System.out.println("Enter Side2");
        double Side2=sc.nextDouble();
        System.out.println("Enter Side3");
        double Side3=sc.nextDouble();
        if(Side1<0 || Side2<0 || Side3<0){
            System.out.println("Disqualified");
        }
       else if(Side1==Side2 && Side1==Side3 && Side1==Side2){
            System.out.println("Acute angle");
        }

        else if (Side1==Side2 || Side1==Side3 || Side3==Side2)
        {
            System.out.println("Angle is isoceles");
        }
        else{
            System.out.println("triangle is scalene");
        }
    }
}
