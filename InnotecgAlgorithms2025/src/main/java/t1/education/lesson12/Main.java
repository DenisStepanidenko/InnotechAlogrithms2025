package t1.education.lesson12;

public class Main {

    public static void main(String[] args) {

        System.out.println("Интернет-магазин");

        // Создаём заказ
        Order order = new Order();
        order.setEmail("client@example.com");
        order.setAddress("Москва, ул. Арбат");

        // Добавляем товары
        order.addProduct(new Book("Паттерны проектирования, Gang Of Four(GoF) ", 1500));
        order.addProduct(new VideoGame("Atomic Heart", 2500));
        order.addProduct(new Laptop("Lenovo Legion", 1200));

        // 1. Chain of Responsibility - проверки
        System.out.println("Цепочка проверок заказа");
        OrderHandler stockCheck = new CheckStockHandler();
        OrderHandler balanceCheck = new CheckBalanceHandler();
        OrderHandler fraudCheck = new CheckFraudHandler();

        stockCheck.setNext(balanceCheck).setNext(fraudCheck);

        boolean allChecksPassed = stockCheck.handle(order);

        if (!allChecksPassed) {
            System.out.println("Заказ отклонён из-за проверок");
            return;
        }
        else{
            System.out.println("Заказ прошёл все проверки.");
        }

        // 2. Visitor - обработка товаров
        System.out.println("Обработка товаров (Visitor)");

        System.out.println("Отчёт о товарах");
        ReportVisitor reportVisitor = new ReportVisitor();
        order.processWithVisitor(reportVisitor);

        System.out.println("Подсчёт стоимости");
        PriceVisitor priceVisitor = new PriceVisitor();
        order.processWithVisitor(priceVisitor);
        System.out.println("Общая стоимость товаров: " + priceVisitor.getTotalPrice() + " руб.");

        // 3. Template Method - оформление заказа
        System.out.println("Выбор типа заказа");

        // Цифровой заказ
        System.out.println("Цифровой заказ");
        OrderProcessor digitalProcessor = new DigitalOrderProcessor();
        try {
            digitalProcessor.processOrder(order);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Физический заказ (с другим заказом, т.к. дорогой ноутбук)
        System.out.println("Физический заказ (другой состав)");
        Order physicalOrder = new Order();
        physicalOrder.setAddress("ул. Ленина, д. 1");
        physicalOrder.addProduct(new Book("Java для начинающих", 800));
        physicalOrder.addProduct(new VideoGame("Minecraft", 1200));

        OrderProcessor physicalProcessor = new PhysicalOrderProcessor();
        physicalProcessor.processOrder(physicalOrder);


    }


}
