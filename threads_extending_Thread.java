class mythread1 extends Thread {
     
    public void run(){
        try {
            System.out.println(
                "Thread " + Thread.currentThread().threadId()
                + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class threads_extending_Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            mythread1 t1= new mythread1();
            t1.start();
        }
    }
}
