import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private String name;
    private static ArrayList<Coffee> menu = new ArrayList<>();

    public Cafe(String cafeName) {
        this.name = cafeName;
    }

    public String getCafeName(){
        return name;
    }

    public static void displayMenu(){
        for (Coffee coffee: menu) {
            System.out.println(coffee.getName()+ " -> $" + coffee.getPrice() + " (" + coffee.getTemperature() + ")");
        }
    }
    
    public static void displayIngredients(){
        for (Coffee coffee: menu) {
            System.out.println(coffee.getName()+ " -> " + coffee.getIngredients());
        }
    }


    public static void main(String str[]) {
        Cafe c = new Cafe("STARBANKS");

        System.out.println("Welcome to " + c.getCafeName() + "!\n");
        
        Coffee espresso = new Espresso();
        Coffee americano = new Americano();
        Coffee flatWhite = new FlatWhite();
        Coffee latte = new Latte();
        Coffee cappuccino = new Cappuccino();

        menu.add(espresso);
        menu.add(americano);
        menu.add(flatWhite);
        menu.add(latte);
        menu.add(cappuccino);
        
        System.out.println("This is our menu: ");
        displayMenu();
        
        Scanner s = new Scanner(System.in);
        System.out.println("\nWould you like to know the ingredients?: Y / N");
        String ans = s.nextLine();
        boolean rightAns = false;

        while (!rightAns){
            if (ans.equals("Y")) {
                displayIngredients();
                rightAns = true;
            } else if (ans.equals("N")) {
                System.out.println("Thank you, BYE! :)");

                rightAns = true;
            } else {
                System.out.println("Please answer with Y or N");

                ans = s.nextLine();
            }
        }

        s.close();
    }
}
