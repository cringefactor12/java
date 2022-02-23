import java.util.Scanner;
public class operators_3 {
    public static void main(String[] args) {
        int day,month,luck;
        Scanner myObj = new Scanner(System.in);
        day = myObj.nextInt();
        month = myObj.nextInt();
        luck = (int) (day*Math.pow(2,month));
        System.out.println(luck);
    }
 }
