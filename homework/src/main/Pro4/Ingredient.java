package main.Pro4;

/**
 * Created by ge62 on 2016-09-20.
 */
public class Ingredient extends Franchise {
    private String ingredientName;
    private String supplier;
    private int price;

    public Ingredient(String franchiseName, String franchiseTel, String franchiseAdress, String manager, int numberStaff) {
        super(franchiseName, franchiseTel, franchiseAdress, manager, numberStaff);
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIngredientName() {

        return ingredientName;
    }

    public String getSupplier() {
        return supplier;
    }

    public int getPrice() {
        return price;
    }
}
