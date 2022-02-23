import java.util.*;
public class exception_handling {
    public static void main(String[] args) {
        int a,b,quotient;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        try {
            quotient=a/b;
            System.out.println("The quotient of "+a+" / "+b+" = "+quotient);
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero Exception caught");
        }finally {
            System.out.println("Inside finally block");
        }
    }

}