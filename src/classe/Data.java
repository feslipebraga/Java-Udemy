package classe;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data() {
		this(1, 1, 1970);
	}

	@Override
	public String toString() {
		return "Data [" + dia + "/" + mes + "/" + ano + "]";
	}
} 
