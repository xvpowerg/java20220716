/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220806.ch3_8_extends1;

/**
 *
 * @author xvpow
 */
public class Ch3_8 {
   //參數可放多筆Cat 或 Dog      
  static void printDogAndCat(Animal... a1){
      System.out.println("=======================");
      for (Animal a : a1){
          a.printInfo();
      }
  }
    public static void main(String[] args) {
       
        Animal a1 = new Animal("Nono",2,2.5f);
        a1.printInfo();
        a1.setAge(3);
        a1.setName("Nana");
        a1.printInfo();
        
        Dog dog1 = new Dog();
        dog1.setName("Lala");
        dog1.setAge(6);
        dog1.setWeight(5);
        dog1.printInfo();
       Cat cat1 = new Cat();
       cat1.setName("Kitty");
       cat1.setAge(16);
       cat1.setWeight(6);
        cat1.printInfo();
                
        Dog dog2 = new Dog("Jojo",3,5.1f);        
        dog2.printInfo();
       
        Cat cat2 = new Cat("yumi",6,4.1f);
        cat2.printInfo();
        
        Animal dog3 = new Dog("HaHa",1,5.6f);//多型
        dog3.printInfo();
        
        Animal cat3 = new Cat("mimi",7,3.6f);//多型
        cat3.printInfo();
        
        printDogAndCat(cat1,cat2,cat3,dog1,dog2,dog3);
    }
    
}
