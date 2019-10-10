package nmfs.umairest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    //Customer
    private int orderId;
    private List<OrderItem> items;
    private int customerId;
    private String receiptNo;
    private double total;
    private double vat;

}
