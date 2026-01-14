package t1.education.lesson12;

public class Laptop implements Product {

    private String model;
    private int price;

    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visitLaptop(this);
    }

    @Override
    public int getPrice() { return price; }

    @Override
    public String getName() { return "Ноутбук: " + model; }

}
