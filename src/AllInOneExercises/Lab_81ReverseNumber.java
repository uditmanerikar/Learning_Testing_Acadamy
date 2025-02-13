package AllInOneExercises;

public class Lab_81ReverseNumber {
    public static void main(String[] args) {
        int num=15478;
        int rev=0;
       while(num>0){
           int lastdigit=num/10;
           rev=rev*10+lastdigit;
           num=num/10;
       }

        }
    }

