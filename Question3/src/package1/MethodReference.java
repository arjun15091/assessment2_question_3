package package1;

interface Dog{  
    void bark1();  
}  
public class MethodReference {  
    public static void bark2(){  
        System.out.println("Dog is Barking");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Dog d1 = MethodReference::bark2;  
        // Calling interface method  
        d1.bark1();  
    }  
}   

