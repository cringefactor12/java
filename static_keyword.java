import java.util.Scanner;
public class static_keyword {
    static String findprime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
        break;
        }
    }

    if (!flag)
        return "Prime";
    else
        return "Not Prime";
    }

    public static void main(String[] args) {
        int num = 0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        boolean flag = false;
        System.out.println(findprime(num));
    } 
}