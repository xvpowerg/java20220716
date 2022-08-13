/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20220813.ch4_9_exception_override;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    //不拋
//    @Override
//    public void testEx(){
//        
//    }
    //拋出一樣
//     @Override
//     public void testEx() throws MyException{ 
//        
//    }
    //拋出子類
//    @Override
//   public void testEx() throws MySubException{ 
//        
//    }
    //uncatch 無限制
   @Override
   public void testEx() throws RuntimeException{ 
        
    }
  
}
