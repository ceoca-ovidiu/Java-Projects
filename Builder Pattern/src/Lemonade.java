
public abstract class Lemonade implements Item {

	@Override
	public Packing packing() {
		return new Mug();
	}

	@Override
	public abstract float price();

}
