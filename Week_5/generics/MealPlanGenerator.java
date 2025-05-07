package generics;

import java.util.*;

// Interface for all Meal Plans
interface MealPlan {
    String getMealType();
    List<String> getMeals();
}

// Subtypes of MealPlan
class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public List<String> getMeals() {
        return Arrays.asList("Grilled Paneer", "Veggie Stir-Fry", "Lentil Soup");
    }
}

class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public List<String> getMeals() {
        return Arrays.asList("Tofu Salad", "Chickpea Curry", "Quinoa Bowl");
    }
}

class KetoMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public List<String> getMeals() {
        return Arrays.asList("Grilled Chicken", "Avocado Egg Salad", "Zucchini Noodles");
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "High-Protein";
    }

    @Override
    public List<String> getMeals() {
        return Arrays.asList("Beef Steak", "Protein Shake", "Tuna Salad");
    }
}

// Generic class for a Meal
class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void displayMeal() {
        System.out.println("Meal Type: " + mealPlan.getMealType());
        System.out.println("Meals: " + mealPlan.getMeals());
    }

    public T getMealPlan() {
        return mealPlan;
    }
}

// Utility class for generating personalized plans
class MealPlanner {
    public static <T extends MealPlan> Meal<T> generatePersonalizedMeal(T plan) {
        System.out.println("Generating your personalized " + plan.getMealType() + " meal plan...");
        return new Meal<>(plan);
    }
}

// Main class
public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarian = MealPlanner.generatePersonalizedMeal(new VegetarianMeal());
        vegetarian.displayMeal();

        Meal<VeganMeal> vegan = MealPlanner.generatePersonalizedMeal(new VeganMeal());
        vegan.displayMeal();

        Meal<KetoMeal> keto = MealPlanner.generatePersonalizedMeal(new KetoMeal());
        keto.displayMeal();

        Meal<HighProteinMeal> highProtein = MealPlanner.generatePersonalizedMeal(new HighProteinMeal());
        highProtein.displayMeal();
    }
}
