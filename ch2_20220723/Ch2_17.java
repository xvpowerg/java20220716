/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_17 {

   /*
    1 找一樣類型
    2 相同型別 可相容的類型
    3 不同型別 可相容的類型
    4 轉封箱類型
    5 錯誤
    */
    //   1 找一樣類型
    static void test1(int v1){
        System.out.println("Test1 int v1");
    }
    static void test1(float v1){
        System.out.println("Test1 float v1");
    }
    // 3 不同型別 可相容的類型
    static void test2(short s1){
        System.out.println("Test2 Short");
    }
    static void test2(float f1){
       System.out.println("Test2 Float");
    }
    
    static void test3(byte b1){
        System.out.println("Test3 byte");
    }
    static void test3(long b1){
        System.out.println("Test3 long");
    }
    
    static void test4(float f1){
        System.out.println("test4 float");
    }
     static void test4(Integer v1){
        System.out.println("test4 Integer");
    }
     
     static void test5(byte b1){
         System.out.println("test5 byte");
     }
        static void test5(Integer obj){
         System.out.println("test5 Integer");
     }
        static void test6(Long long1){
            System.out.println("test6 Long ");
        }
          static void test6(Float f2){
            System.out.println("test6 Float ");
        }
    public static void main(String[] args) {
       test1(20);
       test2(5);
       test3(21);
       test4(32);
       test5(2);
       //test6(25);//編譯錯誤
       Integer v1 = 25;
//       Long v2 = v1;
//       Float v3 = v1;
    }
    
}
