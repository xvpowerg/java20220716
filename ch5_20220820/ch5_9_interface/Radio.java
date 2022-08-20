/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220820.ch5_9_interface;

/**
 *
 * @author xvpow
 */
//play() Play 
//stop() Stop
//pause() Pause
//RadioGroup 
public class Radio implements RadioGroup{
    public void play(){
      System.out.println("Radio Paly");
    }
    public void stop(){
        System.out.println("Radio Stop");
    }
    public void pause(){
        System.out.println("Radio Pause");
    }
}
