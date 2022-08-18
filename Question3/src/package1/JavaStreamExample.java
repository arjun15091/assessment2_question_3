package package1;
  
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"Apple Watch",20000f));  
        productsList.add(new Product(2,"iPhone",80000f));  
        productsList.add(new Product(3,"Redmi Phone",8000f));  
        productsList.add(new Product(4,"Acer Laptop",28000f));  
        productsList.add(new Product(5,"Realme Phone",9000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 50000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);  
    }  
}  
