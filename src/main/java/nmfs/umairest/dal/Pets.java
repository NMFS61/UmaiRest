package nmfs.umairest.dal;


//import org.springframework.data.annotation.Id;

public class Pets {
//  @Id
  public int _id;
  
  public String name;
  public String species;
  public String breed;
  
  // Constructors
  public Pets() {}
  
  public Pets(int _id, String name, String species, String breed) {
    this._id = _id;
    this.name = name;
    this.species = species;
    this.breed = breed;
  }
  

}