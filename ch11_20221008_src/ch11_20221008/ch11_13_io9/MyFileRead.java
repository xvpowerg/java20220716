/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20221008.ch11_13_io9;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author xvpow
 */
public class MyFileRead extends InputStreamReader{
    public MyFileRead(File f,String encode)throws FileNotFoundException,
                                            UnsupportedEncodingException{
        super(new FileInputStream(f),encode);
    }
    public MyFileRead(File f)throws FileNotFoundException,
                                            UnsupportedEncodingException{
        this(f,"utf-8");
    }
}
