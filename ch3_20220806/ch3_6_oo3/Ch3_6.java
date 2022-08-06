/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220806.ch3_6_oo3;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee emp1 = new Employee();
        emp1.setName("Vivin");
        emp1.setAge(20);
        emp1.printInfo();
        
        Employee emp2 = new Employee("Ken",26);
        emp2.printInfo();
        
        Employee emp3 = new Employee();//未填寫
        emp3.printInfo();
        
    }
    
}
