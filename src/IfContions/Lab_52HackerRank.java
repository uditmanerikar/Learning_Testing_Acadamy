package IfContions;

import javax.net.ssl.SNIHostName;
import java.util.Scanner;

public class Lab_52HackerRank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        char grade='B';
        if(score>=90&&  score<=100){
            grade='A';
        }
        else if(score>=80&&  score<=90){
            grade='B';
        }
        else if(score>=70&&  score<=80){
            grade='C';
        }
        else if(score>=60&&  score<=70){
            grade='D';
        }
        else if (score>=100 ||  score<=0){
            System.out.println("You are god level");
        }
        System.out.println(grade);
    }
}
