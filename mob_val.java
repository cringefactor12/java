import java.util.*;
public class mob_val {
    public static void main(String[] args) {
        String num, nums = "0123456789";
        Scanner s = new Scanner(System.in);
        num = s.next();
        if (num.length() != 10) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < num.length(); i++) {
            if (nums.indexOf(num.charAt(i)) == -1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
