package criacionais.abstractfactory;

public class Application {
	public Application(GUIFactory factory) {
		Button button = factory.createButton();
		button.paint();
		
	}

}
