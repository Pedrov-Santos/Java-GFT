package br.com.gft.model;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

	public Veiculo() {
		this.litrosCombustivel = 50 ;
	}

	public Veiculo(String marca, String modelo, String placa, String cor, Float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco) {

		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = false;
		this.litrosCombustivel = 50;
		this.velocidade = 0;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		if (this.isLigado == true) {
			this.velocidade += 20;
			this.litrosCombustivel -= 1;
			System.out.println("O carro foi acelerado sua velocidade atual é de " + this.velocidade + "km/h");
			System.out.println("O nivel de combustivel atual é de " + this.litrosCombustivel + "Litros");
		} else
			System.out.println("O carro está desligado, sera nescesario primeiro ligar o veiculo para poder acelerar");

	}

	public void abastecer(int litros) {  
		if (this.getLitrosCombustivel() + litros > 100) {
			System.out.println("Não é possivel abastecer mais que á capacidade maxima do tanque de 100Litros");
			System.out.println("combustivel atual: " + this.litrosCombustivel + "litros");
		} else {
			this.litrosCombustivel += litros;
			System.out.println("O carro foi abastecido com " + litros + "litros");
			System.out.println("Total de litros no tanque: " + this.litrosCombustivel);
		}

	}

	public void frear() {
		if (this.isLigado == true && this.velocidade > 0) {
			this.velocidade -= 10;
			System.out.println("O veiculo foi freado velocidade atual " + this.velocidade+ "KM/h");
		} else {
			System.out.println("Não é possivel frear com o carro parado ou desligado!");

		}
	}

	public void pintar(String cor) {
		this.cor = cor;
		System.out.println("Nova cor do veiculo: " + this.cor);
	}

	public void ligar() {
		if (this.isLigado == true) {
			System.out.println("O veiculo ja esta ligado.");
		} else {
			this.isLigado = true;
		}
	}

	public void desligar() {
		if (this.isLigado == true ) {
			this.isLigado = false;
		}else { 
			System.out.println("O veiculo ja esta desligado.");
		}
	}
	public void status () {
		System.out.println("O carro está ligado? " + this.isLigado +
			"\nModelo: " + this.modelo + 
			"\nMarca: " + this.marca +
			"\nPlaca: " + this.placa + 
			"\nCor: " + this.cor +
			"\nKilometragem: " + this.km +
			"\nValor do veiculo: " + this.preco);
	}
	
}
