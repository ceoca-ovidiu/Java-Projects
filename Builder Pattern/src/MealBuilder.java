
public class MealBuilder {

	public Meal prepareVegMeal() {

		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;

	}

	public Meal prepareNonVegMeal() {

		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;

	}

	public Meal prepareSalad() {

		Meal meal = new Meal();
		meal.addItem(new CaesarSalad());
		meal.addItem(new CherryLemonade());
		return meal;
	}

}
