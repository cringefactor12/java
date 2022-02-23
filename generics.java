import java.util.ArrayList;
import java.util.Scanner;
public class generics {
    static<T> void dedup(T[] t) {
        ArrayList<T> result=new ArrayList<>();
        for(int i=0;i<t.length;i++) {
            if (!result.contains(t[i])) result.add(t[i]);
        }
        result.forEach((i)->System.out.print(i+" "));
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String data=s.nextLine();
        String[] arr=data.split(" ");
        if (data.contains(".")) {
            Double[] dnum=new Double[arr.length];
            for(int i=0;i<arr.length;i++) {
                dnum[i]=Double.valueOf(arr[i]);
            }
            dedup(dnum);
        }
        else {
            Integer[] num=new Integer[arr.length];
            for(int i=0;i<arr.length;i++) {
            num[i]=Integer.valueOf(arr[i]);
        }
        dedup(num);
        }
    }
}
