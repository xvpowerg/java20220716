package ch4_20220813.ch4_8_cuex;
public class Ch4_8 {

    static void  testMyException(boolean b1) throws MyException{
         if (b1){
             throw new MyException("myException錯誤");
         }        
    }
    
    public static void main(String[] args) {
       
        try{
            testMyException(true);    
        }catch(MyException ex){
            System.out.println(ex);
        }
        
        
    }
    
}
