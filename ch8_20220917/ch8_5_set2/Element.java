/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220917.ch8_5_set2;

/**
 *
 * @author xvpow
 */
public class Element {
        private int serial;
        private String name;
        public Element(int serial ,String name){
            this.serial = serial;
            this.name = name;
        }
        public String toString(){
            return serial+":"+name;
        }
        
        public boolean equals(Object obj){
            System.out.println("equals:"+obj);
            if (obj == null || 
               !(obj instanceof Element) ) return false;
            Element e = (Element)obj;
            
            return this.serial == e.serial && this.name.equals(e.name);
        }
        
        
        public int hashCode(){     
           System.out.println("hashCode:"+this.name);
            return this.serial + this.name.hashCode();
        }
        
}
