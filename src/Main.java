import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "John Doe"));
        orders.add(new Order(2, "Jane Smith"));
        orders.add(new Order(3, "Alice Johnson"));

        int threadPoolSize = 3;
        OrderProcessor orderProcessor = new OrderProcessor(threadPoolSize);
        orderProcessor.processOrders(orders);

        
    }
}