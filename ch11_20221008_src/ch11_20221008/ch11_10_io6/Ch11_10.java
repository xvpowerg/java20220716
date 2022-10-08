/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20221008.ch11_10_io6;

/**
 *
 * @author xvpow
 */
public class Ch11_10 {
    public static void main(String[] args) {
//        try( TestAutoClose t1 = new TestAutoClose("T1",false);
//            TestAutoClose t2 = new TestAutoClose("T2",true);){
//            System.out.println("Body~");
//            
//        }catch(Exception ex){
//            System.out.println(ex);
//        }

//        try( TestAutoClose t1 = new TestAutoClose("T1",true);
//            TestAutoClose t2 = new TestAutoClose("T2",true);){
//            System.out.println("Body~");
//        }catch(Exception ex){
//            System.out.println(ex);
//        }

        try( TestAutoClose t1 = new TestAutoClose("T1",true);
            TestAutoClose t2 = new TestAutoClose("T2",true);){
            System.out.println("Body~");
            throw new Exception("Body Ex");
        }catch(Exception ex){
          Throwable[] ths =   ex.getSuppressed();
          for(Throwable th : ths){
               System.out.println(th);
          }
            System.out.println(ex);
        }
       
    }
}
