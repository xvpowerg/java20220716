/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220806.ch3_5_oo3;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int[] salarys = new int[12];
    private int index = -1;
    //建構式 Constructor
    //名稱跟類別一樣
    //沒有回傳值
    Person(){        
    }
    Person(String inName,int ... inSalarys){
        name= inName;
        for (int s : inSalarys){            
            appendSalary(s);  
        }
    }
    public void setName(String inName){
        name = inName;
    }
    public String getName(){
        return name;
    }
    public void appendSalary(int inSalary){
        if (inSalary < 0){
            System.out.println("薪水不可小於0");
            return;
        }else if (index == salarys.length-1){
            return;
        }
        salarys[++index] = inSalary;
        
        //不可超過12月
        //薪水不可小於0        
    }
    
    public void printInfo(){
        System.out.println(name);
        for(int s : salarys){
            if (s > 0)
                System.out.print(s+" ");
        }
          System.out.println();
    }
    
}
