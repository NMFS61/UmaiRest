package nmfs.umairest.api;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/register",method= RequestMethod.GET)
public class SecurityController {

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public ResponseEntity<String> login()  {
        return new ResponseEntity<String>("", HttpStatus.OK);
    }

}
