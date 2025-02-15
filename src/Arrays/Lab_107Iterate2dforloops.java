package Arrays;

public class Lab_107Iterate2dforloops {
    public static void main(String[] args) {
        int num[][]={{1,2,5},{4,8,9},{7,5,3}};
        for (int i = 0; i <num.length; i++) {
            for (int j = 0; j < num[i].length ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
