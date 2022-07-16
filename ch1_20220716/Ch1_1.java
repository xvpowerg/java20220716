/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220716;

/**
 *
 * @author xvpow
 */
public class Ch1_1 {

    public static void main(String[] args) {
        //基本型態
        //整數
        /*byte 8bit 
        short 16bit
        int 32bit
        long 64bit*/
        //浮點數
        //float 32bit
        //dobule 64bit
        //字元
        //char 16bit 0~65525
        //布林
        //boolean 1bit
        
        byte b1 = 123;
        System.out.println(b1);
        short s1 = 256;
        System.out.println(s1);
        int v1 =  2048;
        System.out.println(v1);
         //預設情況下所有無小數點的數字都是int
        long myLong = 2147483648L;   
         System.out.println(myLong);
        //System.out.println("Test!!");
        //預設情況下有小數點的數值都是dobule
        float f1 = 3.141f;
        double d1 = 2.71818;
        System.out.println(f1);
        System.out.println(d1);
        
        char c1 = 'K';
        System.out.println(b1);
        
        boolean bool = true;
        System.out.println(bool);
        
        //大可以裝小
        //小不可裝大
        short myS1 = 12;
        int myInt = myS1;        
        //short myS2 = myInt;
        
        var myVar1 = 12;
        var myVar2 = 15.5f;
        System.out.println(myVar1+":"+myVar2);
        
        int myV1=20,myV2=30;
        
       // var myVar3 = 40,myVar4 = 50;
        
    }
    
}
