import java.util.Scanner;
public class array_2 {
    public static void main(String[] args) {
        int num,max=0;
        Scanner myObj = new Scanner(System.in);
        num = myObj.nextInt();
        int marks[] = new int[num];
        for(int i = 0; i<num; i++){
            marks[i] = myObj.nextInt();
        }
        for(int i = 0; i<num-1; i++) {
            for(int j=i+1; j<num; j++) {
                if(marks[j]>marks[i]) {
                    int swap = marks[j];
                    marks[j]=marks[i];
                    marks[i]=swap;
                }
            }
        }
        for(int i=0; i<num ;i++)
            System.out.print(marks[i]+" ");
    }
}
