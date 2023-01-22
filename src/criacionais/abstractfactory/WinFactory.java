package criacionais.abstractfactory;

//Fábrica concreta
public class WinFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new WinButton();
	}

}
