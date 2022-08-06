/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220806;

/**
 *
 * @author xvpow
 */
public class Ch3_1 {
   /*
    1 找一樣類型
    2 相同型別 可相容的類型
    3 不同型別 可相容的類型
    4 轉封箱類型
    5 錯誤
    */
    
    static void test1(int v1,int v2){
        System.out.println("Test1 int int");
    }
    static void test1(float v1,int v2){
        System.out.println("Test1 float int");
    }
    
    static void test2(int v1,float f1){
        System.out.println("Test2 int float");
    }
    
    static void test2(float f1, int v2){
        System.out.println("Test2  float int");
    }
    
    public static void main(String[] args) {
       
        test1(20,60);
        //test2(10,5);
        test2(10f,5);
    }
    
}
