import java.util.Scanner;
public class control_program_3 {
    public static void main(String[] args) {
        int num, total = 0;
        try (Scanner myObj = new Scanner(System.in)) {
            num = myObj.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                total += i;
                System.out.println(i);
            }
        }
        System.out.println(total);
    }
}
