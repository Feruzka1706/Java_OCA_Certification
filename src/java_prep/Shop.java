package java_prep;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public static void main(String[] args) {

        List<Product> lst = new ArrayList<>();
        lst.add(new Product(10,"IceCream"));
        lst.add(new Product(11,"Chocolate"));

        Product p1= new Product(10, "IceCream");
        System.out.println(lst.indexOf(p1));
    }
}
