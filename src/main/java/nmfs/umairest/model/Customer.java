package nmfs.umairest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    private int customerId;
    private String title;
    private String name;
    private String email;
    private String phone;
    private String authMethod;
    private String authPass;
    private Boolean activated;

}
