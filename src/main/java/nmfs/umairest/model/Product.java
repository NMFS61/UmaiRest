package nmfs.umairest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nmfs.umairest.model.enums.ProductGroups;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private String sku;
    private ProductGroups group; // Food, Drink
    private String subgroup; // FoodsSubGroups or DrinkSubGroups: Soft Drinks, Beers
    private String name;
    private String description;
    private String ingredients;
    private String expectedServingTime;
    private int expectedServingTimeInMins;

    // *******
    private String calories;
    private String carbs;
    private String protein;
    private String fat;
    // *******

    //
    private String unit;
    private String price;
    private List<ProductOptions> options; // unit,price kombinasyonlari : 33cl 2.00, 50cl 3
    //

    // Belki side options can be added.



}
