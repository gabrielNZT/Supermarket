package stock;

import java.util.ArrayList;
import java.util.Date;

public class stockManager {
    private ArrayList<Product> products;
    private Seacher seacher;
    private Product product;

    public stockManager(){
        this.products = Repository.getInstance().getProducts();
        seacher = new Seacher();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(String ref){
        product = seacher.seachProduct(ref);
        products.remove(product);
    }

    public void updateQuantity(String ref, int quantity){
        product = seacher.seachProduct(ref);
        product.setQtd(quantity);
    }

    public long generateValidity(Date date, Product product){
        ProductType productType = product.getProductType();

        switch (productType){
            case perecivel:
                addTime(date, 1000000);
                break;
            case notperecivel:
                addTime(date, 500000);
        }

        return date.getTime();
    }

    public void addTime(Date date, long plus){
        long time = date.getTime();
        time = time + plus;
        date.setTime(time);
    }

}
