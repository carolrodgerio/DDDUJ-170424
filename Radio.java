package br.com.radiocorrecao;

public class Radio {

	// Atributos encapsulados

	private int volume;
	private float estacao;

	// Construtores

	public Radio() {

	}

	public Radio(int volume, float estacao) {
		
		setVolume(volume);
		setEstaçao(estacao);
		
	}

	// métodos getters e setters

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {

		try {
			if (volume <= 10 && volume >= 0) {
				this.volume = volume;
			} else {
				this.volume = 10;
				throw new Exception("Volume inválido");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public float getEstaçao() {
		return estacao;
	}

	public void setEstaçao(float estacao) {
		try {
			if (estacao <= 105.0f && estacao >= 80.0f) {
				this.estacao = estacao;
			} else {
				this.estacao = 80.0f;
				throw new Exception("Estação inválida");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	// métodos da classe

	public void aumentarVolume() {
		if (volume < 10) {
			volume++;
		}

	}

	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}

	}

	

}
