package t1.education.lesson12;

public class VideoGame implements Product {

    private String name;
    private int price;

    public VideoGame(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visitVideoGame(this);
    }

    @Override
    public int getPrice() { return price; }

    @Override
    public String getName() { return "Игра: " + name; }


}

