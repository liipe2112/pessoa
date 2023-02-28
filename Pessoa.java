package pessoa;

/*Crie uma classe Pessoa que possua os atributos nome, idade e sexo, além dos métodos falar() e andar(). 
 *Crie um objeto Pessoa e chame esses métodos para testar o funcionamento da classe. */

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public void falar() {
		System.out.println(nome + " está falando!");
	}
	
	public void andar() {
		System.out.println(nome + " está andando!");
	}
}
