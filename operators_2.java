import java.util.Scanner;
public class operators_2 {
    public static void main(String[] args) {
        int num;
        try (Scanner myObj = new Scanner(System.in)) {
            num = myObj.nextInt();
        }
        System.out.println("Last digit is" + (num % 10 == 0 ? "" : " not") + " 0");
    }
 }
