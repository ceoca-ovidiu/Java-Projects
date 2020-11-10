
public class Main {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		Meal saladMeal = mealBuilder.prepareSalad();

		System.out.println("You ordered a vegMeal and you have to pay : ");
		System.out.println(vegMeal.getCost());
		vegMeal.showMealItems();

		System.out.println("You ordered a nonVegMeal and you have to pay : ");
		System.out.println(nonVegMeal.getCost());
		nonVegMeal.showMealItems();

		System.out.println("You ordered a saladMeal and you have to pay : ");
		System.out.println(nonVegMeal.getCost());
		saladMeal.showMealItems();
	}

}
