/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;
import java.util.Arrays;

public class Ch2_8 {

 
    public static void main(String[] args) {
       //小到大排序
       int[] array = {8,21,5,13,2};
       Arrays.sort(array);
       for (int v : array){
           System.out.print(v+" ");
       }
       System.out.println();
       
       int index = Arrays.binarySearch(array, 8);
       System.out.println(index);
       //找不到
       //1 比所有大
        index = Arrays.binarySearch(array,80 );//(陣列長度 +1) * -1
        System.out.println(index);
       //2 比所有小 一律-1
        index = Arrays.binarySearch(array, 1);
        System.out.println(index);
       //3 在中間
       index = Arrays.binarySearch(array, 6);
        System.out.println(index);
       
    }
    
}
