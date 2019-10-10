package nmfs.umairest.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import nmfs.umairest.model.Product;
import nmfs.umairest.model.Venue;
import nmfs.umairest.model.enums.ProductGroups;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@Builder
public class ListOfProducts {

    private Venue venue;
    private List<Product> listProducts;


}
