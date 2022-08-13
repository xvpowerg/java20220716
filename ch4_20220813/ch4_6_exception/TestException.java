/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20220813.ch4_6_exception;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class TestException {
    public void testCatchedException(boolean canThrow)throws Exception{
        if (canThrow){
            throw new Exception();
        }
    }
    
    public void testUnCatchException(boolean canThrow){
        if (canThrow){
            throw new RuntimeException();
        }
    }
    
    public void testExceptionMp(int a)
            throws FileNotFoundException,IOException,SQLException{
        switch(a){
            case 1:
                throw new IOException();
            case 2:
                throw new FileNotFoundException();
            case 3:
                throw new SQLException();
        }
    }
}
