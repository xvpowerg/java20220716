/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_20221022.ch13_5_Thread3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch13_5 {

    public static void main(String[] args) {
        Random random = new Random();
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 1;i<=5000;i++){
                  es.submit(()->{
                    System.out.println("Name:"+Thread.currentThread().getName());
                    try{
                        Thread.sleep(random.nextInt(10)+1);    
                    }catch(Exception ex){

                    }

                });
        }
  
                
        
        
    }
    
}
