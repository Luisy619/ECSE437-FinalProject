package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import src.Cafe;
import src.Coffee;
import src.Latte;

public class CafeTest {

    Cafe cafe = new Cafe("StarBanks");
    Coffee latte = new Latte();


    @Test                                               
    @DisplayName("Get Cafe Name")   
    void testGetCafeName() {
        assertEquals("StarBanks", cafe.getCafeName(),     
                "It should properly show the Cafe name");  
    }

    @Test                                               
    @DisplayName("Get Menu")   
    void testGetMenu() {
        cafe.addMenu(latte);
        ArrayList<Coffee> testList = new ArrayList<Coffee>(List.of(latte));

        assertEquals(testList, cafe.getMenu(),
                "It should properly show the Menu");  
    }
}
