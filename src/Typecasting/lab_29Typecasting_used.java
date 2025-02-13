package Typecasting;

public class lab_29Typecasting_used {
    public static void main(String[] args) {
        int course=100;
        float gst=18.5f;
        int total=course+(int) gst;//Explicit casting
        float total1=(int)course+gst;
        System.out.println(total);
    }
}
