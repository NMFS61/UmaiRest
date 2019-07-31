package nmfs.umairest.api;

import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="/storage",description="Linking Service",produces ="application/json")
public class CommercialController {

    @RequestMapping(value="/linking/authorizations/{accessToken}",method= RequestMethod.GET)
    public ResponseEntity<String> getAuthorisation()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }
}
