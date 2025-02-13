package Functions;

import java.util.Scanner;

public class Lab_79UserdDefinedAll {
    public static void main(String[] args) {
       // String s=Greet1();
        //System.out.println(s);
      //  int age=tovote();
      //  System.out.println(age);
      //  greetname("Ojas");
       // greetnames("Udit","Manerikar");
      //  Scanner sc=new Scanner(System.in);
      //  String myname=sc.next();
      //  int age1=sc.nextInt();
      //  int salary=sc.nextInt();
      //  mydetails(myname,age1,salary);
        int sum=sumoftwonumbers(5,8);
        System.out.println(sum);
    }

    //No return type no argument
    static void greet(){
        System.out.println("udit");
    }
    // return type  But no argument
    static String Greet1(){
        return "Udit How are you";
    }
    static int tovote(){
        return 18;
    }
    // No return type  But with argument
    static void greetname(String name){
        System.out.println("Yo I am a Man"+name);
    }
    static void greetnames(String fname,String lname){
        System.out.println("Yo I am a Man "+fname+" "+lname);
    }
    static void mydetails(String myname,int age1,int salary){
        System.out.println("My name is  "+myname+" my age is "+age1+" my salary is "+salary);
    }

    // With return type  with argument
    static int sumoftwonumbers(int a,int b){
        return a+b;
    }
}


