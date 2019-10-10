package nmfs.umairest.api;


import nmfs.umairest.model.Order;
import nmfs.umairest.model.Person;
import nmfs.umairest.model.enums.OrderStatus;
import nmfs.umairest.service.CCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/commercial")
public class CommercialOpController {

    @Autowired
    CCService service;


    // |  ORDERS ||
    @CrossOrigin
    @RequestMapping(value="/listActiveOrders/{venueId}",method= RequestMethod.GET)
    public ResponseEntity<List<Order>> getActiveOrders(@PathVariable("venueId") String venueId)  {
        List<Order> response=service.getActiveOrders(venueId);
        return new ResponseEntity<List<Order>>(response, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/updateOrderStatus/{orderId}",method= RequestMethod.GET)
    public ResponseEntity<String> updateOrderStatus(@RequestParam("orderUpdate") OrderStatus orderUpdate, @RequestParam("messageToCustomer") String messageToCustomer
                                                   , @PathVariable("orderId") String orderId)  {
        System.out.println(orderUpdate.getVal());
        // notify the customer as well
        return new ResponseEntity<String>("", HttpStatus.OK);
    }

        // Phase 2
        @CrossOrigin
        @RequestMapping(value="/listOrdersByQuery",method= RequestMethod.GET)
        public ResponseEntity<String> getOrdersByQuery()  {

             return new ResponseEntity<String>("", HttpStatus.OK);
        }



    // |  PERSONs ||
    @CrossOrigin
    @RequestMapping(value="/getPatrols",method= RequestMethod.GET)
    public ResponseEntity<List<Person> > getPersonels()  {
        List<Person> persons=service.getPersonels();
        return new ResponseEntity<List<Person> >(persons, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/addPatrol",method= RequestMethod.POST)
    public ResponseEntity<String> addPersonels(@RequestBody Person person)  {

        String response=service.addPersonels(person);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/updatePatrol",method= RequestMethod.PUT)
    public ResponseEntity<String> updatePersonels(@RequestBody Person person)  {
        String response=service.updatePersonels(person);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/deletePatrol/{patrolId}",method= RequestMethod.DELETE)
    public ResponseEntity<String> deletePersonels(@PathVariable("patrolId") String patrolId)  {
        String response=service.deletePersonels(patrolId);
        return new ResponseEntity<String>("", HttpStatus.OK);
    }


    //  | FINANCIALs ||
    @CrossOrigin
    @RequestMapping(value="/getSummary",method= RequestMethod.GET)
    public ResponseEntity<String> getSummary()  {

        return new ResponseEntity<String>("", HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/getStats",method= RequestMethod.GET)
    public ResponseEntity<String> getStats()  {
        return new ResponseEntity<String>("", HttpStatus.OK);
    }
}
