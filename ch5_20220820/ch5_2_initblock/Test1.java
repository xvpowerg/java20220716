/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220820.ch5_2_initblock;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String[] msg = new String[300];
    private String id;
    //初始化區塊
    {
        for (int i = 0;i < msg.length;i++){
            msg[i] = "";
        }
    }

    
    public Test1(){
        
    }
    
    public Test1(String id){
        //this();
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    public boolean isEmpty(int index){
        return msg[index].length() == 0;
    }
}
