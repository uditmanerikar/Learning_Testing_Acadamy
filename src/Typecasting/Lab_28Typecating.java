package Typecasting;

public class Lab_28Typecating {
    public static void main(String[] args) {
        byte b=10;
        //int a =b;
        int a=(int)b;
        int c=200;
        byte d =(byte)c;
        System.out.println(d);//data loss
    }
}
