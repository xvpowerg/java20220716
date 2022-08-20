/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220820.ch5_6_report;
import ch5_20220820.ch5_6_erp.MyErpReport;
/**
 *
 * @author xvpow
 */
public class Ch5_6 {

    /**
     * @param args the command line arguments
     */
    
    static void testRunReport(MyErpReport report){
        report.exportReport();
    }
    public static void main(String[] args) {
       MyReport myR1 = new MyReport();
       MyReport2 myR2 = new MyReport2();
       MyRpeort3 myR3 = new MyRpeort3();
       testRunReport(myR1);
       System.out.println("==================");
        testRunReport(myR2);
       System.out.println("=================="); 
       testRunReport(myR3);
    }
    //moyRpeort 3 
   //1 ken
    //2 Viivn
    //3 Join
    //4 Lucy
}
