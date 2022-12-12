package day06;



import java.util.LinkedList;
import java.util.List;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Day06Thread {

   public static void main(String[] args) {

        List<Integer> numList = new LinkedList<>();
        //Creates a thread pool with 2 threads (asking for 2 threads)
        ExecutorService threadpool = Executors.newFixedThreadPool(2);

        for (Integer i = 0; i < 3; i++){
            //Create a thread
            RandomNumbers thr = new RandomNumbers("thr-%d".formatted(i), 100, numList);
            //this is just a method call
            //thr.run();
            //Schedule a thread to the Runnable
            threadpool.submit(thr);
        }

        System.out.println("Add done");
        while (true) {
            System.out.println("\n>>>> numList:" + numList + ", size: " + numList.size());
            try{

            
            //Sleep for 15 secs
            Thread.sleep(2 * 1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }            
        }
   }




}