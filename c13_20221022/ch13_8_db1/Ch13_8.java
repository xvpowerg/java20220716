/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_20221022.ch13_8_db1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch13_8 {

    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/mydb20221022";
        String name = "qwer";
        String password = "123456";
           try(Connection conn = DriverManager.getConnection(url,name,password);
               Statement stm = conn.createStatement();
                   ){
              int count =  stm.executeUpdate("INSERT INTO student(id,name,score1,score2,height) "
                       + "VALUES(100,'Sean',65,72,172.3)");
               if (count > 0){
                   System.out.println("成功!");
               }
            }catch(SQLException ex){
                System.out.println(ex);
            }
        
        
    }
    
}
