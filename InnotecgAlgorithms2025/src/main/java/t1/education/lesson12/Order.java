package t1.education.lesson12;

import java.util.ArrayList;
import java.util.List;

public class Order {


    private String email;
    private String address;
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public int getTotalPrice() {
        int total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }

    public void processWithVisitor(ProductVisitor visitor) {
        for (Product p : items) {
            p.accept(visitor);
        }
    }


    public String getAddress() {
        return address;
    }

    public List<Product> getItems() {
        return items;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
