package Strings;

public class Lab_88StringInterviewequalsvsequalsequals {
    public static void main(String[] args) {
        // == check the object location and not value
        String s1="Udit";
        String s2="Udit";
        String s3=new String ("Udit");//new string would get created
        String s4=new String("Ojas");
        System.out.println(s3==s1);
        System.out.println(s2==s1);
        //equals checks the value
        System.out.println(s4.equals(s1));
        System.out.println(s2.equals(s1));
        /*Explanation:
String Pool Optimization (s1 and s2):
String s1 = "Udit";
String s2 = "Udit";
Both s1 and s2 refer to the same string literal "Udit" stored in the string pool.
The Java compiler optimizes memory usage by storing only one copy of each unique string literal in the string pool.
s1 == s2 → true (Both refer to the same string in the pool).
Using new String() (s3):

String s3 = new String("Udit");
s3 is explicitly created using the new keyword.
This creates a new object in the heap memory, even though the string content is the same as "Udit".
s3 does not point to the string in the string pool but to a different object in heap memory.
Comparison using ==:

System.out.println(s3 == s1);
s3 (heap object) and s1 (string pool) refer to different objects.
== checks for reference equality, and since they point to different memory locations, the result is false.*/
    }
}
