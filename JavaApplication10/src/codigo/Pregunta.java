package codigo;

public class Pregunta {

	private int identificador;
	private String enunciado;
	private String opcionA;
	private String opcionB;
	private String opcionC;
	private String opcionD;
	private String nombreImagen;
	
	public Pregunta(int identificador, String enunciado, String opcionA, String opcionB,
		String opcionC, String opcionD, String nombreImagen) {
		this.identificador = identificador;
		this.enunciado = enunciado;
		this.opcionA = opcionA;
		this.opcionB = opcionB;
		this.opcionC = opcionC;
		this.opcionD = opcionD;
		this.nombreImagen = nombreImagen;
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getOpcionA() {
		return opcionA;
	}
	public void setOpcionA(String opcionA) {
		this.opcionA = opcionA;
	}
	public String getOpcionB() {
		return opcionB;
	}
	public void setOpcionB(String opcionB) {
		this.opcionB = opcionB;
	}
	public String getOpcionC() {
		return opcionC;
	}
	public void setOpcionC(String opcionC) {
		this.opcionC = opcionC;
	}
	public String getOpcionD() {
		return opcionD;
	}
	public String getNombreImagen() {
		return nombreImagen;
	}

	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}

	public void setOpcionD(String opcionD) {
		this.opcionD = opcionD;
	}
	
	
}
