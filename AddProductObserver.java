import java.util.LinkedList;

public interface AddProductObserver {

    void addProduct(AddProductEvent event);
    double getValorTotal();
}