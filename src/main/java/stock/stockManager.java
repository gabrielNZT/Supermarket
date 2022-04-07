package stock;

import java.util.ArrayList;

public class stockManager {
    private ArrayList<Product> products;

    public stockManager(){
        this.products = Repository.getInstance().getProducts();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(String ref){

    }

}
