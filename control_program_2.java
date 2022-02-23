import java.util.Scanner;
public class control_program_2 {
    public static void main(String[] args) {
        int num;
        try (Scanner myObj = new Scanner(System.in)) {
            num = myObj.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}