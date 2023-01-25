package criacionais.factorymethod;


/*
 * Define uma interface para criar um objeto, mas
 *	deixa as subclasses decidirem qual classe instanciar
 * Use Factory Method quando:
 * Uma classe não pode antecipar a classe de objetos
 * que ela deve criar
 * Uma classe quer que suas subclasses especifiquem
 *  os objetos que ela cria Factory Method
 * 
 */
public class Aplicacao {
	public static void main(String[] args) {
		FactoryPessoa factory = new FactoryPessoa();
		Pessoa pessoa = factory.getPessoa("Mailson", "M");
		pessoa = factory.getPessoa("Carla", "F");
	}
}
