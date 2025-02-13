package Strings;

public class Lab_89StringFunctions {
    public static void main(String[] args) {
        String name="Udit1 how are you doing";
        name=name.substring(0,4);
        System.out.println(name);
        System.out.println(name.charAt(3));
        String myname="udit@ojas";
        String split[]=myname.split("@");
        System.out.println(split[0]);
        System.out.println(name.substring(1,3));
        String mypositionis="   Test";
        System.out.println(mypositionis);
        System.out.println(mypositionis.trim());
        System.out.println(mypositionis);


    }
}
