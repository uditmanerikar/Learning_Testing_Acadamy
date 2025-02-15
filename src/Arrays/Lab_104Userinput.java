package Arrays;

import java.util.Scanner;

public class Lab_104Userinput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("hi enter the numbers");
        int size=sc.nextInt();
        int num[]=new int[size];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("hi lets print");
        for(int j=0;j<num.length;j++){
            System.out.println(num[j]);
        }
    }
}
