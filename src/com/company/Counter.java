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
            }
            catch(InterruptedException p)
            {
                break;
            }
            System.out.println(ct.getName()+ " interrupted ");
        }
    }


}