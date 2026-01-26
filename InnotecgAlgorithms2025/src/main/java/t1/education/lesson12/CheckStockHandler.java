package t1.education.lesson12;

public class CheckStockHandler extends OrderHandler{

    @Override
    public boolean check(Order order) {

        // предположим, что товар всегда есть в наличии, для нашей учебной задачи это не имеет критическую важность.
        return true;

    }

}
