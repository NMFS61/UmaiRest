package nmfs.umairest.api;


import nmfs.umairest.model.Customer;
import nmfs.umairest.model.request.RegistrationRequest;
import nmfs.umairest.service.RegistrationService;
import nmfs.umairest.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
@RequestMapping(value="/register/person")
public class PersonalRegistryController {

    @Autowired
    SmsService service;
    @Autowired
    RegistrationService registrationService;

    @CrossOrigin
    @RequestMapping(value="/byPhone",method= RequestMethod.POST)
    public ResponseEntity<String> registerByPhone(@RequestBody RegistrationRequest registrationRequest)  {
        registrationService.register(registrationRequest);
        return new ResponseEntity<String>("An SMS message has been sent to your phone number. Please enter the key", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/byFacebook",method= RequestMethod.GET)
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

    @CrossOrigin
    @RequestMapping(value="/updateCustomer",method= RequestMethod.POST)
    public ResponseEntity<String> updateCustomer(Customer customer)  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

}
