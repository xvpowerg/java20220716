/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220820.ch5_9_interface;

/**
 *
 * @author xvpow
 */
public class Ch5_9 {

        static void testRadio(RadioGroup group){
            group.play();
            group.stop();
            group.pause();            
        }
    public static void main(String[] args) {
            Radio radio = new  Radio();
            testRadio(radio);
    }
    
}
