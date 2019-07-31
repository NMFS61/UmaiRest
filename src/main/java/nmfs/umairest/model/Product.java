package nmfs.umairest.model;

import lombok.Data;

@Data
public class Product {
    private String SKU;
    private String Group; // Food, Drink, Dessert, Deal
    private String Subrgroup; // Wine, Breakfast,
    private String Name; // Adana
    private String Description; //
    private String Unit;
    private String UnitPrice;
    private String Ingredients; //

}
