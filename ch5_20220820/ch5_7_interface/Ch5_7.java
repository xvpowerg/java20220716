/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220820.ch5_7_interface;

/**
 *
 * @author xvpow
 */
public class Ch5_7 {

    static void testFly(Fly fly){
        fly.flying();
    }
    public static void main(String[] args) {
      Bird b1 = new Bird();
      AirPlane a = new AirPlane();
      testFly(b1);
      testFly(a);
    }
    
}
