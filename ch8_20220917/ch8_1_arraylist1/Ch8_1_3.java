/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_1_arraylist1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch8_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Iris");
        list.add("Joy");
        //list.add("Apple phoen Apple IPad");
        
        System.out.println(list);
        
        System.out.println(list.indexOf("Lucy"));
         System.out.println(list.indexOf("Ben"));//找不到一定-1
         
        list.set(3, "Gigi");//直接修改某個index的內容
        System.out.println(list);
         
         
    }
    
}
