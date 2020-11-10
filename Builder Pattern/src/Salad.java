
public abstract class Salad implements Item {

	@Override
	public Packing packing() {
		return new Bowl();
	}

	@Override
	public abstract float price();

}
