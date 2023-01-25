package criacionais.builder;
//Classe construtora concreta
public class BuilderPizzaCalabresa extends PizzaBuilder {
	@Override
	public void buildCobertura() {
		pizza.setCobertura("medio");
		
	}
	@Override
	public void buildTempero() {
		pizza.setTempero("calabresa");
		
	}
}
