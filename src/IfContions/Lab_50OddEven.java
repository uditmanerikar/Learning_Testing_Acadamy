package IfContions;

import java.util.Scanner;

public class Lab_50OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        if(Number%2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
