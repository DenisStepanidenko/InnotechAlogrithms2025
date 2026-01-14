package t1.education.lesson12;

public interface ProductVisitor {

    void visitBook(Book book);
    void visitVideoGame(VideoGame game);
    void visitLaptop(Laptop laptop);

}
