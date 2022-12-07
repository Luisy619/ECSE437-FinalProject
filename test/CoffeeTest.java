package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import src.Coffee;
import src.FlatWhite;

public class CoffeeTest {

    Coffee flatWhite = new FlatWhite();

    @Test                                               
    @DisplayName("Get Coffee Name")   
    void testGetCoffeeName() {
        assertEquals("Flat White", flatWhite.getName(),     
                "It should properly show the name of the coffee");
    }

    @Test                                               
    @DisplayName("Get Price")   
    void testGetPrice() {
        assertEquals(4.99, flatWhite.getPrice(),     
                "It should properly show the price of the coffee");
    }

    @Test                                               
    @DisplayName("Get availble Temperature")   
    void testGetTemperature() {
        assertEquals("Hot/Cold", flatWhite.getTemperature(),     
                "It should properly show the availble temperature options");
    }

    @Test                                               
    @DisplayName("Get Ingredients")   
    void testGetIngredients() {
        ArrayList<String> testList = new ArrayList<>(List.of("coffee bean", "water", "milk"));

        assertEquals(testList, flatWhite.getIngredients(),
                "It should properly show the ingredients");  
    }
}
