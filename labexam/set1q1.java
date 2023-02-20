public class set1q1 extends Thread {
    set1q1(String s){
        super(s);
    }
    public static void main(String[] args) {
        set1q1 t1 = new set1q1("prime number");
        set1q1 t2 = new set1q1("armstrong");
        t1.start();
        t2.start();
    }
    public void run(){
        if(Thread.currentThread().getName().equals("prime number"))
            prime_num();
        else
            armstrong_num();
    }
    void prime_num(){
        for (int i = 10; i < 100; i++) {
            int flag = 0;
            for (int j = 2; j < i/2; j++) {
                if(i%j == 0){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("prime: "+i);
            }
        }
    }
    void armstrong_num(){
        for (int i = 100; i < 1000; i++) {
            int temp = i;
            int sum = 0;
            while(temp>0){
                int r = temp%10;
                sum+= (r*r*r);
                temp/=10;
            }
            if(sum == i)
                System.out.println("armstrong: "+i);
        }
    }
}

