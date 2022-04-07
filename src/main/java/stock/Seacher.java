package stock;

import java.util.ArrayList;

public class Seacher {
    private String ref;
    private Product product;
    private ArrayList<Product> products;

    public Seacher(String ref){
       this.ref = ref;
       products = Repository.getInstance().getProducts();
    }

    public Product seachProduct(String ref){
        for(Product product : products){
            if(product.getRef().equals(ref)){
                return product;
            }
        }
        return null;
    }

}
