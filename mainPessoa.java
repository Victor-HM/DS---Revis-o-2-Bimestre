import javax.swing.JOptionPane;

public class mainPessoa {

	public static void main(String[] args) {
		
		String nome;
		double altura;
		String phrase;
		
		nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		altura = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura?"));
		phrase = JOptionPane.showInputDialog("Digite qualquer frase");
		
		Pessoa pessoa = new Pessoa(nome, altura);
		
		pessoa.setNome(nome);
		pessoa.setAltura(altura);
		
		pessoa.showClass();
		pessoa.showPhrase(phrase);

	}

}
