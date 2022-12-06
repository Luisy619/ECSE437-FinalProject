import java.util.ArrayList;
import java.util.List;

public class Espresso implements Coffee {
    private String name = "Espresso";
    private double price = 2.99;
    private Boolean temperature = true;
    private ArrayList<String> ingredients = new ArrayList<>(List.of("coffee bean", "water"));

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Boolean getTemperature() {
        return temperature;
    }

    @Override
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
}
