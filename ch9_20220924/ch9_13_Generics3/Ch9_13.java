/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220924.ch9_13_Generics3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch9_13 {

    /**
     * @param args the command line arguments
     */
    static void test1(ArrayList<Test1> list){
        list.add(new Test2());
        for(Test1 t1 : list){
            System.out.println(t1);
        }
    }
    
    //只要泛型的類別是Test2的子類就可通過
    static void test2(ArrayList<? extends Test2> list2){        
       // list2.add(new Test2());//無法新增
        for (Test2 t2 : list2){
            System.out.println(t2);
        }
    }
    //只要泛型的類別是Test3的父類就可通過
    static void test3(ArrayList<? super Test3> list){
            list.add(new Test3());//可以新增但是只能是Test3
            //輪巡類型只能是object
            for(Object v : list){
                System.out.println(v);
            }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //Test1 t1 = new Test3();
       ArrayList<Test1> list1 = new ArrayList<>();//Test1
       test1(list1);//參數的泛型必須一樣類型
       
       ArrayList<Test3> list2 = new ArrayList<>();//Test3 Test2 
       test2(list2);       
       ArrayList<Test2> list3 = new ArrayList<>();//Test3 Test2 Test1
       list3.add(new Test2());
       list3.add(new Test3());
       test3(list3);
    }
    
}
