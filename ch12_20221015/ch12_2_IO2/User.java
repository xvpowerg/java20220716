/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20221015.ch12_2_IO2;
import java.io.IOException;
import java.time.LocalDateTime;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class User implements Serializable {
    private LocalDateTime dataTime;
    private String name;
    private String password;
    public static final long serialVersionUID = 42L;
    public User(String name,String password){
        this.name = name;
        this.password = password;
        this.dataTime =  LocalDateTime.now();
    }
    
    private void writeObject(java.io.ObjectOutputStream out) throws IOException{
        System.out.println("writeObject!!");
        //out.defaultWriteObject();
        out.writeUTF(this.name);
       out.writeUTF(this.password);
        //out.writeObject(this.dataTime);
    }
    
    private void readObject(java.io.ObjectInputStream in)
            throws IOException,ClassNotFoundException{
        this.name = in.readUTF();
        this.password = in.readUTF();
     this.dataTime = LocalDateTime.now();
    }
    
    public String toString(){
        return this.name +":"+password+":"+this.dataTime;
    }
}
