package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
       // com.company.Main.Counter ct = new com.company.Main.Counter();
        Thread ct = new Thread(new Counter());
        ct.start();
        System.out.println("Press Enter to stop");
        Scanner keyboard = new Scanner(System.in);
        String s = "start";
        while(!s.equals("")) {
            s = keyboard.nextLine();
        }
        ct.interrupt();

    }

    /**
     * Created by oracle on 7/5/17.
     */

}
