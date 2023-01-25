package criacionais.builder;
//Classe construtora abstrata 
public abstract class PizzaBuilder {
	protected Pizza pizza;
	
	public Pizza getPizza() {
		return this.pizza;
	}
	
	public void criarNovoProdutoPizza() {
       pizza = new Pizza();
	}
	 
	public abstract void buildTempero();
	public abstract void buildCobertura();


}
