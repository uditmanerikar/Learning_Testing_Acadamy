package IfContions;

import java.util.Scanner;

public class Lab46_IfElse {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("allowed to vote Boss");
        }
    else {
            System.out.println("Cannot vote");
        }
    }
}