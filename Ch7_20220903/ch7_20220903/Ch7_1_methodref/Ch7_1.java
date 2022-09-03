/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220903.Ch7_1_methodref;
import java.util.function.Function;
import java.util.Random;
import java.util.ArrayList;
public class Ch7_1 {

    static void printList(int count,Function<Integer,ArrayList<Integer>> func){
        ArrayList<Integer> list = func.apply(count);
        System.out.println(list);
    }
    static ArrayList<Integer> testFunction(Integer count){
         ArrayList<Integer> list = new ArrayList<>();
     Random ran = new Random();
        for (int i =1 ; i <= count;i++){
            int v = ran.nextInt(100000);
           list.add(v);
        }
     return list;
    }
    
    public static void main(String[] args) {
    printList(6,Ch7_1::testFunction);
        
//     Function<Integer,ArrayList<Integer>> f1 = (Integer count)-> {
//     ArrayList<Integer> list = new ArrayList<>();
//     Random ran = new Random();
//        for (int i =1 ; i <= count;i++){
//            int v = ran.nextInt(100000);
//           list.add(v);
//        }
//     return list;
//     };
        
        //printList(5,f1);
    }
    
}
