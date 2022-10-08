/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20221008.ch11_10_io6;

/**
 *
 * @author xvpow
 */
public class TestAutoClose implements AutoCloseable {
    private String name;
    private boolean canThrow;
    public TestAutoClose(String name,boolean canThrow){
        this.name = name;
        this.canThrow = canThrow;
    }
    
    public void close()throws Exception{
        System.out.println("Close :"+name);
        if(canThrow){
            throw new Exception("Ex:"+name);
        }
    }
            
}
