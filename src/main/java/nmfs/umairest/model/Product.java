package nmfs.umairest.model;

import lombok.Data;
import nmfs.umairest.model.enums.ProductGroups;

@Data
public class Product {
    private String SKU;
    private ProductGroups group; // Food Drink
    private String Subgroup; // FoodsSubGroups or DrinkSubGroups
    private String Name;
    private String Description;
    private String unit;
    private String price;
    private String ingredients;
    private String calories;
    private String carbs;
    private String protein;
    private String fat;

}
