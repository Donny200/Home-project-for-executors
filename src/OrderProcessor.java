import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderProcessor {
    private ExecutorService executor;

    public OrderProcessor(int threadPoolSize) {
        executor = Executors.newFixedThreadPool(threadPoolSize);
    }

    public void processOrders(List<Order> orders) {
        for (Order order : orders) {
            executor.execute(() -> processOrder(order));
        }
        executor.shutdown();
    }

    private void processOrder(Order order) {
        System.out.println("Processing Order ID: " + order.getOrderId() + " for Customer: " + order.getCustomerName());

    }
}