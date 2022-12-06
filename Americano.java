import java.util.ArrayList;
import java.util.List;

public class Americano implements Coffee {
    private String name = "Americano";
    private double price = 3.99;
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
