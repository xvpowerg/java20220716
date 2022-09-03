/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220903.Ch7_2_methodref;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Test {
    private  ArrayList<Integer> list;
    private Random rand = new Random();
    Test(){
        list = new ArrayList();
    }
    public ArrayList<Integer> getList(){
        int count = rand.nextInt(10)+1;//1~10 次數
        for (int i = 1;i <= count;i++){
            int v = rand.nextInt(100000);
            list.add(v);
        }        
        return list;
    }
    
    public void testList(Supplier<ArrayList<Integer>> listSupp){
       ArrayList<Integer> list =   listSupp.get();
       System.out.println(list);
    }
    
    public void runTestList(){
        testList(this::getList);
    }
}
