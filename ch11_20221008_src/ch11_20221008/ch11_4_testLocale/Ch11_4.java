/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_4_testLocale;
import java.util.Locale;
import java.util.ResourceBundle;
/**
 *
 * @author xvpow
 */
public class Ch11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        ResourceBundle res = ResourceBundle.getBundle("messages");
        String w1 = res.getString("tw.com.welcome");
        String n1 = res.getString("tw.com.name");
        System.out.println(w1+":"+n1);
        
        Locale locale2 = new Locale("en","US");
        ResourceBundle res2 = ResourceBundle.getBundle("messages",locale2);
        String w2 =  res2.getString("tw.com.welcome");
        String n2 =  res2.getString("tw.com.name");
        System.out.println(w2+":"+n2);
        
        
        //1 找指定的
        //2 找預設
        //3 找messages
        Locale locale3 = new Locale("en"); //找不到 或 錯誤的類型 找預設
        ResourceBundle res3 = ResourceBundle.getBundle("messages",locale3);
        String w3 =  res3.getString("tw.com.welcome");
        String n3 =  res3.getString("tw.com.name");
        System.out.println(w3+":"+n3);
    }
    
}
