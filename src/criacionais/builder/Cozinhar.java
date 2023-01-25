package criacionais.builder;
//Classe diretora 
// Coordena a ordem de construção das partes
public class Cozinhar {
	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pb) {
		this.pizzaBuilder = pb;
	}
	
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}
	
	public void constructPizza() {
		pizzaBuilder.criarNovoProdutoPizza();
		pizzaBuilder.buildCobertura();
		pizzaBuilder.buildTempero();
		
	}

}
