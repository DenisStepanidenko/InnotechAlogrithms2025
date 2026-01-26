package t1.education.lesson12;

public class CheckBalanceHandler extends OrderHandler {


    @Override
    public boolean check(Order order) {

        // предположим, что у пользователя 10000 баланс, для нашей учебной задачи это не имеет критическую важность.
        int required = order.getTotalPrice();
        return required <= 10000;

    }
}
