package t1.education.lesson12;

public abstract class OrderHandler {

    private OrderHandler next;

    public OrderHandler setNext(OrderHandler next) {
        this.next = next;
        return next;
    }

    public boolean handle(Order order) {
        if (check(order)) {
            System.out.println(getClass().getSimpleName() + ": проверка пройдена");
            if (next != null) {
                return next.handle(order);
            }
            return true;
        } else {
            System.out.println(getClass().getSimpleName() + ": проверка НЕ пройдена");
            return false;
        }
    }

    public abstract boolean check(Order order);


}
