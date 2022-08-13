/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220813.ch4_11_equals;

/**
 *
 * @author xvpow
 */
public class Ch4_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Ken",255167);
        Student st2 = new Student("Ken",255167);
        Object obj = new Object();
        System.out.println(st1);//Ken:255167
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(null));
        System.out.println(st1.equals(obj));
    }
    
}
