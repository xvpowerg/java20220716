/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220813.ch4_12;

/**
 *
 * @author xvpow
 */
public class Ch4_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person("Ken",25);
        Person p2 = new Person("Ken",25);
        
        System.out.println(p1);//Ken:25
        System.out.println(p1.equals(p2));//true
        
    }
    
}
