package t1.education.lesson12;

public class DigitalOrderProcessor extends OrderProcessor {

    @Override
    public void validate(Order order) {

        if (order.getEmail().isBlank()) {
            throw new IllegalArgumentException("Для цифрового заказа нужен email.");
        }
        System.out.println("Проверка пройдена: email указан.");

    }

    @Override
    public void calculatePrice(Order order) {

        System.out.println("Расчёт: только цена товаров (" + order.getTotalPrice() + ").");

    }

    @Override
    public void pay(Order order) {

        System.out.println("Оплата: онлайн оплата.");

    }

    @Override
    public void notification() {
        System.out.println("Оформление цифрового заказа закончено.");
    }

}
