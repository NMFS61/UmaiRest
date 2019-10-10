package nmfs.umairest.api;

import nmfs.umairest.model.Location;
import nmfs.umairest.model.request.VenueQuery;
import nmfs.umairest.model.response.ListOfProducts;
import nmfs.umairest.model.response.ListOfVenues;
import nmfs.umairest.service.PUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/personal")
public class PersonalOpController {

    @Autowired
    PUService service;
    // FINDING THE VENUE
    @CrossOrigin
    @RequestMapping(value="/getVenues",method= RequestMethod.POST)
    public ResponseEntity<ListOfVenues> getVenues(@RequestBody VenueQuery query)  {
        ListOfVenues list=service.getVenues(query);
        return new ResponseEntity<ListOfVenues>(list, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/venueById",method= RequestMethod.GET)
    public ResponseEntity<String> getVenueById()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/venueByQR",method= RequestMethod.GET)
    public ResponseEntity<String> getVenueByQR()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/nearByVenues",method= RequestMethod.GET)
    public ResponseEntity<String> nearByVenues()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/favoriteVenues",method= RequestMethod.GET)
    public ResponseEntity<String> getFavVenues()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }



    // MENU
//    @RequestMapping(value="/getMenu",method= RequestMethod.GET)
//    public ResponseEntity<ListOfProducts> getMenu()  {
//
//        return new ResponseEntity<ListOfProducts>(, HttpStatus.OK);
//    }

    // ORDERING
    @CrossOrigin
    @RequestMapping(value="/order",method= RequestMethod.GET)
    public ResponseEntity<String> order()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/cancelOrder",method= RequestMethod.GET)
    public ResponseEntity<String> cancelOrder()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/listOrders",method= RequestMethod.GET)
    public ResponseEntity<String> listOrders()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/orderDetails",method= RequestMethod.GET)
    public ResponseEntity<String> orderDetails()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    // SOCIAL
    @CrossOrigin
    @RequestMapping(value="/rateVenue",method= RequestMethod.GET)
    public ResponseEntity<String> rateVenue()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }
    @CrossOrigin
    @RequestMapping(value="/rateFood",method= RequestMethod.GET)
    public ResponseEntity<String> rateFood()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }



}
