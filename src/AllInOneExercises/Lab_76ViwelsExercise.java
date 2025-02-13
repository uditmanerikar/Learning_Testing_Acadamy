package AllInOneExercises;

import java.util.Scanner;

public class Lab_76ViwelsExercise {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
        System.out.println("Entyet string name");
        String input = sc.next();
        countvc(input);
    }
        public static void countvc(String str){
            int vowel = 0, consonants = 0;
            str = str.toLowerCase();
            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if ("aeiou".indexOf(ch) != -1) {
                        vowel++;
                    } else {
                        consonants++;
                    }
                }
            }
            System.out.println(vowel);
            System.out.println(consonants);
        }
    }
