package br.gft.model;

public class Juiz {

	public String resposta(String playerOne, String playerTwo) {

		if (playerOne.equals("Papel") && playerTwo.equals("Pedra")
				|| playerOne.equals("Pedra") && playerTwo.equals("Papel")) {
			return "Papel ganha de Pedra!";
		}

		else if (playerOne.equals("Pedra") && playerTwo.equals("Tesoura")
				|| playerOne.equals("Tesoura") && playerTwo.equals("Pedra")) {
			return "Pedra ganha de tesoura!";

		} else if (playerOne.equals("Tesoura") && playerTwo.equals("Papel")
				|| playerOne.equals("Papel") && playerTwo.equals("Tesoura")) {
			return "Tesoura ganha de Papel!";

		} else if (playerOne.equals(playerTwo)) {
			return "Empate";

		} else {
			return "Erro na digitação da String";
		}
	}
}
