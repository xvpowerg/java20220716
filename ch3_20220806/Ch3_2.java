/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220806;

/**
 *
 * @author xvpow
 */
public class Ch3_2 {

    static int max(int a,int b,int c,int d){               
        return  max(max(a,b),max(c,d));
    }
            
    static int max(int a,int b){
        if(a > b){
            return a;
        }
        return b;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println(max(1,5));
       System.out.println(max(9,5,6,7));
    }
    
}
