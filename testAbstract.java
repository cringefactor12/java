import java.util.Scanner;
public class testAbstract{
    static abstract class Book{
        String title;
        abstract void setTitle(String s);
        String getTitle(){
            return title;
        }
    }

    static class MyBook extends Book{
        void setTitle(String s){
            this.title=s;
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String s=myObj.nextLine();
        MyBook book=new MyBook();
        book.setTitle(s);
        System.out.println("Book Title:"+book.getTitle());
    }

}