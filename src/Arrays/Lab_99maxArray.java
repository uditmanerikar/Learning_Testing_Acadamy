package Arrays;

public class Lab_99maxArray {
    public static void main(String[] args) {
    int array[]={12,25,14,78,98,96,45,75,84,35,26,115};
        System.out.println(givemax(array));
    //logic building
    //1.Identify input-array-int
    //output=int
}
static int givemax(int mazxarray1[]){
int max=mazxarray1[0];
for(int a=1;a<mazxarray1.length;a++){
    if(mazxarray1[a]>max){
        max=mazxarray1[a];
    }
}
return max;
        }}