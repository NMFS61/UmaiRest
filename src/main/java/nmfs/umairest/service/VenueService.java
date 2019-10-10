package nmfs.umairest.service;

import nmfs.umairest.model.Location;
import nmfs.umairest.model.request.VenueQuery;
import nmfs.umairest.model.response.ListOfProducts;
import nmfs.umairest.model.response.ListOfVenues;
import nmfs.umairest.util.DummyObjects;
import org.springframework.stereotype.Service;

@Service
public class VenueService {

    public ListOfProducts getProducts(String venueId){
        return DummyObjects.getDummyProducts();

    }

}

