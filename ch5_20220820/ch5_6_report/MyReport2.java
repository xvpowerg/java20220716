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
public class MyReport2 extends MyErpReport {
    public void  reportStyle(String[] data){
        for (int i= 0,k=1;i<data.length;i++,k++){
            System.out.print(data[i]+" ");
            if (k % 2 == 0) 
                System.out.println();
        }
    }
}
