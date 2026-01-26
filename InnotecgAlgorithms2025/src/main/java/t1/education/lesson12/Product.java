package t1.education.lesson12;

public interface Product {

    void accept(ProductVisitor visitor);
    int getPrice();
    String getName();


}
