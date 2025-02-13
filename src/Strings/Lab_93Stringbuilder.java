package Strings;

public class Lab_93Stringbuilder {
    public static void main(String[] args) {
        String s="Udit";
        String s2="Ojas";
        //String s3=s+s2;
        System.out.println(s+s2);
        StringBuilder sb=new StringBuilder("Udit");//mutale no new object is created
        sb.append("manerikar");
        System.out.println(sb);
    }
}
