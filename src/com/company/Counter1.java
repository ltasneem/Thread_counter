package com.company;

/**
 * Created by oracle on 7/5/17.
 */
public class Counter1 implements Runnable{

    public void run()
    {
        Thread ct = Thread.currentThread();
        int counter=1;
        while(true)
        {
            //System.out.println(ct.getName() + " count " + counter);
            counter++;
            try
            {
                Thread.sleep(1000);
                System.out.println("MOM");
                break;
            }
            catch(InterruptedException p)
            {
                break;
            }
           // System.out.println(ct.getName()+ " interrupted ");
        }
    }
}
