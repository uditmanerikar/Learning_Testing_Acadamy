package SwitchStatements;

import java.util.Scanner;

public class Lab_54HackerRank {
    //Identify Which day is it
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int Day=sc.nextInt();
        switch(Day)
        {
            case 1:
                System.out.println("Day Is Monday");
                break;
            case 2:
                System.out.println("Day Is Tuesday");
                break;
            case 3:
                System.out.println("Day Is Wednesday");
                break;
            case 4:
                System.out.println("Day Is Thuesday");
                break;
            case 5:
                System.out.println("Day Is Friday");
                break;
            case 6:
                System.out.println("Day Is Saturday");
                break;
            case 7:
                System.out.println("Day Is Sunday");
                break;
        }
    }
}
