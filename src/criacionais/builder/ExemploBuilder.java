package criacionais.builder;

/*
 * Separa a construção de um objeto complexo da sua
*  representação, de forma que o mesmo processo possa criar
*  diferentes tipos de representações.
*  Use Builder quando: O algoritmo para criar um objeto deve ser independente de
*  suas partes e de como elas são montadas.  
*  

 */

public class ExemploBuilder {
	public static void main(String[] args) {
		Cozinhar cozinhar = new Cozinhar();
		
		PizzaBuilder pizzaBuilderCalabresa = new BuilderPizzaCalabresa();
		PizzaBuilder pizzaBuilderMarquerita  = new BuilderPizzaMarguerita();
		
		cozinhar.setPizzaBuilder(pizzaBuilderCalabresa);
		cozinhar.constructPizza();
		Pizza pizzaCalabrersa = cozinhar.getPizza();
		System.out.println(pizzaCalabrersa);
		
		cozinhar.setPizzaBuilder(pizzaBuilderMarquerita);
		cozinhar.constructPizza();
		Pizza pizzaMarquerita = cozinhar.getPizza();
		System.out.println(pizzaMarquerita);
		
	}

}
