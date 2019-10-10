package nmfs.umairest.util;

import nmfs.umairest.model.*;
import nmfs.umairest.model.enums.FoodSubGroups;
import nmfs.umairest.model.enums.ProductGroups;
import nmfs.umairest.model.response.ListOfProducts;
import nmfs.umairest.model.response.ListOfVenues;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c0259896 on 05/08/2019.
 */
public class DummyObjects {
    public static Customer getCustomer(){
        // for order
        return Customer.builder().name("Bora").email("bora@borauzun.net").build();
    }

    public static OrderItem getFoodOrderItem(){
        return OrderItem.builder().numberOfOrder(1).product(getFoodProduct()).build();
    }

    public static OrderItem getDrinkOrderItem(){
        return OrderItem.builder().numberOfOrder(1).product(getDrinkProduct()).build();
    }

    public static Product getFoodProduct(){
        return Product.builder().calories("290").description("medium rare Steak").expectedServingTime("15 mins").expectedServingTimeInMins(15)
                .name("Steak").price("25").sku("008").group(ProductGroups.FOOD).subgroup(FoodSubGroups.DINNER.getVal()).build();
    }
    public static Product getDrinkProduct(){
        return Product.builder().name("Peroni").sku("P123").group(ProductGroups.DRINK).expectedServingTime("").price("2.50").build();
    }

    public static List<OrderItem> getOrder() {
        List<OrderItem> items=new ArrayList<>();
        items.add(getFoodOrderItem());
        items.add(getDrinkOrderItem());
        return items;
    }
    public static List<Person> persons(){

        List<Person> persons=new ArrayList<>();
        persons.add(Person.builder().personId(1).name("Bora Uzun").position("Chef").phone("0888").build());
        persons.add(Person.builder().personId(2).name("Rakesh").position("Manager").phone("0888").build());
        return persons;
    }
    //// PU Dummy
    public static ListOfVenues getDummyVenues(){
        List<Venue> favorites=new ArrayList<>();
        List<Venue> search=new ArrayList<>();
        List<Venue> recent=new ArrayList<>();
        List<Venue> nearby=new ArrayList<>();
        favorites.add(Venue.builder().address("121 Moorgate").venueName("ALL BARS ARE GOOD-1").venueId("1").build());
        search.add(Venue.builder().address("122 Moorgate").venueName("ALL BARS ARE GOOD-1").venueId("1").chainName("ALL BARS GOOD").chainId("1").build());
        recent.add(Venue.builder().address("123 Moorgate").venueName("ALL BARS ARE GOOD-2").venueId("2").build());
        recent.add(Venue.builder().address("124 Moorgate").venueName("ALL BARS ARE GOOD-3").venueId("2").build());
        recent.add(Venue.builder().address("125 Moorgate").venueName("ALL BARS ARE GOOD-4").venueId("3").build());
        nearby.add(Venue.builder().address("126 Moorgate").venueName("ALL BARS ARE GOOD-5").venueId("4").build());
        nearby.add(Venue.builder().address("127 Moorgate").venueName("ALL BARS ARE GOOD-6").venueId("5").build());
        nearby.add(Venue.builder().address("128 Moorgate").venueName("ALL BARS ARE GOOD-7").venueId("6").build());
        nearby.add(Venue.builder().address("129 Moorgate").venueName("ALL BARS ARE GOOD-8").venueId("7").build());
        nearby.add(Venue.builder().address("130 Moorgate").venueName("ALL BARS ARE GOOD-9").venueId("8").build());

        return ListOfVenues.builder().favorites(favorites).nearBy(nearby).recents(recent).search(search).build();
    }

    //// PU Dummy
    public static ListOfProducts getDummyProducts(){
        List<ProductOptions> options=new ArrayList<>();
        options.add(ProductOptions.builder().price("34").unit("400 gram").build());
        options.add(ProductOptions.builder().price("40").unit("500 gram").build());

        List<Product> products=new ArrayList<>();
        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.FOOD).subgroup("Main").ingredients("Beef,onion,carrot").description("served with chips").name("Ribeye Steak").price("27").unit("250 gram").options(options).sku("001").build());
        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.FOOD).subgroup("Main").ingredients("Beef,onion,carrot").description("served with tartar souce").name("Fish and Chips").price("14").unit("1").sku("002").build());
        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.FOOD).subgroup("Main").ingredients("Beef,onion,carrot").description("served with chips").name("Lamb Shank").price("22").unit("1").sku("003").build());
        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.FOOD).subgroup("Starter").ingredients("Beef,onion,carrot").description("").name("mixed nuts").price("27").unit("1").sku("004").build());
        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.FOOD).subgroup("Starter").ingredients("Beef,onion,carrot").description("").name("olives").price("27").unit("250 gram").sku("005").build());
        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.FOOD).subgroup("Side").ingredients("").description("Steak served with chips").name("Chips").price("3").unit("1").sku("006").build());
        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.FOOD).subgroup("Side").ingredients("").description("2 slices").name("Garlic Bread").price("2").unit("1").sku("007").build());

        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.DRINK).subgroup("Beers").description("").name("Peroni").price("27").unit("pint").options(options).sku("008").build());
        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.DRINK).subgroup("Beers").description("").name("Efes").price("14").unit("bottle").sku("009").build());
        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.DRINK).subgroup("Soft drinks").name("Coke").price("27").unit("bottle").options(options).sku("008").build());
        products.add(Product.builder().expectedServingTimeInMins(10).group(ProductGroups.DRINK).subgroup("Soft drinks").description("freshly squeezed").name("Orange juice").price("14").unit("bottle").sku("009").build());

        //products.add
        return ListOfProducts.builder()
                .listProducts(products).build();

    }



    }
