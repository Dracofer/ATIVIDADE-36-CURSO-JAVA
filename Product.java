package entities;

public class Product {
	
	private String name;
	private double idade;
	private double altura;
	
	public Product(String name, double idade, double altura) {
		
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
