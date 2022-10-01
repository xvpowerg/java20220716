/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.Ch10_4_Optional;
import java.util.Optional;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch10_4_2 {
    
    public static String getString(){
        String[] letterArray = new String[26];
        for (char i = 'A';i<='Z';i++){
            letterArray[i-'A'] = i+"";
        }
        Random ran = new Random();
         int len =   ran.nextInt(9) + 2;
         StringBuilder sb = new StringBuilder();
         for(int i = 1; i <= len ;i++){
             int index =   ran.nextInt(26);
             sb.append(letterArray[index]);
         }
         
        return sb.toString();
    }
    
    public static void main(String[] args) {
       String value1 = null;
       String value2 = "Ken";
       //Optional.of 不支持null的value
        //Optional<String> op1 = Optional.of(value1);//java.lang.NullPointerExcept        
        Optional<String> op2 =  Optional.ofNullable(value1);
        //不支持null
        //op2.get();//java.util.NoSuchElementException
         Optional<String> op3 =  Optional.ofNullable(value2);
         System.out.println(op3.get());
         
         System.out.println(op2.isPresent());
         System.out.println(op3.isPresent());
         
         op2.ifPresent(v->System.out.println("ifPresent 1:"+v));
         op3.ifPresent(v->System.out.println("ifPresent 2:"+v));
         
         op2.ifPresentOrElse(v->System.out.println("ifPresentOrElse 3:"+v),
                            ()->{System.out.println("Empty Run...");});
         op3.ifPresentOrElse(v->System.out.println("ifPresentOrElse 4"+v),
                 ()->{System.out.println("Empty Run2......");});
         
         
         String msg1 = op2.orElse("空白");
         String msg2 =  op3.orElse("空白");
         System.out.println(msg1+":"+msg2);
         
        String msg3 =  op2.orElseGet(Ch10_4_2:: getString);
        System.out.println(msg3);
        
        String msg4 =  op3.orElseGet(Ch10_4_2:: getString);
        System.out.println(msg4);
        
        
         //op2.orElseThrow();//java.util.NoSuchElementException
         String msg5 = op3.orElseThrow();
         System.out.println(msg5);
         
        // op2.orElseThrow(IllegalArgumentException::new);
          String msg6 =  op3.orElseThrow(IllegalArgumentException::new);
         System.out.println(msg6);
         
    }
    
}
