/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_20221022.ch13_6_Thread4;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author xvpow
 */
public class Ch13_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        int c = Runtime.getRuntime().availableProcessors();
        ExecutorService es = Executors.newFixedThreadPool(c);
          for (int i = 1;i<=20;i++){
              es.submit(()->{              
                    System.out.println(Thread.currentThread().getName());
                    try{
                        TimeUnit.SECONDS.sleep(1);
                    }catch(Exception ex){
                        
                    }
               });              
          }
          
        //  es.shutdown();
       List<Runnable> listRun = es.shutdownNow();
       System.out.println(listRun.size());

                
        
        
    }
    
}
