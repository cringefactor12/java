import java.util.Scanner;
public class testinterface {
    interface AdvancedArithmetic{
        int divisor_sum(int n);
    }
    static class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0) {
                sum+=i;
            }
        }
    return sum;
    }

    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n=myObj.nextInt();
        MyCalculator Calc=new MyCalculator();
        System.out.println(Calc.divisor_sum(n));
    }
}
