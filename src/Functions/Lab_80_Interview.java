package Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_80_Interview {
    //create a function for sum sub div mul take user inputs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Numbersum");
        int a = 0;
        if(sc.hasNextInt()){
         a = sc.nextInt();
        }
        else{
            System.out.println("Enter int numbers only");
            System.exit(0);
        }
        System.out.println("Enter Second Numbersum");
        int b = sc.nextInt();
        int sum=Sum(a,b);
        System.out.println(sum);
        int Mul=Mul(a,b);
        System.out.println(Mul);
        int Div=Div(a,b);
        System.out.println(Div);
        int Sub=Subtractionum(a,b);
        System.out.println(Sub);
    }

    static int Sum(int num1, int num2) {
    return num1+num2;
    }
    static int Mul(int num1, int num2) {
        return num1*num2;
    }
    static int Div(int num1, int num2) {
        return num1/num2;
    }
    static int Subtractionum(int num1, int num2) {
        return num1-num2;
    }


}
