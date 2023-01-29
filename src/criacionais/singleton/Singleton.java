package criacionais.singleton;

/*
 * Garante que uma classe tem apenas uma
 * instância e provê um ponto de acesso global a ela
 * Use Singleton quando:
 * Deve haver exatamente uma instância de uma
 * classe, e ela deve ser acessível aos clientes a partir
 * de um ponto de acesso conhecido
 */

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();
	//Construtor privado para impedir outras instâncias
	private Singleton() {

	}
	public static Singleton getInstance() {
		return INSTANCE;
	}

}
