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
public class Venue {

    private String chainRegistrar;
    private String venueRegistrar;
    private String registeryDate;

    private String chainId;
    private String chainName;
    private String venueId;
    private String venueName;

    private String address;
    private String phone;
    private String city;
    private String country;
    private String postCode;
    private Location location; //(x,y)

    private List<Person> managers;
    private List<Person> chainManagers;
    private List<Location> locationBorders; //v2

}
