import java.util.ArrayList;
import java.util.List;

public class FlatWhite implements Coffee {
    private String name = "Flat White";
    private double price = 4.99;
    private Boolean temperature = true;
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
    public Boolean getTemperature() {
        return temperature;
    }

    @Override
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
}
