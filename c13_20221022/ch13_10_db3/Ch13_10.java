/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_20221022.ch13_10_db3;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author xvpow
 */
public class Ch13_10 {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/mydb20221022";
        String name = "qwer";
        String password = "123456";       
        try(Connection conn =   DriverManager.getConnection(url,name,password);
            Statement stm =  conn.createStatement();){
           ResultSet res = stm.executeQuery("SELECT * FROM student");
           while(res.next()){
               int id = res.getInt(1);
               String cName  = res.getString("name");
               System.out.println(id+":"+cName);
           }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
