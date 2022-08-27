/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_1_Interface;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStrList list = new MyStrList();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
       // System.out.println(list.get(3));
        //超過index時拋出以下例外        
        //new IndexOutOfBoundsException 
        System.out.println(list.getSize());
        
        for (int i = 0;i < list.getSize();i++){
            System.out.println(list.get(i));
        }
        System.out.println("==================================");
        for (String v : list){
          System.out.println(v);
        }
    }
    
}
