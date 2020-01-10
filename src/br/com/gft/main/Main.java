package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class Main {
	public static void main(String[]args) {
		
		Veiculo c = new Veiculo();
		c.setModelo("Palio");
		c.setMarca("FIAT");
		c.setPlaca("PEM-0911");
		c.setCor("Preto");
		c.setKm(30.543f);
		c.setPreco(15.900);
		c.ligar();
		c.abastecer(60);
		c.acelerar();
		c.acelerar();
		c.frear();
		c.desligar();
		c.status();
		
		
	}
}
