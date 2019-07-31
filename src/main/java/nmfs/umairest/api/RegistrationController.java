package nmfs.umairest.api;

import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="/storage",description="Linking Service",produces ="application/json")
@RequestMapping(value="/register",method= RequestMethod.GET)
public class RegistrationController {

    @RequestMapping(value="/personal",method= RequestMethod.GET)
    public ResponseEntity<String> registerPersonalUser()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @RequestMapping(value="/commercial",method= RequestMethod.GET)
    public ResponseEntity<String> registerCommercialUser()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }
}
