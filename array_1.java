import java.util.Scanner;
public class array_1 {
    public static void main(String[] args) {
        int num,dose=0,max=0,k=0;
        Scanner myObj = new Scanner(System.in);
        num = myObj.nextInt();
        k = myObj.nextInt();

        int height[]=new int[num];
        for (int i = 0; i < num; i++) {
            height[i] = myObj.nextInt();
            if(max<height[i])
                max=height[i];
            }
        if(max>k) {
            dose=max-k;
        }
        System.out.println(dose);
    }
}