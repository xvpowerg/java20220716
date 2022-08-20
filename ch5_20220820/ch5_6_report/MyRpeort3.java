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
public class MyRpeort3 extends MyErpReport{
    public void reportStyle(String[] data){
        for (int i = 1;i <= data.length;i++){
            System.out.println(i+" "+data[i-1]);
        }
    }
}
