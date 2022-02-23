import java.util.*;
import java.util.Collections;
public class collections_arraylist {
    public static void main(String[] args) {
        int num;
        ArrayList<Integer> age = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for (int i = 0; i < num; i++) {
            age.add(s.nextInt());
        }
        Collections.sort(age);
        for (int i : age) {
            System.out.println(i);
        }
    } 
}
