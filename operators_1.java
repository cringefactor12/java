import java.io.*;
import java.util.Scanner;
    public class operators_1 {
        public static void main(String[] args) {
            int numpl, numpen, numn;
            double pencil, pen, note, total;
            Scanner myObj = new Scanner(System.in);
            pencil = myObj.nextDouble();
            numpl = myObj.nextInt();
            pen = myObj.nextDouble();
            numpen = myObj.nextInt();
            note = myObj.nextDouble();
            numn = myObj.nextInt();
            total = pencil * numpl + pen * numpen + note * numn;
            System.out.println(total);
        }
    }