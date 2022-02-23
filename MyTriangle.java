import java.util.Scanner;

public class MyTriangle {

public class MyPoint {
    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    MyPoint() {
        x = 0;
        y = 0;
    }

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int result[] = new int[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {

        return Math.sqrt(Math.pow((this.x - x), 2 )+
            Math.pow((this.y - y), 2));
    }


    }

    private MyPoint v1, v2, v3;

        public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {

            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }

        public MyTriangle(int x1, int y1, int x2, int y2, int x3,
        int y3){

            this.v1 = new MyPoint(x1,y1);
            this.v2 = new MyPoint(x2,y2);
            this.v3 = new MyPoint(x3,y3);
        }


        public String toString() {
            return "My Triangle=[v1=" + v1 + ",v2=" + v2 +
            ",v3=" + v3 + "]";
        }

        public double getPerimeter(){
            return v1.distance(v2.getX(),
            v2.getY())+v1.distance(v3.getX(), v3.getY())+v2.distance(v3.getX(),
            v3.getY());
        }

        public void printType() {
            double d1,d2,d3;
            d1=v1.distance(v2.getX(), v2.getY());
            d2=v1.distance(v3.getX(), v3.getY());
            d3=v2.distance(v3.getX(), v3.getY());

            if(d1==d2 && d1==d3) {
                System.out.println("Equilateral");
            }else if(d1==d2 || d1==d3|| d2==d3) {
                System.out.println("Isosceles");
            }else if(d1!=d2 && d1!=d3 && d2!=d3) {
                System.out.println("Scalene");
            }
        }

    public static void main(String[] args) {
        int x1, y1, x2, y2, x3, y3;
        Scanner myObj = new Scanner(System.in);
        x1 = myObj.nextInt();
        y1 = myObj.nextInt();
        x2 = myObj.nextInt();
        y2 = myObj.nextInt();
        x3 = myObj.nextInt();
        y3 = myObj.nextInt();
        MyTriangle t= new MyTriangle(x1, y1, x2, y2, x3,
        y3);
        System.out.println(t.toString());
        t.printType();
    }
}