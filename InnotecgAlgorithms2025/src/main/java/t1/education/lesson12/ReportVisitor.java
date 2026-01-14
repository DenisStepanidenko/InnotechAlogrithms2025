package t1.education.lesson12;

public class ReportVisitor implements ProductVisitor {

    @Override
    public void visitBook(Book book) {
        System.out.println(book.getName() + " - " + book.getPrice() + " руб.");
    }

    @Override
    public void visitVideoGame(VideoGame game) {
        System.out.println(game.getName() + " - " + game.getPrice() + " руб.");
    }

    @Override
    public void visitLaptop(Laptop laptop) {
        System.out.println(laptop.getName() + " - " + laptop.getPrice() + " руб.");
    }

}