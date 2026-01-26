package t1.education.lesson12;

public class Book implements Product {

    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visitBook(this);
    }

    @Override
    public int getPrice() { return price; }

    @Override
    public String getName() { return "Книга: " + title; }


}
