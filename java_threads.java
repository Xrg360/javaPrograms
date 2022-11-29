import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class java_threads implements Runnable {
    public static void main(String[] args) {
        java_threads obj = new java_threads();
        Thread t1 = new Thread(obj , "one");
        Thread t2 = new Thread(obj , "two");

        t1.start();
        t2.start();
    }
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hi from "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException exp){
                System.out.println(exp);
            }
        }
    }
}
