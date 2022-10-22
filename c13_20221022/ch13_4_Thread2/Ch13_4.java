/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_20221022.ch13_4_Thread2;

/**
 *
 * @author xvpow
 */
public class Ch13_4 {
        static class TestRes{
             int count = 1; 
//            public synchronized void  increment(){
//                  System.out.println("Thread 1:"+Thread.currentThread().getName());
//                for (int i = 1;i<=5;i++){
//                   System.out.println("Thread For:"+Thread.currentThread().getName());
//                    System.out.println(count++);
//                }
//                
//                System.out.println("Thread 2:"+Thread.currentThread().getName());
//            } 
             
              public  void  increment(){
               System.out.println("Thread 1:"+Thread.currentThread().getName());
                  
               synchronized(this){
                    for (int i = 1;i<=5;i++){
                        System.out.println("Thread For:"+Thread.currentThread().getName());
                         System.out.println(count++);
                     }
               }   
            
                
                System.out.println("Thread 2:"+Thread.currentThread().getName());
            } 
        }
                
  
    public static void main(String[] args) {
      
        TestRes tr = new TestRes();
        Thread t1 = new Thread(tr::increment);
        Thread t2 = new Thread(tr::increment);
        t1.start();
        t2.start();
        //tr.increment();
        //tr.increment();
        
    }
    
}
