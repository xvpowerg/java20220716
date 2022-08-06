/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220806.ch3_5_oo3;

/**
 *
 * @author xvpow
 */
public class Ch3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person();
        p1.setName("Ken");
        p1.appendSalary(50000);
        p1.appendSalary(60000);
        p1.printInfo();
        // p1.appendSalary(-1);
//        p1.appendSalary(50000);
//        p1.appendSalary(60000);
//        p1.appendSalary(50000);
//        p1.appendSalary(60000);
//        p1.appendSalary(50000);
//        p1.appendSalary(60000);
//        p1.appendSalary(50000);
//        p1.appendSalary(60000);
//        p1.appendSalary(50000);
//        p1.appendSalary(60000);
//        p1.appendSalary(50000);
  
        Person p2 = new Person("Vivin");
        Person p3= new Person("Lucy",50000,60000,75555);  
        p3.printInfo();
    }
    
}
