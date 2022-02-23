import java.util.Scanner;

public class MyPolynomial {
    private int[] coeffs;
    private int degree;

    MyPolynomial(int... a) {
        this.degree = a.length;
        coeffs = new int[degree];
        for (int i = 0; i < degree; i++) {
            coeffs[i] = a[i];
        }
    }

    public int getDegree() {
        return degree;
    }

    @Override
    public String toString() {
    StringBuilder str = new StringBuilder();
    // for (int i = coeffs.length-1; i >= 0; i--) {
    // str.append(coeffs[i] + "x^" + i + "+");
    // }
    // str.append(coeffs[0]);
        for (int i = 0; i < coeffs.length - 1; i++) {
            str.append(coeffs[i] + "x^" + i + "+");
        }
        str.append(coeffs[coeffs.length - 1] + "x^" +
        (coeffs.length - 1));

        return str.toString();
    }

    public int evaluate(int x) {
        int p = 0;
        for (int i = 0; i < coeffs.length; i++) {
            p += coeffs[i] * Math.pow(x, i);
        }
        return p;
    }

    public MyPolynomial add(MyPolynomial that) {
        int poly[] = new int[this.degree > that.degree ?
        this.degree : that.degree];
        if (this.degree > that.degree) {
            for (int i = 0; i < this.degree; i++) {
                poly[i] += this.coeffs[i];
                if (i<that.degree)
                    poly[i] += that.coeffs[i];
                }
        } else {
            for (int i = 0; i < that.degree; i++) {
                poly[i] += that.coeffs[i];
            if (i<this.degree)
                poly[i] += this.coeffs[i];
            }
        }
        return new MyPolynomial(poly);
    }

    public MyPolynomial multiply(MyPolynomial that) {
        int poly[] = new int[this.degree + that.degree - 1];
        for (int i = 0; i < this.degree; i++)
            for (int j = 0; j < that.degree; j++)
                poly[i + j] += (this.coeffs[i] * that.coeffs[j]);
        return new MyPolynomial(poly);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int degree;
        int coef[];
        degree = myObj.nextInt();
        coef = new int[degree+1];
        for (int i = 0; i < coef.length; i++) {
            coef[i] = myObj.nextInt();
        }
        MyPolynomial first = new MyPolynomial(coef);
        degree = myObj.nextInt();
        coef = new int[degree+1];
        for (int i = 0; i < coef.length; i++) {
            coef[i] = myObj.nextInt();
        }
        MyPolynomial second = new MyPolynomial(coef);
        int eval = myObj.nextInt();

        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(first.evaluate(eval));

        System.out.println(first.add(second).toString());

        System.out.println(first.multiply(second).toString());
    }
}