class Rabbit extends Thread {
    //giving name to the thread
    Rabbit() {
        super("rabit");
    }

    static int distance = 0;

    public void run() {
        int r_dist = 10;
        while (distance < 200) {
            distance = distance + r_dist;
            System.out.println("Rabbit : " + distance);
            try {
                if (distance == 100) {
                    //rabit would win the race if he sleeps for less than 3 milliseconds
                    Thread.sleep(1000);
                }

                if (distance == 200) {
                    System.out.println(Thread.currentThread().getName() + " won the match");
                } 
                //if tortoise finishes the race rabbit also stops and winner is declared
                else if ( Tortoise.distance ==200) {
                    return;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}

class Tortoise extends Thread {
    static int distance = 0;

    //setting thread name
    Tortoise() {
        super("tortoise");
    }

    public void run() {
        int t_dist = 5;
        while (distance < 200) {
            distance = distance + t_dist;
            System.out.println("Tortoise : " + distance);
            if (distance == 200) {
                System.out.println(Thread.currentThread().getName() + " won the match");
            }
            //if rabbit finishes the race tortoise also stops and winner is declared
            else if (Rabbit.distance == 200 ) {
                return;
            }
        }
    }
}

public class tortoiseRabbit {
    public static void main(String[] args) {
        Rabbit r = new Rabbit();
        Tortoise t = new Tortoise();
        r.start();
        t.start();

    }
}
