package stock;

import java.util.ArrayList;
import java.util.Objects;

public class Seacher {
    private Product product;
    private ArrayList<Product> products;

    public Seacher(){
       products = Repository.getInstance().getProducts();
    }

    public Product seachProduct(String ref){
        for(Product product : products){
            if(Objects.equals(product.getRef(), ref)){
                return product;
            }
        }
        return null;
    }

}
