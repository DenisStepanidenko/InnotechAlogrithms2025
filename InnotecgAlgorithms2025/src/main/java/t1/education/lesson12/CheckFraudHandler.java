package t1.education.lesson12;

public class CheckFraudHandler extends OrderHandler {


    @Override
    public boolean check(Order order) {

        // предположим, что товар всегда НЕподозрительный, для нашей учебной задачи это не имеет критическую важность.
        return true;

    }

}
