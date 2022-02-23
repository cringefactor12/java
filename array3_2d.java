import java.util.Scanner;
public class array3_2d {
public static void main(String[] args){
    LeanMatrixMultiplication();
}
public static void LeanMatrixMultiplication() {
    int row;
    Scanner myObj = new Scanner(System.in);
    row = myObj.nextInt();
    int first[][] = new int[row][row];
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < row; j++) {
            first[i][j] = myObj.nextInt();
        }
    }
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < row; j++) {
            System.out.print((first[i][j]+
            myObj.nextInt())+" ");
        }
    System.out.println();
    }
    }

}
