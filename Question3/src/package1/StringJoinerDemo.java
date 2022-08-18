package package1;

import java.util.StringJoiner;  
public class StringJoinerDemo {  
    public static void main(String[] args) {  
        StringJoiner names = new StringJoiner(","); 
        // passing comma(,) as delimiter   
          
        // Adding values to StringJoiner  
        names.add("Aditya");  
        names.add("Arjun");  
        names.add("Deepak");  
        names.add("Ronit");  
                  
        System.out.println(names);  
    }  
} 