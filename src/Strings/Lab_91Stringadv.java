package Strings;

public class Lab_91Stringadv {
    public static void main(String[] args) {
        String name="Ojas";
        System.out.println(name.charAt(1));
        String concat=name.concat("Manerikar");
        System.out.println(concat);
        System.out.println(name.contains("U"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.replace('j','s'));
    }
}
