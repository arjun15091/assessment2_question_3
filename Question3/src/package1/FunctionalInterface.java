package package1;

/*FunctionInterface has - 
1. Only 1 Abstract method
2. n number of static methods
3. n number of default methods*/
  
interface  massage{  
    void massageFunction(String msg);  
} 
public class FunctionalInterface implements massage{  
    public void massageFunction(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterface fie = new FunctionalInterface();  
        fie.massageFunction("Hello Aditya");  
    }  
} 