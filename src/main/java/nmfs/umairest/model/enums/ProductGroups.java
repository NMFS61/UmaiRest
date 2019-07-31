package nmfs.umairest.model.enums;

public enum ProductGroups {
    FOOD("FOOD"),
    DRINK("DRINK"),
    DEALS("DEALS"),
    DESSERT("DESSERT");

    private String grp;
    ProductGroups(String grp){this.grp=grp;}
    public String getVal(){return this.grp;}

}
