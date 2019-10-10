package nmfs.umairest.service;

import nmfs.umairest.model.Location;
import nmfs.umairest.model.request.VenueQuery;
import nmfs.umairest.model.response.ListOfVenues;
import nmfs.umairest.util.DummyObjects;
import org.springframework.stereotype.Service;

@Service
public class PUService {

    public ListOfVenues getVenues(VenueQuery query){
        return DummyObjects.getDummyVenues();

    }

    private ListOfVenues getVenuesByLocation(Location location){
        return null;
        //TODO: implement
    }
}
