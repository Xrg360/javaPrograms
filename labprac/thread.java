//this pgm uses two threads even(to print even numbers) and odd (to print the odd numbers) 


class eventhread extends Thread
{
    public void run()
    {
       try{ 
            for(int i=0;i<=10;i++)
            {
                System.out.println("evennum ="+i);
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class oddthread extends Thread
{
    public void run()
    {
        try {
            for(int i=1;i<=10;i++)
        {
            System.out.println("oddnum ="+i);
            Thread.sleep(1000);
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Main
{
    public static void main(String[] args) {
        eventhread e = new eventhread();
        
        oddthread o = new oddthread();
        
        e.setPriority(10);
        o.setPriority(1);
        o.start();
        e.start();

        
    }
}