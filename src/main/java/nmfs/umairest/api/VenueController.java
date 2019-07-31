package nmfs.umairest.api;

import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="/VenueController",description="Venue Service",produces ="application/json")
@RequestMapping(value="/register",method= RequestMethod.GET)
public class VenueController {

    @RequestMapping(value="/products/{group}/{subGroup}",method= RequestMethod.GET)
    public ResponseEntity<String> getProducts(@PathVariable("group") String group,@PathVariable("subGroup") String subGroup)  {
      // */* olursa hepsini don
        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @RequestMapping(value="/venueDetails",method= RequestMethod.GET)
    public ResponseEntity<String> getVenueDetails()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }
}
