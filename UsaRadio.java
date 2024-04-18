package br.com.radiocorrecao;

import javax.swing.JOptionPane;

public class UsaRadio {

	public static void main(String[] args) {

		String aux;
		int volume, escolha;
		float estacao;

		try {

			aux = JOptionPane.showInputDialog("Escolha o volume");
			volume = Integer.parseInt(aux);

			aux = JOptionPane.showInputDialog("Escolha a Estacao");
			estacao = Float.parseFloat(aux);

			Radio radio = new Radio(volume, estacao);

			JOptionPane.showMessageDialog(null, "Estação" + radio.getEstaçao() + "\nVolume: " + radio.getVolume());

			aux = JOptionPane.showInputDialog("Escolha uma opção:" + "\n(1) Aumentar volume" + "\n(2) Diminuir volume"
					+ "\n(3) Trocar de estação");
			escolha = Integer.parseInt(aux);

			switch (escolha) {
			case 1:
				radio.aumentarVolume();
				break;
			case 2:
				radio.diminuirVolume();
				break;
			case 3:
				aux = JOptionPane.showInputDialog("Escolha a nova Estacao");
				estacao = Float.parseFloat(aux);

				radio.setEstaçao(estacao);

				break;

			default:
				throw new Exception("Opção inválida");

			}

			JOptionPane.showMessageDialog(null, "Estação: " + radio.getEstaçao() + "\nVolume: " + radio.getVolume());

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

}
