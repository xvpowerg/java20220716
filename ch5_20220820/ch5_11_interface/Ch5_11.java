/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220820.ch5_11_interface;

/**
 *
 * @author xvpow
 */
public class Ch5_11 {
    
    
    static void printData(MyIterator it){
        it.foreach();
    }
    
    public static void main(String[] args) {
     Student st1 = new Student("Ken",18,"0911-778223");
     printData(st1);
     
     MyIterator.printData(st1);
    }
    
}
