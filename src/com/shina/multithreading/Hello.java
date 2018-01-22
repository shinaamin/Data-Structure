package com.shina.multithreading;

public class Hello implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Hello hello = new Hello();
        Hello hello2 = new Hello();
        Thread t = new Thread(hello);
        Thread t2 = new Thread(hello2);
        t.setDaemon(true);
        t.start();
        System.out.println(11 + Thread.currentThread().getName() + " ........." +Thread.currentThread().isDaemon());
        System.out.println(22 + t.getName() + " ........." +t.isDaemon());

       // Thread.sleep(500);
        System.out.println(444+ Thread.currentThread().getName() + " ........." +Thread.currentThread().isDaemon());

    }

    @Override
    public void run() {
  if (Thread.currentThread().isDaemon())
   {
       try {
           System.out.println("333demon " + Thread.currentThread().getName() + "......" + Thread.currentThread().isDaemon());
           Thread.sleep(100);
       }
       catch (InterruptedException e)
       {

       }
   }
   else
  {
      System.out.println("main thread");
  }
    }
}
