/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220827.Ch6_1_Interface;

import java.util.Iterator;

class MyIterator implements Iterator<String>{
    private MyStrList myList;
    private int index = 0;
    MyIterator(MyStrList myList){
        this.myList = myList;
    }
    public String next(){
        return myList.get(index++);
    }
    public boolean hasNext(){                
        return myList.getSize()!= 0 && index < myList.getSize() ;
    }
}
public class MyStrList implements Iterable<String>{
    private String[] strArr = new String[100000];
    private int index = -1;
    
    public Iterator<String> iterator(){
        MyIterator it = new MyIterator(this);
        return it;
    }
    public void add(String str){
        index++;
        strArr[index] = str;
    }
    public String get(int index){
        if (index < 0 || index >= getSize()){
            throw new ArrayIndexOutOfBoundsException("錯誤的Index");
        }
        return strArr[index];
    }
    public int getSize(){
        return index + 1;
    }
}
