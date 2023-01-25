package criacionais.builder;

public class BuilderPizzaMarguerita extends PizzaBuilder {
	@Override
	public void buildCobertura() {
		pizza.setCobertura("quente");
		
	}
	@Override
	public void buildTempero() {
		pizza.setTempero("tomate");
		
	}
}
