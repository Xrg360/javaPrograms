//this pgm uses two threads one for generating a random number and the second one to check whether the thread is odd or even


import java.util.*;

class threads implements Runnable{
    int rand;
    public static void main(String[] args) {
        threads ob = new threads();
        Thread t1 = new Thread(ob,"random");
        Thread t2 = new Thread(ob,"even");
        t1.start();
        t2.start();
    }
    public void run(){
        if (Thread.currentThread().getName().equals("random")) {
            Random random = new Random();
            rand = random.nextInt(100);
            System.out.println(rand);
        }
        else{
            try{Thread.currentThread().sleep(500);}catch(InterruptedException e){System.out.println(e);}
            if(rand%2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
            
        }
    }
}
