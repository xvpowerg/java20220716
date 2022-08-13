/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220813.ch4_1_override;

/**
 *
 * @author xvpow
 */
public class Ch4_1 {
    /*
    1 Modifier (存取權限) 只能開放不能封閉
    2 複寫的函數 父類回傳基本型態 子類複寫必須回傳一樣類型
    3 複寫的函數 父類回傳參考型態 子類複寫可回傳一樣類型或子類
    4 複寫的函數 名稱與參數必須與父類一樣
    5 例外拋出可一樣或拋出子類或不拋出 
    */
    public static void main(String[] args) {
        TestModifier tm = new  TestModifier();
        System.out.println(tm.publicStr);
        System.out.println(tm.protectedStr);
        System.out.println(tm.defaultStr);       
        
    }
    
}
