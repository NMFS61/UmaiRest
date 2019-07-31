package nmfs.umairest.model;

import java.util.List;

public class Order {
    //Customer
    private List<OrderItem> items;
    private Customer customer;
    private String receiptNo;
    private double Total;
    private double VAT;

}
