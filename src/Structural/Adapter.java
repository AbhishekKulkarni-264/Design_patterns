package Structural;
import java.util.List;

interface Item{
    String getName();
    String getPrice();
    String getRestaurantName();
}

class FoodItem implements Item{

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPrice() {
        return null;
    }

    @Override
    public String getRestaurantName() {
        return null;
    }
}

interface Grocery{
    String getName();
    String getPrice();
    String getShopName();
}

class GroceryItem implements Grocery{

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPrice() {
        return null;
    }

    @Override
    public String getShopName() {
        return null;
    }
}

class Grocery_adapter implements Item{
    GroceryItem gi;
    Grocery_adapter(GroceryItem gi){
        this.gi=gi;
    }

    @Override
    public String getName() {
        gi.getName();
        return null;
    }

    @Override
    public String getPrice() {
        gi.getPrice();
        return null;
    }

    @Override
    public String getRestaurantName() {
        gi.getShopName();
        return null;
    }
}

class Store{
    List<Item> lis;
    void addItems(Item item){
        lis.add(item);
    }
}

public class Adapter {
    public static void main(String[] args) {
      Store store=new Store();
      store.addItems(new FoodItem());
      store.addItems(new Grocery_adapter(new GroceryItem()));

    }
}
