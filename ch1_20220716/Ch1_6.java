/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220716;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean b1 = true;
       boolean b2 = false;
       System.out.println(b1 && b2);//兩邊為true才為true
       System.out.println(b1 || b2);//單邊為true就為true
       System.out.println(!b2);//反向
         System.out.println("====================");
        int i = 0;
        //i++;
        boolean b3 = b1&&++i > 0;
        System.out.println(b3);
        System.out.println(i);
        //左邊是false短路發生
        int k = 0;
        boolean b4 = b2 && ++k > 0;
        System.out.println(b4);
        System.out.println(k);
        System.out.println("=========================");
        int w = 0;
        boolean b5 = b2 || ++w>0;
        System.out.println(b5);
        System.out.println(w);
       int x = 0;
       //左邊為true就短路
       boolean b6 = b1 || ++x > 0;
       System.out.println(b6);
       System.out.println(x);
       
       
        
    }
    
}
