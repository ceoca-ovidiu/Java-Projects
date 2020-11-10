import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> mealItemsList = new ArrayList<>();

	public void addItem(Item item) {
		mealItemsList.add(item);
	}

	public float getCost() {
		float totalPrice = 0;
		for (Item item : mealItemsList) {
			totalPrice += item.price();
		}
		return totalPrice;
	}

	public void showMealItems() {
		System.out.println("Your food list consists of : ");
		for (Item item : mealItemsList) {
			System.out.println("Food Name : " + item.name() + " price : " + item.price());
		}
	}

}
