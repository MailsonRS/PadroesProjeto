package criacionais.abstractfactory;
//Produto concreto
public class WinButton implements Button{

	@Override
	public void paint() {
		System.out.println("Eu sou um WinButton");		
	}

}
