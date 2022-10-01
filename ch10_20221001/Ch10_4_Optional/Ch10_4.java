/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.Ch10_4_Optional;
import java.util.Optional;
public class Ch10_4 {

    public static void main(String[] args) {
        String value = "qwer";
//           if (value.isEmpty() && value == null){
//               System.out.println("value是null");
//           }
//           Optional<String> opt1 = Optional.ofNullable(value);
//           if (opt1.isPresent()){
//               System.out.println(opt1.get());
//           }else{
//               System.out.println("is null");
//           }

            Student st1 = new Student("Iris",25);
            Optional<String> op =  st1.getName();
            if (op.isPresent()){
             if (op.get().length() > 2){
                 System.out.println("長度正確:"+st1.getName()+":"+st1.getAge());
             }else{
                 System.out.println("長度不正確");
             }
                
            }else{
                 System.out.println("長度不正確");
            }
           
           
    }
    
}
