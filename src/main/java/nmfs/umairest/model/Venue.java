package nmfs.umairest.model;

import java.util.List;

public class Venue {

    private String ChainId;
    private String ChainName;
    private String VenueId;
    private String VenueName;
    private String Address;
    private String Phone;
    private String City;
    private String Country;
    private String PostCode;
    private String Location; //(x,y)
    private List<Person> managers;
    private List<Person> chainManagers;

}
