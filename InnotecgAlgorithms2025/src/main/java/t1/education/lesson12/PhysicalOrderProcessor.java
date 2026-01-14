package t1.education.lesson12;

public class PhysicalOrderProcessor extends OrderProcessor {


    @Override
    public void validate(Order order) {

        if (order.getAddress().isBlank()) {
            throw new IllegalArgumentException("Для физического заказа нужен адрес.");
        }
        System.out.println("Проверка: адрес доставки указан.");

    }

    @Override
    public void calculatePrice(Order order) {

        int delivery = 300;
        System.out.println("Расчёт: цена товаров (" + order.getTotalPrice() +
                " ) + доставка (" + delivery + ") = " +
                (order.getTotalPrice() + delivery));


    }

    @Override
    public void pay(Order order) {

        System.out.println("Оплата: при получении");

    }

    @Override
    public void notification() {
        System.out.println("Оформление физического заказа закончено.");
    }


}
