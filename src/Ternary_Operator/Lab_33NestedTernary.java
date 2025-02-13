package Ternary_Operator;

public class Lab_33NestedTernary {
    public static void main(String[] args) {
        int n1=90;
        int n2=250;
        int n3=51;
        int max=(n1>n2)?(n1>n3)?n1:n3:(n2>n3)? n2:n1;
        System.out.println(max);
    }
}
