package nmfs.umairest.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nmfs.umairest.model.Venue;

import java.util.HashMap;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@Builder
public class ListOfVenues {

    private List<Venue> favorites;
    private List<Venue> nearBy;
    private List<Venue> recents;
    private List<Venue> search;

}
/**
 * Four lists
 * key = "NEAR_BY","FAVORITES","RECENTS","SEARCH"
 */