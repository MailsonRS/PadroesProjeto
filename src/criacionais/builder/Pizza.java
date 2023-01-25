package criacionais.builder;
//Produto a ser construído
public class Pizza {
	private String tempero = "";
	private String cobertura = "";
	
	public void setTempero(String tempero) {
		this.tempero = tempero;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	@Override
	public String toString() {
		
		return "A pizza tem o tempero " + this.tempero + " e cobertura " + this.cobertura;  
	}
	
}
