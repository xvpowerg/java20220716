/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220806.ch3_3_oo1;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {

    /**
     * @param args the command line arguments
     */
    static String[] sex = {"女","男"}; 

    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a1 = new Animal();
        a1.name = "momo";
        a1.age = 10;
        a1.height= 5;
        a1.sex = 1;
      
        Animal a2 = new Animal();
        a2.name = "Lulu";
        a2.age = 6;
        a2.height = 2;
        a2.sex =0;
        //1  男  0 女
        a1.printInfo();
        a2.printInfo();
//      System.out.println(a1.name+":"+a1.age+":"+a1.height+":"+testSex(a1.sex));
//      System.out.println(a2.name+":"+a2.age+":"+a2.height+":"+testSex(a2.sex));
        
        
        
    }
    
}
