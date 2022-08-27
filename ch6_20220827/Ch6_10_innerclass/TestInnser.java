/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220827.Ch6_10_innerclass;

/**
 *
 * @author xvpow
 */
public class TestInnser {
    
    private String msg = "Test";
    //可使用外部靜態屬性
    static class MyStaticInnerClass{
        private String id;
        private int price;
        MyStaticInnerClass(String id,int price){
            this.id = id;
            this.price = price;
        }
        public String toString(){
            return this.id+":"+this.price;
        }
    }
    //可使用外部非靜態與靜態屬性
    class MyInnerClass{
        private String name;
        MyInnerClass(String name){
            this.name = name;
        }
        public String toString(){
            return this.name+":"+msg;
        }
    }
    
    public void testInnerClass(){
        MyInnerClass inner = 
                new MyInnerClass("My Inner Class");
        System.out.println(inner);
    }
    
    
}
