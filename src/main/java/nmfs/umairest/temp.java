package nmfs.umairest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import nmfs.umairest.model.Customer;
import nmfs.umairest.model.Location;
import nmfs.umairest.model.Person;
import nmfs.umairest.model.Venue;
import nmfs.umairest.model.request.VenueQuery;
import nmfs.umairest.util.Calculations;

/**
 * Created by c0259896 on 06/08/2019.
 */
public class temp {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Venue query..");
        VenueQuery q=VenueQuery.builder().location(Location.builder().x(12).y(19).build()).build();
        ObjectMapper m=new ObjectMapper();
        String str=m.writeValueAsString(q);
        System.out.println(str);



        System.out.println(Calculations.distance(32.9697, -96.80322, 29.46786, -98.53506, 'M') + " Miles\n");
        System.out.println(Calculations.distance(32.9697, -96.80322, 29.46786, -98.53506, 'K') + " Kilometers\n");
        System.out.println(Calculations.distance(32.9697, -96.80322, 29.46786, -98.53506, 'N') + " Nautical Miles\n");
    }

    private Venue venue1(){
        return Venue.builder().venueName("Onsen Sushi Bar - Watford")
                       .venueId("1")
                       .address("12 Colerandian Road").city("Watford") .country("UK").postCode("WD17 4LE").phone("")
                       .location(Location.builder().x(1).y(1).build())
                       .venueRegistrar("").build();



    }
    private Venue venue2(){
        return Venue.builder().venueName("Holiday Inn Cafe - Watford")
                .venueId("1")
                .address("12 Colerandian Road").city("Watford") .country("UK").postCode("WD17 4LE").phone("")
                .location(Location.builder().x(1).y(1).build())
                .venueRegistrar("").build();



    }
    private Venue venue3(){
        return Venue.builder().venueName("The Flag")
                .venueId("1")
                .address("12 Colerandian Road").city("Watford") .country("UK").postCode("WD17 4LE").phone("")
                .location(Location.builder().x(1).y(1).build())
                .venueRegistrar("").build();



    }
    private Venue venue4(){
        return Venue.builder().venueName("Onsen Sushi Bar - Birmingham")
                .venueId("1")
                .address("12 Colerandian Road").city("Watford") .country("UK").postCode("WD17 4LE").phone("")
                .location(Location.builder().x(1).y(1).build())
                .venueRegistrar("").build();

    }
}
