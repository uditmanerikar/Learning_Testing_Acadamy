package SwitchStatements;

import java.util.Scanner;

public class Lab_55Exercise {
    public static void main(String[] args) {
        //ask user which browser to execute scripts
        Scanner sc =new Scanner(System.in);
        String Browser=sc.next();
        switch (Browser){
            case "Chrome":
                System.out.println("Execute scripts on chrome browser");
                break;
            case "Edge":
                System.out.println("Execute scripts on Edge browser");
                break;
            case "Firefox":
                System.out.println("Execute scripts on Firefox browser");
                break;
            case "OperaMini":
                System.out.println("Execute scripts on OperaMini browser");
                break;

        }
    }
}
