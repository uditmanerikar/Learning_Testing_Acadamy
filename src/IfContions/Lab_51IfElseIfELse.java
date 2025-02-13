package IfContions;

import java.util.Scanner;

public class Lab_51IfElseIfELse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Number1=sc.nextInt();
        int Number2=sc.nextInt();
        if(Number1>Number2){
            System.out.println("Number 1 is greater");
        } else if (Number2>Number1) {
            System.out.println("Number 2  is  Greater");

        }
        else {
            System.out.println("Both are equal");
        }
    }
}
