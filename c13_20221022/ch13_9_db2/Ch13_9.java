/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_20221022.ch13_9_db2;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch13_9 {
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:derby://localhost:1527/mydb20221022";
        String name = "qwer";
        String password = "123456";
        
        var id = 1;
        var score1 = 87;
        try(Connection con =   DriverManager.getConnection(url,name,password);
             Statement stm =   con.createStatement();){
           int count =  stm.executeUpdate("UPDATE  student  SET score1 = "+score1+"WHERE id="+id);
            System.out.println(count);
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
