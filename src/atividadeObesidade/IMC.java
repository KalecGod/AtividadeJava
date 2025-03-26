package atividadeObesidade;

public class IMC {

	private double peso;
	private double altura;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public IMC(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public IMC() {

	}

	public double calculo(double peso, double altura) {

		var result = peso / (altura * altura);

		return result;

	}

}
