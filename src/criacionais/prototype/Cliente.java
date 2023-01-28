package criacionais.prototype;

/*
 * Especifica os tipos de objetos para criar usando uma
 * instância prototípica, e cria novos objetos copiando
 *  este protótipo (clonando o objeto original)
 * Use Prototype quando:
 *  O sistema possui componentes cujo estado inicial tem 
 *  poucas variações, e é conveniente disponibilizar um conjunto
 *  pré estabelecido de protótipos que dão origem aos objetos
 *  que compõem o sistema
 */

public class Cliente {
	static final int DOCUMENTO_TIPO_ASCII = 0;
	static final int DOCUMENTO_TIPO_PDF = 1;
	
	private Documento ascii= new ASCII();
	private Documento pdf= new PDF();
	
	public Documento criarDocumento(int i) {
		if (i == DOCUMENTO_TIPO_ASCII) {
			return ascii.clone();
		} else {
			return pdf.clone();

		}
	}
	

}
