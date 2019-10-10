package nmfs.umairest.api;


import nmfs.umairest.model.Customer;
import nmfs.umairest.model.Venue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/register/co")
public class CommercialRegistryController {

    @CrossOrigin
    @RequestMapping(value="/byPhone",method= RequestMethod.POST)
    public ResponseEntity<String> registerByPhone(Venue venue)  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/updateVenue",method= RequestMethod.POST)
    public ResponseEntity<String> updateCustomer(Venue venue)  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/byFacebook",method= RequestMethod.POST)
    public ResponseEntity<String> registerByFacebook()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/activate",method= RequestMethod.GET)
    public ResponseEntity<String> activate(@RequestParam(name = "activationCode",required = false) String activationCode)  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/activate/{activationCode}",method= RequestMethod.GET)
    public ResponseEntity<String> activateUrl(@PathVariable("activationCode") String activationCode)  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }



}
