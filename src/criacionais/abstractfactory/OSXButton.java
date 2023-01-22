package criacionais.abstractfactory;
//Produto concreto
public class OSXButton implements Button {

	@Override
	public void paint() {
		System.out.println("Eu sou um OSXButton");
	}

}
