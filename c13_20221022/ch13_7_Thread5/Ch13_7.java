/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_20221022.ch13_7_Thread5;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author xvpow
 */
public class Ch13_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        ExecutorService es = Executors.newCachedThreadPool();
      Future<Integer> f=  es.submit(()->{
         int r = 0;           
         r = random.nextInt(5000);
         TimeUnit.SECONDS.sleep(5);
         return r;
        });
     System.out.println("Wait....");
     es.submit(()->{
            try{
                System.out.println(f.get());
            }catch(Exception ex){
                
            }
     });

        
     System.out.println("Finish....");
        es.shutdown();
    }
    
}
