import java.text.DecimalFormat;

public class Pessoa {
	private String nome;
	private double altura;
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	public Pessoa(String nome, double altura) {
		nome = this.nome;
		altura = this.altura;
	}
	
	//GET'S
	
	public String getNome() {
		return nome;
	}
	
	public double getAltura() {
		return altura;
	}
	
	//SET'S
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void showPhrase(String phrase) {
		System.out.print(phrase);
	}
	
	public void showClass() {
		System.out.println("Esse é seu nome: " + this.getNome());
		System.out.println("E essa é a sua altura: " + df.format(this.getAltura()));
	}
}
