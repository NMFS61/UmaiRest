package nmfs.umairest.api;

import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="/PUController",description="Personal User Service",produces ="application/json")
public class PUController {

    @RequestMapping(value="/nearByVenues",method= RequestMethod.GET)
    public ResponseEntity<String> nearByVenues()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @RequestMapping(value="/favoriteVenues",method= RequestMethod.GET)
    public ResponseEntity<String> getAuthorisation()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @RequestMapping(value="/order",method= RequestMethod.GET)
    public ResponseEntity<String> order()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @RequestMapping(value="/listOrders",method= RequestMethod.GET)
    public ResponseEntity<String> listOrders()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @RequestMapping(value="/orderDetails",method= RequestMethod.GET)
    public ResponseEntity<String> orderDetails()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }




}
