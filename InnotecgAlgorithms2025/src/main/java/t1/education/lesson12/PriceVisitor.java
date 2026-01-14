package t1.education.lesson12;

public class PriceVisitor implements ProductVisitor {

    private int totalPrice = 0;

    @Override
    public void visitBook(Book book) {
        totalPrice += book.getPrice();
    }

    @Override
    public void visitVideoGame(VideoGame game) {
        totalPrice += game.getPrice();
    }

    @Override
    public void visitLaptop(Laptop laptop) {
        totalPrice += laptop.getPrice();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

}
