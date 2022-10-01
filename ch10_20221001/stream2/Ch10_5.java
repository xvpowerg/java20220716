/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.stream2;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.OptionalDouble;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;


public class Ch10_5 {

    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList();         
           list.add("Vivin");
           list.add("Lindy");
           list.add("Ken");
           list.add("Joy");           
           list.add("Iris");
           //parallel 多核分散計算的能力
          Optional<String> op1 =  list.stream().parallel().findAny();
          Optional<String> op2 =  list.stream().findFirst();
          System.out.println(op1.get());
          System.out.println(op2.get());
          
          
           
    }
    
}
