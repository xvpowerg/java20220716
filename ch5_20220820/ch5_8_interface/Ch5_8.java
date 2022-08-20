/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220820.ch5_8_interface;

/**
 *
 * @author xvpow
 */
public class Ch5_8 {
    static void testIronManGroup(IronManGroup group){
        group.attacking();
        group.flying();
        group.runing();
    }
    public static void main(String[] args) {
        IronMan irom1 = new IronMan();
        Fly fly1 = irom1;
        fly1.flying();
        Attack att = irom1;
        att.attacking();
        Run run = irom1;
        run.runing();
        System.out.println("=======================");
        testIronManGroup(irom1);
    }
    
}
