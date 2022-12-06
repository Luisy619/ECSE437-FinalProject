import java.util.ArrayList;
import java.util.List;

public class Cappuccino implements Coffee {
    private String name = "Cappuccino";
    private double price = 4.99;
    private ArrayList<String> temperature = new ArrayList<>(List.of("hot", "cold"));
    private ArrayList<String> ingredients = new ArrayList<>(List.of("coffee bean", "water", "milk"));

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public ArrayList<String> getTemperature() {
        return temperature;
    }

    @Override
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
}
