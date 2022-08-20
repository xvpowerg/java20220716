/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220820.ch5_6_report;
import ch5_20220820.ch5_6_erp.MyErpReport;
/**
 *
 * @author xvpow
 */
public class MyReport  extends MyErpReport{
    public void reportStyle(String[] data){
        for (String d : data){
            System.out.println(d);
        }        
    }
}
