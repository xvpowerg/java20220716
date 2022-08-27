/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_4_functional_if;



class MyFunc1 implements MyFunction{
    public void action(){
        System.out.println("MyFunc1!!!");
    }
}
public class Ch6_4 {
 
    static void testFunc(MyFunction myfunc){
     myfunc.action();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        MyFunc1 func1 = new MyFunc1();
        testFunc(func1);
  
        
    }
    
}
