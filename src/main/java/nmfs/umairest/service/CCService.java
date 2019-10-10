package nmfs.umairest.service;

import nmfs.umairest.model.Person;
import nmfs.umairest.util.DummyObjects;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import nmfs.umairest.model.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c0259896 on 02/08/2019.
 */
@Service
public class CCService {

    public List<Order> getActiveOrders(String venueId)  {
        List<Order> activeOrders=new ArrayList<>();
        activeOrders.add(Order.builder().customerId(1).receiptNo("R-1").total(90).items(DummyObjects.getOrder()).build());
        return activeOrders;
    }


    public List<Person> getPersonels(){
        return DummyObjects.persons();
    }
    public String updatePersonels(Person p){
        return "Success";
    }
    public String addPersonels(Person p){
        return "Success";
    }
    public String deletePersonels(String pId){
        return "Success";
    }
}
