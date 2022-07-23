/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;
/**
 *
 * @author xvpow
 */
public class Ch2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //基本型態 的物件類型
        /*
        byte         Byte
        short        Short
        int          Integer
        long         Long
        float        Float
        double       Double
        char         Character
        boolean       Boolean
        */
        //如何把基本型態 變為物件類型
        //Boxing 封箱
        int value1 = 50;
        Integer intObj =   Integer.valueOf(value1);
        //如何把物件類型 變為基本型態
        //UnBoxing
        int v2  = intObj.intValue();
        System.out.println(v2);
        
        //自動封箱
        Integer intObj2 = 12;
        //自動解封箱
        int v3 = intObj2;
        
        Integer intObj3 = null;
        int v4 = intObj3;
        
        
    }
    
}
