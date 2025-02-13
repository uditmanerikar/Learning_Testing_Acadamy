package ForLoops;

public class Lab_70EvenNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if (i % 2 == 0) {
                System.out.println("even" + i);
                continue;
            }
            System.out.println(i);
        }}}


