package com.company;

/**
 * Created by oracle on 7/5/17.
 */
public class Counter implements Runnable{

    @Override
    public void run()
    {
        Thread ct = Thread.currentThread();
        int counter=1;
        while(true)
        {
            System.out.println(ct.getName() + " count " + counter);
            counter++;
            try
            {
                Thread.sleep(1000);
                int i=0;
                while(i<10000)
                {
                    i++;
                }
                System.out.println("Done calculating 10000");
                //Thread.sleep(10000);
                //System.out.println("MOM");
                Thread ct1 = new Thread(new Counter1());
                ct1.start();
            }
            catch(InterruptedException p)
            {
                //Thread ct1 = new Thread(new Counter1());
                //ct1.start();
                break;
            }
            System.out.println(ct.getName()+ " interrupted ");
        }
    }


}