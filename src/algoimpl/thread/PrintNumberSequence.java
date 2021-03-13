/**
 * Paytm.com.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package algoimpl.thread;

/**
 * @author Parth Pahariya 
 * @version $Id: PrintNumberSequence.java, v 0.1 2021-03-13 16:48 Parth Pahariya Exp $$ 
 */
public class PrintNumberSequence implements Runnable {

    private static Integer val = 1;
    private int remainder;
    private static final  Object object = new Object();
    PrintNumberSequence(int remainder) {
        this.remainder=remainder;
    }

    @Override
    public void run(){

        while (true) {
            synchronized (object) {
                while (val % 3 != remainder) { // wait for numbers other than remainder
                    try {
                        object.wait();
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + val);
                val++;
                object.notifyAll();

            }
        }

    }


    public static void  main(String[] args){

        Thread pRint1 = new Thread(new PrintNumberSequence(1));
        pRint1.setName("Thread1");
        pRint1.start();
        Thread pRint2 = new Thread(new PrintNumberSequence(2));
        pRint2.setName("Thread2");
        pRint2.start();
        Thread pRint3 = new Thread(new PrintNumberSequence(0));
        pRint3.setName("Thread3");
        pRint3.start();




    }
}