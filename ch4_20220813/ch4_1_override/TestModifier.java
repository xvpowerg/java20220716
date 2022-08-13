/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20220813.ch4_1_override;

/**
 *
 * @author xvpow
 */
public class TestModifier {
    public String publicStr = "publicStr";//跨package可讀寫
    protected String protectedStr = "protectedStr";//相同package  或跨package繼承時可讀寫
    String defaultStr = "defaultStr";//相同package 可讀寫
    private String privateStr = "privateStr";//相同類別可讀寫
}
