package criacionais.factorymethod;
//Fabrica de Pessoas
public class FactoryPessoa {
	
	public Pessoa getPessoa(String nome, String sexo) {
		if(sexo.equals("M")) {
			return new Homem(nome);
		}else if(sexo.equals("F")) {
			return new Mulher(nome);
		}else {
			return null;
		}
		
	}


}
