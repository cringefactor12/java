import java.util.*;
public class str_concat{
    public static void main(String[] args) {
        String s1,s2;
        Scanner s=new Scanner(System.in);
        s1=s.next();
        s2=s.next();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            s2=s2.substring(1);
        }
        System.out.println(s1 + s2);
    }
}
