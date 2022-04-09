package stock;

import java.util.ArrayList;
import java.util.HashMap;

public class Repository {
    private ArrayList<Product> products;
    private static Repository instance;

    public static Repository getInstance() {
        if(instance == null){
           instance = new Repository();
        }
        return instance;
    }

    public ArrayList<Product> getProducts() {
        this.products = instance.getProducts();
        return products;
    }
}
