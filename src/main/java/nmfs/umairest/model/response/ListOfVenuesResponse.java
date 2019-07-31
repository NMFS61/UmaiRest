package nmfs.umairest.model.response;

import lombok.Data;
import nmfs.umairest.model.Venue;

import java.util.HashMap;
import java.util.List;

@Data
public class ListOfVenuesResponse {
    private HashMap<String, List<Venue>> venues;
    public ListOfVenuesResponse(){this.venues=new HashMap<>();}
    public void addVenue(String type,List<Venue> venues){
       this.venues.putIfAbsent(type,venues); // type=favorites, nearby, search
    }

}
/**
 * Four lists
 * key = "NEAR_BY","FAVORITES","RECENTS","SEARCH"
 */