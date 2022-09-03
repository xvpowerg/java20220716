/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m2.tools;
import tw.com.m1.beans.Teacher;
/**
 *
 * @author xvpow
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher t1 = new Teacher("A0001",3);
        System.out.println(t1);
        MyClass myclass = new MyClass();
        System.out.println(myclass.getStudent());
    }
    
}
