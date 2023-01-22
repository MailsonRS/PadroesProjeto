package criacionais.abstractfactory;

/*
 * Proporciona uma interface para criar famílias de
*  objetos relacionados ou dependentes sem especificar
*  suas classes concretas
 */

public class ApplicationRunner {
	public static void main(String[] args) {
		// A fábrica é escolhida em tempo de execução
		new Application(createOsSpecificFactory());
	}
	public static GUIFactory createOsSpecificFactory(){
		//int sys =  readFromCongigFile("OS_TYPE");
		int sys =  0;
		if(sys == 0) {
			return new WinFactory();
		}else {
			return new OSXFactory();
		}
		
	}

}
