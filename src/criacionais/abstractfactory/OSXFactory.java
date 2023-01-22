package criacionais.abstractfactory;

//Fábrica concreta
public class OSXFactory implements GUIFactory{
	@Override
	public Button createButton() {
		return new OSXButton();
	}
}
