import java.util.Scanner;

public class multithread {

    static int counter = 1;
    int N;

    public void printNumber(int n)
    {
        synchronized (this)
        {
        while (counter < N) {
            while (counter % 2 == n) {
                try {
                    wait();
                }
                catch (
                    InterruptedException e) {
                    e.printStackTrace();
                }
                }
            System.out.println(counter + " ");
            counter++;
            notify();
            }
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        multithread mt = new multithread();
        mt.N = s.nextInt();
        Thread t1 = new Thread(new Runnable() {
        public void run(){
            mt.printNumber(1);
        }
        });
        Thread t2 = new Thread(new Runnable() {
        public void run(){
            mt.printNumber(0);
        }
        });
        t1.start();
        t2.start();
    }
}