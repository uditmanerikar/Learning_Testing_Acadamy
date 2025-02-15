package Arrays;

public class Lab_100MinArray {
    public static void main(String[] args) {
        int number[]={4,8,6,9,8,2,3,6,5,7,4};
        int minimum=min(number);
        System.out.println(minimum);
    }
    static int min(int minarray[]){
        int min=minarray[0];
        for(int i=1;i<minarray.length;i++){
            if(minarray[i]<min){
                min=minarray[i];
            }
        }
        return min;
    }
}
