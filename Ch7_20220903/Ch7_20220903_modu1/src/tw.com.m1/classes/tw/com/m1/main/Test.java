/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m1.main;
import tw.com.m1.beans.Student;
import tw.com.m1.beans.Teacher;
import tw.com.m1.beans2.Car;
/**
 *
 * @author xvpow
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Ken",20);
        Teacher t1 = new Teacher("A001",2);
        Car car = new Car(4,"bmw");
        System.out.println(st1);
        System.out.println(t1);
        System.out.println(car);
    }
    
}

