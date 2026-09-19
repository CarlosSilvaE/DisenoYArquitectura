package Builder;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("VegMeal");
		vegMeal.showItems();
		System.out.println("Total cost: " + vegMeal.getCost());
		
		
		Meal nonVegMeal = mealBuilder.prepareVegMeal();
		System.out.println("nonVegMeal");
		nonVegMeal.showItems();
		System.out.println("Total cost: " + nonVegMeal.getCost());
		
		Meal FishB = mealBuilder.prepareFishB();
		System.out.println("FishBurger");
		FishB.showItems();
		System.out.println("Total cost: " + FishB.getCost());
		
	}
}
