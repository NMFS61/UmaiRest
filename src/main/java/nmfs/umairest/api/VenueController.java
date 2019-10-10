package nmfs.umairest.api;


import nmfs.umairest.model.response.ListOfProducts;
import nmfs.umairest.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/venue",method= RequestMethod.GET)
public class VenueController {

    @Autowired
    VenueService service;
    @RequestMapping(value="/customer/listAllProducts/{venueId}",method= RequestMethod.GET)
    public ResponseEntity<ListOfProducts> getProducts(@PathVariable("venueId") String venueId)  {
      // */* olursa hepsini don
        ListOfProducts listOfProducts=service.getProducts(venueId);
        return new ResponseEntity<ListOfProducts>(listOfProducts, HttpStatus.OK);
    }

    @RequestMapping(value="/venueDetails",method= RequestMethod.GET)
    public ResponseEntity<String> getVenueDetails()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }
}
