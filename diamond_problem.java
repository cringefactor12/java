public class diamond_problem {
    static interface Device{
        public void processDoc();
    }
    interface Scanner extends Device{
    @Override
        default void
        processDoc(){System.out.println("Scanning...");}

    interface Copier extends Device{
    @Override
        default void
        processDoc(){System.out.println("Copying...");}
    }

    static class ComboDevice implements Scanner, Copier{

    @Override
    public void processDoc() {
        System.out.println("Combo device doing");
        Scanner.super.processDoc();
        Copier.super.processDoc();
    }

    }
    public static void main(String[] args) {
        ComboDevice cd=new ComboDevice();
        cd.processDoc();
    }
    }
}
    