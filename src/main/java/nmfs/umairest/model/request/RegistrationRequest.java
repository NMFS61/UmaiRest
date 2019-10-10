package nmfs.umairest.model.request;

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
public class RegistrationRequest {

    String method; // Facebook, Phone, Google
    String type; // Personal , Commercial

    String displayName;
    String name;
    String lastName;
    String phone;
    String email;

    // Only for companies
    String ceo; // emergency cases


}
