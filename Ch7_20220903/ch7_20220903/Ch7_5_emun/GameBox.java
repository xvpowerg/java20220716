/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220903.Ch7_5_emun;

/**
 *
 * @author xvpow
 */
public class GameBox {
    enum Action{
        PLAY,STOP,PAUSH,EXIT
    }
    
    public void action(Action action){
        switch(action){
            case PLAY:
                System.out.println("開始!");
                break;
            case STOP:
                System.out.println("停止!");
                break;
            case PAUSH:
                System.out.println("暫停!");
               break;
            case EXIT:
                System.out.println("離開!");
                break;
        }
        
    }
}
