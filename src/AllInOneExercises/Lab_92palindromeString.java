package AllInOneExercises;

public class Lab_92palindromeString {
    public static void main(String[] args) {
        boolean result=ispalindrome("lanal");
        System.out.println(result);
    }
    static boolean ispalindrome(String name) {
        name = name.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;//0
        int right = name.length() - 1;//3
        while (left < right) {
            if (name.charAt(left) != name.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }}
