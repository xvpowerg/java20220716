/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220820.ch5_6_erp;

/**
 *
 * @author xvpow
 */
public abstract class MyErpReport {
    private String[] getData(){
        String[] data = {"Ken","Vivin","Join","Lucy"};
        
        return data;
    }
    
    protected abstract void reportStyle(String[] data);
    
    public final void exportReport(){
        String[] data = getData();
        reportStyle(data);
    }
    
    
}
