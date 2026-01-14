package t1.education.lesson12;

public abstract class OrderProcessor {


    public final void processOrder(Order order) {

        System.out.println("Оформление заказа");
        validate(order);
        calculatePrice(order);
        pay(order);
        notification();

    }

    public abstract void validate(Order order);

    public abstract void calculatePrice(Order order);

    public abstract void pay(Order order);

    public void notification() {
        System.out.println("Заказ оформлен.");
    }

}
